/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mecarep.Views.Cliente;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mecarep.Controlers.ControladorCliente;
import mecarep.Models.Cliente;

/**
 *
 * @author Usuario
 */
public class ClienteView extends javax.swing.JPanel {

    /**
     * Creates new form ClienteView
     */
    ControladorCliente ce;
    String id_usuario;
    Cliente clienteSeleccionado = new Cliente();

    public ClienteView() {
        initComponents();
        ce = new ControladorCliente();
        ce.desplegarClientes(RegistrosC);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEliminarCliente = new javax.swing.JButton();
        btnNuevoCliente = new javax.swing.JButton();
        DatosC = new javax.swing.JScrollPane();
        RegistrosC = new javax.swing.JTable();
        bgBack2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminarCliente.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminarCliente.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnEliminarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente.setText("Eliminar");
        btnEliminarCliente.setToolTipText("");
        btnEliminarCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });
        add(btnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 120, 30));

        btnNuevoCliente.setBackground(new java.awt.Color(0, 102, 204));
        btnNuevoCliente.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnNuevoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoCliente.setText("Nuevo");
        btnNuevoCliente.setToolTipText("");
        btnNuevoCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });
        add(btnNuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 120, 30));

        RegistrosC.setModel(new javax.swing.table.DefaultTableModel(
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
        RegistrosC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RegistrosCMousePressed(evt);
            }
        });
        DatosC.setViewportView(RegistrosC);

        add(DatosC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 690, 290));

        bgBack2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mecarep/Views/img/bg-blue.jpg"))); // NOI18N
        add(bgBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 520));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        CreateCliente cr = new CreateCliente();
        cr.setVisible(true);
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        int resultado = ce.eliminarCliente(clienteSeleccionado); // Ajusta esto según tu implementación del método eliminarCliente
        // Puedes manejar el resultado de la eliminación aquí, por ejemplo, mostrar un mensaje
        if (resultado > 0) {
            JOptionPane.showMessageDialog(null, "El cliente ha sido eliminado correctamente.");
            ce.desplegarClientes(RegistrosC);
        } else {
            JOptionPane.showMessageDialog(null, "Error al eliminar el cliente.");
        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void RegistrosCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrosCMousePressed
        DefaultTableModel modelo = (DefaultTableModel) RegistrosC.getModel();
        // Obtener el índice de la fila seleccionada
        int filaSeleccionada = RegistrosC.getSelectedRow();
        // Comprobar si se ha seleccionado una fila válida
        if (filaSeleccionada != -1) {
            // Obtener los datos de la fila seleccionada y almacenarlos en variables
            String cedula = modelo.getValueAt(filaSeleccionada, 0).toString();
            String nombre = modelo.getValueAt(filaSeleccionada, 1).toString();
            String apellido = modelo.getValueAt(filaSeleccionada, 2).toString();
            String ciudad = modelo.getValueAt(filaSeleccionada, 3).toString();
            String idTaller = modelo.getValueAt(filaSeleccionada, 4).toString();
            clienteSeleccionado = new Cliente(nombre, apellido, idTaller, ciudad, cedula);
        }
    }//GEN-LAST:event_RegistrosCMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JScrollPane DatosC;
    public javax.swing.JTable RegistrosC;
    private javax.swing.JLabel bgBack2;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnNuevoCliente;
    // End of variables declaration//GEN-END:variables
}
