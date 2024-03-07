package mecarep.Models;

public class Seguro {
    private String idSeguro;
    private String nombreSeguro;
    private String tipoSeguro;
    private String IdTaller;
    private int montoCobertura;

    public Seguro(String idSeguro,String idTaller, String nombreSeguro, String tipoSeguro, int montoCobertura) {
        this.idSeguro = idSeguro;
        this.IdTaller = idTaller;
        this.nombreSeguro = nombreSeguro;
        this.tipoSeguro = tipoSeguro;
        this.montoCobertura = montoCobertura;
    }

    public String getIdTaller() {
        return IdTaller;
    }

    public Seguro() {
    }

    public String getIdSeguro() {
        return idSeguro;
    }

    public void setIdSeguro(String idSeguro) {
        this.idSeguro = idSeguro;
    }

    public String getNombreSeguro() {
        return nombreSeguro;
    }

    public void setNombreSeguro(String nombreSeguro) {
        this.nombreSeguro = nombreSeguro;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public int getMontoCobertura() {
        return montoCobertura;
    }

    public void setMontoCobertura(int montoCobertura) {
        this.montoCobertura = montoCobertura;
    }

 
}
