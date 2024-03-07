package mecarep.Controlers;

import mecarep.Models.Seguro;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static mecarep.Controlers.ControladorEmpleado.resultado;
import static mecarep.Controlers.ControladorEmpleado.statement;

public class ControladorSeguros {

    private Conexion conexion = new Conexion();

    public void desplegarSeguros01(JTable tabla) throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Seguro"); 
        modelo.addColumn("Taller");
        modelo.addColumn("Nombre Seguro");
        modelo.addColumn("Tipo Seguro");
        modelo.addColumn("Monto Cobertura");
        conexion.conectar();

        String sql = "SELECT ID_SEGURO,ID_TALLER, NOMBRE_SEGURO, TIPO_SEGURO, MONTO_COBERTURA FROM SEGUROS";
        statement = conexion.conex.prepareStatement(sql);
        resultado = statement.executeQuery();
        Object[] fila = new Object[5];

        while (resultado.next()) {
            fila[0] = resultado.getString("ID_SEGURO");
            fila[1] = resultado.getString("ID_TALLER");
            fila[2] = resultado.getString("NOMBRE_SEGURO");
            fila[3] = resultado.getString("TIPO_SEGURO");
            fila[4] = resultado.getString("MONTO_COBERTURA");
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
        resultado.close();
        statement.close();

        conexion.cerrarConexión();
    }

    public void actualizarSeguro01(String idSeguro, String nuevoTipo, int nuevoMonto) throws SQLException {

        conexion.conectar();
        String sql = "UPDATE SEGUROS SET TIPO_SEGURO = ?, MONTO_COBERTURA = ? WHERE ID_SEGURO = ?";
        statement = conexion.conex.prepareStatement(sql);

        // Establecer los parámetros en la declaración preparada
        statement.setString(1, nuevoTipo);
        statement.setInt(2, nuevoMonto);
        statement.setString(3, idSeguro);

        // Ejecutar la actualización
        int filasAfectadas = statement.executeUpdate();

        if (filasAfectadas > 0) {
            System.out.println("Actualización exitosa. Filas afectadas: " + filasAfectadas);
        } else {
            System.out.println("No se encontró ningún seguro con el ID proporcionado.");
        }

        conexion.cerrarConexión();

    }

    public void guardarSeguro(Seguro seguro) throws SQLException {
        String sql = "INSERT INTO SEGUROS  (ID_SEGURO, ID_TALLER, NOMBRE_SEGURO, TIPO_SEGURO, MONTO_COBERTURA) values (?,?,?,?,?)";
        PreparedStatement statement = null; // Declaramos el statement aquí para que esté disponible en el bloque finally
        conexion.conectar();
        statement = conexion.conex.prepareStatement(sql);
        statement.setString(1, seguro.getIdSeguro());
        statement.setString(2, seguro.getIdTaller());
        statement.setString(3, seguro.getNombreSeguro());
        statement.setString(4, seguro.getTipoSeguro());
        statement.setInt(5, seguro.getMontoCobertura());
        statement.executeUpdate();
        JOptionPane.showMessageDialog(null, "Los datos se han guardado con éxito", "TALLER", JOptionPane.INFORMATION_MESSAGE);

        if (conexion != null) {
            conexion.cerrarConexión();
        }
    }

    public int eliminarSeguros(Seguro seguro) {
        int aux = 0;
        PreparedStatement statement = null; // Declaramos statement fuera del bloque try para acceder en el bloque finally
        try {
            conexion.conectar();
            String sql = "DELETE FROM SEGUROS WHERE ID_SEGURO =?";
            statement = conexion.conex.prepareStatement(sql);
            statement.setString(1, seguro.getIdSeguro());
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
