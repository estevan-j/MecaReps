package mecarep.Models;

public class Taller {
    private String idTaller;
    private String nombreTaller;
    private String ciudad;
    private String idDirector;

    public Taller(String idTaller, String nombreTaller, String ciudad, String idDirector) {
        this.idTaller = idTaller;
        this.nombreTaller = nombreTaller;
        this.ciudad = ciudad;
        this.idDirector = idDirector;
    }

    public Taller() {
    }

    public String getIdTaller() {
        return idTaller;
    }

    public void setIdTaller(String idTaller) {
        this.idTaller = idTaller;
    }

    public String getNombreTaller() {
        return nombreTaller;
    }

    public void setNombreTaller(String nombreTaller) {
        this.nombreTaller = nombreTaller;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getIdDirector() {
        return idDirector;
    }

    public void setIdDirector(String idDirector) {
        this.idDirector = idDirector;
    }
}
