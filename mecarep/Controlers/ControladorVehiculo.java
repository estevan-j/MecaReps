/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mecarep.Controlers;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import mecarep.Models.Vehiculo;

public class ControladorVehiculo {

    static ResultSet resultado;
    static PreparedStatement statement;
    Conexion conexion = new Conexion();

    // Otros métodos relacionados con el control de los vehículos
    public void mostrarVehiculosQuito(JTable tabla) throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Matrícula");
        modelo.addColumn("ID_TALLER");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("ID_SEGURO");
        modelo.addColumn("Fecha de Compra");
        conexion.conectar();
        String sql = "SELECT MATRICULA, ID_TALLER, NOMBRE, APELLIDO, ID_SEGURO, FECHA_COMPRA FROM VEHICULOS";
        statement = conexion.conex.prepareStatement(sql);
        resultado = statement.executeQuery();
        Object[] fila = new Object[6];
        while (resultado.next()) {
            fila[0] = resultado.getString("MATRICULA");
            fila[1] = resultado.getString("ID_TALLER");
            fila[2] = resultado.getString("NOMBRE");
            fila[3] = resultado.getString("APELLIDO");
            fila[4] = resultado.getString("ID_SEGURO");
            fila[5] = resultado.getString("FECHA_COMPRA");
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
        resultado.close();
        statement.close();
        conexion.cerrarConexión();

    }

    public void insertarVehiculo(Vehiculo vehiculo) throws SQLException {
        conexion.conectar();
        String sql = "INSERT INTO VEHICULOS (MATRICULA, ID_TALLER, NOMBRE, APELLIDO, ID_SEGURO, FECHA_COMPRA) VALUES (?, ?, ?, ?, ?, ?)";
        statement = conexion.conex.prepareStatement(sql);
        statement.setString(1, vehiculo.getMatricula());
        statement.setString(2, vehiculo.getIdTaller());
        statement.setString(3, vehiculo.getNombre());
        statement.setString(4, vehiculo.getApellido());
        statement.setString(5, vehiculo.getIdSeguro());
        statement.setDate(6, (Date) vehiculo.getFechaCompra());
        statement.executeUpdate();
        conexion.cerrarConexión();

    }

    public void cargarNombresClientesEnComboBox(JComboBox<String> comboBox) {
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        try {
            conexion.conectar();
            String sql = "SELECT CONCAT(NOMBRE, ' ', APELLIDO) AS nombre FROM CLIENTES";
            statement = conexion.conex.prepareStatement(sql);
            resultado = statement.executeQuery();
            while (resultado.next()) {
                modelo.addElement(resultado.getString("nombre"));
            }
            comboBox.setModel(modelo);

            resultado.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println("Error al cargar nombres de clientes en el ComboBox: " + e.getMessage());
        } finally {
            conexion.cerrarConexión();
        }
    }

    public void cargarIDsSegurosEnComboBox(JComboBox<String> comboBox) {
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        try {
            conexion.conectar();
            String sql = "SELECT ID_SEGURO FROM SEGUROS";
            statement = conexion.conex.prepareStatement(sql);
            resultado = statement.executeQuery();
            while (resultado.next()) {
                modelo.addElement(resultado.getString("ID_SEGURO"));
            }
            comboBox.setModel(modelo);

            resultado.close();
            statement.close();
        } catch (SQLException e) {
            System.err.println("Error al cargar IDs de seguros en el ComboBox: " + e.getMessage());
        } finally {
            conexion.cerrarConexión();
        }
    }

    public void mostrarVehiculosMatricula(JTable tabla) {
        // Crear un modelo de tabla por defecto
        DefaultTableModel modelo = new DefaultTableModel();
        // Agregar columnas al modelo
        modelo.addColumn("Matrícula");
        modelo.addColumn("rowguid");
        try {
            // Conectar a la base de datos
            conexion.conectar();
            // Definir la consulta SQL para obtener los datos de la tabla VEHICULO_MATRICULA
            String sql = "SELECT MATRICULA, rowguid FROM VEHICULO_MATRICULA";
            // Preparar la declaración SQL
            statement = conexion.conex.prepareStatement(sql);
            // Ejecutar la consulta y obtener el conjunto de resultados
            resultado = statement.executeQuery();
            // Crear un arreglo de objetos para almacenar los datos de cada fila
            Object[] fila = new Object[2];
            // Iterar a través de los resultados y agregar cada fila al modelo de tabla
            while (resultado.next()) {
                fila[0] = resultado.getString("MATRICULA");
                fila[1] = resultado.getString("rowguid");
                modelo.addRow(fila);
            }
            // Establecer el modelo de tabla en el componente JTable proporcionado
            tabla.setModel(modelo);
            // Cerrar los recursos (conjunto de resultados y declaración)
            resultado.close();
            statement.close();
        } catch (SQLException e) {
            // Manejar cualquier error de SQL e imprimir un mensaje de error
            System.err.println("Error al desplegar datos de vehículos por matrícula: " + e.getMessage());
        } finally {
            conexion.cerrarConexión();
        }
    }

    public int eliminarVehiculo(String matricula) {
        int resultado = 0;
        PreparedStatement statement = null;

        try {
            conexion.conectar();
            String sql = "DELETE FROM VEHICULOS WHERE MATRICULA=?";
            statement = conexion.conex.prepareStatement(sql);
            statement.setString(1, matricula);

            resultado = statement.executeUpdate();

            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Registro eliminado", "TALLER", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un vehículo con esa matrícula", "TALLER", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar registro", "TALLER", JOptionPane.ERROR_MESSAGE);
            System.err.println(e);
        } finally {
            // Cerrar el statement en el bloque finally para asegurarnos de que siempre se cierre
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    System.err.println("Error al cerrar el statement: " + e.getMessage());
                }
            }
            // Cerrar la conexión en el bloque finally para asegurarnos de que siempre se cierre
            if (conexion != null) {
                conexion.cerrarConexión();
            }
        }
        return resultado;
    }

}
