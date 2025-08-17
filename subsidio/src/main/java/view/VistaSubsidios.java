
package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class VistaSubsidios extends javax.swing.JFrame {

   
    public VistaSubsidios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        btnValidar = new javax.swing.JButton();
        btnTotalizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        BtnAddInicio = new javax.swing.JButton();
        BtnAddFinal = new javax.swing.JButton();
        txtNro = new javax.swing.JTextField();
        btnAddDespues = new javax.swing.JButton();
        btnDelDespues = new javax.swing.JButton();
        btnObtener = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnVerLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Calcular.png"))); // NOI18N
        btnCalcular.setText("Calcular");

        btnValidar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Validar.png"))); // NOI18N
        btnValidar.setText("Validar");

        btnTotalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Total.png"))); // NOI18N
        btnTotalizar.setText("Totalizar");

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Nuevo.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Salir.png"))); // NOI18N
        btnSalir.setText("Salir");

        BtnAddInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add inicio.png"))); // NOI18N
        BtnAddInicio.setText("Add Inicio");

        BtnAddFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add final.png"))); // NOI18N
        BtnAddFinal.setText("Add Final");

        btnAddDespues.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add despues.png"))); // NOI18N
        btnAddDespues.setText("Add Después");
        btnAddDespues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDespuesActionPerformed(evt);
            }
        });

        btnDelDespues.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/del despues.png"))); // NOI18N
        btnDelDespues.setText("Del  Después");
        btnDelDespues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelDespuesActionPerformed(evt);
            }
        });

        btnObtener.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/obtener.png"))); // NOI18N
        btnObtener.setText("Obtener");
        btnObtener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObtenerActionPerformed(evt);
            }
        });

        jLabel7.setText("Nodo No.");

        btnVerLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ver lista.png"))); // NOI18N
        btnVerLista.setText("VerLista");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVerLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnValidar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnAddInicio))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddDespues, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnAddFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelDespues, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTotalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar)
                        .addGap(29, 29, 29)
                        .addComponent(btnSalir))
                    .addComponent(btnObtener))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAddInicio)
                    .addComponent(BtnAddFinal)
                    .addComponent(btnTotalizar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnSalir)
                    .addComponent(btnValidar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerLista)
                    .addComponent(jLabel7)
                    .addComponent(txtNro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddDespues)
                    .addComponent(btnDelDespues)
                    .addComponent(btnObtener))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddDespuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDespuesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddDespuesActionPerformed

    private void btnDelDespuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelDespuesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDelDespuesActionPerformed

    private void btnObtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObtenerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnObtenerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddFinal;
    private javax.swing.JButton BtnAddInicio;
    private javax.swing.JPanel Contenedor;
    private javax.swing.JButton btnAddDespues;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnDelDespues;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnObtener;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTotalizar;
    private javax.swing.JButton btnValidar;
    private javax.swing.JButton btnVerLista;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtNro;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAddFinal() {
        return BtnAddFinal;
    }

    public void setBtnAddFinal(JButton BtnAddFinal) {
        this.BtnAddFinal = BtnAddFinal;
    }

    public JButton getBtnAddInicio() {
        return BtnAddInicio;
    }

    public void setBtnAddInicio(JButton BtnAddInicio) {
        this.BtnAddInicio = BtnAddInicio;
    }

    public JPanel getContenedor() {
        return Contenedor;
    }

    public void setContenedor(JPanel Contenedor) {
        this.Contenedor = Contenedor;
    }

    public JButton getBtnAddDespues() {
        return btnAddDespues;
    }

    public void setBtnAddDespues(JButton btnAddDespues) {
        this.btnAddDespues = btnAddDespues;
    }

    public JButton getBtnCalcular() {
        return btnCalcular;
    }

    public void setBtnCalcular(JButton btnCalcular) {
        this.btnCalcular = btnCalcular;
    }

    public JButton getBtnDelDespues() {
        return btnDelDespues;
    }

    public void setBtnDelDespues(JButton btnDelDespues) {
        this.btnDelDespues = btnDelDespues;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public void setBtnLimpiar(JButton btnLimpiar) {
        this.btnLimpiar = btnLimpiar;
    }

    public JButton getBtnObtener() {
        return btnObtener;
    }

    public void setBtnObtener(JButton btnObtener) {
        this.btnObtener = btnObtener;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public JButton getBtnTotalizar() {
        return btnTotalizar;
    }

    public void setBtnTotalizar(JButton btnTotalizar) {
        this.btnTotalizar = btnTotalizar;
    }

    public JButton getBtnValidar() {
        return btnValidar;
    }

    public void setBtnValidar(JButton btnValidar) {
        this.btnValidar = btnValidar;
    }

    public JButton getBtnVerLista() {
        return btnVerLista;
    }

    public void setBtnVerLista(JButton btnVerLista) {
        this.btnVerLista = btnVerLista;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JTextField getTxtNro() {
        return txtNro;
    }

    public void setTxtNro(JTextField txtNro) {
        this.txtNro = txtNro;
    }

       
}
