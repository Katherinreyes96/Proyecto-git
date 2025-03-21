public class reparar {
    private String numeropedido ;
    private String  etiquetadevol ;
    private String tiemporeparacion;
    private String siserepara;
    private String noserepara;

    public producto ()
    {}
    public producto (String numeropedido,String etiquetadevol, String tiemporeparacion, String  siserepara,String noserepara)
    {
    this.numeropedido=numeropedido;
    this.etiquetadevol=etiquetadevol;
    this.tiemporeparacion=tiemporeparacion;
    this.siserepara=siserepara;
    this.noserepara=noserepara;
    }
    public String getNumeropedido() {
        return numeropedido;
    }
    public void setNumeropedido(String numeropedido) {
        this.numeropedido = numeropedido;
    }
    public String getEtiquetadevol() {
        return etiquetadevol;
    }
    public void setEtiquetadevol(String etiquetadevol) {
        this.etiquetadevol = etiquetadevol;
    }
    public String getTiemporeparacion() {
        return tiemporeparacion;
    }
    public void setTiemporeparacion(String tiemporeparacion) {
        this.tiemporeparacion = tiemporeparacion;
    }
    public String getSiserepara() {
        return siserepara;
    }
    public void setSiserepara(String siserepara) {
        this.siserepara = siserepara;
    }
    public String getNoserepara() {
        return noserepara;
    }
    public void setNoserepara(String noserepara) {
        this.noserepara = noserepara;
    }
    
}
