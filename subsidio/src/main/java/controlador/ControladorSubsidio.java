package controlador;

import admonLista.AdmonLista;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;
import modelo.estudiantes;
import validar.validar;
import view.Entrada;
import view.SalidasPariales;
import view.Totales;
import view.VistaLista;
import view.VistaSubsidios;

public class ControladorSubsidio {

    private estudiantes est;
    private final VistaSubsidios visSub;
    private final Entrada ent;
    private final SalidasPariales salPar;
    private final Totales tot;
    private final validar val;
    private final VistaLista visLis;
    private final AdmonLista admLista;
    
    float porSubMat, valPagEst, valSubOng,valPagSub, dinTotSub100, dinTotSub80, dinTotSub60, dinTotSub40, dinTotSub20, dinTotSub;
    float porEstSub100, porEstSub80, porEstSub60, porEstSub40, porEstSub20, porEstSub00;
    int numEstSub100, numEstSub80, numEstSub60, numEstSub40, numEstSub20, numEstSub00, numTotEstSub, numTotEstAfi;
    int nro;
    String nom, ape, ide;
    float proSem, valMatSem;
    
    //Formatos de salida 
    DecimalFormat f1 = new DecimalFormat("###,###,###.##");
    DecimalFormat f2 = new DecimalFormat("#########.#%");
    DecimalFormat f3 = new DecimalFormat("$###,###,###.##");
    
    //Asignar cabecera y valores a la tabla tblsalidaparcial del panel salidaparcial
    String cabecera[] = {"Ident.", "Apellidos", "Nombres", "Val. matSem", "% Sub.", "Val. sub.", "Val. PagEst"};
    String datos[][] = {};
    DefaultTableModel modelo = new DefaultTableModel(datos, cabecera);
    
    private final String cabecera2[] = {"Nombre", "Apellidos", "Ident", "Promedio", "Val. Matrícula"};
    private final String datos2[][] = {};
    private final DefaultTableModel modelo2 = new DefaultTableModel(datos2, cabecera2);
    
    //Constructor
    public ControladorSubsidio(estudiantes est, VistaLista visLis, VistaSubsidios visSub, Entrada ent, SalidasPariales salPar, Totales tot, validar val, AdmonLista admLista) {
        this.est = est;
        this.visSub = visSub;
        this.visLis = visLis;
        this.ent = ent;
        this.salPar = salPar;
        this.tot = tot;
        this.val = val;
        this.admLista = admLista;

        //Adicionar botones existentes
        this.visSub.getBtnValidar().addActionListener(e ->{btnValidar();});
        this.visSub.getBtnCalcular().addActionListener(e ->{btnCalcular();});
        this.visSub.getBtnTotalizar().addActionListener(e ->{btnTotalizar();});
        this.visSub.getBtnLimpiar().addActionListener(e ->{btnLimpiar();});
        this.visSub.getBtnSalir().addActionListener(e ->{System.exit(0);});
        this.salPar.getBtnVolver().addActionListener(e ->{btnVolver();});
        this.tot.getBntVolver().addActionListener(e ->{btnVolver();});
        this.visSub.getBtnVerLista().addActionListener(e -> {btnVerLista();});
        this.visLis.getBtnVolver().addActionListener(e -> {btnVolver();});
        
        // Nuevos action listeners para la lista enlazada
        this.visSub.getBtnAddDespues().addActionListener(e -> {btnAddDespues();});
        this.visSub.getBtnAddInicio().addActionListener(e -> {btnAddInicio();});
        this.visSub.getBtnAddFinal().addActionListener(e -> {btnAddFinal();});
        this.visSub.getBtnDelDespues().addActionListener(e -> {btnDelDespues();});
        this.visSub.getBtnObtener().addActionListener(e -> {btnObtener();});
        this.visLis.getBtnContar().addActionListener(e -> {btnContar();});
        this.visLis.getBtnTodos().addActionListener(e -> {btnTodos();});
        this.visLis.getBtnDelInicio().addActionListener(e -> {btnDelInicio();});
        this.visLis.getBtnDelFinal().addActionListener(e -> {btnDelFinal();});
        
        salPar.getjTblaDatos().setModel(modelo); 
        visLis.getTblLista().setModel(modelo2);
    }
    
    // === MÉTODOS ORIGINALES DEL SISTEMA DE SUBSIDIOS ===
    
    private void btnValidar() {
      if(val.validarNumeroEnteroPositivo(ent.getTextideEst().getText())) {
            est.setIdeEst(ent.getTextideEst().getText());
            if (val.validarNombre(ent.getTextnomEst().getText())) {
                est.setNomEst(ent.getTextnomEst().getText());
                if (val.validarApellido(ent.getTextapeEst().getText())) {
                    est.setApeEst(ent.getTextapeEst().getText());
                    if (val.validarNumeroRealPositivo(ent.getTextproSem().getText())) {
                        est.setProSem(Float.parseFloat(ent.getTextproSem().getText()));
                        if(val.validarNumeroRealPositivo(ent.getTextvalMatSem().getText())) {
                            est.setValMatSem(Float.parseFloat(ent.getTextvalMatSem().getText()));
                            if (est.getIdeEst().isEmpty() || est.getNomEst().isEmpty() || 
                               est.getApeEst().isEmpty() || est.getProSem() == 0 || 
                               est.getValMatSem() == 0) {
                                 JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "Error", JOptionPane.WARNING_MESSAGE);
                                  return;
                             }
                            if (est.getProSem() < 0 || est.getProSem() > 5) {
                             JOptionPane.showMessageDialog(null, "El promedio del semestre debe estar entre 0 y 5", "Error", JOptionPane.WARNING_MESSAGE);
                                    return;
                           }
                            visSub.getBtnAddInicio().setEnabled(true);
                            visSub.getBtnAddFinal().setEnabled(true); 
                            
                        } else {
                            error(ent.getTextvalMatSem(),"Error en el campo valor de matricula, su contenido no es válido");
                        }
                    } else {
                        error(ent.getTextproSem(),"Error en el campo promedio de semestre, su contenido no es válido");
                    }
                } else {
                    error(ent.getTextapeEst(),"Error en el campo apellido, su contenido no es válido");
                }
            } else {
                error(ent.getTextnomEst(),"Error en el campo nombre, su contenido no es válido");
            }
        } else {
            error(ent.getTextideEst(),"Error en el campo identificacion, su contenido no es válido");
        }
    }

    private void btnCalcular() {
        //Procesos parciales
        porSubMat = est.determinarPorcentajeSubsidio(est.getProSem()); // Calcula el porcentaje de subsidio
        valSubOng = est.valorSubsidio(est.getValMatSem(), porSubMat);
        valPagSub = est.getValMatSem() - valSubOng;
        
        switch ((int) porSubMat) {
            case 100:
                numEstSub100++;
                dinTotSub100 += valSubOng;
                break;
            case 80:
                numEstSub80++;
                dinTotSub80 += valSubOng;
                break;
            case 60:
                numEstSub60++;
                dinTotSub60 += valSubOng;
                break;
            case 40:
                numEstSub40++;
                dinTotSub40 += valSubOng;
                break;
            case 20:
                numEstSub20++;
                dinTotSub20 += valSubOng;
                break;
            case 0:
                numEstSub00++;
                break;
        }
        
        //Datos de salida parciales
        Object contenido[] = {est.getIdeEst(), est.getApeEst(), est.getNomEst(), 
            f3.format(est.getValMatSem()), f2.format(porSubMat / 100), f3.format(valSubOng), 
            f3.format(valPagSub)};
        modelo.addRow(contenido);
        desahabilitarbtn();
        showPane(salPar);  
    }

    private void btnTotalizar() {
        // Procesos totales
        dinTotSub = est.sumar5Valores(dinTotSub100, dinTotSub80, dinTotSub60, dinTotSub40, dinTotSub20);
        numTotEstSub = (int) est.sumar5Valores(numEstSub100, numEstSub80, numEstSub60, numEstSub40, numEstSub20);
        numTotEstAfi = est.sumar2Valores(numTotEstSub, numEstSub00);

        // Cálculo de porcentajes
        porEstSub100 = est.calcularPorcentajeSubsidiados(numEstSub100, numTotEstAfi);
        porEstSub80 = est.calcularPorcentajeSubsidiados(numEstSub80, numTotEstAfi);
        porEstSub60 = est.calcularPorcentajeSubsidiados(numEstSub60, numTotEstAfi);
        porEstSub40 = est.calcularPorcentajeSubsidiados(numEstSub40, numTotEstAfi);
        porEstSub20 = est.calcularPorcentajeSubsidiados(numEstSub20, numTotEstAfi);
        porEstSub00 = est.calcularPorcentajeSubsidiados(numEstSub00, numTotEstAfi);

        // Datos de salida totales
        tot.getjTextNumEstSub100().setText(String.valueOf(numEstSub100));
        tot.getjTextNumEstSub80().setText(String.valueOf(numEstSub80));
        tot.getjTextNumEstSub60().setText(String.valueOf(numEstSub60));
        tot.getjTextNumEstSub40().setText(String.valueOf(numEstSub40));
        tot.getjTextNumEstSub20().setText(String.valueOf(numEstSub20));
        tot.getjTextnumEstSub00().setText(String.valueOf(numEstSub00));

        tot.getjTextdinTotSub100().setText(f3.format(dinTotSub100));
        tot.getjTextdinTotSub80().setText(f3.format(dinTotSub80));
        tot.getjTextdinTotSub60().setText(f3.format(dinTotSub60));
        tot.getjTextdinTotSub40().setText(f3.format(dinTotSub40));
        tot.getjTextdinTotSub20().setText(f3.format(dinTotSub20));
 
        // Formato de porcentaje
        tot.getjTextporEstSub100().setText(f2.format(porEstSub100/100));
        tot.getjTextporEstSub80().setText(f2.format(porEstSub80/100));
        tot.getjTextporEstSub60().setText(f2.format(porEstSub60/100));
        tot.getjTextporEstSub40().setText(f2.format(porEstSub40/100));
        tot.getjTextporEstSub20().setText(f2.format(porEstSub20/100));
        tot.getjTextporEstSub00().setText(f2.format(porEstSub00/100));

        tot.getjTextnumTotEstSub().setText(f1.format(numTotEstSub));
        tot.getjTextdinTotOtoSub().setText(f3.format(dinTotSub));
        
        desahabilitarbtn();   
        showPane(tot);
    }

    private void btnLimpiar() {
        ent.getTextideEst().setText("");
        ent.getTextnomEst().setText("");
        ent.getTextapeEst().setText("");
        ent.getTextproSem().setText("");
        ent.getTextvalMatSem().setText("");
        ent.getTextideEst().requestFocus();
    
    }

    private void btnVolver() {
        habilitarbtn();
        showPane(ent);
        btnLimpiar();
    }
    
    public void btnVerLista (){
    showPane(visLis);
    }
    
    public boolean DatoNodo() {
        String nodo = visSub.getTxtNro().getText();
        nodo = nodo.trim();
        return !nodo.isEmpty();
    }
    
    public void btnAddInicio() {
    est = new estudiantes(ide, nom, ape, proSem, valMatSem);
    admLista.InsertarPrincipio(est);
    insercion();
    btnLimpiar();
    visSub.getBtnCalcular().setEnabled(true);
}
        
    public void btnAddFinal() {
    est = new estudiantes(ide, nom, ape, proSem, valMatSem);
    admLista.InsertarFinal(est);
    insercion();
    btnLimpiar();
    visSub.getBtnCalcular().setEnabled(true);
}
    
   public void btnAddDespues() {
    if (DatoNodo()) {
        nro = Integer.parseInt(visSub.getTxtNro().getText());
        est = new estudiantes(ide, nom, ape, proSem, valMatSem);
        admLista.InsertarDespues(nro, est);
        btnLimpiar();
    } else {
        JOptionPane.showMessageDialog(null, "No se especificó la posición del nodo a adicionar...", "Notificación", JOptionPane.WARNING_MESSAGE);
    }
}
    
    public void btnDelInicio() {
        if (admLista.EliminarPrincipio()) {
            JOptionPane.showMessageDialog(null, "Nodo eliminado del inicio...", "Notificación", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No existen nodos para eliminar...", "Notificación", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void btnDelFinal() {
        if (admLista.EliminarFinal()) {
            JOptionPane.showMessageDialog(null, "Nodo eliminado del final...", "Notificación", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No existen nodos para eliminar...", "Notificación", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void btnDelDespues() {
        if (DatoNodo()) {
            nro = Integer.parseInt(visSub.getTxtNro().getText());
            if (admLista.EliminarDespues(nro)) {
                JOptionPane.showMessageDialog(null, "Nodo eliminado en posición " + nro + "...", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese nodo para eliminar...", "Notificación", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe especificar el nodo a eliminar en el campo Nodo Nro...", "Notificación", JOptionPane.WARNING_MESSAGE);
        }
    }
    
   public void btnObtener() {
    if (DatoNodo()) {
        nro = Integer.parseInt(visSub.getTxtNro().getText());
        estudiantes est = admLista.Obtener(nro);
        modelo2.setRowCount(0);
        if (est != null) {
            Object contenido[] = {est.getNomEst(), est.getApeEst(), est.getIdeEst(), est.getProSem(), f3.format(est.getValMatSem())};
            modelo2.addRow(contenido);
            // Cambiar a la vista de lista para mostrar el resultado
            showPane(visLis);
        } else {
            JOptionPane.showMessageDialog(null, "No existe ese nodo...", "Notificación", JOptionPane.WARNING_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Se debe indicar el número del nodo...", "Notificación", JOptionPane.WARNING_MESSAGE);
    }
}
    
    public void btnContar() {
        nro = admLista.Contar();
        if (nro != -99) {
            JOptionPane.showMessageDialog(null, "Número de estudiantes en la lista: " + String.valueOf(nro), "Conteo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Lista vacía...", "Notificación", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void btnTodos() {
    modelo2.setRowCount(0);
    ArrayList<estudiantes> VecEst = new ArrayList<>();
    VecEst = admLista.ObtenerTodos();
    for (estudiantes est : VecEst) {
        Object contenido[] = {est.getNomEst(), est.getApeEst(), est.getIdeEst(), est.getProSem(), f3.format(est.getValMatSem())};
        modelo2.addRow(contenido);
    }
}
    
    
    public void insercion(){
        JOptionPane.showMessageDialog(null, "<html><p style =\"color: green\">Estudiante insertado correctamente en la lista... </p></html>",
                        "Atención", JOptionPane.INFORMATION_MESSAGE);
    }

    public void titulo() {
        visSub.setTitle("Gestión de subsidio");
        visSub.setLocationRelativeTo(null);
        
        TitledBorder borEnt = new TitledBorder("Datos de entrada");
        ent.setBorder(borEnt);
          
        TitledBorder borsalPar = new TitledBorder("Datos de salida");
        salPar.setBorder(borsalPar);
          
        TitledBorder bortot = new TitledBorder("Datos de salidas totales");
        tot.setBorder(bortot);
    }
    
    public void error(javax.swing.JTextField txtName, String msg) {
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(Color.RED));
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
        txtName.setText("");
        txtName.requestFocus();

        // Resetear el color a su valor original (opcional)
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(Color.BLACK));
    }
        
        
    public void showPane(JPanel p) {
        p.setSize(800, 500);
        p.setLocation(0, 0);

        visSub.getContenedor().removeAll();
        visSub.getContenedor().add(p,BorderLayout.CENTER);
        visSub.getContenedor().revalidate();
        visSub.getContenedor().repaint();
    }
    
    public void habilitarbtn(){
        visSub.getBtnValidar().setEnabled(true);
        visSub.getBtnCalcular().setEnabled(true);
        visSub.getBtnTotalizar().setEnabled(true);
        visSub.getBtnLimpiar().setEnabled(true);
        visSub.getBtnSalir().setEnabled(true);
    }
    
    public void desahabilitarbtn(){
        visSub.getBtnValidar().setEnabled(false);
        visSub.getBtnCalcular().setEnabled(false);
        visSub.getBtnTotalizar().setEnabled(false);
        visSub.getBtnLimpiar().setEnabled(false);
        visSub.getBtnSalir().setEnabled(false);
    }
    
    public void habilitarBtnLista(){
        visSub.getBtnAddInicio().setEnabled(true);
        visSub.getBtnAddFinal().setEnabled(true);
        visSub.getBtnAddDespues().setEnabled(true);
        visSub.getBtnAddInicio().setEnabled(true);
        visSub.getBtnAddFinal().setEnabled(true);
        visSub.getBtnDelDespues().setEnabled(true);
        visSub.getBtnObtener().setEnabled(true);
        visLis.getBtnContar().setEnabled(true);
        visLis.getBtnTodos().setEnabled(true);
    }
    
    public void deshabilitarBtnLista(){
        visSub.getBtnAddInicio().setEnabled(false);
        visSub.getBtnAddFinal().setEnabled(false);
        visSub.getBtnAddDespues().setEnabled(false);
        visSub.getBtnAddInicio().setEnabled(false);
        visSub.getBtnAddFinal().setEnabled(false);
        visSub.getBtnDelDespues().setEnabled(false);
        visSub.getBtnObtener().setEnabled(false);
        visLis.getBtnContar().setEnabled(false);
        visLis.getBtnTodos().setEnabled(false);
    }

    public void actionPerformed(ActionEvent e) {
    }
}