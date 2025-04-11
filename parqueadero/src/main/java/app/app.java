
package app;
import controller.controlador;
import modelo.parqueadero;
import static modelo.parqueadero.determinarhoradeentradaysalida;
import validar.validar;
import vista.entrada;
import vista.parcial;
import vista.total;
import vista.vistaparqueadero;

public class app { 
    
public static void main(String[] args) {
        float horaEntrada = 6.00f;
        float horaSalida = 22.00f; 
    
        float horas = determinarhoradeentradaysalida(horaEntrada, horaSalida);
        System.out.println("Horas totales: " + horas);
        parqueadero parque = new parqueadero();
        vistaparqueadero vistaparque = new vistaparqueadero();
        entrada ent = new entrada();
        parcial par = new parcial();
        total tot = new total();
        validar val = new validar();
        controlador con = new controlador(parque, vistaparque, ent, par, tot, val);
        vistaparque.getBtnCalcular().setEnabled(false);
        vistaparque.getBtnTotalizar().setEnabled(false);
        con.titulo();
        vistaparque.setVisible(true);
        con.showPane(ent);
    }
}
