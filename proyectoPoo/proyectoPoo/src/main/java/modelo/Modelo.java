package modelo;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;

public class Modelo {
    private final int[] vector;
    private final int size;

    public Modelo(int size) {
        this.size = size;
        this.vector = new int[size];
    }

    public void generate(Long seed) {
        // Si se proporciona semilla, usar Random reproducible; de lo contrario, ThreadLocalRandom
        if (seed != null) {
            Random rnd = new Random(seed);
            for (int i = 0; i < size; i++) {
                vector[i] = rnd.nextInt();
            }
        } else {
            ThreadLocalRandom rnd = ThreadLocalRandom.current();
            for (int i = 0; i < size; i++) {
                vector[i] = rnd.nextInt();
            }
        }
    }

    public int findMaxSequential() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            int v = vector[i];
            if (v > max) max = v;
        }
        return max;
    }

    public int findMaxWithTwoThreads() throws InterruptedException, ExecutionException {
        final int mid = size / 2;
        Callable<Integer> leftTask = () -> {
            int localMax = Integer.MIN_VALUE;
            for (int i = 0; i < mid; i++) {
                int v = vector[i];
                if (v > localMax) localMax = v;
            }
            return localMax;
        };
        Callable<Integer> rightTask = () -> {
            int localMax = Integer.MIN_VALUE;
            for (int i = mid; i < size; i++) {
                int v = vector[i];
                if (v > localMax) localMax = v;
            }
            return localMax;
        };
        ExecutorService executor = Executors.newFixedThreadPool(2);
        try {
            Future<Integer> f1 = executor.submit(leftTask);
            Future<Integer> f2 = executor.submit(rightTask);
            int m1 = f1.get();
            int m2 = f2.get();
            return Math.max(m1, m2);
        } finally {
            executor.shutdown();
        }
    }

    public int size() { return size; }
    public int[] getData() { return vector; }
}
