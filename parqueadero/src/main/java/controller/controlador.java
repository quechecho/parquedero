
package controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;
import modelo.parqueadero;
import validar.validar;
import vista.entrada;
import vista.parcial;
import vista.total;
import vista.vistaparqueadero;



public class controlador implements ActionListener{
    private final parqueadero parque;
    private final vistaparqueadero vistaparque;
    private final entrada ent;
    private final parcial par;
    private final total tot;
    private final validar val;

    // Acumuladores por tipo de vehículo (7 grupos)
    // 1: bicicleta, 2: motocicleta, 3: automóvil, 4: camioneta, 5: buseta, 6: bus, 7: camión
    private int numVeh1 = 0, numVeh2 = 0, numVeh3 = 0, numVeh4 = 0, numVeh5 = 0, numVeh6 = 0, numVeh7 = 0;
    private float valVeh1 = 0, valVeh2 = 0, valVeh3 = 0, valVeh4 = 0, valVeh5 = 0, valVeh6 = 0, valVeh7 = 0;
    private float totalCosto;
    private int totalVeh;

    // Formatos para salida
    DecimalFormat dfNumber = new DecimalFormat("###,###,###.##");
    DecimalFormat dfCurrency = new DecimalFormat("$###,###,###.##");
    DecimalFormat dfPercent = new DecimalFormat("##0.0%");

    // Modelo y cabecera de la tabla parcial
    String cabecera[] = {"Ident.", "Apellidos", "Nombres", "Tipo Veh.", "Hora Entrada", "Hora Salida", "Horas Uso", "Tarifa", "Costo"};
    String datos[][] = {};
    DefaultTableModel modelo = new DefaultTableModel(datos, cabecera);

    // Constructor: se vinculan los componentes y se asignan los listeners
    public controlador (parqueadero parque, vistaparqueadero vistaparque, entrada ent, parcial par, total tot, validar val) {
        this.parque = parque;
        this.vistaparque = vistaparque;
        this.ent = ent;
        this.par = par;
        this.tot = tot;
        this.val = val;

        // Asignar acciones a los botones de la vista principal
        this.vistaparque.getBtnValidar().addActionListener(e -> btnValidar());
        this.vistaparque.getBtnCalcular().addActionListener(e -> btnCalcular());
        this.vistaparque.getBtnTotalizar().addActionListener(e -> btnTotalizar());
        this.vistaparque.getBtnNuevo().addActionListener(e -> btnNuevo());
        this.vistaparque.getBtnSalir().addActionListener(e -> System.exit(0));
        this.par.getBtnVolver().addActionListener(e -> btnVolver());
        this.tot.getBtnVolver().addActionListener(e -> btnVolver());
        
        // Asumimos que el combo de tipo de vehículo tiene 7 opciones
        // (0: bicicleta, 1: motocicleta, 2: automóvil, 3: camioneta, 4: buseta, 5: bus, 6: camión)
        this.ent.getjComboBox1().addActionListener(this);

        // Asignar el modelo a la tabla de la vista parcial
        par.getTblParcial().setModel(modelo);
    }

    // Validación de datos de entrada
    public void btnValidar() {
        if (val.validarNumeroEnteroPositivo(ent.getTxtIdeCli().getText())) {
            parque.setIdeCli(ent.getTxtIdeCli().getText());
            if (val.validarApellido(ent.getTxtApeCli().getText())) {
                parque.setApeCli(ent.getTxtApeCli().getText());
                if (val.validarNombre(ent.getTxtNomCli().getText())) {
                    parque.setNomCli(ent.getTxtNomCli().getText());
                    // Validar y asignar el tipo de vehículo según el índice seleccionado del combo
                    switch (ent.getjComboBox1().getSelectedIndex()) {
                        case 0 -> parque.setTipVeh(1); // bicicleta
                        case 1 -> parque.setTipVeh(2); // motocicleta
                        case 2 -> parque.setTipVeh(3); // automóvil
                        case 3 -> parque.setTipVeh(4); // camioneta
                        case 4 -> parque.setTipVeh(5); // buseta
                        case 5 -> parque.setTipVeh(6); // bus
                        case 6 -> parque.setTipVeh(7); // camión
                    }
                    if (val.validarNumeroRealPositivo(ent.getTxtHoraEntrada().getText())) {
                        parque.setHoraEntrada(Float.parseFloat(ent.getTxtHoraEntrada().getText()));
                        if (val.validarNumeroRealPositivo(ent.getTxtHoraSalida().getText())) {
                            parque.setHoraSalida(Float.parseFloat(ent.getTxtHoraSalida().getText()));
                            if (val.validarNumeroRealPositivo(ent.getTxtValHor().getText())) {
                                parque.setValRecibido(Float.parseFloat(ent.getTxtValHor().getText()));
                                vistaparque.getBtnCalcular().setEnabled(true);
                                vistaparque.getBtnTotalizar().setEnabled(true);
                            } else {
                                error(ent.getTxtValHor(), "Error en el campo valor recibido, su contenido no es válido");
                            }
                        } else {
                            error(ent.getTxtHoraSalida(), "Error en el campo hora salida, su contenido no es válido");
                        }
                    } else {
                        error(ent.getTxtHoraEntrada(), "Error en el campo hora entrada, su contenido no es válido");
                    }
                } else {
                    error(ent.getTxtNomCli(), "Error en el campo nombre, su contenido no es válido");
                }
            } else {
                error(ent.getTxtApeCli(), "Error en el campo apellido, su contenido no es válido");
            }
        } else {
            error(ent.getTxtIdeCli(), "Error en el campo identificación, su contenido no es válido");
        }
    }

    // Cálculo parcial de la estadía y costo
    public void btnCalcular() {
        // Calcular las horas de uso: diferencia entre hora de salida y entrada
        float horasUso = parqueadero.determinarhoradeentradaysalida(parque.getHoraEntrada(), parque.getHoraSalida());
        parque.setHorasUso(horasUso);

        // Determinar el tipo de vehículo (cadena) según el valor asignado
        String tipoVehStr = "";
        switch (parque.getTipVeh()) {
            case 1 -> tipoVehStr = "bicicleta";
            case 2 -> tipoVehStr = "motocicleta";
            case 3 -> tipoVehStr = "automóvil";
            case 4 -> tipoVehStr = "camioneta";
            case 5 -> tipoVehStr = "buseta";
            case 6 -> tipoVehStr = "bus";
            case 7 -> tipoVehStr = "camión";
        }

        // Calcular la tarifa por hora usando el método del modelo
        float tarifa = parque.determinarValorPorHora(tipoVehStr, parque.getHoraEntrada(), parque.getHoraSalida());
        // Calcular el costo total: (horas de uso * tarifa)
        float costo = horasUso * tarifa;
        parque.setCosto(costo);

        // Acumular los totales por tipo de vehículo
        acumularVehiculo(costo);

        // Preparar la fila de datos de salida y agregarla a la tabla parcial
        Object fila[] = {
            parque.getIdeCli(),
            parque.getApeCli(),
            parque.getNomCli(),
            tipoVehStr,
            dfNumber.format(parque.getHoraEntrada()),
            dfNumber.format(parque.getHoraSalida()),
            dfNumber.format(horasUso),
            dfCurrency.format(tarifa),
            dfCurrency.format(costo)
        };
        modelo.addRow(fila);
        desHabilitarBtn();
        showPane(par);
    }

    // Totalización de datos: suma, porcentajes y presentación en la vista de totales
    public void btnTotalizar() {
        totalCosto = valVeh1 + valVeh2 + valVeh3 + valVeh4 + valVeh5 + valVeh6 + valVeh7;
        totalVeh = numVeh1 + numVeh2 + numVeh3 + numVeh4 + numVeh5 + numVeh6 + numVeh7;

        float porVeh1 = (totalVeh != 0) ? ((float) numVeh1 / totalVeh) : 0;
        float porVeh2 = (totalVeh != 0) ? ((float) numVeh2 / totalVeh) : 0;
        float porVeh3 = (totalVeh != 0) ? ((float) numVeh3 / totalVeh) : 0;
        float porVeh4 = (totalVeh != 0) ? ((float) numVeh4 / totalVeh) : 0;
        float porVeh5 = (totalVeh != 0) ? ((float) numVeh5 / totalVeh) : 0;
        float porVeh6 = (totalVeh != 0) ? ((float) numVeh6 / totalVeh) : 0;
        float porVeh7 = (totalVeh != 0) ? ((float) numVeh7 / totalVeh) : 0;

        tot.getTxtNumVeh1().setText(String.valueOf(numVeh1));
        tot.getTxtNumVeh2().setText(String.valueOf(numVeh2));
        tot.getTxtNumVeh3().setText(String.valueOf(numVeh3));
        tot.getTxtNumVeh4().setText(String.valueOf(numVeh4));
        tot.getTxtNumVeh5().setText(String.valueOf(numVeh5));
        tot.getTxtNumVeh6().setText(String.valueOf(numVeh6));
        tot.getTxtNumVeh7().setText(String.valueOf(numVeh7));

        tot.getTxtValVeh1().setText(dfCurrency.format(valVeh1));
        tot.getTxtValVeh2().setText(dfCurrency.format(valVeh2));
        tot.getTxtValVeh3().setText(dfCurrency.format(valVeh3));
        tot.getTxtValVeh4().setText(dfCurrency.format(valVeh4));
        tot.getTxtValVeh5().setText(dfCurrency.format(valVeh5));
        tot.getTxtValVeh6().setText(dfCurrency.format(valVeh6));
        tot.getTxtValVeh7().setText(dfCurrency.format(valVeh7));

        tot.getTxtPorVeh1().setText(dfPercent.format(porVeh1));
        tot.getTxtPorVeh2().setText(dfPercent.format(porVeh2));
        tot.getTxtPorVeh3().setText(dfPercent.format(porVeh3));
        tot.getTxtPorVeh4().setText(dfPercent.format(porVeh4));
        tot.getTxtPorVeh5().setText(dfPercent.format(porVeh5));
        tot.getTxtPorVeh6().setText(dfPercent.format(porVeh6));
        tot.getTxtPorVeh7().setText(dfPercent.format(porVeh7));

        tot.getTxtTotalVeh().setText(dfNumber.format(totalVeh));
        tot.getTxtTotalCosto().setText(dfCurrency.format(totalCosto));
        desHabilitarBtn();

        showPane(tot);
    }

    // Limpia los campos de entrada para un nuevo registro
    public void btnNuevo() {
        ent.getTxtIdeCli().setText("");
        ent.getTxtApeCli().setText("");
        ent.getTxtNomCli().setText("");
        ent.getTxtHoraEntrada().setText("");
        ent.getTxtHoraSalida().setText("");
        ent.getTxtValHor().setText("");
        ent.getTxtIdeCli().requestFocus();
    }

    // Vuelve al panel de entrada y limpia los datos
    public void btnVolver() {
        habilitarBtn();
        showPane(ent);
        btnNuevo();
    }

    // Configuración de títulos y disposiciones de paneles
    public void titulo() {
        vistaparque.setTitle("Control de Parqueadero");
        vistaparque.setLocationRelativeTo(null);
        TitledBorder borEnt = new TitledBorder("Datos de entrada");
        ent.setBorder(borEnt);
        TitledBorder borPar = new TitledBorder("Datos de salida parciales");
        par.setBorder(borPar);
        TitledBorder borTot = new TitledBorder("Datos de salida totales");
        tot.setBorder(borTot);
    }

    // Muestra un mensaje de error, limpia el campo y reasigna el focus
    public void error(javax.swing.JTextField txtField, String msg) {
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(Color.RED));
        JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
        txtField.setText("");
        txtField.requestFocus();
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(Color.BLACK));
    }

    // Acumula registros según el tipo de vehículo para la totalización
    public void acumularVehiculo(float costo) {
        switch (parque.getTipVeh()) {
            case 1 -> {
                numVeh1++;
                valVeh1 += costo;
            }
            case 2 -> {
                numVeh2++;
                valVeh2 += costo;
            }
            case 3 -> {
                numVeh3++;
                valVeh3 += costo;
            }
            case 4 -> {
                numVeh4++;
                valVeh4 += costo;
            }
            case 5 -> {
                numVeh5++;
                valVeh5 += costo;
            }
            case 6 -> {
                numVeh6++;
                valVeh6 += costo;
            }
            case 7 -> {
                numVeh7++;
                valVeh7 += costo;
            }
        }
    }

    // Muestra el panel recibido en la vista principal
    public void showPane(JPanel p) {
        p.setSize(800, 500);
        p.setLocation(0, 0);
        vistaparque.getContenedor().removeAll();
        vistaparque.getContenedor().add(p, BorderLayout.CENTER);
        vistaparque.getContenedor().revalidate();
        vistaparque.getContenedor().repaint();
    }
    
    public void habilitarBtn(){
        vistaparque.getBtnValidar().setEnabled(true);
        //visBel.getBtnCalcular().setEnabled(true);
        vistaparque.getBtnTotalizar().setEnabled(true);
        vistaparque.getBtnNuevo().setEnabled(true);
        vistaparque.getBtnSalir().setEnabled(true);
    }
    
    public void desHabilitarBtn(){
        vistaparque.getBtnValidar().setEnabled(false);
        vistaparque.getBtnCalcular().setEnabled(false);
        vistaparque.getBtnTotalizar().setEnabled(false);
        vistaparque.getBtnNuevo().setEnabled(false);
        vistaparque.getBtnSalir().setEnabled(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ent.getjComboBox1()) {
            // Determine the vehicle type string based on the selection
            String tipoVehStr = "";
            switch (ent.getjComboBox1().getSelectedIndex()) {
                case 0 -> tipoVehStr = "bicicleta";
                case 1 -> tipoVehStr = "motocicleta";
                case 2 -> tipoVehStr = "automóvil";
                case 3 -> tipoVehStr = "camioneta";
                case 4 -> tipoVehStr = "buseta";
                case 5 -> tipoVehStr = "bus";
                case 6 -> tipoVehStr = "camión";
            }
            
            // Calculate the hourly price using the model's method
            float hourlyPrice = parque.determinarValorPorHora(tipoVehStr, 0, 0);
            
            // Display the price in the value per hour text field
            ent.getTxtValHor().setText(String.valueOf(hourlyPrice));
        }
    }
}
