package controlador;

import java.util.concurrent.ExecutionException;
import modelo.Modelo;
import vista.Vista;

public class Controlador {
    private final Modelo model;
    private final Vista view;
    private final Long seed;

    public Controlador(Modelo model, Vista view, Long seed) {
        this.model = model;
        this.view = view;
        this.seed = seed;
    }

    public void run() {
        view.showHeader(model.size());
        view.showMemoryAdvice();
        long t0 = System.nanoTime();
        try {
            model.generate(seed);
        } catch (OutOfMemoryError e) {
            view.showWarning("Falta de memoria generando el vector: considera reducir tamaño o aumentar -Xmx");
            return;
        }
        long t1 = System.nanoTime();
        view.showInfo(String.format("Generación completada en %,.2f s", (t1 - t0) / 1_000_000_000.0));

        try {
            System.gc();
            Thread.sleep(200);

            long s0 = System.nanoTime();
            int maxSeq = model.findMaxSequential();
            long s1 = System.nanoTime();
            long timeSeqNs = s1 - s0;
            long timeSeqMs = timeSeqNs / 1_000_000;
            view.showResult("Sin hilos", maxSeq, timeSeqMs);

            long p0 = System.nanoTime();
            int maxPar = model.findMaxWithTwoThreads();
            long p1 = System.nanoTime();
            long timeParNs = p1 - p0;
            long timeParMs = timeParNs / 1_000_000;
            view.showResult("Con 2 hilos", maxPar, timeParMs);

            if (maxSeq != maxPar) {
                view.showWarning("Los máximos difieren entre secuencial y paralelo! (posible error)");
            } else {
                view.showInfo("Máximo verificado: idéntico en ambas búsquedas.");
            }
            if (timeParNs > 0) {
                double speedup = (double) timeSeqNs / (double) timeParNs;
                view.showInfo(String.format("Speedup (secuencial/paralelo): %.3f x", speedup));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            view.showWarning("Ejecución interrumpida.");
        } catch (ExecutionException e) {
            view.showWarning("Error en ejecución paralela: " + e.getMessage());
        }
    }
}
