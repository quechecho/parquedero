//Brayan Vega Bolaños - Jose Luis Vides Polo - Arnulfo Domingo Estrada Espire 

package App;

import admonArbol.Arbol;
import controlador.ControladorSubsidio;
import modelo.estudiantes;
import validar.validar;
import view.Entrada;
import view.SalidasPariales;
import view.Totales;
import view.VistaArbol;
import view.VistaSubsidios;

public class app {
   
    public static void main(String[] args) {
        estudiantes est = new estudiantes();
        VistaSubsidios VisSub = new VistaSubsidios();
        VistaArbol visArbol = new VistaArbol();
        Entrada ent = new Entrada();
        Totales tot = new Totales();
        SalidasPariales SalPar = new SalidasPariales();
        validar val = new validar();
        Arbol arbolBin = new Arbol(visArbol);
        
        ControladorSubsidio Con = new ControladorSubsidio(
            est, visArbol, VisSub, ent, SalPar, tot, val, arbolBin
        );
        
        Con.titulo();
        
        // Deshabilitar botones inicialmente
        VisSub.getBtnCalcular().setEnabled(false);
        VisSub.getBtnTotalizar().setEnabled(false);
        VisSub.getBtnInsertar().setEnabled(false);
        VisSub.getBtnVer().setEnabled(false);
        
        VisSub.setVisible(true);
        Con.showPane(ent);
    }
}