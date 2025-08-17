
package view;

import javax.swing.JLabel;
import javax.swing.JTextField;


public class Entrada extends javax.swing.JPanel {

   
    public Entrada() {
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
        jLabel6 = new javax.swing.JLabel();
        jTextideEst = new javax.swing.JTextField();
        jTextnomEst = new javax.swing.JTextField();
        jTextapeEst = new javax.swing.JTextField();
        jTextproSem = new javax.swing.JTextField();
        jTextvalMatSem = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("Datos de entrada");

        jLabel2.setText("Identificacion:");

        jLabel3.setText("Nombres:");

        jLabel4.setText("Apellidos:");

        jLabel5.setText("Promedio del semestre:");

        jLabel6.setText("Valor de matricula:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextideEst)
                            .addComponent(jTextnomEst)
                            .addComponent(jTextapeEst)
                            .addComponent(jTextproSem)
                            .addComponent(jTextvalMatSem, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                .addContainerGap(360, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextideEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextnomEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextapeEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextproSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextvalMatSem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextapeEst;
    private javax.swing.JTextField jTextideEst;
    private javax.swing.JTextField jTextnomEst;
    private javax.swing.JTextField jTextproSem;
    private javax.swing.JTextField jTextvalMatSem;
    // End of variables declaration//GEN-END:variables

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
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

    public JTextField getjTextapeEst() {
        return jTextapeEst;
    }

    public void setjTextapeEst(JTextField jTextapeEst) {
        this.jTextapeEst = jTextapeEst;
    }

    public JTextField getjTextideEst() {
        return jTextideEst;
    }

    public void setjTextideEst(JTextField jTextideEst) {
        this.jTextideEst = jTextideEst;
    }

    public JTextField getjTextnomEst() {
        return jTextnomEst;
    }

    public void setjTextnomEst(JTextField jTextnomEst) {
        this.jTextnomEst = jTextnomEst;
    }

    public JTextField getjTextproSem() {
        return jTextproSem;
    }

    public void setjTextproSem(JTextField jTextproSem) {
        this.jTextproSem = jTextproSem;
    }

    public JTextField getjTextvalMatSem() {
        return jTextvalMatSem;
    }

    public void setjTextvalMatSem(JTextField jTextvalMatSem) {
        this.jTextvalMatSem = jTextvalMatSem;
    }



}
