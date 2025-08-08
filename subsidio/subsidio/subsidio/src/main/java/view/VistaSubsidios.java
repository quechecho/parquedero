
package view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class VistaSubsidios extends javax.swing.JFrame {

   
    public VistaSubsidios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVer = new javax.swing.JButton();
        Contenedor = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();
        btnValidar = new javax.swing.JButton();
        btnTotalizar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnVer1 = new javax.swing.JButton();

        btnVer.setText("Ver");
        btnVer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVer.setMaximumSize(new java.awt.Dimension(60, 22));
        btnVer.setMinimumSize(new java.awt.Dimension(60, 22));
        btnVer.setPreferredSize(new java.awt.Dimension(60, 22));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
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

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Add.png"))); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdicionar.setMaximumSize(new java.awt.Dimension(60, 22));
        btnAdicionar.setMinimumSize(new java.awt.Dimension(60, 22));
        btnAdicionar.setPreferredSize(new java.awt.Dimension(60, 22));
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnVer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Ver.png"))); // NOI18N
        btnVer1.setText("Ver");
        btnVer1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVer1.setMaximumSize(new java.awt.Dimension(60, 22));
        btnVer1.setMinimumSize(new java.awt.Dimension(60, 22));
        btnVer1.setPreferredSize(new java.awt.Dimension(60, 22));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnValidar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnVer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnCalcular)
                .addGap(31, 31, 31)
                .addComponent(btnTotalizar)
                .addGap(28, 28, 28)
                .addComponent(btnLimpiar)
                .addGap(35, 35, 35)
                .addComponent(btnSalir)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnValidar)
                    .addComponent(btnTotalizar)
                    .addComponent(btnSalir)
                    .addComponent(btnLimpiar)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular))
                .addGap(0, 45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTotalizar;
    private javax.swing.JButton btnValidar;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btnVer1;
    // End of variables declaration//GEN-END:variables

    public JPanel getContenedor() {
        return Contenedor;
    }

    public void setContenedor(JPanel Contenedor) {
        this.Contenedor = Contenedor;
    }

    public JButton getBtnAdicionar() {
        return btnAdicionar;
    }

    public void setBtnAdicionar(JButton btnAdicionar) {
        this.btnAdicionar = btnAdicionar;
    }

    public JButton getBtnCalcular() {
        return btnCalcular;
    }

    public void setBtnCalcular(JButton btnCalcular) {
        this.btnCalcular = btnCalcular;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }

    public void setBtnLimpiar(JButton btnLimpiar) {
        this.btnLimpiar = btnLimpiar;
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

    public JButton getBtnVer() {
        return btnVer;
    }

    public void setBtnVer(JButton btnVer) {
        this.btnVer = btnVer;
    }

    public JButton getBtnVer1() {
        return btnVer1;
    }

    public void setBtnVer1(JButton btnVer1) {
        this.btnVer1 = btnVer1;
    }

   
    
}
