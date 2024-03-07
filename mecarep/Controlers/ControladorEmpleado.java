/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mecarep.Controlers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import mecarep.Models.Empleado;

/**
 *
 * @author Usuario
 */
public class ControladorEmpleado {

    static ResultSet resultado;
    static PreparedStatement statement;
    Conexion conexion = new Conexion();

    public void desplegarEmpleadosQuito(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Empleado");
        modelo.addColumn("Taller");
        modelo.addColumn("Cédula Empleado");
        modelo.addColumn("Nombre Empleado");
        modelo.addColumn("Fecha Inicio Contrato");
        modelo.addColumn("Salario");
        try {
            conexion.conectar();
            String sql = "SELECT ID_EMPLEADO, ID_TALLER, CEDULA_EMPLEADO, NOMBRE_EMPLEADO, FECHA_INICIO_CONTRATO, SALARIO FROM EMPLEADOS";
            statement = conexion.conex.prepareStatement(sql);
            resultado = statement.executeQuery();
            Object[] fila = new Object[6];
            while (resultado.next()) {
                fila[0] = resultado.getString("ID_EMPLEADO");
                fila[1] = resultado.getString("ID_TALLER");
                fila[2] = resultado.getString("CEDULA_EMPLEADO");
                fila[3] = resultado.getString("NOMBRE_EMPLEADO");
                fila[4] = resultado.getString("FECHA_INICIO_CONTRATO");
                fila[5] = resultado.getString("SALARIO");
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
            resultado.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println("Error al desplegar datos de empleados: " + e.getMessage());
        } finally {
            conexion.cerrarConexión();
        }
    }

    public void cargarIDEmpleadosEnComboBox(JComboBox<String> comboBox) {
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        try {
            conexion.conectar();
            String sql = "SELECT ID_EMPLEADO FROM EMPLEADOS";
            statement = conexion.conex.prepareStatement(sql);
            resultado = statement.executeQuery();
            while (resultado.next()) {
                modelo.addElement(resultado.getString("ID_EMPLEADO"));
            }
            comboBox.setModel(modelo);

            resultado.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println("Error al cargar datos de empleados en el ComboBox: " + e.getMessage());
        } finally {
            conexion.cerrarConexión();
        }
    }

    public void actualizarSalarioEmpleado(String idEmpleado, double nuevoSalario) throws SQLException {
        conexion.conectar();
        String sql = "UPDATE EMPLEADOS SET SALARIO = ? WHERE ID_EMPLEADO = ?";
        statement = conexion.conex.prepareStatement(sql);
        statement.setDouble(1, nuevoSalario);
        statement.setString(2, idEmpleado);
        int filasAfectadas = statement.executeUpdate();

        if (filasAfectadas > 0) {
            System.out.println("Actualización exitosa. Filas afectadas: " + filasAfectadas);
        } else {
            System.out.println("No se encontró ningún empleado con el ID proporcionado.");
        }
        statement.close();
        conexion.cerrarConexión();
    }

    public void guardarEmpleado(Empleado empleado) throws ParseException, SQLException {
        String sql = "INSERT INTO EMPLEADOS  (ID_EMPLEADO, ID_TALLER, CEDULA_EMPLEADO, NOMBRE_EMPLEADO, FECHA_INICIO_CONTRATO, SALARIO) values (?,?,?,?,?,?)";
        PreparedStatement statement = null; // Declaramos el statement aquí para que esté disponible en el bloque finall
        conexion.conectar();
        statement = conexion.conex.prepareStatement(sql);
        statement.setString(1, empleado.getIdEmpleado());
        statement.setString(2, empleado.getIdTaller());
        statement.setString(3, empleado.getCedulaEmpleado());
        statement.setString(4, empleado.getNombreEmpleado());
        statement.setDate(5, (java.sql.Date) empleado.getFechaInicioContrato());
        statement.setInt(6, empleado.getSalario());
        statement.executeUpdate();
        JOptionPane.showMessageDialog(null, "Los datos se han guardado con éxito", "TALLER", JOptionPane.INFORMATION_MESSAGE);
        if (conexion != null) {
            conexion.cerrarConexión();
        }
    }


public int eliminarEmpleado(String id_emp) {
        int aux = 0;
        Conexion conexion = new Conexion();
        PreparedStatement statement = null; // Declaramos statement fuera del bloque try para acceder en el bloque finally
        try {
            conexion.conectar();
            String sql = "DELETE FROM EMPLEADOS WHERE ID_EMPLEADO = ?";
            statement = conexion.conex.prepareStatement(sql);
            statement.setString(1, id_emp);
            aux = statement.executeUpdate();
            if (aux > 0) {
                JOptionPane.showMessageDialog(null, "Registro eliminado", "TALLER", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar registro", "TALLER", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar registro", "TALLER", JOptionPane.ERROR_MESSAGE);
            System.err.println(e);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar el statement: " + e.getMessage());
                }
            }
            if (conexion != null) {
                conexion.cerrarConexión();
            }
        }
        return aux;
    }

}
