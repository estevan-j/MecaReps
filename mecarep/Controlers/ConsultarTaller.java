/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mecarep.Controlers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import mecarep.Models.Cliente;

/**
 *
 * @author Usuario
 */
public class ConsultarTaller {
    private final Conexion conec = new Conexion();
    
    public List<Cliente> consultarClientes() throws SQLException {
        conec.conectar();
        List<Cliente> clientes = new ArrayList<>();
        String consulta = "SELECT [NOMBRE], [APELLIDO], [ID_TALLER], [CIUDAD], [CEDULA] FROM [dbo].[CLIENTES]";
        PreparedStatement preparedStatement = conec.conex.prepareStatement(consulta);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            clientes.add(new Cliente(resultSet.getString("NOMBRE"), resultSet.getString("APELLIDO"),
                    resultSet.getString("ID_TALLER"), resultSet.getString("CIUDAD"), resultSet.getString("CEDULA")));
        }
        conec.cerrarConexión();
        return clientes;
    }

}
