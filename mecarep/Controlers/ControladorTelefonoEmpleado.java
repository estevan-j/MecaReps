package mecarep.Controlers;

import mecarep.Models.TelefonoEmpleado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorTelefonoEmpleado {

    static ResultSet resultado;
    static PreparedStatement statement;
    Conexion conexion = new Conexion();

    public void guardarTelefono(TelefonoEmpleado telefonoempleado) throws SQLException {
        String sql = "INSERT INTO TELEFONOS_EMPLEADOS values (?,?,?)";
        PreparedStatement statement = null; // Declaramos el statement aquí para que esté disponible en el bloque finally

        conexion.conectar();
        statement = conexion.conex.prepareStatement(sql);
        statement.setString(1, telefonoempleado.getTelefono());
        statement.setString(2, telefonoempleado.getIdEmpleado());
        statement.setString(3, telefonoempleado.getIdTaller());
        statement.executeUpdate();
        JOptionPane.showMessageDialog(null, "Los datos se han guardado con éxito", "TALLER", JOptionPane.INFORMATION_MESSAGE);

        // Cerramos la conexión en el bloque finally para asegurarnos de que siempre se cierre
        if (conexion != null) {
            conexion.cerrarConexión();

        }
    }
    //------------------------------------------------------------------------------------        //------------------------------------------------------------------------------------

    public int eliminarTelefono(String idEmpleado) {
        //public int eliminarTelefono(String telefonoempleado) { 
        int aux = 0;
        Conexion conexion = new Conexion();
        PreparedStatement statement = null; // Declaramos statement fuera del bloque try para acceder en el bloque finally
        try {
            conexion.conectar();
            String sql = "DELETE FROM TELEFONOS_EMPLEADOS WHERE ID_EMPLEADO = ?";
            statement = conexion.conex.prepareStatement(sql);
            statement.setString(1, idEmpleado);
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

    public void desplegarTelefonos(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Empleado");
        modelo.addColumn("ID Taller");
        modelo.addColumn("Telefono");

        try {
            conexion.conectar();
            String sql = "SELECT ID_EMPLEADO, ID_TALLER, TELEFONO FROM TELEFONOS_EMPLEADOS";
            statement = conexion.conex.prepareStatement(sql);
            resultado = statement.executeQuery();
            Object[] fila = new Object[6];
            while (resultado.next()) {
                fila[0] = resultado.getString("ID_EMPLEADO");
                fila[1] = resultado.getString("ID_TALLER");
                fila[2] = resultado.getString("TELEFONO");
                modelo.addRow(fila);
            }
            tabla.setModel(modelo);
            resultado.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println("Error al desplegar telefonos: " + e.getMessage());
        } finally {
            conexion.cerrarConexión();
        }
    }

}
