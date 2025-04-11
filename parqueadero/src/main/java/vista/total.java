
package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class total extends javax.swing.JPanel {


    public total() {
        initComponents();
        
    TxtNumVeh1.setEditable(false);
    TxtNumVeh2.setEditable(false);
    TxtNumVeh3.setEditable(false);
    TxtNumVeh4.setEditable(false);
    TxtNumVeh5.setEditable(false);
    TxtNumVeh6.setEditable(false);
    TxtNumVeh7.setEditable(false);
    
    TxtValVeh1.setEditable(false);
    TxtValVeh2.setEditable(false);
    TxtValVeh3.setEditable(false);
    TxtValVeh4.setEditable(false);
    TxtValVeh5.setEditable(false);
    TxtValVeh6.setEditable(false);
    TxtValVeh7.setEditable(false);
    
    TxtPorVeh1.setEditable(false);
    TxtPorVeh2.setEditable(false);
    TxtPorVeh3.setEditable(false);
    TxtPorVeh4.setEditable(false);
    TxtPorVeh5.setEditable(false);
    TxtPorVeh6.setEditable(false);
    TxtPorVeh7.setEditable(false);
    
    TxtTotalCosto.setEditable(false);
    TxtTotalVeh.setEditable(false);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtNumVeh1 = new javax.swing.JTextField();
        TxtNumVeh2 = new javax.swing.JTextField();
        TxtNumVeh3 = new javax.swing.JTextField();
        TxtNumVeh4 = new javax.swing.JTextField();
        TxtNumVeh5 = new javax.swing.JTextField();
        TxtNumVeh6 = new javax.swing.JTextField();
        TxtNumVeh7 = new javax.swing.JTextField();
        TxtValVeh1 = new javax.swing.JTextField();
        TxtValVeh2 = new javax.swing.JTextField();
        TxtValVeh3 = new javax.swing.JTextField();
        TxtValVeh4 = new javax.swing.JTextField();
        TxtValVeh5 = new javax.swing.JTextField();
        TxtValVeh6 = new javax.swing.JTextField();
        TxtValVeh7 = new javax.swing.JTextField();
        TxtPorVeh1 = new javax.swing.JTextField();
        TxtPorVeh2 = new javax.swing.JTextField();
        TxtPorVeh3 = new javax.swing.JTextField();
        TxtPorVeh4 = new javax.swing.JTextField();
        TxtPorVeh5 = new javax.swing.JTextField();
        TxtPorVeh6 = new javax.swing.JTextField();
        TxtPorVeh7 = new javax.swing.JTextField();
        TxtTotalCosto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TxtTotalVeh = new javax.swing.JTextField();

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolver.setText("Volver");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Salida totales");

        jLabel2.setText("bicicleta ");

        jLabel3.setText("motocicletas");

        jLabel4.setText("automoviles");

        jLabel5.setText("busetas");

        jLabel6.setText("bus");

        jLabel7.setText("camiones");

        jLabel8.setText("camionetas");

        TxtNumVeh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumVeh1ActionPerformed(evt);
            }
        });

        TxtPorVeh3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPorVeh3ActionPerformed(evt);
            }
        });

        jLabel9.setText("No. horas");

        jLabel10.setText("valor horas");

        jLabel11.setText("% de horas");

        jLabel12.setText("N0. total de horas");

        jLabel13.setText("No. de vehiculos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TxtNumVeh5, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(12, 12, 12))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TxtPorVeh1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(TxtValVeh1)
                                            .addComponent(TxtNumVeh1)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(TxtValVeh2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(TxtNumVeh2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(22, 22, 22)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(TxtValVeh3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(TxtNumVeh3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(TxtPorVeh2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(TxtPorVeh3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtPorVeh4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtValVeh4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtNumVeh4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtTotalVeh, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtValVeh5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtPorVeh5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtNumVeh6)
                            .addComponent(TxtPorVeh6, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(TxtValVeh6, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtNumVeh7, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtPorVeh7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtValVeh7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtTotalCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TxtNumVeh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumVeh2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumVeh3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumVeh4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumVeh5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumVeh6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNumVeh7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(TxtValVeh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtValVeh2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtValVeh3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtValVeh4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtValVeh5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtValVeh6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtValVeh7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(TxtPorVeh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPorVeh2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPorVeh3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPorVeh4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPorVeh5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPorVeh6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPorVeh7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtTotalCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtTotalVeh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNumVeh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumVeh1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNumVeh1ActionPerformed

    private void TxtPorVeh3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPorVeh3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPorVeh3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtNumVeh1;
    private javax.swing.JTextField TxtNumVeh2;
    private javax.swing.JTextField TxtNumVeh3;
    private javax.swing.JTextField TxtNumVeh4;
    private javax.swing.JTextField TxtNumVeh5;
    private javax.swing.JTextField TxtNumVeh6;
    private javax.swing.JTextField TxtNumVeh7;
    private javax.swing.JTextField TxtPorVeh1;
    private javax.swing.JTextField TxtPorVeh2;
    private javax.swing.JTextField TxtPorVeh3;
    private javax.swing.JTextField TxtPorVeh4;
    private javax.swing.JTextField TxtPorVeh5;
    private javax.swing.JTextField TxtPorVeh6;
    private javax.swing.JTextField TxtPorVeh7;
    private javax.swing.JTextField TxtTotalCosto;
    private javax.swing.JTextField TxtTotalVeh;
    private javax.swing.JTextField TxtValVeh1;
    private javax.swing.JTextField TxtValVeh2;
    private javax.swing.JTextField TxtValVeh3;
    private javax.swing.JTextField TxtValVeh4;
    private javax.swing.JTextField TxtValVeh5;
    private javax.swing.JTextField TxtValVeh6;
    private javax.swing.JTextField TxtValVeh7;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    public JTextField getTxtNumVeh1() {
        return TxtNumVeh1;
    }

    public void setTxtNumVeh1(JTextField TxtNumVeh1) {
        this.TxtNumVeh1 = TxtNumVeh1;
    }

    public JTextField getTxtNumVeh2() {
        return TxtNumVeh2;
    }

    public void setTxtNumVeh2(JTextField TxtNumVeh2) {
        this.TxtNumVeh2 = TxtNumVeh2;
    }

    public JTextField getTxtNumVeh3() {
        return TxtNumVeh3;
    }

    public void setTxtNumVeh3(JTextField TxtNumVeh3) {
        this.TxtNumVeh3 = TxtNumVeh3;
    }

    public JTextField getTxtNumVeh4() {
        return TxtNumVeh4;
    }

    public void setTxtNumVeh4(JTextField TxtNumVeh4) {
        this.TxtNumVeh4 = TxtNumVeh4;
    }

    public JTextField getTxtNumVeh5() {
        return TxtNumVeh5;
    }

    public void setTxtNumVeh5(JTextField TxtNumVeh5) {
        this.TxtNumVeh5 = TxtNumVeh5;
    }

    public JTextField getTxtNumVeh6() {
        return TxtNumVeh6;
    }

    public void setTxtNumVeh6(JTextField TxtNumVeh6) {
        this.TxtNumVeh6 = TxtNumVeh6;
    }

    public JTextField getTxtNumVeh7() {
        return TxtNumVeh7;
    }

    public void setTxtNumVeh7(JTextField TxtNumVeh7) {
        this.TxtNumVeh7 = TxtNumVeh7;
    }

    public JTextField getTxtPorVeh1() {
        return TxtPorVeh1;
    }

    public void setTxtPorVeh1(JTextField TxtPorVeh1) {
        this.TxtPorVeh1 = TxtPorVeh1;
    }

    public JTextField getTxtPorVeh2() {
        return TxtPorVeh2;
    }

    public void setTxtPorVeh2(JTextField TxtPorVeh2) {
        this.TxtPorVeh2 = TxtPorVeh2;
    }

    public JTextField getTxtPorVeh3() {
        return TxtPorVeh3;
    }

    public void setTxtPorVeh3(JTextField TxtPorVeh3) {
        this.TxtPorVeh3 = TxtPorVeh3;
    }

    public JTextField getTxtPorVeh4() {
        return TxtPorVeh4;
    }

    public void setTxtPorVeh4(JTextField TxtPorVeh4) {
        this.TxtPorVeh4 = TxtPorVeh4;
    }

    public JTextField getTxtPorVeh5() {
        return TxtPorVeh5;
    }

    public void setTxtPorVeh5(JTextField TxtPorVeh5) {
        this.TxtPorVeh5 = TxtPorVeh5;
    }

    public JTextField getTxtPorVeh6() {
        return TxtPorVeh6;
    }

    public void setTxtPorVeh6(JTextField TxtPorVeh6) {
        this.TxtPorVeh6 = TxtPorVeh6;
    }

    public JTextField getTxtPorVeh7() {
        return TxtPorVeh7;
    }

    public void setTxtPorVeh7(JTextField TxtPorVeh7) {
        this.TxtPorVeh7 = TxtPorVeh7;
    }

    public JTextField getTxtTotalCosto() {
        return TxtTotalCosto;
    }

    public void setTxtTotalCosto(JTextField TxtTotalCosto) {
        this.TxtTotalCosto = TxtTotalCosto;
    }

    public JTextField getTxtTotalVeh() {
        return TxtTotalVeh;
    }

    public void setTxtTotalVeh(JTextField TxtTotalVeh) {
        this.TxtTotalVeh = TxtTotalVeh;
    }

    public JTextField getTxtValVeh1() {
        return TxtValVeh1;
    }

    public void setTxtValVeh1(JTextField TxtValVeh1) {
        this.TxtValVeh1 = TxtValVeh1;
    }

    public JTextField getTxtValVeh2() {
        return TxtValVeh2;
    }

    public void setTxtValVeh2(JTextField TxtValVeh2) {
        this.TxtValVeh2 = TxtValVeh2;
    }

    public JTextField getTxtValVeh3() {
        return TxtValVeh3;
    }

    public void setTxtValVeh3(JTextField TxtValVeh3) {
        this.TxtValVeh3 = TxtValVeh3;
    }

    public JTextField getTxtValVeh4() {
        return TxtValVeh4;
    }

    public void setTxtValVeh4(JTextField TxtValVeh4) {
        this.TxtValVeh4 = TxtValVeh4;
    }

    public JTextField getTxtValVeh5() {
        return TxtValVeh5;
    }

    public void setTxtValVeh5(JTextField TxtValVeh5) {
        this.TxtValVeh5 = TxtValVeh5;
    }

    public JTextField getTxtValVeh6() {
        return TxtValVeh6;
    }

    public void setTxtValVeh6(JTextField TxtValVeh6) {
        this.TxtValVeh6 = TxtValVeh6;
    }

    public JTextField getTxtValVeh7() {
        return TxtValVeh7;
    }

    public void setTxtValVeh7(JTextField TxtValVeh7) {
        this.TxtValVeh7 = TxtValVeh7;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public void setBtnVolver(JButton btnVolver) {
        this.btnVolver = btnVolver;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    
    
}
