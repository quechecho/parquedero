
package controller;

/*
participantes =
Jesus Dacid Sanchez Pacheco
Victor Manuel Salgado Gonzales
Reiner Andres Montiel Gonzalez
*/

import admonLista.AdmonLista;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;
import model.SuperMercado3;
import validate.Validar;
import view.Entrada;
import view.Parciales;
import view.Principal;
import view.Total;
import view.VisLista;

public class Controlador implements ActionListener{
    private SuperMercado3 Sup;
    private final Principal pri; 
    private final Entrada ent;
    private final Parciales par;
    private final Total tot;
    private final Validar val; 
    private final AdmonLista admLista;
    private final VisLista visLista;
    
    float totDes = 0,porDes,num0RangoCli,num1RangoCli,num2RangoCli,num3RangoCli,num5RangoCli,num6RangoCli,num7RangoCli,num8RangoCli,num9RangoCli,num10RangoCli,num4RangoCli;
    float valDes, valPag, valTotCom = 0;  
    int nro, numTotCli = 0, numeroSorteo;
    private int num0, num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
    String nom, ape, ide;
    float valCom;
    
    DecimalFormat f2 = new DecimalFormat("#########.#%");
    DecimalFormat f3 = new DecimalFormat("$###,###,###.##");
    
    private final String cabecera2[] = {"Nombre", "Apellidos", "Ident", "Val. Compra"};
    private final String datos2[][] = {};
    private final DefaultTableModel modelo2 = new DefaultTableModel(datos2, cabecera2);
        
    
    private final String cabecera[] = {"Ident.", "Apellidos", "Nombres", "Val. compra", "% Desc.","Num. Ram", "Val. Desc.", "Val. Pagar"};
    private final String datos[][] = {};
    private final DefaultTableModel modelo = new DefaultTableModel(datos, cabecera);

    public Controlador(SuperMercado3 Sup, Principal pri, Entrada ent, Parciales par, Total tot, Validar val, AdmonLista admLista, VisLista visLista) {
        this.Sup = Sup;
        this.pri = pri;
        this.ent = ent;
        this.par = par;
        this.tot = tot;
        this.val = val;
        this.admLista = admLista;
        this.visLista = visLista;

        this.pri.getBtnValidar().addActionListener(e ->{btnValidar();});
        this.pri.getBtnCalcular().addActionListener(e ->{btnCalcular();});
        this.pri.getBtnTotalizar().addActionListener(e ->{btnTotalizar();});
        this.pri.getBtnNuevo().addActionListener(e ->{btnNuevo();});
        this.pri.getBtnSalida().addActionListener(e ->{System.exit(0);});
        this.par.getBtnVolver().addActionListener(e ->{btnVolver();});
        this.tot.getBtnVolver().addActionListener(e ->{btnVolver();});
        
        this.visLista.getBtnVolver().addActionListener(e -> {btnVolver();});
        this.pri.getBtnVerLista().addActionListener(e ->{btnVerLista();});
        this.pri.getBtnAddInicio().addActionListener(e -> {btnAddInicio();});
        this.pri.getBtnAddFinal().addActionListener(e -> {btnAddFinal();});
        this.pri.getBtnAddDespues().addActionListener(e -> {btnAddDespues();});
        this.visLista.getBtnDelInicio().addActionListener(e -> {btnDelInicio();});
        this.visLista.getBtnDelFinal().addActionListener(e -> {btnDelFinal();});
        this.pri.getBtnDelDespues().addActionListener(e -> {btnDelDespues();});
        this.pri.getBtnObtener().addActionListener(e -> {btnObtener();});
        this.visLista.getBtnContar().addActionListener(e -> {btnContar();});
        this.visLista.getBtnTodos().addActionListener(e -> {btnTodos();});
        this.visLista.getLimpiar().addActionListener(e -> {btnLimpiar();});
        
        visLista.getTblLista().setModel(modelo2);
        par.getTblParciales().setModel(modelo);
    
    }

    public Controlador(SuperMercado3 Sup, Principal pri, Entrada ent, Total tot, Validar val) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void btnVerLista (){
        showPane(visLista);
    }
    
    public boolean DatoNodo() {
        String nodo = pri.getTxtNro().getText();
        nodo = nodo.trim();
        return !nodo.isEmpty();
    }
    
    public void btnAddInicio() {
        Sup = new SuperMercado3(nom, ape, ide, valCom);
        admLista.InsertarPrincipio(Sup);
        insercion();
        btnLimpiar();
        pri.getBtnCalcular().setEnabled(true);
        
    }
        
    public void btnAddFinal() {
        Sup = new SuperMercado3(nom, ape, ide, valCom);
        admLista.InsertarFinal(Sup);
        btnLimpiar();
        pri.getBtnCalcular().setEnabled(true);
    }
    
    public void btnAddDespues() {
        if (DatoNodo()) {
            nro = Integer.parseInt(pri.getTxtNro().getText());
            Sup = new SuperMercado3(nom, ape, ide, valCom);
            admLista.InsertarDespues(nro, Sup);
            btnLimpiar();
        } else {
            JOptionPane.showMessageDialog(null, "No se especificó la posición del nodo a adicionar...", "Notificación", JOptionPane.WARNING_MESSAGE);
        }

    }
    
    public void btnDelInicio() {
        if (admLista.EliminarPrincipio()) {
           btnLimpiar();
        } else {
            JOptionPane.showMessageDialog(null, "No existen nodos para eliminar...", "Notificación", JOptionPane.WARNING_MESSAGE);
        }

    }
    
    public void btnDelFinal() {
        if (admLista.EliminarFinal()) {
            //btnLimpiar();
        } else {
            JOptionPane.showMessageDialog(null, "No existen nodos para eliminar...", "Notificación", JOptionPane.WARNING_MESSAGE);
        }

    }
    
    public void btnDelDespues() {
        if (DatoNodo()) {
            nro = Integer.parseInt(pri.getTxtNro().getText());
            if (admLista.EliminarDespues(nro)) {
                //btnLimpiar();
                JOptionPane.showMessageDialog(null, "Nodo eliminado...", "Notificación", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No existen ese nodos para eliminar...", "Notificación", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe especificar el nodos a eliminar en el campo Nodo Nro...", "Notificación", JOptionPane.WARNING_MESSAGE);
        }

    }
    
    public void btnObtener() {
        if (DatoNodo()) {
            nro = Integer.parseInt(pri.getTxtNro().getText());
            Sup = admLista.Obtener(nro);
            modelo2.setRowCount(0);
            if (Sup != null) {
                Object contenido[] = {Sup.getNomCli(), Sup.getApeCli(), Sup.getIdeCli(), Sup.getValCom()};
                modelo2.addRow(contenido);
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
            JOptionPane.showMessageDialog(null, "Número de nodos: " + String.valueOf(nro), "Notificación", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Lista vacia...", "Notificación", JOptionPane.WARNING_MESSAGE);
        }

    }

    public void btnTodos() {
        modelo2.setRowCount(0);
        ArrayList<SuperMercado3> VecLib = new ArrayList<>();
        VecLib = admLista.ObtenerTodos();
        for (SuperMercado3 sp : VecLib) {
            Object contenido[] = {sp.getNomCli(), sp.getApeCli(), sp.getIdeCli(), sp.getValCom()};
            modelo2.addRow(contenido);
        }
    }
    
    public void insercion(){
        JOptionPane.showMessageDialog(null, "<html><p style =\"color: green\">Nodo insertado correctamente... </p></htnl>",
                        "Aención", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void btnLimpiar() {
        modelo2.setRowCount(0);
        
    }
    
    private void btnValidar() {
         
        
        if (val.validarNombre(ent.getTxtNombre().getText())){
       Sup.setNomCli(ent.getTxtNombre().getText());
       nom = ent.getTxtNombre().getText().trim();
       if (val.validarApellido(ent.getTxtApellido().getText())){
           Sup.setApeCli(ent.getTxtApellido().getText());
           ape = ent.getTxtApellido().getText();
           if (val.validarNumeroEnteroPositivo(ent.getTxtIde().getText())){
               Sup.setIdeCli(ent.getTxtIde().getText());
               ide = ent.getTxtIde().getText();
           if (val.validarNumeroRealPositivo(ent.getTxtValCom().getText())){
               Sup.setValCom(Float.parseFloat(ent.getTxtValCom().getText()));
               valCom = Float.parseFloat(ent.getTxtValCom().getText());
               JOptionPane.showMessageDialog(null, "", "Datos OK", JOptionPane.INFORMATION_MESSAGE);
               pri.getBtnAddInicio().setEnabled(true);
               pri.getBtnAddFinal().setEnabled(true);
           }else {
               error(ent.getTxtValCom(), "Error en el campo valor de la compra, su contenido no es válido");
           }    
           }else {
                 error(ent.getTxtIde(), "Error en el campo identificación del cliente, su contenido no es válido");
           }
       }else {
            error(ent.getTxtApellido(), "Error en el campo apellido del cliente, su contenido no es válido");
       }
        } else {
            error(ent.getTxtNombre(), "Error en el campo nombre del cliente, su contenido no es válido");
        } 
    
  
    }

    private void btnCalcular() {
        //Procesos parciales
        
        try{
       
        numeroSorteo = Sup.numeroSorteo();
        porDes = Sup.determinarPorcentaje(numeroSorteo);
        valDes = Sup.valorDescuento(porDes);
        valPag = Sup.valorPagar(valDes);
        numTotCli = Sup.contar(numTotCli);
        valTotCom = Sup.acumular(valTotCom, valPag);
        totDes = Sup.totalDescontado(totDes, valDes);
        //Datoas de salida parciales
        Object contenido[] = {Sup.getIdeCli(), Sup.getApeCli(), Sup.getNomCli(),
            
            f3.format(Sup.getValCom()), f2.format(porDes / 100),numeroSorteo, f3.format(valDes), 
            f3.format(valPag)};
    
        if (numeroSorteo == 0) {
            num0++;
        } else {if (numeroSorteo == 1) {
                num1++;
            } else {
                if (numeroSorteo == 2) {
                  num2++;
                } else {
                    if (numeroSorteo == 3) {
                        num3++;
                    } else {
                        if (numeroSorteo == 4) {
                            num4++;
                        } else {
                            if (numeroSorteo == 5) {
                                num5++;
                            } else {
                                if (numeroSorteo == 6) {
                                    num6++;
                                } else {
                                    if (numeroSorteo == 7) {
                                       num7++;
                                    } else {
                                        if (numeroSorteo == 8) {
                                            num8++;
                                        } else {
                                            if (numeroSorteo == 9) {
                                                num9++;
                                            } else {
                                                if (numeroSorteo == 10) {
                                                    num10++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        
         
            
        modelo.addRow(contenido);
        desHabilitarBtn();
        showPane(par);
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "]ERROR", "eRROR: " + ex, JOptionPane.ERROR_MESSAGE);
        }
        }
        
    private void btnTotalizar() {
        //procesos totales
        try {
    num0RangoCli = Sup.calcularPorcentaje(num0, numTotCli);
    num1RangoCli = Sup.calcularPorcentaje(num1, numTotCli);   
    num2RangoCli = Sup.calcularPorcentaje(num2, numTotCli);
    num3RangoCli = Sup.calcularPorcentaje(num3, numTotCli);    
    num4RangoCli = Sup.calcularPorcentaje(num4, numTotCli);
    num5RangoCli = Sup.calcularPorcentaje(num5, numTotCli);    
    num6RangoCli = Sup.calcularPorcentaje(num6, numTotCli);
    num7RangoCli = Sup.calcularPorcentaje(num7, numTotCli);
    num8RangoCli = Sup.calcularPorcentaje(num8, numTotCli);
    num9RangoCli = Sup.calcularPorcentaje(num9, numTotCli);
    num10RangoCli = Sup.calcularPorcentaje(num10, numTotCli);
    
    
    tot.getTxtPorCli0().setText(f2.format(num0RangoCli/100));tot.getTxtPorCli1().setText(f2.format(num1RangoCli/100));
    tot.getTxtPorCli2().setText(f2.format(num2RangoCli/100));tot.getTxtPorCli3().setText(f2.format(num3RangoCli/100));
    tot.getTxtPorCli4().setText(f2.format(num4RangoCli/100));tot.getTxtPorCli5().setText(f2.format(num5RangoCli/100));
    tot.getTxtPorCli6().setText(f2.format(num6RangoCli/100));tot.getTxtPorCli7().setText(f2.format(num7RangoCli/100));
    tot.getTxtPorCli8().setText(f2.format(num8RangoCli/100));tot.getTxtPorCli9().setText(f2.format(num9RangoCli/100));
    tot.getTxtPorCli10().setText(f2.format(num10RangoCli/100));
    tot.getTxtDel0().setText(String.valueOf(num0));tot.getTxtDel10().setText(String.valueOf(num1));
    tot.getTxtDel20().setText(String.valueOf(num2));tot.getTxtDel30().setText(String.valueOf(num3));
    tot.getTxtDel40().setText(String.valueOf(num4));tot.getTxtDel50().setText(String.valueOf(num5));
    tot.getTxtDel60().setText(String.valueOf(num6));tot.getTxtDel70().setText(String.valueOf(num7));
    tot.getTxtDel80().setText(String.valueOf(num8));tot.getTxtDel90().setText(String.valueOf(num9));
    tot.getTxtDel100().setText(String.valueOf(num10));
    tot.getTxtTotalClientes().setText(String.valueOf(numTotCli));
    tot.getTxtTotalDescontado().setText(f3.format(totDes));
    tot.getTxtTotalNeto().setText(f3.format(valTotCom));
    

    //datos de salida totales 
    
    
    desHabilitarBtn();
    showPane(tot); 
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "]ERROR", "eRROR: " + ex, JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnNuevo() {
    ent.getTxtNombre().setText("");
    ent.getTxtApellido().setText("");
    ent.getTxtIde().setText("");
    ent.getTxtValCom().setText("");
    ent.getTxtNombre().requestFocus();
    
    }

    private void btnVolver() {
        habilitarBtn();
        showPane(ent);
        btnNuevo();
    }
    
    public void titulo() {
        pri.setTitle("Super Mercado Event");
        pri.setLocationRelativeTo(null);

        TitledBorder borEnt = new TitledBorder("Datos de entrada");
        ent.setBorder(borEnt);

        TitledBorder borPar = new TitledBorder("Datos de salida parciales");
        par.setBorder(borPar);

        TitledBorder borTot = new TitledBorder("Datos de salida totales");
        tot.setBorder(borTot);
    }
    

     //Método para mostrar un mensaje de error y limpiar el campo de texto y asignarle el focus
    public void error(javax.swing.JTextField txtName, String msg) {
        // Cambiar el color del texto del JOptionPane a rojo
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(Color.RED));
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
        txtName.setText("");
        txtName.requestFocus();

        // Resetear el color a su valor original (opcional)
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(Color.BLACK));
    }

//Hacer visible un panel
    public void showPane(JPanel p) {
        p.setSize(842, 448);
        p.setLocation(0, 0);

        pri.getJPanelContenedor().removeAll();
        pri.getJPanelContenedor().add(p, BorderLayout.CENTER);
        pri.getJPanelContenedor().revalidate();
        pri.getJPanelContenedor().repaint();
    }

    public void habilitarBtn(){
        pri.getBtnValidar().setEnabled(true);
        pri.getBtnTotalizar().setEnabled(true);
        pri.getBtnNuevo().setEnabled(true);
        pri.getBtnSalida().setEnabled(true);
    }
    
    public void desHabilitarBtn(){
        pri.getBtnValidar().setEnabled(false);
        pri.getBtnCalcular().setEnabled(false);
        pri.getBtnTotalizar().setEnabled(false);
        pri.getBtnNuevo().setEnabled(false);
        pri.getBtnSalida().setEnabled(false);
        pri.getBtnAddInicio().setEnabled(false);
        pri.getBtnAddFinal().setEnabled(false);
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
     


}



    









