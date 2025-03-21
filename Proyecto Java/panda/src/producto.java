public class producto {
    private String nombreproducto;
    private String cantidadproducto;
    private String direccionentregaproducto;
    private String valorfinalproducto;
    private String fechayhorarealizapedido;
    private String confirmacompradeproducto;
    private String confirmarpagodeproducto;

    public producto ()
    {

    }

    public producto (String nombreproducto,String cantidadproducto,String  direccionentregaproducto,String valorfinalproducto,String fechayhorarealizapedido,String confirmacompradeproducto,String confirmarpagodeproducto )

    {
    this.nombreproducto=nombreproducto;
    this.cantidadproducto=cantidadproducto;
    this.direccionentregaproducto=direccionentregaproducto;
    this.valorfinalproducto=valorfinalproducto;
    this.fechayhorarealizapedido=fechayhorarealizapedido;
    this.confirmacompradeproducto=confirmacompradeproducto;
    this.confirmarpagodeproducto=confirmarpagodeproducto;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public String getCantidadproducto() {
        return cantidadproducto;
    }

    public void setCantidadproducto(String cantidadproducto) {
        this.cantidadproducto = cantidadproducto;
    }

    public String getDireccionentregaproducto() {
        return direccionentregaproducto;
    }

    public void setDireccionentregaproducto(String direccionentregaproducto) {
        this.direccionentregaproducto = direccionentregaproducto;
    }

    public String getValorfinalproducto() {
        return valorfinalproducto;
    }

    public void setValorfinalproducto(String valorfinalproducto) {
        this.valorfinalproducto = valorfinalproducto;
    }

    public String getFechayhorarealizapedido() {
        return fechayhorarealizapedido;
    }

    public void setFechayhorarealizapedido(String fechayhorarealizapedido) {
        this.fechayhorarealizapedido = fechayhorarealizapedido;
    }

    public String getConfirmacompradeproducto() {
        return confirmacompradeproducto;
    }

    public void setConfirmacompradeproducto(String confirmacompradeproducto) {
        this.confirmacompradeproducto = confirmacompradeproducto;
    }

    public String getConfirmarpagodeproducto() {
        return confirmarpagodeproducto;
    }

    public void setConfirmarpagodeproducto(String confirmarpagodeproducto) {
        this.confirmarpagodeproducto = confirmarpagodeproducto;
    }
    
}
