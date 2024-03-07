/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mecarep.Views.Seguros;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mecarep.Controlers.ControladorSeguros;
import mecarep.Controlers.Validaciones;
import mecarep.Models.Seguro;

/**
 *
 * @author USER
 */
public class ActSeguros extends javax.swing.JFrame {

    /**
     * Creates new form ActSeguros
     */
    ControladorSeguros seg = new ControladorSeguros();
    Seguro segu;
    public ActSeguros(Seguro seguro) {
        initComponents();
        this.setLocationRelativeTo(null);
        segu = seguro;
        txtIDSeguro.setText(segu.getIdSeguro());
        txtNombreSeg.setText(segu.getNombreSeguro());
        txtTipoSeg.setText(segu.getTipoSeguro());
        txtMonto.setText(String.valueOf(segu.getMontoCobertura()));
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
        txtIDSeguro = new javax.swing.JTextField();
        lblCel = new javax.swing.JLabel();
        lblCel4 = new javax.swing.JLabel();
        lblCel2 = new javax.swing.JLabel();
        txtNombreSeg = new javax.swing.JTextField();
        lblCel3 = new javax.swing.JLabel();
        txtTipoSeg = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        lblCel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        bgBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Actualizar Seguros");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        txtIDSeguro.setEnabled(false);
        getContentPane().add(txtIDSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 160, -1));

        lblCel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCel.setForeground(new java.awt.Color(255, 255, 255));
        lblCel.setText("ID Seguro: ");
        getContentPane().add(lblCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        lblCel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCel4.setForeground(new java.awt.Color(255, 255, 255));
        lblCel4.setText("Actualizar: ");
        getContentPane().add(lblCel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        lblCel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCel2.setForeground(new java.awt.Color(255, 255, 255));
        lblCel2.setText("Nombre:");
        getContentPane().add(lblCel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        txtNombreSeg.setEnabled(false);
        getContentPane().add(txtNombreSeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 200, -1));

        lblCel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCel3.setForeground(new java.awt.Color(255, 255, 255));
        lblCel3.setText("Tipo:");
        getContentPane().add(lblCel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));
        getContentPane().add(txtTipoSeg, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 200, -1));
        getContentPane().add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 140, -1));

        lblCel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        lblCel1.setForeground(new java.awt.Color(255, 255, 255));
        lblCel1.setText("Monto Cobertura: ");
        getContentPane().add(lblCel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

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
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 120, 30));

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
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 120, 30));

        bgBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mecarep/Views/img/bg-blue.jpg"))); // NOI18N
        getContentPane().add(bgBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            Validaciones.validarDatosNumericos(txtMonto.getText());
            seg.actualizarSeguro01(segu.getIdSeguro(),txtTipoSeg.getText(),Integer.parseInt(txtMonto.getText()));
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgBack;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lblCel;
    private javax.swing.JLabel lblCel1;
    private javax.swing.JLabel lblCel2;
    private javax.swing.JLabel lblCel3;
    private javax.swing.JLabel lblCel4;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtIDSeguro;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombreSeg;
    private javax.swing.JTextField txtTipoSeg;
    // End of variables declaration//GEN-END:variables
}
