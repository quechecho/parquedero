
package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Totales extends javax.swing.JPanel {

   
    public Totales() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextnumTotEstSub = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextnumEstSub00 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextdinTotOtoSub = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextporEstSub00 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextNumEstSub100 = new javax.swing.JTextField();
        jTextNumEstSub80 = new javax.swing.JTextField();
        jTextNumEstSub60 = new javax.swing.JTextField();
        jTextNumEstSub40 = new javax.swing.JTextField();
        jTextNumEstSub20 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextdinTotSub100 = new javax.swing.JTextField();
        jTextdinTotSub80 = new javax.swing.JTextField();
        jTextdinTotSub60 = new javax.swing.JTextField();
        jTextdinTotSub40 = new javax.swing.JTextField();
        jTextdinTotSub20 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextporEstSub100 = new javax.swing.JTextField();
        jTextporEstSub80 = new javax.swing.JTextField();
        jTextporEstSub60 = new javax.swing.JTextField();
        jTextporEstSub40 = new javax.swing.JTextField();
        jTextporEstSub20 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        bntVolver = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Datos de salidas totales");

        jLabel2.setText("Subsidios entregados por la ONG:");

        jLabel3.setText("Numero de estudiantes con subsidio de:");

        jLabel4.setText("Porcentaje de estudiantes subsidiados con el:");

        jLabel5.setText("Numero total de estudiantes subsidiados");

        jLabel6.setText("Numero total de estudiantes sin subsidios:");

        jLabel7.setText("Dinero total otorgado en subsidios por la ONG:");

        jLabel8.setText("Porcentaje estudiantes sin subsidio:");

        jTextporEstSub00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextporEstSub00ActionPerformed(evt);
            }
        });

        jLabel9.setText("100%");

        jLabel10.setText("80%");

        jLabel11.setText("60%");

        jLabel12.setText("40%");

        jLabel13.setText("20%");

        jTextNumEstSub40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNumEstSub40ActionPerformed(evt);
            }
        });

        jLabel14.setText("Dinero total otorgado en subsidio del:");

        jTextdinTotSub80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextdinTotSub80ActionPerformed(evt);
            }
        });

        jTextdinTotSub60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextdinTotSub60ActionPerformed(evt);
            }
        });

        jTextdinTotSub20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextdinTotSub20ActionPerformed(evt);
            }
        });

        jLabel15.setText("100%");

        jLabel16.setText("80%");

        jLabel17.setText("60%");

        jLabel18.setText("40%");

        jLabel19.setText("20%");

        jTextporEstSub20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextporEstSub20ActionPerformed(evt);
            }
        });

        jLabel20.setText("100%");

        jLabel21.setText("80%");

        jLabel22.setText("60%");

        jLabel23.setText("40%");

        jLabel24.setText("20%");

        bntVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Back.jpg"))); // NOI18N
        bntVolver.setText("Volver");
        bntVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jTextdinTotOtoSub, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextporEstSub00, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel14)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel19))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jTextdinTotSub80, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                                    .addComponent(jTextdinTotSub100))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jTextdinTotSub20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                    .addComponent(jTextdinTotSub60, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextdinTotSub40, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(175, 175, 175)
                                                .addComponent(bntVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(23, 23, 23)
                                            .addComponent(jTextnumEstSub00, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel12))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel11))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(24, 24, 24)
                                            .addComponent(jTextnumTotEstSub, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(77, 77, 77)
                                            .addComponent(jLabel9))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextNumEstSub100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel20))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextNumEstSub80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel21))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextNumEstSub20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel24))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextNumEstSub60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel22))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextNumEstSub40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel23)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextporEstSub100)
                                    .addComponent(jTextporEstSub80)
                                    .addComponent(jTextporEstSub60)
                                    .addComponent(jTextporEstSub40)
                                    .addComponent(jTextporEstSub20))))
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9)
                                    .addComponent(jTextNumEstSub100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextporEstSub100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextnumTotEstSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jTextNumEstSub80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextporEstSub80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11)
                                    .addComponent(jTextNumEstSub60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextporEstSub60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextnumEstSub00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jTextNumEstSub40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextporEstSub40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextNumEstSub20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextporEstSub20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextdinTotOtoSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextdinTotSub100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextdinTotSub80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel16))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextporEstSub00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextdinTotSub60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextdinTotSub40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntVolver)
                        .addGap(19, 19, 19)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextdinTotSub20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextporEstSub00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextporEstSub00ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextporEstSub00ActionPerformed

    private void jTextNumEstSub40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNumEstSub40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNumEstSub40ActionPerformed

    private void jTextdinTotSub80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextdinTotSub80ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextdinTotSub80ActionPerformed

    private void jTextdinTotSub60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextdinTotSub60ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextdinTotSub60ActionPerformed

    private void jTextdinTotSub20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextdinTotSub20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextdinTotSub20ActionPerformed

    private void jTextporEstSub20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextporEstSub20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextporEstSub20ActionPerformed

    private void bntVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextNumEstSub100;
    private javax.swing.JTextField jTextNumEstSub20;
    private javax.swing.JTextField jTextNumEstSub40;
    private javax.swing.JTextField jTextNumEstSub60;
    private javax.swing.JTextField jTextNumEstSub80;
    private javax.swing.JTextField jTextdinTotOtoSub;
    private javax.swing.JTextField jTextdinTotSub100;
    private javax.swing.JTextField jTextdinTotSub20;
    private javax.swing.JTextField jTextdinTotSub40;
    private javax.swing.JTextField jTextdinTotSub60;
    private javax.swing.JTextField jTextdinTotSub80;
    private javax.swing.JTextField jTextnumEstSub00;
    private javax.swing.JTextField jTextnumTotEstSub;
    private javax.swing.JTextField jTextporEstSub00;
    private javax.swing.JTextField jTextporEstSub100;
    private javax.swing.JTextField jTextporEstSub20;
    private javax.swing.JTextField jTextporEstSub40;
    private javax.swing.JTextField jTextporEstSub60;
    private javax.swing.JTextField jTextporEstSub80;
    // End of variables declaration//GEN-END:variables

    public JButton getBntVolver() {
        return bntVolver;
    }

    public void setBntVolver(JButton bntVolver) {
        this.bntVolver = bntVolver;
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

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public JLabel getjLabel15() {
        return jLabel15;
    }

    public void setjLabel15(JLabel jLabel15) {
        this.jLabel15 = jLabel15;
    }

    public JLabel getjLabel16() {
        return jLabel16;
    }

    public void setjLabel16(JLabel jLabel16) {
        this.jLabel16 = jLabel16;
    }

    public JLabel getjLabel17() {
        return jLabel17;
    }

    public void setjLabel17(JLabel jLabel17) {
        this.jLabel17 = jLabel17;
    }

    public JLabel getjLabel18() {
        return jLabel18;
    }

    public void setjLabel18(JLabel jLabel18) {
        this.jLabel18 = jLabel18;
    }

    public JLabel getjLabel19() {
        return jLabel19;
    }

    public void setjLabel19(JLabel jLabel19) {
        this.jLabel19 = jLabel19;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel20() {
        return jLabel20;
    }

    public void setjLabel20(JLabel jLabel20) {
        this.jLabel20 = jLabel20;
    }

    public JLabel getjLabel21() {
        return jLabel21;
    }

    public void setjLabel21(JLabel jLabel21) {
        this.jLabel21 = jLabel21;
    }

    public JLabel getjLabel22() {
        return jLabel22;
    }

    public void setjLabel22(JLabel jLabel22) {
        this.jLabel22 = jLabel22;
    }

    public JLabel getjLabel23() {
        return jLabel23;
    }

    public void setjLabel23(JLabel jLabel23) {
        this.jLabel23 = jLabel23;
    }

    public JLabel getjLabel24() {
        return jLabel24;
    }

    public void setjLabel24(JLabel jLabel24) {
        this.jLabel24 = jLabel24;
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

    public JTextField getjTextNumEstSub100() {
        return jTextNumEstSub100;
    }

    public void setjTextNumEstSub100(JTextField jTextNumEstSub100) {
        this.jTextNumEstSub100 = jTextNumEstSub100;
    }

    public JTextField getjTextNumEstSub20() {
        return jTextNumEstSub20;
    }

    public void setjTextNumEstSub20(JTextField jTextNumEstSub20) {
        this.jTextNumEstSub20 = jTextNumEstSub20;
    }

    public JTextField getjTextNumEstSub40() {
        return jTextNumEstSub40;
    }

    public void setjTextNumEstSub40(JTextField jTextNumEstSub40) {
        this.jTextNumEstSub40 = jTextNumEstSub40;
    }

    public JTextField getjTextNumEstSub60() {
        return jTextNumEstSub60;
    }

    public void setjTextNumEstSub60(JTextField jTextNumEstSub60) {
        this.jTextNumEstSub60 = jTextNumEstSub60;
    }

    public JTextField getjTextNumEstSub80() {
        return jTextNumEstSub80;
    }

    public void setjTextNumEstSub80(JTextField jTextNumEstSub80) {
        this.jTextNumEstSub80 = jTextNumEstSub80;
    }

    public JTextField getjTextdinTotOtoSub() {
        return jTextdinTotOtoSub;
    }

    public void setjTextdinTotOtoSub(JTextField jTextdinTotOtoSub) {
        this.jTextdinTotOtoSub = jTextdinTotOtoSub;
    }

    public JTextField getjTextdinTotSub100() {
        return jTextdinTotSub100;
    }

    public void setjTextdinTotSub100(JTextField jTextdinTotSub100) {
        this.jTextdinTotSub100 = jTextdinTotSub100;
    }

    public JTextField getjTextdinTotSub20() {
        return jTextdinTotSub20;
    }

    public void setjTextdinTotSub20(JTextField jTextdinTotSub20) {
        this.jTextdinTotSub20 = jTextdinTotSub20;
    }

    public JTextField getjTextdinTotSub40() {
        return jTextdinTotSub40;
    }

    public void setjTextdinTotSub40(JTextField jTextdinTotSub40) {
        this.jTextdinTotSub40 = jTextdinTotSub40;
    }

    public JTextField getjTextdinTotSub60() {
        return jTextdinTotSub60;
    }

    public void setjTextdinTotSub60(JTextField jTextdinTotSub60) {
        this.jTextdinTotSub60 = jTextdinTotSub60;
    }

    public JTextField getjTextdinTotSub80() {
        return jTextdinTotSub80;
    }

    public void setjTextdinTotSub80(JTextField jTextdinTotSub80) {
        this.jTextdinTotSub80 = jTextdinTotSub80;
    }

    public JTextField getjTextnumEstSub00() {
        return jTextnumEstSub00;
    }

    public void setjTextnumEstSub00(JTextField jTextnumEstSub00) {
        this.jTextnumEstSub00 = jTextnumEstSub00;
    }

    public JTextField getjTextnumTotEstSub() {
        return jTextnumTotEstSub;
    }

    public void setjTextnumTotEstSub(JTextField jTextnumTotEstSub) {
        this.jTextnumTotEstSub = jTextnumTotEstSub;
    }

    public JTextField getjTextporEstSub00() {
        return jTextporEstSub00;
    }

    public void setjTextporEstSub00(JTextField jTextporEstSub00) {
        this.jTextporEstSub00 = jTextporEstSub00;
    }

    public JTextField getjTextporEstSub100() {
        return jTextporEstSub100;
    }

    public void setjTextporEstSub100(JTextField jTextporEstSub100) {
        this.jTextporEstSub100 = jTextporEstSub100;
    }

    public JTextField getjTextporEstSub20() {
        return jTextporEstSub20;
    }

    public void setjTextporEstSub20(JTextField jTextporEstSub20) {
        this.jTextporEstSub20 = jTextporEstSub20;
    }

    public JTextField getjTextporEstSub40() {
        return jTextporEstSub40;
    }

    public void setjTextporEstSub40(JTextField jTextporEstSub40) {
        this.jTextporEstSub40 = jTextporEstSub40;
    }

    public JTextField getjTextporEstSub60() {
        return jTextporEstSub60;
    }

    public void setjTextporEstSub60(JTextField jTextporEstSub60) {
        this.jTextporEstSub60 = jTextporEstSub60;
    }

    public JTextField getjTextporEstSub80() {
        return jTextporEstSub80;
    }

    public void setjTextporEstSub80(JTextField jTextporEstSub80) {
        this.jTextporEstSub80 = jTextporEstSub80;
    }


    




}
