/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mecarep.Views.Telefonos;

import javax.swing.table.DefaultTableModel;
import mecarep.Controlers.ControladorTelefonoEmpleado;
import javax.swing.JOptionPane;
import mecarep.Views.Empleado.CreateUserEmpleado;

/**
 *
 * @author Usuario
 */
public class TelefonosView extends javax.swing.JPanel {

    /**
     * Creates new form TelefonosView
     */
    private String id_empleado;
    ControladorTelefonoEmpleado tel = new ControladorTelefonoEmpleado();
    
    public TelefonosView() {
        initComponents();
        tel = new ControladorTelefonoEmpleado();
        tel.desplegarTelefonos(RegistrosTef); 
    }
/*
        private String id_empleado;
    ControladorTelefonoEmpleado tel; 
            
    public TelefonosView() {
        initComponents();
        tel = new ControladorTelefonoEmpleado();
        tel.desplegarTelefonos(RegistrosTef); 
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEliminarTelefono = new javax.swing.JButton();
        btnNuevoTelefono = new javax.swing.JButton();
        Datos1 = new javax.swing.JScrollPane();
        RegistrosTef = new javax.swing.JTable();
        bgBack2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminarTelefono.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminarTelefono.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnEliminarTelefono.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarTelefono.setText("Eliminar");
        btnEliminarTelefono.setToolTipText("");
        btnEliminarTelefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTelefonoActionPerformed(evt);
            }
        });
        add(btnEliminarTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 120, 30));

        btnNuevoTelefono.setBackground(new java.awt.Color(0, 102, 204));
        btnNuevoTelefono.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnNuevoTelefono.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoTelefono.setText("Nuevo");
        btnNuevoTelefono.setToolTipText("");
        btnNuevoTelefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNuevoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoTelefonoActionPerformed(evt);
            }
        });
        add(btnNuevoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 120, 30));

        RegistrosTef.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        RegistrosTef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RegistrosTefMousePressed(evt);
            }
        });
        Datos1.setViewportView(RegistrosTef);

        add(Datos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 690, 280));

        bgBack2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mecarep/Views/img/bg-blue.jpg"))); // NOI18N
        add(bgBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTelefonoActionPerformed
       tel.eliminarTelefono(id_empleado);
       tel.desplegarTelefonos(RegistrosTef); 
    }//GEN-LAST:event_btnEliminarTelefonoActionPerformed
                                        
    private void btnNuevoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoTelefonoActionPerformed
        CreateTelefono esp = new CreateTelefono();
        esp.setVisible(true);
    }//GEN-LAST:event_btnNuevoTelefonoActionPerformed

    private void RegistrosTefMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrosTefMousePressed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) RegistrosTef.getModel();
        // Obtener el índice de la fila seleccionada
        int filaSeleccionada = RegistrosTef.getSelectedRow();
        // Comprobar si se ha seleccionado una fila válida
        if (filaSeleccionada != -1) {
            // Obtener los datos de la fila seleccionada y almacenarlos en variables
            id_empleado = modelo.getValueAt(filaSeleccionada, 0).toString();

        } 
    }//GEN-LAST:event_RegistrosTefMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JScrollPane Datos1;
    public javax.swing.JTable RegistrosTef;
    private javax.swing.JLabel bgBack2;
    private javax.swing.JButton btnEliminarTelefono;
    private javax.swing.JButton btnNuevoTelefono;
    // End of variables declaration//GEN-END:variables
}
