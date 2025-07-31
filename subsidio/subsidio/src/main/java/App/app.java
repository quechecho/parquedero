
//Brayan Vega Bolaños - Jose Luis Vides Polo - Arnulfo Domingo Estrada Espir

package App;

import admonArray.AdministradorArray;
import controlador.ControladorSubsidio;
import modelo.estudiantes;
import validar.validar;
import view.Entrada;
import view.SalidasPariales;
import view.Totales;
import view.VerVector;
import view.VistaSubsidios;


public class app {

   
    public static void main(String[] args) {
        estudiantes est        = new estudiantes();
        VistaSubsidios VisSub  = new VistaSubsidios();
        Entrada  ent            = new Entrada();
        Totales tot              = new Totales();
        SalidasPariales SalPar   = new SalidasPariales();
        validar val            = new validar();
        VerVector verVec          = new VerVector();
        AdministradorArray admArr = new AdministradorArray();
        ControladorSubsidio Con = new ControladorSubsidio( est, VisSub, ent, SalPar, tot, val,verVec, admArr);
        Con.titulo();
        
        VisSub.getBtnCalcular().setEnabled(false);
        VisSub.getBtnTotalizar().setEnabled(false);
        VisSub.setVisible(true);
        Con.showPane(ent);

    }
   
}

