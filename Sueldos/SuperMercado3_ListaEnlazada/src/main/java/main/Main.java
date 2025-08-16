
package main;

/*
participantes =
Jesus Dacid Sanchez Pacheco
Victor Manuel Salgado Gonzales
*/

import admonLista.AdmonLista;
import controller.Controlador;
import java.util.HashSet;
import model.SuperMercado3;
import validate.Validar;
import view.Entrada;
import view.Parciales;
import view.Principal;
import view.Total;
import view.VisLista;

public class Main {


    public static void main(String[] args) {
        SuperMercado3  Sup     = new SuperMercado3();
        Principal pri          = new Principal();
        Entrada ent            = new Entrada();
        Parciales par          = new Parciales();
        Total tot              = new Total();
        Validar val            = new Validar();
        AdmonLista admLista    = new AdmonLista();
        VisLista visLista      = new VisLista();
        Controlador con = new Controlador(Sup, pri, ent, par, tot, val, admLista, visLista);
        con.titulo();
        pri.getBtnCalcular().setEnabled(false);
        pri.getBtnTotalizar().setEnabled(false);
        pri.getBtnAddInicio().setEnabled(false);
        pri.getBtnAddFinal().setEnabled(false);
        
        pri.setVisible(true);
        pri.setLocationRelativeTo(null);
        con.showPane(ent);
    }
}
