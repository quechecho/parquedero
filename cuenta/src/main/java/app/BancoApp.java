package app;

import modelo.Cuenta;
import view.VistaConsola;
import controlador.ControladorBanco;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class BancoApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Crear instancias del modelo y vista
                Cuenta cuenta = new Cuenta();
                VistaConsola vista = new VistaConsola();
                
                // Crear controlador principal (con manejo de eventos)
                ControladorBanco controlador = new ControladorBanco(cuenta, vista, true);
                
                // Crear y configurar la ventana principal
                JFrame frame = new JFrame("Simulación Bancaria con Hilos");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(vista);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                
                System.out.println("Aplicación iniciada. Saldo inicial: $" + cuenta.getSaldo());
            }
        });
    }
}