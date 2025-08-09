
package app;
import modelo.Cuenta;
import view.VistaConsola;
import controlador.ControladorBanco;

public class BancoApp {
    public static void main(String[] args) {
        // Crear instancias del modelo y vista
        Cuenta cuenta = new Cuenta();
        VistaConsola vista = new VistaConsola();
        
        // Crear controladores (uno por cada hilo)
        ControladorBanco controlador1 = new ControladorBanco(cuenta, vista);
        ControladorBanco controlador2 = new ControladorBanco(cuenta, vista);
        
        // Crear y ejecutar hilos
        Thread t1 = new Thread(controlador1, "Cristian");
        Thread t2 = new Thread(controlador2, "Angie");
        
        System.out.println("Saldo inicial: $" + cuenta.getSaldo());
        
        t1.start();
        t2.start();
        
        // Esperar a que terminen ambos hilos
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        // Mostrar saldo final
        vista.mostrarSaldoFinal(cuenta.getSaldo());
    }
    
}
