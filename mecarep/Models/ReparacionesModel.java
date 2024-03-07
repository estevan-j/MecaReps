package mecarep.Models;

import java.util.Date;

public class ReparacionesModel {
    private String idReparacion;
    private String idTaller;
    private String matricula;
    private Date fechaReparacion;
    private String tipoReparacion;
    private String observaciones;
    private String fechaString;
    private double precioReparacion;

    public ReparacionesModel(String idReparacion, String idTaller, String matricula, Date fechaReparacion, String tipoReparacion, String observaciones, double precioReparacion) {
        this.idReparacion = idReparacion;
        this.idTaller = idTaller;
        this.matricula = matricula;
        this.fechaReparacion = fechaReparacion;
        this.tipoReparacion = tipoReparacion;
        this.observaciones = observaciones;
        this.precioReparacion = precioReparacion;
    }

    public ReparacionesModel() {
    }

    public ReparacionesModel(String idRep, String taller, String matricula, String fecha, String tipo, String observacion, String precio) {
        this.idReparacion = idRep;
        this.idTaller = taller;
        this.matricula = matricula;
        this.fechaString = fecha;
        this.tipoReparacion = tipo;
        this.observaciones = observacion;
        this.precioReparacion = Double.parseDouble(precio);        
    }

    public String getFechaString() {
        return fechaString;
    }

    public String getIdReparacion() {
        return idReparacion;
    }

    public void setIdReparacion(String idReparacion) {
        this.idReparacion = idReparacion;
    }

    public String getIdTaller() {
        return idTaller;
    }

    public void setIdTaller(String idTaller) {
        this.idTaller = idTaller;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getFechaReparacion() {
        return fechaReparacion;
    }

    public void setFechaReparacion(Date fechaReparacion) {
        this.fechaReparacion = fechaReparacion;
    }

    public String getTipoReparacion() {
        return tipoReparacion;
    }

    public void setTipoReparacion(String tipoReparacion) {
        this.tipoReparacion = tipoReparacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public double getPrecioReparacion() {
        return precioReparacion;
    }

    public void setPrecioReparacion(double precioReparacion) {
        this.precioReparacion = precioReparacion;
    }
}