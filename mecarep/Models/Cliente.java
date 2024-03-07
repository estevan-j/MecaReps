package mecarep.Models;

public class Cliente {
    private String nombre;
    private String apellido;
    private String idTaller;
    private String ciudad;
    private String cedula;

    public Cliente(String nombre, String apellido, String idTaller, String ciudad, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idTaller = idTaller;
        this.ciudad = ciudad;
        this.cedula = cedula;
    }

    public Cliente() {
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

    public String getIdTaller() {
        return idTaller;
    }

    public void setIdTaller(String idTaller) {
        this.idTaller = idTaller;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
