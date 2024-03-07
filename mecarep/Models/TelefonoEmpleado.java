package mecarep.Models;

public class TelefonoEmpleado {

    private String telefono;
    private String idEmpleado;
    private String idTaller;

    public TelefonoEmpleado(String telefono, String idEmpleado, String idTaller) {
        this.telefono = telefono;
        this.idEmpleado = idEmpleado;
        this.idTaller = idTaller;
    }

    public TelefonoEmpleado() {
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
}
