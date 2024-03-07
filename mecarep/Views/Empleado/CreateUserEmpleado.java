/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mecarep.Views.Empleado;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mecarep.Controlers.ControladorEmpleado;
import mecarep.Controlers.Validaciones;
import mecarep.Models.Empleado;

/**
 *
 * @author USER
 */
public class CreateUserEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form CreateUserEmpleado
     */
    ControladorEmpleado tabla = new ControladorEmpleado();
    public CreateUserEmpleado() {
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

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        lblCel = new javax.swing.JLabel();
        lblCel2 = new javax.swing.JLabel();
        lblCel4 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        cmbClienteTaller = new javax.swing.JComboBox<>();
        lblCel1 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        lblSubtitle1 = new javax.swing.JLabel();
        lblSubtitle2 = new javax.swing.JLabel();
        lblCe3 = new javax.swing.JLabel();
        lblCel5 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        lblCel6 = new javax.swing.JLabel();
        txtIDEmpleado = new javax.swing.JTextField();
        btnCancelarEmp = new javax.swing.JButton();
        btnGuardarEmp = new javax.swing.JButton();
        FechaInicio = new com.toedter.calendar.JDateChooser();
        bgBack = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registrar Nuevo Empledo");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        txtCedula.setToolTipText("");
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 130, -1));

        lblCel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCel.setForeground(new java.awt.Color(255, 255, 255));
        lblCel.setText("Cedula:");
        getContentPane().add(lblCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        lblCel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCel2.setForeground(new java.awt.Color(255, 255, 255));
        lblCel2.setText("Apellidos:");
        getContentPane().add(lblCel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        lblCel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCel4.setForeground(new java.awt.Color(255, 255, 255));
        lblCel4.setText("Taller:");
        getContentPane().add(lblCel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 190, -1));

        cmbClienteTaller.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "T001", "T002" }));
        getContentPane().add(cmbClienteTaller, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 140, -1));

        lblCel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCel1.setForeground(new java.awt.Color(255, 255, 255));
        lblCel1.setText("Nombres:");
        lblCel1.setToolTipText("");
        getContentPane().add(lblCel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 190, -1));

        lblSubtitle1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblSubtitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitle1.setText("Datos Personales");
        getContentPane().add(lblSubtitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        lblSubtitle2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblSubtitle2.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitle2.setText("Datos del Contrato");
        getContentPane().add(lblSubtitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        lblCe3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCe3.setForeground(new java.awt.Color(255, 255, 255));
        lblCe3.setText("Inicio Contrato:");
        getContentPane().add(lblCe3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        lblCel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCel5.setForeground(new java.awt.Color(255, 255, 255));
        lblCel5.setText("Salario:");
        getContentPane().add(lblCel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));
        getContentPane().add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 160, -1));

        lblCel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCel6.setForeground(new java.awt.Color(255, 255, 255));
        lblCel6.setText("ID Empleado:");
        getContentPane().add(lblCel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));
        getContentPane().add(txtIDEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 150, -1));

        btnCancelarEmp.setBackground(new java.awt.Color(153, 0, 0));
        btnCancelarEmp.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnCancelarEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarEmp.setText("Cancelar");
        btnCancelarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEmpActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 120, 40));

        btnGuardarEmp.setBackground(new java.awt.Color(0, 102, 204));
        btnGuardarEmp.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnGuardarEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarEmp.setText("Guardar");
        btnGuardarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEmpActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 120, 40));
        getContentPane().add(FechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        bgBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mecarep/Views/img/bg-blue.jpg"))); // NOI18N
        getContentPane().add(bgBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 636, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmpActionPerformed
        String idEmpleado = this.txtIDEmpleado.getText();
        String idTaller = this.cmbClienteTaller.getSelectedItem().toString();
        String cedulaEmpleado = this.txtCedula.getText();
        String nombreEmpleado = this.txtNombres.getText() + this.txtApellidos.getText();
        java.util.Date fechaUtil = FechaInicio.getDate();
        java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime()); 
        try {
            Validaciones.validarNombre(nombreEmpleado);
            Validaciones.validarDatosNumericos(this.txtSalario.getText());
            int salario = Integer.parseInt(this.txtSalario.getText());
            Empleado empleadoguardar = new Empleado(idEmpleado, idTaller, cedulaEmpleado, nombreEmpleado, fechaSQL, salario);
            tabla.guardarEmpleado(empleadoguardar);
            JOptionPane.showMessageDialog(null, "Empleado Ingresado con éxito.", "Exitosa", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } 
       
    }//GEN-LAST:event_btnGuardarEmpActionPerformed

    private void btnCancelarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEmpActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarEmpActionPerformed

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
            java.util.logging.Logger.getLogger(CreateUserEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUserEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUserEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUserEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateUserEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaInicio;
    private javax.swing.JLabel bgBack;
    private javax.swing.JButton btnCancelarEmp;
    private javax.swing.JButton btnGuardarEmp;
    private javax.swing.JComboBox<String> cmbClienteTaller;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblCe3;
    private javax.swing.JLabel lblCel;
    private javax.swing.JLabel lblCel1;
    private javax.swing.JLabel lblCel2;
    private javax.swing.JLabel lblCel4;
    private javax.swing.JLabel lblCel5;
    private javax.swing.JLabel lblCel6;
    private javax.swing.JLabel lblSubtitle1;
    private javax.swing.JLabel lblSubtitle2;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtIDEmpleado;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
