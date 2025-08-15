// juan camilo padilla arnulfo estrada espir maria camila diego sanchez

package app;
import controlador.Controlador;
import modelo.Modelo;
import vista.Entrada;

public class App {
    private static final int DEFAULT_SIZE = 500_000_000; // 500 millones

    public static void main(String[] args) {
        int size = DEFAULT_SIZE;
        Long seed = null; // semilla opcional reproducible

        if (args.length > 0) {
            try {
                size = Integer.parseInt(args[0]);
            } catch (NumberFormatException ex) {
                System.out.println("Argumento de tamaño inválido, usando 500,000,000.");
                size = DEFAULT_SIZE;
            }
        } else {
            System.out.println("Usando tamaño por defecto: " + DEFAULT_SIZE + ". Puedes pasar otro tamaño como primer argumento.");
        }
        if (args.length > 1) {
            try {
                seed = Long.parseLong(args[1]);
                System.out.println("Usando semilla reproducible: " + seed);
            } catch (NumberFormatException ex) {
                System.out.println("Semilla inválida, se usará fuente aleatoria no reproducible.");
            }
        }

        if (size >= 100_000_000) {
            System.out.println("ADVERTENCIA: tamaños grandes requieren mucha memoria (~" + (size * 4L / (1024*1024)) + " MB para int). Ajusta -Xmx, ej.: -Xms4g -Xmx6g");
        }

        Modelo model = new Modelo(size);
        Entrada view = new Entrada();
        Controlador controller = new Controlador(model, view, seed);
        controller.run();
    }
}




