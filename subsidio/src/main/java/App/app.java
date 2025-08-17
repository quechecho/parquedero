//Brayan Vega Bolaños - Jose Luis Vides Polo - Arnulfo Domingo Estrada Espire 

package App;

import admonLista.AdmonLista;
import controlador.ControladorSubsidio;
import modelo.estudiantes;
import validar.validar;
import view.Entrada;
import view.SalidasPariales;
import view.Totales;
import view.VistaSubsidios;
import view.VistaLista;

public class app {

   
    public static void main(String[] args) {
    estudiantes est = new estudiantes();
    VistaSubsidios VisSub = new VistaSubsidios();
    Entrada ent = new Entrada();
    Totales tot = new Totales();
    SalidasPariales SalPar = new SalidasPariales();
    validar val = new validar();
    AdmonLista admLista = new AdmonLista();
    VistaLista VisLis = new VistaLista();
    ControladorSubsidio Con = new ControladorSubsidio(est, VisLis, VisSub, ent, SalPar, tot, val, admLista);
    
    Con.titulo();
    
    VisSub.getBtnCalcular().setEnabled(false);
    VisSub.getBtnTotalizar().setEnabled(false);
    VisSub.getBtnAddInicio().setEnabled(false);
    VisSub.getBtnAddFinal().setEnabled(false);
    
    VisSub.setVisible(true);
    VisSub.setLocationRelativeTo(null);
    Con.showPane(ent);
}
}