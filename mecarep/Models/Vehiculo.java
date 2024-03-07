package mecarep.Models;

import java.util.Date;

public class Vehiculo {
    private String matricula;
    private String idTaller;
    private String nombre;
    private String apellido;
    private String idSeguro;
    private String fecha;
    private Date fechaCompra;

    public Vehiculo(String matricula, String idTaller, String nombre, String apellido, String idSeguro, Date fechaCompra) {
        this.matricula = matricula;
        this.idTaller = idTaller;
        this.nombre = nombre;
        this.apellido = apellido;
        this.idSeguro = idSeguro;
        this.fechaCompra = fechaCompra;
    }

    public Vehiculo() {
    }

    public Vehiculo(String matricula, String taller, String nombre, String apellido, String seguro, String fecha) {
        this.matricula = matricula;
        this.idTaller = taller;
        this.nombre = nombre;
        this.apellido = apellido;
        this.idSeguro = seguro;
        this.fecha = fecha;        
    }

    public String getFecha() {
        return fecha;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getIdTaller() {
        return idTaller;
    }

    public void setIdTaller(String idTaller) {
        this.idTaller = idTaller;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdSeguro() {
        return idSeguro;
    }

    public void setIdSeguro(String idSeguro) {
        this.idSeguro = idSeguro;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
}
