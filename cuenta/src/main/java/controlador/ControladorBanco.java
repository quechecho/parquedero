
package controlador;
import modelo.Cuenta;
import view.VistaConsola;

public class ControladorBanco implements Runnable {
    private Cuenta cuenta;
    private VistaConsola vista;
    
    public ControladorBanco(Cuenta cuenta, VistaConsola vista) {
        this.cuenta = cuenta;
        this.vista = vista;
    }
    
    @Override
    public void run() {
        for (int x = 0; x < 5; x++) {
            hacerRetiro(100000.0);
            
            // Verificar si la cuenta está sobregirada
            if (cuenta.getSaldo() < 0) {
                vista.mostrarCuentaSobregirada();
            }
            
            try {
                Thread.sleep(100); // Pequeña pausa entre retiros
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    private void hacerRetiro(Double cantidad) {
        String nombreHilo = Thread.currentThread().getName();
        
        // Sincronización mejorada para evitar condiciones de carrera
        synchronized (cuenta) {
            if (cuenta.validarSaldo(cantidad)) {
                vista.mostrarRetiroIniciado(nombreHilo);
                
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                
                cuenta.retirar(cantidad);
                vista.mostrarRetiroCompletado(nombreHilo);
            } else {
                vista.mostrarSaldoInsuficiente(nombreHilo);
            }
        }
    }
} 
    
    

