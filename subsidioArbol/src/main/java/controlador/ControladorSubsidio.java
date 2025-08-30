package controlador;

import admonArbol.Arbol;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import modelo.estudiantes;
import validar.validar;
import view.Entrada;
import view.SalidasPariales;
import view.Totales;
import view.VistaArbol;
import view.VistaSubsidios;

public class ControladorSubsidio {

    private final estudiantes est;
    private final VistaSubsidios visSub;
    private final VistaArbol visArbol;
    private final Entrada ent;
    private final SalidasPariales salPar;
    private final Totales tot;
    private final validar val;
    private final Arbol arbolBin;
    
    float porSubMat, valPagEst, valSubOng, valPagSub, dinTotSub100, dinTotSub80, dinTotSub60, dinTotSub40, dinTotSub20, dinTotSub;
    float porEstSub100, porEstSub80, porEstSub60, porEstSub40, porEstSub20, porEstSub00;
    int numEstSub100, numEstSub80, numEstSub60, numEstSub40, numEstSub20, numEstSub00, numTotEstSub, numTotEstAfi;
    
    //Formatos de salida 
    DecimalFormat f1 = new DecimalFormat("###,###,###.##");
    DecimalFormat f2 = new DecimalFormat("#########.#%");
    DecimalFormat f3 = new DecimalFormat("$###,###,###.##");
    
    //Asignar cabecera y valores a la tabla tblsalidaparcial del panel salidaparcial
    String cabecera[] = {"Ident.", "Apellidos", "Nombres", "Val. matSem", "% Sub.", "Val. sub.", "Val. PagEst"};
    String datos[][] = {};
    DefaultTableModel modelo = new DefaultTableModel(datos, cabecera);
    
    //Constructor
    public ControladorSubsidio(estudiantes est, VistaArbol visArbol, VistaSubsidios visSub, Entrada ent, SalidasPariales salPar, Totales tot, validar val, Arbol arbolBin) {
        this.est = est;
        this.visSub = visSub;
        this.visArbol = visArbol;
        this.ent = ent;
        this.salPar = salPar;
        this.tot = tot;
        this.val = val;
        this.arbolBin = arbolBin;

        this.visSub.getBtnValidar().addActionListener(e ->{btnValidar();});
        this.visSub.getBtnCalcular().addActionListener(e ->{btnCalcular();});
        this.visSub.getBtnTotalizar().addActionListener(e ->{btnTotalizar();});
        this.visSub.getBtnLimpiar().addActionListener(e ->{btnLimpiar();});
        this.visSub.getBtnSalir().addActionListener(e ->{System.exit(0);});
        this.salPar.getBtnVolver().addActionListener(e ->{btnVolver();});
        this.tot.getBntVolver().addActionListener(e ->{btnVolver();});
        
        //Action listeners para botones del árbol en VistaSubsidios
        this.visSub.getBtnInsertar().addActionListener(e -> {btnInsertar();});
        this.visSub.getBtnBuscar().addActionListener(e -> {btnBuscar();});
        this.visSub.getBtnEliminar().addActionListener(e -> {btnEliminar();});
        this.visSub.getBtnVer().addActionListener(e -> {btnVerArbol();});
        
        //Action listeners para botones en VistaArbol
        this.visArbol.getBtnPreOrden().addActionListener(e -> {btnPreOrden();});
        this.visArbol.getBtnInOrden().addActionListener(e -> {btnInOrden();});
        this.visArbol.getBtnPostOrden().addActionListener(e -> {btnPostOrden();});
        this.visArbol.getBtnPorNiveles().addActionListener(e -> {btnPorNiveles();});
        this.visArbol.getBtnContar().addActionListener(e -> {btnContar();});
        this.visArbol.getBtnAltura().addActionListener(e -> {btnAltura();});
        this.visArbol.getBtnHojas().addActionListener(e -> {btnHojas();});
        this.visArbol.getBtnInternos().addActionListener(e -> {btnInternos();});
        this.visArbol.getBtnBalanceado().addActionListener(e -> {btnBalanceado();});
        this.visArbol.getBtnVolver().addActionListener(e -> {btnVolverDesdeArbol();});
        
        //Asignar el modelo a las tablas
        salPar.getjTblaDatos().setModel(modelo); 
        visArbol.getTblestudiante().setModel(arbolBin.modelo);
    }
    private void btnValidar() {
        if( val.validarNumeroEnteroPositivo(ent.getjTextideEst().getText())) {
            est.setIdeEst(ent.getjTextideEst().getText());
               if (val.validarNombre(ent.getjTextnomEst().getText())) {
                 est.setNomEst(ent.getjTextnomEst().getText());
                     if (val.validarApellido(ent.getjTextapeEst().getText())) {
                         est.setApeEst(ent.getjTextapeEst().getText());
                         if (val.validarNumeroRealPositivo(ent.getjTextproSem().getText())) {
                             est.setProSem(Float.parseFloat(ent.getjTextproSem().getText()));
                             if(val.validarNumeroRealPositivo(ent.getjTextvalMatSem().getText())) {
                                
                                 est.setValMatSem(Float.parseFloat(ent.getjTextvalMatSem().getText()));
                             
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
                            
                            visSub.getBtnCalcular().setEnabled(true);
                            visSub.getBtnTotalizar().setEnabled(true);
                            visSub.getBtnInsertar().setEnabled(true);
                            visSub.getBtnBuscar().setEnabled(true);
                            visSub.getBtnEliminar().setEnabled(true);
                            visSub.getBtnVer().setEnabled(true);
                            
                             }else {
                             error (ent.getjTextvalMatSem(),"Error en el campo valor de matricula, su contenido no es válido");
                                    }
                        }else {
                         error (ent.getjTextproSem(),"Error en el campo promedio de semestre, su contenido no es válido");
                                }
                    }else {
                     error (ent.getjTextapeEst(),"Error en el campo apellido, su contenido no es válido");
                            }
                }else {
                  error (ent.getjTextnomEst(),"Error en el campo nombre, su contenido no es válido");
                       }
            }else {
            error (ent.getjTextideEst(),"Error en el campo identificacion, su contenido no es válido");
                    }
    }

   private void btnCalcular() {
        modelo.setRowCount(0);      
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
        
        ArrayList<estudiantes> listaEstudiantes = arbolBin.obtenerTodos();
        
        for (estudiantes estudiante : listaEstudiantes) {
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
            estudiante.getApeEst(),    // ✅ APELLIDOS PRIMERO
            estudiante.getNomEst(),    // ✅ NOMBRES DESPUÉS
            f3.format(estudiante.getValMatSem()),
            f2.format(porcentajeSubsidio / 100),
            f3.format(valorSubsidio),
            f3.format(valorPagar)
            };
            modelo.addRow(contenido);
        }
        
        showPane(salPar);
    }

    private void btnTotalizar() {
        // Procesos totales
        dinTotSub = est.sumar5Valores(dinTotSub100, dinTotSub80, dinTotSub60, dinTotSub40, dinTotSub20);
        numTotEstSub = (int) est.sumar5Valores(numEstSub100, numEstSub80, numEstSub60, numEstSub40, numEstSub20);
        numTotEstAfi = est.sumar2Valores(numTotEstSub, numEstSub00);

        // Cálculo de porcentajes
        porEstSub100 = est.calcularPorcentajeSubsidiados(numEstSub100, numTotEstAfi);
        porEstSub80 =  est.calcularPorcentajeSubsidiados(numEstSub80, numTotEstAfi);
        porEstSub60 =  est.calcularPorcentajeSubsidiados(numEstSub60, numTotEstAfi);
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
     
        // Formato de porcentaje (corregido)
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
        ent.getjTextideEst().setText("");
        ent.getjTextnomEst().setText("");
        ent.getjTextapeEst().setText("");
        ent.getjTextproSem().setText("");
        ent.getjTextvalMatSem().setText("");
        ent.getjTextideEst().requestFocus();
        
        ent.getjTextnomEst().setEnabled(true);
        ent.getjTextapeEst().setEnabled(true);
        ent.getjTextproSem().setEnabled(true);
        ent.getjTextvalMatSem().setEnabled(true);
        
        visSub.getBtnInsertar().setEnabled(false);
        
        if (arbolBin != null) {
            arbolBin.limpiarTabla();
        }
    }

    private void btnVolver() {
         habilitarbtn();
         showPane(ent);
        btnLimpiar();
    }
    
    private void btnVolverDesdeArbol() {
        showPane(ent);
        arbolBin.limpiarTabla();
    }

    public void btnInsertar() {
        estudiantes nuevoEst = new estudiantes(est.getIdeEst(), est.getNomEst(), 
                                             est.getApeEst(), est.getProSem(), est.getValMatSem());
        if (arbolBin.insertar(est.getIdeEst(), nuevoEst)) {
            JOptionPane.showMessageDialog(null, "Estudiante insertado correctamente en el árbol", 
                                        "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
            btnLimpiar();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo insertar. La identificación ya existe en el árbol", 
                                        "Error en Operación", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void btnBuscar() {
        if (!ent.getjTextideEst().getText().trim().isEmpty()) {
            String clave = ent.getjTextideEst().getText().trim();
            estudiantes estudiante = arbolBin.buscar(clave);
            
            if (estudiante != null) {
                ent.getjTextnomEst().setText(estudiante.getNomEst());
                ent.getjTextapeEst().setText(estudiante.getApeEst());
                ent.getjTextproSem().setText(String.valueOf(estudiante.getProSem()));
                ent.getjTextvalMatSem().setText(String.valueOf(estudiante.getValMatSem()));
                
                // Deshabilitar campos para mostrar que son datos encontrados
                ent.getjTextnomEst().setEnabled(false);
                ent.getjTextapeEst().setEnabled(false);
                ent.getjTextproSem().setEnabled(false);
                ent.getjTextvalMatSem().setEnabled(false);
                
                JOptionPane.showMessageDialog(null, "Estudiante encontrado en el árbol", 
                                            "Búsqueda Exitosa", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Estudiante con ID: " + clave + " no encontrado en el árbol", 
                                            "Estudiante No Encontrado", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            error(ent.getjTextideEst(), "Debe ingresar una identificación para buscar");
        }
    }

    public void btnEliminar() {
        if (!ent.getjTextideEst().getText().trim().isEmpty()) {
            String clave = ent.getjTextideEst().getText().trim();
            estudiantes estudiante = arbolBin.eliminar(clave);
            
            if (estudiante != null) {
                ent.getjTextnomEst().setText(estudiante.getNomEst());
                ent.getjTextapeEst().setText(estudiante.getApeEst());
                ent.getjTextproSem().setText(String.valueOf(estudiante.getProSem()));
                ent.getjTextvalMatSem().setText(String.valueOf(estudiante.getValMatSem()));
 
                ent.getjTextnomEst().setEnabled(false);
                ent.getjTextapeEst().setEnabled(false);
                ent.getjTextproSem().setEnabled(false);
                ent.getjTextvalMatSem().setEnabled(false);
                
                JOptionPane.showMessageDialog(null, "Estudiante con ID: " + clave + " eliminado del árbol", 
                                            "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Estudiante con ID: " + clave + " no encontrado para eliminar", 
                                            "Error en Eliminación", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            error(ent.getjTextideEst(), "Debe ingresar una identificación para eliminar");
        }
    }

    // Ver vista del árbol
    public void btnVerArbol() {
        showPane(visArbol);
    }

    public void btnPreOrden() {
        if (!arbolBin.esVacio()) {
            arbolBin.preOrden();
        } else {
            JOptionPane.showMessageDialog(null, "El árbol está vacío. Inserte estudiantes primero", 
                                        "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void btnInOrden() {
        if (!arbolBin.esVacio()) {
            arbolBin.inOrden();
        } else {
            JOptionPane.showMessageDialog(null, "El árbol está vacío. Inserte estudiantes primero", 
                                        "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void btnPostOrden() {
        if (!arbolBin.esVacio()) {
            arbolBin.postOrden();
        } else {
            JOptionPane.showMessageDialog(null, "El árbol está vacío. Inserte estudiantes primero", 
                                        "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Recorrido por niveles (BFS - Breadth First Search)
    public void btnPorNiveles() {
        if (!arbolBin.esVacio()) {
            arbolBin.porNiveles();
        } else {
            JOptionPane.showMessageDialog(null, "El árbol está vacío. Inserte estudiantes primero", 
                                        "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }


    public void btnContar() {
        int cantidad = arbolBin.contarNodos();
        if (cantidad > 0) {
            JOptionPane.showMessageDialog(null, "Total de estudiantes: " + cantidad, 
                "Conteo de Nodos", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El árbol está vacío. No hay estudiantes para contar", 
                                        "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Calcular altura del árbol
    public void btnAltura() {
        int altura = arbolBin.altura();
        if (altura > 0) {
            JOptionPane.showMessageDialog(null, "Altura del árbol: " + altura + " niveles", 
                "Altura del Árbol", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El árbol está vacío. No hay altura que calcular", 
                                        "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void btnHojas() {
        int hojas = arbolBin.contarHojas();
        int totalNodos = arbolBin.contarNodos();
        
        if (totalNodos > 0) {
            JOptionPane.showMessageDialog(null, "Número de hojas: " + hojas, 
                "Nodos Hoja", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El árbol está vacío. No hay hojas que contar", 
                                        "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void btnInternos() {
        int internos = arbolBin.contarNodosInternos();
        int totalNodos = arbolBin.contarNodos();
        
        if (totalNodos > 0) {
            JOptionPane.showMessageDialog(null, "Nodos internos: " + internos, 
                "Nodos Internos", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El árbol está vacío. No hay nodos internos que contar", 
                                        "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void btnBalanceado() {
        if (!arbolBin.esVacio()) {
            boolean balanceado = arbolBin.esBalanceado();
            String mensaje = balanceado ? "El árbol SÍ está balanceado" : "El árbol NO está balanceado";
            
            JOptionPane.showMessageDialog(null, mensaje, "Balance del Árbol", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El árbol está vacío. No se puede analizar el balance", 
                                        "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void titulo() {
        visSub.setTitle("Gestion de subsidio con Árbol Binario");
        visSub.setLocationRelativeTo(null);
        
         TitledBorder borEnt = new TitledBorder("Datos de entrada");
          ent.setBorder(borEnt);
          
         TitledBorder borsalPar = new TitledBorder("Datos de salida");
          salPar.setBorder(borsalPar);
          
         TitledBorder bortot = new TitledBorder("datos de salidas totales");
         tot.setBorder(bortot);
         
         TitledBorder borArbol = new TitledBorder("Vista del Árbol Binario");
         visArbol.setBorder(borArbol);
    }
    
    public void error(javax.swing.JTextField txtName, String msg) {
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
        txtName.setText("");
        txtName.requestFocus();
    }
        
    //Hacer visible un panel
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
        visSub.getBtnInsertar().setEnabled(false);
        visSub.getBtnBuscar().setEnabled(false);
        visSub.getBtnEliminar().setEnabled(false);
        visSub.getBtnVer().setEnabled(false);
    }

    public void actionPerformed(ActionEvent e) {
    }
}