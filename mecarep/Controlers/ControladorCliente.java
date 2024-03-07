package mecarep.Controlers;

import mecarep.Models.Cliente;
import mecarep.Views.PanelPrincipal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorCliente {

    Conexion conexion = new Conexion();
    static ResultSet resultado;
    static PreparedStatement statement;

    public void desplegarClientes(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Cédula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Taller");
        try {
            conexion.conectar();
            String sql = "SELECT CEDULA, NOMBRE, APELLIDO, CIUDAD, ID_TALLER FROM CLIENTES";
            statement = conexion.conex.prepareStatement(sql);
            resultado = statement.executeQuery();

            Object[] fila = new Object[5];
            while (resultado.next()) {
                fila[0] = resultado.getString("CEDULA");
                fila[1] = resultado.getString("NOMBRE");
                fila[2] = resultado.getString("APELLIDO");
                fila[3] = resultado.getString("CIUDAD");
                fila[4] = resultado.getString("ID_TALLER");
                modelo.addRow(fila);
            }

            tabla.setModel(modelo);
            resultado.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println("Error al desplegar clientes: " + e.getMessage());
        } finally {
            conexion.cerrarConexión(); // Cerrar la conexión en el bloque finally para garantizar que siempre se cierre
        }
    }

    public void guardarCliente(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO [dbo].CLIENTES  (CEDULA, NOMBRE, APELLIDO, CIUDAD, ID_TALLER ) values (?,?,?,?,?)";

        statement = null;
        conexion.conectar();
        statement = conexion.conex.prepareStatement(sql);
        statement.setString(1, cliente.getCedula());
        statement.setString(2, cliente.getNombre());
        statement.setString(3, cliente.getApellido());
        statement.setString(4, cliente.getCiudad());
        statement.setString(5, cliente.getIdTaller());
        statement.executeUpdate();
        conexion.cerrarConexión();

    }

    public Integer actualizarCliente(Cliente cliente) throws SQLException {
        Integer aux = null;
        Conexion conexion = new Conexion();
        try {
            conexion.conectar();
            String sql = "UPDATE CLIENTES"
                    + "SET NOMBRE =?, APELLIDO =?"
                    + "WHERE CEDULA =?;";
            PreparedStatement statement = conexion.conex.prepareStatement(sql);
            statement.setString(1, cliente.getNombre());
            statement.setString(2, cliente.getApellido());
            statement.setString(3, cliente.getCedula());

            aux = statement.executeUpdate();
            if (aux >= 1) {
                JOptionPane.showMessageDialog(null, "Los datos del cliente han sido actualizados", "TALLER", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar los datos del cliente", "TALLER", JOptionPane.ERROR_MESSAGE);
            }
        } finally {
            if (statement != null) {
                conexion.cerrarConexión();
            }
            if (conexion != null) {
                conexion.cerrarConexión();
            }
        }
        return aux;
    }

    public int eliminarCliente(Cliente cliente) {
        int aux = 0;
        Conexion conexion = new Conexion();
        PreparedStatement statement = null; // Declaramos statement fuera del bloque try para acceder en el bloque finally
        try {
            conexion.conectar();
            String sql = "DELETE FROM CLIENTES WHERE CEDULA = ?";
            statement = conexion.conex.prepareStatement(sql);
            statement.setString(1, cliente.getCedula());
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
            // Cerramos el statement en el bloque finally para asegurarnos de que siempre se cierre
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar el statement: " + e.getMessage());
                }
            }
            // Cerramos la conexión en el bloque finally para asegurarnos de que siempre se cierre
            if (conexion != null) {
                conexion.cerrarConexión();
            }
        }
        return aux;
    }

}
