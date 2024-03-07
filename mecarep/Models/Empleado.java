package mecarep.Models;

import java.util.Date;

public class Empleado {
    private String idEmpleado;
    private String idTaller;
    private String cedulaEmpleado;
    private String nombreEmpleado;
    private Date fechaInicioContrato;
    private int salario;

    public Empleado(String idEmpleado, String idTaller, String cedulaEmpleado, String nombreEmpleado, Date fechaInicioContrato, int salario) {
        this.idEmpleado = idEmpleado;
        this.idTaller = idTaller;
        this.cedulaEmpleado = cedulaEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.fechaInicioContrato = fechaInicioContrato;
        this.salario = salario;
    }

    public Empleado() {
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getIdTaller() {
        return idTaller;
    }

    public void setIdTaller(String idTaller) {
        this.idTaller = idTaller;
    }

    public String getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(String cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public Date getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public int getSalario() {
        return salario;
    }



   
    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

}
