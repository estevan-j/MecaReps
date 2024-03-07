package mecarep.Controlers;

import java.sql.Date;
import mecarep.Models.ReparacionesModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorReparaciones {

    Conexion conexion = new Conexion();
    static ResultSet resultado;
    static PreparedStatement statement;

    public void desplegarReparacionesQuito(JTable tabla) throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Reparación");
        modelo.addColumn("Taller");
        modelo.addColumn("Matrícula");
        modelo.addColumn("Fecha Reparación");
        modelo.addColumn("Tipo Reparación");
        modelo.addColumn("Observaciones");
        modelo.addColumn("Precio Reparación");

        conexion.conectar();
        String sql = "SELECT ID_REPARACION, ID_TALLER, MATRICULA, FECHA_REPARACION, TIPO_REPARACION, OBSERVACIONES, PRECIO_REPARACION FROM REPARACIONES";
        statement = conexion.conex.prepareStatement(sql);
        resultado = statement.executeQuery();
        Object[] fila = new Object[7];
        while (resultado.next()) {
            fila[0] = resultado.getString("ID_REPARACION");
            fila[1] = resultado.getString("ID_TALLER");
            fila[2] = resultado.getString("MATRICULA");
            fila[3] = resultado.getString("FECHA_REPARACION");
            fila[4] = resultado.getString("TIPO_REPARACION");
            fila[5] = resultado.getString("OBSERVACIONES");
            fila[6] = resultado.getString("PRECIO_REPARACION");
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
        resultado.close();
        statement.close();

        conexion.cerrarConexión();

    }

    public void desplegarReparacionesMatricula(JTable tabla, String matricula) throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Reparación");
        modelo.addColumn("Taller");
        modelo.addColumn("Matrícula");
        modelo.addColumn("Fecha Reparación");
        modelo.addColumn("Tipo Reparación");
        modelo.addColumn("Observaciones");
        modelo.addColumn("Precio Reparación");

        conexion.conectar();
        String sql = "SELECT ID_REPARACION, ID_TALLER, MATRICULA, FECHA_REPARACION, TIPO_REPARACION, OBSERVACIONES, PRECIO_REPARACION FROM REPARACIONES WHERE MATRICULA = ?";
        statement = conexion.conex.prepareStatement(sql);
        statement.setString(1, matricula); // Asignar valor a la variable de la sentencia preparada

        resultado = statement.executeQuery();
        Object[] fila = new Object[7];
        while (resultado.next()) {
            fila[0] = resultado.getString("ID_REPARACION");
            fila[1] = resultado.getString("ID_TALLER");
            fila[2] = resultado.getString("MATRICULA");
            fila[3] = resultado.getString("FECHA_REPARACION");
            fila[4] = resultado.getString("TIPO_REPARACION");
            fila[5] = resultado.getString("OBSERVACIONES");
            fila[6] = resultado.getString("PRECIO_REPARACION");
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
        resultado.close();
        statement.close();

        conexion.cerrarConexión();
    }

    public void guardarReparaciones(ReparacionesModel reparaciones) throws SQLException {
        String sql = "INSERT INTO REPARACIONES  (ID_REPARACION, ID_TALLER, MATRICULA, FECHA_REPARACION, TIPO_REPARACION, OBSERVACIONES, PRECIO_REPARACION) values (?,?,?,?,?,?,?)";
        PreparedStatement statement = null; // Declaramos el statement aquí para que esté disponible en el bloque finally

        conexion.conectar();
        statement = conexion.conex.prepareStatement(sql);
        statement.setString(1, reparaciones.getIdReparacion());
        statement.setString(2, reparaciones.getIdTaller());
        statement.setString(3, reparaciones.getMatricula());
        statement.setDate(4, (Date) reparaciones.getFechaReparacion());
        statement.setString(5, reparaciones.getTipoReparacion());
        statement.setString(6, reparaciones.getObservaciones());
        statement.setDouble(7, reparaciones.getPrecioReparacion());
        statement.executeUpdate();
        JOptionPane.showMessageDialog(null, "Los datos se han guardado con éxito", "TALLER", JOptionPane.INFORMATION_MESSAGE);
        conexion.cerrarConexión();
    }

    public boolean verificarMatriculaExistente(String matricula) throws SQLException {
        String sql = "SELECT COUNT(*) AS Cantidad FROM VEHICULO_MATRICULA WHERE MATRICULA = ?";
        PreparedStatement statement = null;
        ResultSet resultado = null;

        try {
            conexion.conectar();
            statement = conexion.conex.prepareStatement(sql);
            statement.setString(1, matricula);
            resultado = statement.executeQuery();

            if (resultado.next()) {
                int cantidad = resultado.getInt("Cantidad");
                return cantidad > 0;  // Si la cantidad es mayor que 0, la matrícula existe
            } else {
                return false;
            }
        } finally {
            // Cerrar recursos en el bloque finally
            if (resultado != null) {
                resultado.close();
            }
            if (statement != null) {
                statement.close();
            }
            conexion.cerrarConexión();
        }
    }

    public int eliminarReparacion(ReparacionesModel reparaciones) {
        int aux = 0;
        Conexion conexion = new Conexion();
        PreparedStatement statement = null; // Declaramos statement fuera del bloque try para acceder en el bloque finally
        try {
            conexion.conectar();
            String sql = "DELETE FROM REPARACIONES WHERE ID_REPARACION = ?";
            statement = conexion.conex.prepareStatement(sql);
            statement.setString(1, reparaciones.getIdReparacion());
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
