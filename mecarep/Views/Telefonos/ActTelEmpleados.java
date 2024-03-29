/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mecarep.Views.Telefonos;

import mecarep.Views.PanelPrincipal;
import mecarep.Views.Vehiculos.RegistrarVehiculo;

/**
 *
 * @author USER
 */
public class ActTelEmpleados extends javax.swing.JFrame {

    /**
     * Creates new form ActTelEmpleados
     */
    public ActTelEmpleados() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        txtCodEmp = new javax.swing.JTextField();
        lblCel = new javax.swing.JLabel();
        lblCel3 = new javax.swing.JLabel();
        cmbTelefonos = new javax.swing.JComboBox<>();
        lblCel4 = new javax.swing.JLabel();
        txtNuevoTelefono = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        bgBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Actualizar Telefonos");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        txtCodEmp.setToolTipText("");
        getContentPane().add(txtCodEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 220, -1));

        lblCel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCel.setForeground(new java.awt.Color(255, 255, 255));
        lblCel.setText("ID Empleado:");
        getContentPane().add(lblCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        lblCel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCel3.setForeground(new java.awt.Color(255, 255, 255));
        lblCel3.setText("Nuevo Telefono: ");
        getContentPane().add(lblCel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 130, -1));

        cmbTelefonos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTelefonosActionPerformed(evt);
            }
        });
        getContentPane().add(cmbTelefonos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 180, -1));

        lblCel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCel4.setForeground(new java.awt.Color(255, 255, 255));
        lblCel4.setText("Actualizar: ");
        getContentPane().add(lblCel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));
        getContentPane().add(txtNuevoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 190, -1));

        btnRegresar.setBackground(new java.awt.Color(153, 0, 0));
        btnRegresar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Cancelar");
        btnRegresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 120, 30));

        btnActualizar.setBackground(new java.awt.Color(0, 102, 204));
        btnActualizar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setToolTipText("");
        btnActualizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 120, 30));

        bgBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mecarep/Views/img/bg-blue.jpg"))); // NOI18N
        getContentPane().add(bgBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTelefonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTelefonosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTelefonosActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        PanelPrincipal nw = new PanelPrincipal();
        nw.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        RegistrarVehiculo nw = new RegistrarVehiculo();
        nw.setVisible(true);
    }//GEN-LAST:event_btnActualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ActTelEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActTelEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActTelEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActTelEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActTelEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgBack;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbTelefonos;
    private javax.swing.JLabel lblCel;
    private javax.swing.JLabel lblCel3;
    private javax.swing.JLabel lblCel4;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCodEmp;
    private javax.swing.JTextField txtNuevoTelefono;
    // End of variables declaration//GEN-END:variables
}
