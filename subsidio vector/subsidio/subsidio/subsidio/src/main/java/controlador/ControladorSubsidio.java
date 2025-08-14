
package controlador;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;
import admonArray.AdministradorArray;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import modelo.estudiantes;
import validar.validar;
import view.Entrada;
import view.SalidasPariales;
import view.Totales;
import view.VerVector;
import view.VistaSubsidios;

public class ControladorSubsidio implements ActionListener {

    private final estudiantes est;
    private final VistaSubsidios visSub;
    private final Entrada ent;
    private final SalidasPariales salPar;
    private final Totales tot;
    private final validar val;
    private final VerVector verVec;
    private final AdministradorArray admArr;
    
    float porSubMat, valPagEst, valSubOng,valPagSub, dinTotSub100, dinTotSub80, dinTotSub60, dinTotSub40, dinTotSub20, dinTotSub;
    float porEstSub100, porEstSub80, porEstSub60, porEstSub40, porEstSub20, porEstSub00;
    int numEstSub100, numEstSub80, numEstSub60, numEstSub40, numEstSub20, numEstSub00, numTotEstSub, numTotEstAfi, i;
    
     DecimalFormat f1 = new DecimalFormat("###,###,###.##");
    DecimalFormat f2 = new DecimalFormat("#########.#%");
    DecimalFormat f3 = new DecimalFormat("$###,###,###.##");
    
     String cabecera[] = {"Ident.", "Apellidos", "Nombres", "Val. matSem", "% Sub.", "Val. sub.", "Val. PagEst"};
    String datos[][] = {};
    DefaultTableModel modelo1 = new DefaultTableModel(datos, cabecera);
    
    String cabecera2[] = {"Identificacion", "Apellidos", "Nombres", "Val. matSem", "Promedio", "Val. subsidio"};
    String datos2[][] = {};
    DefaultTableModel modelo2 = new DefaultTableModel(datos2, cabecera2);
    
    ArrayList<estudiantes> vecBus = new ArrayList<>();
    
    
    public ControladorSubsidio(estudiantes est, VistaSubsidios visSub, Entrada ent, SalidasPariales salPar, Totales tot, validar val, VerVector verVec, AdministradorArray admArr) {
        this.est = est;
        this.visSub = visSub;
        this.ent = ent;
        this.salPar = salPar;
        this.tot = tot;
        this.val = val;
        this.verVec = verVec;
        this.admArr = admArr; 
    
        
        this.visSub.getBtnValidar().addActionListener(e -> {btnValidar();});
        this.visSub.getBtnCalcular().addActionListener(e -> {btnCalcular();});
        this.visSub.getBtnTotalizar().addActionListener(e -> {btnTotalizar();});
        this.visSub.getBtnLimpiar().addActionListener(e -> {btnLimpiar();});
        this.visSub.getBtnSalir().addActionListener(e -> {System.exit(0);});
        this.visSub.getBtnAdicionar().addActionListener(e -> {btnAdicionar();});
       this.visSub.getBtnVer().addActionListener(e -> {btnVer();});
        
        this.salPar.getBtnVolver().addActionListener(e -> {btnVolver();});
       
        
        this.tot.getBntVolver().addActionListener(e -> {btnVolver();});
      this.visSub.getBtnVer().addActionListener(e -> {btnVer();});

        this.ent.getBtnBuscarIdeEst().addActionListener(e -> {btnBuscarIdeEst();});
        this.ent.getBtnBuscarapeEst().addActionListener(e -> {btnBuscarapeEst();});
        this.ent.getBtnBuscarnomEst().addActionListener(e -> {btnBuscarnomEst();});
        this.ent.getBtnBuscarproSem().addActionListener(e -> {btnBuscarproSem();});
        this.ent.getBtnBuscarvalmatSem().addActionListener(e -> {btnBuscarvalmatSem();});
        this.ent.getBtnOrdenarIdeEst().addActionListener(e -> {btnOrdenarIdeEst();});
        this.ent.getBtnOrdenarapeEst().addActionListener(e -> {btnOrdenarapeEst();});
        this.ent.getBtnOrdenarnomEst().addActionListener(e -> {btnOrdenarnomEst();});
        this.ent.getBtnOrdenarproSem().addActionListener(e -> {btnOrdenarproSem();});
        this.ent.getBtnOrdenarvalmatSem().addActionListener(e -> {btnOrdenarvalmatSem();});
        this.ent.getBtnEditar().addActionListener(e -> {btnEditar();});
        this.ent.getBtnGuardar().addActionListener(e -> {btnGuardar();});
        this.ent.getBtnEliminar().addActionListener(e -> {btnEliminar();});
        this.verVec.getBtnVolver().addActionListener(e -> {btnVolver();});
        
        alinearModelo1();
        alinearModelo2();
       
        admArr.crearVector();
}
    
    

    private void btnValidar() {
      
        if( val.validarNumeroEnteroPositivo(ent.getTextideEst().getText())) {
            est.setIdeEst(ent.getTextideEst().getText());
               if (val.validarNombre(ent.getTextnomEst().getText())) {
                 est.setNomEst(ent.getTextnomEst().getText());
                     if (val.validarApellido(ent.getTextapeEst().getText())) {
                         est.setApeEst(ent.getTextapeEst().getText());
                         if (val.validarNumeroRealPositivo(ent.getTextproSem().getText())) {
                             est.setProSem(Float.parseFloat(ent.getTextproSem().getText()));
                             if(val.validarNumeroRealPositivo(ent.getTextvalMatSem().getText())) {
                                
                                 est.setValMatSem(Float.parseFloat(ent.getTextvalMatSem().getText()));
                             
                            visSub.getBtnCalcular().setEnabled(true);
                            visSub.getBtnTotalizar().setEnabled(true);
                            visSub.getBtnAdicionar().setEnabled(true);
                            
                             }else {
                             error (ent.getTextvalMatSem(),"Error en el campo valor de matricula, su contenido no es válido");
                                    }
                        }else {
                         error (ent.getTextproSem(),"Error en el campo promedio de semestre, su contenido no es válido");
                                }
                    }else {
                     error (ent.getTextapeEst(),"Error en el campo apellido, su contenido no es válido");
                            }
                }else {
                  error (ent.getTextnomEst(),"Error en el campo nombre, su contenido no es válido");
                       }
            }else {
            error (ent.getTextideEst(),"Error en el campo identificacion, su contenido no es válido");
                    }
    }
    
    public void btnAdicionar() {
        estudiantes mb = new estudiantes(est.getIdeEst(),  
        est.getNomEst(),   
        est.getApeEst(),     
        est.getValMatSem(),  
        est.getProSem()      );
        admArr.adicionar(mb);
       // visSub.getBtnVer().setEnabled(true);
        visSub.getBtnCalcular().setEnabled(true);
        visSub.getBtnTotalizar().setEnabled(true);
        visSub.getBtnAdicionar().setEnabled(false);
        habilitarbtn();
        btnLimpiar();
        
    }
    
   public void btnVer() {
    modelo2.setRowCount(0);
    for (estudiantes mb : admArr.getvecEst()) {
        // Calcular el subsidio que recibe el estudiante
        float porSubMat = mb.determinarPorcentajeSubsidio(mb.getProSem());
        float valSubOng = mb.valorSubsidio(mb.getValMatSem(), porSubMat);
        
        Object contenido[] = {
            mb.getIdeEst(),                    
            mb.getApeEst(),                    
            mb.getNomEst(),                    
            f3.format(mb.getValMatSem()),
            f1.format(mb.getProSem()),      
            f3.format(valSubOng)               
        };
        modelo2.addRow(contenido);
    }
    desahabilitarbtn();
    showPane(verVec);
}

    private void btnCalcular() {
        modelo1.setRowCount(0);
        
        // Reiniciar contadores y totales
        numEstSub100 = 0;
        numEstSub80 = 0;
        numEstSub60 = 0;
        numEstSub40 = 0;
        numEstSub20 = 0;
        numEstSub00 = 0;
        dinTotSub100 = 0;
        dinTotSub80 = 0;
        dinTotSub60 = 0;
        dinTotSub40 = 0;
        dinTotSub20 = 0;
        
        // Mostrar todos los estudiantes del vector
        for (estudiantes estudiante : admArr.getvecEst()) {
            float porcentajeSubsidio = estudiante.determinarPorcentajeSubsidio(estudiante.getProSem());
            float valorSubsidio = estudiante.valorSubsidio(estudiante.getValMatSem(), porcentajeSubsidio);
            float valorPagar = estudiante.getValMatSem() - valorSubsidio;
            
            // Actualizar contadores y totales
            switch ((int) porcentajeSubsidio) {
                case 100:
                    numEstSub100++;
                    dinTotSub100 += valorSubsidio;
                    break;
                case 80:
                    numEstSub80++;
                    dinTotSub80 += valorSubsidio;
                    break;
                case 60:
                    numEstSub60++;
                    dinTotSub60 += valorSubsidio;
                    break;
                case 40:
                    numEstSub40++;
                    dinTotSub40 += valorSubsidio;
                    break;
                case 20:
                    numEstSub20++;
                    dinTotSub20 += valorSubsidio;
                    break;
                case 0:
                    numEstSub00++;
                    break;
            }
            
            // Agregar a la tabla
            Object contenido[] = {
                estudiante.getIdeEst(),
                estudiante.getNomEst(),
                estudiante.getApeEst(),
                f3.format(estudiante.getValMatSem()),
                f2.format(porcentajeSubsidio / 100),
                f3.format(valorSubsidio),
                f3.format(valorPagar)
            };
            modelo1.addRow(contenido);
        }
        
        validarEstudiante();
        desahabilitarbtn();
        showPane(salPar);
    }

      
    private void btnTotalizar() {
    
    dinTotSub = est.sumar5Valores(dinTotSub100, dinTotSub80, dinTotSub60, dinTotSub40, dinTotSub20);
    numTotEstSub = (int) est.sumar5Valores(numEstSub100, numEstSub80, numEstSub60, numEstSub40, numEstSub20);
    numTotEstAfi = est.sumar2Valores(numTotEstSub, numEstSub00);

    porEstSub100 = est.calcularPorcentajeSubsidiados(numEstSub100, numTotEstAfi);
    porEstSub80 =  est.calcularPorcentajeSubsidiados(numEstSub80, numTotEstAfi);
    porEstSub60 =  est.calcularPorcentajeSubsidiados(numEstSub60, numTotEstAfi);
    porEstSub40 = est.calcularPorcentajeSubsidiados(numEstSub40, numTotEstAfi);
    porEstSub20 = est.calcularPorcentajeSubsidiados(numEstSub20, numTotEstAfi);
    porEstSub00 = est.calcularPorcentajeSubsidiados(numEstSub00, numTotEstAfi);
    
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
 
    tot.getjTextporEstSub100().setText(f2.format(porEstSub100/100));
    tot.getjTextporEstSub80().setText(f2.format(porEstSub80/100));
    tot.getjTextporEstSub60().setText(f2.format(porEstSub60/100));
    tot.getjTextporEstSub40().setText(f2.format(porEstSub40/100));
    tot.getjTextporEstSub20().setText(f2.format(porEstSub20/100));
    tot.getjTextporEstSub00().setText(f2.format(porEstSub00/100));

    tot.getjTextnumTotEstSub().setText(f1.format(numTotEstSub));
    tot.getjTextdinTotOtoSub().setText(f3.format(dinTotSub));
        System.out.println(porEstSub100);
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
        habilitarTxt();
        deshabilitarCrud();
  
    }
    
    public void btnBuscarIdeEst() {
    try {
        i = admArr.buscarideEst(ent.getTextideEst().getText());
        if (i != -1) {
            deshabilitarTxt();
            ent.getTextnomEst().setText(admArr.getvecEst().get(i).getNomEst());
            ent.getTextapeEst().setText(admArr.getvecEst().get(i).getApeEst());
            ent.getTextproSem().setText(String.valueOf(admArr.getvecEst().get(i).getProSem()));
            ent.getTextvalMatSem().setText(f3.format(admArr.getvecEst().get(i).getValMatSem()));
            habilitarCrud();
        } else {
            JOptionPane.showMessageDialog(null, "<html><p style =\"color: red\">No se encuentra la identificación buscada</p></html>",
                    "Atención", JOptionPane.WARNING_MESSAGE);
            ent.getTextideEst().setText("");
            ent.getTextideEst().requestFocus();
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "<html><p style =\"color: red\">Error: " + ex.getMessage() + "</p></html>", 
                "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    public void btnBuscarapeEst(){
    vecBus = admArr.buscarapeEst(ent.getTextapeEst().getText());
    if(vecBus.isEmpty()){
        JOptionPane.showMessageDialog(null, "<html><p style =\"color: red\">No se encuentra el apellido buscado</p></html>",
                    "Atención", JOptionPane.INFORMATION_MESSAGE);
        btnLimpiar();
    }else
        verBusqueda(vecBus);
}

public void btnBuscarnomEst(){
    vecBus = admArr.buscarnomEst(ent.getTextnomEst().getText());
    if(vecBus.isEmpty()){
        JOptionPane.showMessageDialog(null, "<html><p style =\"color: red\">No se encuentra el nombre buscado</p></html>",
                    "Atención", JOptionPane.INFORMATION_MESSAGE);
        btnLimpiar();
    }else
        verBusqueda(vecBus);
}

public void btnBuscarproSem(){
    vecBus = admArr.buscarproSem(ent.getTextproSem().getText());
    if(vecBus.isEmpty()){
        JOptionPane.showMessageDialog(null, "<html><p style =\"color: red\">No se encuentra el promedio buscado</p></html>",
                    "Atención", JOptionPane.INFORMATION_MESSAGE);
        btnLimpiar();
    }else
        verBusqueda(vecBus);
}

public void btnBuscarvalmatSem(){
    vecBus = admArr.buscarvalmatSem(ent.getTextvalMatSem().getText());
    if(vecBus.isEmpty()){
        JOptionPane.showMessageDialog(null, "<html><p style =\"color: red\">No se encuentra el valor de matrícula buscado</p></html>",
                    "Atención", JOptionPane.INFORMATION_MESSAGE);
        btnLimpiar();
    }else
        verBusqueda(vecBus);
}

public void btnOrdenarIdeEst(){
    admArr.ordenarIdentificacion();
    //btnVer();
}

public void btnOrdenarapeEst(){
    admArr.ordenarApellido();
    btnVer();
}

public void btnOrdenarnomEst(){
    admArr.ordenarNombre();
    btnVer();
}

public void btnOrdenarproSem(){
    admArr.ordenarpromediosemestre();
   btnVer();
}

public void btnOrdenarvalmatSem(){
    admArr.ordenarvalormateriasemestre();
    btnVer();
}


 public void btnEditar(){
        habilitarTxt();
        ent.getTextideEst().setEditable(false);
    }

public void btnGuardar(){
    
    admArr.getvecEst().get(i).setApeEst(ent.getTextapeEst().getText());
    admArr.getvecEst().get(i).setNomEst(ent.getTextnomEst().getText());
    admArr.getvecEst().get(i).setValMatSem(Float.parseFloat(ent.getTextvalMatSem().getText()));
    admArr.getvecEst().get(i).setProSem(Float.parseFloat(ent.getTextproSem().getText()));
    
    JOptionPane.showMessageDialog(null, "<html><p style =\"color: green\">Registro actualizado</p></html>",
                    "Atención", JOptionPane.INFORMATION_MESSAGE);
    btnLimpiar();
        
    }

public void btnEliminar(){
        admArr.eliminar(i);
        JOptionPane.showMessageDialog(null, "<html><p style =\"color: green\">Regitro eliminado</p></htnl>",
                        "Aención", JOptionPane.INFORMATION_MESSAGE);
        btnLimpiar();
    }

    private void btnVolver() {
         habilitarbtn();
         showPane(ent);
        btnLimpiar();
    }
    
  public void verBusqueda(ArrayList<estudiantes> vecBus){
    modelo2.setRowCount(0);
    for (estudiantes mb : vecBus) {
        Object contenido[] = {mb.getIdeEst(), mb.getApeEst(), mb.getNomEst(), f3.format(mb.getValMatSem()), mb.getProSem()};
        modelo2.addRow(contenido);
    }
    desahabilitarbtn();
    showPane(verVec);
}

    public void titulo() {
        visSub.setTitle("Gestion de subsidio");
        visSub.setLocationRelativeTo(null);
        
         TitledBorder borEnt = new TitledBorder("Datos de entrada");
          ent.setBorder(borEnt);
          
         TitledBorder borsalPar = new TitledBorder("Datos de salida");
          salPar.setBorder(borsalPar);
          
         TitledBorder bortot = new TitledBorder("datos de salidas totales");
         tot.setBorder(bortot);
    
    }
    
     
    public void error(javax.swing.JTextField txtName, String msg) {
       
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(Color.RED));
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
        txtName.setText("");
        txtName.requestFocus();

        UIManager.put("OptionPane.messageForeground", new ColorUIResource(Color.BLACK));
    }
        
    public void validarEstudiante() {
    
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
    
  
    }
        
    
    public void showPane(JPanel p) {
        p.setSize(800, 500);
        p.setLocation(0, 0);

        visSub.getContenedor().removeAll();
        visSub.getContenedor().add(p,BorderLayout.CENTER);
        visSub.getContenedor().revalidate();
        visSub.getContenedor().repaint();
    }
    
    public void deshabilitarTxt(){
        ent.getTextideEst().setEditable(false);
        ent.getTextapeEst().setEditable(false);
        ent.getTextnomEst().setEditable(false);
        ent.getTextproSem().setEditable(false);
        ent.getTextvalMatSem().setEnabled(false);
    }
    
     public void habilitarTxt(){
        ent.getTextideEst().setEditable(true);
        ent.getTextapeEst().setEditable(true);
        ent.getTextnomEst().setEditable(true);
        ent.getTextproSem().setEditable(true);
        ent.getTextvalMatSem().setEnabled(true);
        
    }
     
    public void deshabilitarCrud(){
        ent.getBtnEditar().setEnabled(false);
        ent.getBtnGuardar().setEnabled(false);
        ent.getBtnEliminar().setEnabled(false);
    }
    
    public void habilitarCrud(){
        ent.getBtnEditar().setEnabled(true);
        ent.getBtnGuardar().setEnabled(true);
        ent.getBtnEliminar().setEnabled(true);
    }
    
    public void habilitarbtn(){
        visSub.getBtnValidar().setEnabled(true);
        visSub.getBtnCalcular().setEnabled(true);
        visSub.getBtnTotalizar().setEnabled(true);
        visSub.getBtnLimpiar().setEnabled(true);
        visSub.getBtnSalir().setEnabled(true);
       visSub.getBtnVer().setEnabled(true);
        
        ent.getBtnBuscarIdeEst().setEnabled(true);
        ent.getBtnBuscarapeEst().setEnabled(true);
        ent.getBtnBuscarnomEst().setEnabled(true);
        ent.getBtnBuscarproSem().setEnabled(true);
        ent.getBtnBuscarvalmatSem().setEnabled(true);
        ent.getBtnOrdenarapeEst().setEnabled(true);
        ent.getBtnOrdenarIdeEst().setEnabled(true);
        ent.getBtnOrdenarproSem().setEnabled(true);
        ent.getBtnOrdenarvalmatSem().setEnabled(true);
        ent.getBtnOrdenarnomEst().setEnabled(true); 
        
    }
    
    public void desahabilitarbtn(){
        visSub.getBtnValidar().setEnabled(false);
        visSub.getBtnAdicionar().setEnabled(false);
        visSub.getBtnCalcular().setEnabled(false);
        visSub.getBtnTotalizar().setEnabled(false);
        visSub.getBtnLimpiar().setEnabled(false);
        visSub.getBtnSalir().setEnabled(false);
       
    }
      
    public void deshabilitarBtnVisSubent(){
        visSub.getBtnAdicionar().setEnabled(false);
        visSub.getBtnCalcular().setEnabled(false);
        visSub.getBtnTotalizar().setEnabled(false);
       visSub.getBtnVer().setEnabled(false);
       ent.getBtnBuscarIdeEst().setEnabled(false);
       ent.getBtnBuscarapeEst().setEnabled(false);
       ent.getBtnBuscarnomEst().setEnabled(false);
       ent.getBtnBuscarproSem().setEnabled(false);
       ent.getBtnBuscarvalmatSem().setEnabled(false);
       ent.getBtnOrdenarapeEst().setEnabled(false);
       ent.getBtnOrdenarIdeEst().setEnabled(false);
       ent.getBtnOrdenarproSem().setEnabled(false);
       ent.getBtnOrdenarvalmatSem().setEnabled(false);
       ent.getBtnOrdenarnomEst().setEnabled(false);
       ent.getBtnEditar().setEnabled(false);
       ent.getBtnGuardar().setEnabled(false);
       ent.getBtnEliminar().setEnabled(false);
    
    }

    public void actionPerformed(ActionEvent e) {
        
    }
    public final void alinearModelo1() {
        
        salPar.getjTblaDatos().setModel(modelo1);
        TableColumnModel columnModel1 = salPar.getjTblaDatos().getColumnModel();
        
        DefaultTableCellRenderer renderer1 = new DefaultTableCellRenderer();
        renderer1.setHorizontalAlignment(SwingConstants.RIGHT);
        columnModel1.getColumn(0).setCellRenderer(renderer1);
        columnModel1.getColumn(3).setCellRenderer(renderer1);
        columnModel1.getColumn(4).setCellRenderer(renderer1);
        columnModel1.getColumn(5).setCellRenderer(renderer1);
        columnModel1.getColumn(6).setCellRenderer(renderer1);
        
    }
    
    public final void alinearModelo2() {
        verVec.getTblVector().setModel(modelo2);

        TableColumnModel columnModel2 = verVec.getTblVector().getColumnModel();
            
        DefaultTableCellRenderer renderer1 = new DefaultTableCellRenderer();
        renderer1.setHorizontalAlignment(SwingConstants.RIGHT);
        columnModel2.getColumn(0).setCellRenderer(renderer1);
        
        DefaultTableCellRenderer renderer2 = new DefaultTableCellRenderer();
        renderer2.setHorizontalAlignment(SwingConstants.CENTER);
        columnModel2.getColumn(3).setCellRenderer(renderer2);
        columnModel2.getColumn(4).setCellRenderer(renderer2);
        columnModel2.getColumn(5).setCellRenderer(renderer2);
        
        
    }

   
    
    }

