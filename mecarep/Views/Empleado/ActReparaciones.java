package mecarep.Views.Empleado;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import mecarep.Controlers.ControladorReparaciones;
import mecarep.Views.PanelPrincipal;
import mecarep.Views.Vehiculos.RegistrarVehiculo;

/**
 *
 * @author USER
 */
public class ActReparaciones extends javax.swing.JFrame {

    /**
     * Creates new form ActReparaciones
     */
    ControladorReparaciones rep = new ControladorReparaciones();    
    public ActReparaciones() {
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
        lblCel = new javax.swing.JLabel();
        txtIDReparacion = new javax.swing.JTextField();
        lblCel1 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        lblCel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblCel3 = new javax.swing.JLabel();
        lblCel4 = new javax.swing.JLabel();
        txtFechaRep = new javax.swing.JTextField();
        lblCel6 = new javax.swing.JLabel();
        txtTipoRep = new javax.swing.JTextField();
        lblCel7 = new javax.swing.JLabel();
        txtPrecioRep = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        bgBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Actualizar Reparaciones");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        lblCel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCel.setForeground(new java.awt.Color(255, 255, 255));
        lblCel.setText("ID Reparación:");
        getContentPane().add(lblCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));
        getContentPane().add(txtIDReparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 140, -1));

        lblCel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCel1.setForeground(new java.awt.Color(255, 255, 255));
        lblCel1.setText("Matricula:");
        getContentPane().add(lblCel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));
        getContentPane().add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 160, -1));

        lblCel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCel5.setForeground(new java.awt.Color(255, 255, 255));
        lblCel5.setText("Observaciones: ");
        getContentPane().add(lblCel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 410, 70));

        lblCel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCel3.setForeground(new java.awt.Color(255, 255, 255));
        lblCel3.setText("Actualizar: ");
        getContentPane().add(lblCel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        lblCel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCel4.setForeground(new java.awt.Color(255, 255, 255));
        lblCel4.setText("Fecha Reparación:");
        getContentPane().add(lblCel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        getContentPane().add(txtFechaRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 120, -1));

        lblCel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCel6.setForeground(new java.awt.Color(255, 255, 255));
        lblCel6.setText("Tipo Reparación: ");
        getContentPane().add(lblCel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        getContentPane().add(txtTipoRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 120, -1));

        lblCel7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCel7.setForeground(new java.awt.Color(255, 255, 255));
        lblCel7.setText("Precio: ");
        getContentPane().add(lblCel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));
        getContentPane().add(txtPrecioRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 320, -1));

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
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 120, 30));

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
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 120, 30));

        bgBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mecarep/Views/img/bg-blue.jpg"))); // NOI18N
        getContentPane().add(bgBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        RegistrarVehiculo nw = new RegistrarVehiculo();
        nw.setVisible(true);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(ActReparaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActReparaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActReparaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActReparaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActReparaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgBack;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblCel;
    private javax.swing.JLabel lblCel1;
    private javax.swing.JLabel lblCel3;
    private javax.swing.JLabel lblCel4;
    private javax.swing.JLabel lblCel5;
    private javax.swing.JLabel lblCel6;
    private javax.swing.JLabel lblCel7;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtFechaRep;
    private javax.swing.JTextField txtIDReparacion;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtPrecioRep;
    private javax.swing.JTextField txtTipoRep;
    // End of variables declaration//GEN-END:variables
}
