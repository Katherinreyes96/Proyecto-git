public class empleado {
    private int idempleado;
    private String cargoempleado;
    private String claveempleado;
    private String primernombre;
    private String segundonombre;
    private String primerapellido;
    private String segundoapellido;
    private String correocorporativo;

    public empleado ()
    {

    }

    public empleado (int idempleado, String cargoempleado,String claveempleado, String primernombre, String segundonombre,String primerapellido, string segundoapellido,String correocorporativo)
    {
    this.idempleado=idempleado;
    this.cargoempleado=cargoempleado;
    this.claveempleado=claveempleado;
    this.primernombre=primernombre;
    this.segundonombre=segundonombre;
    this.primerapellido=primerapellido;
    this.segundoapellido=segundoapellido;
    this.correocorporativo=correocorporativo;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public String getCargoempleado() {
        return cargoempleado;
    }

    public void setCargoempleado(String cargoempleado) {
        this.cargoempleado = cargoempleado;
    }

    public String getClaveempleado() {
        return claveempleado;
    }

    public void setClaveempleado(String claveempleado) {
        this.claveempleado = claveempleado;
    }

    public String getPrimernombre() {
        return primernombre;
    }

    public void setPrimernombre(String primernombre) {
        this.primernombre = primernombre;
    }

    public String getSegundonombre() {
        return segundonombre;
    }

    public void setSegundonombre(String segundonombre) {
        this.segundonombre = segundonombre;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    public String getSegundoapellido() {
        return segundoapellido;
    }

    public void setSegundoapellido(String segundoapellido) {
        this.segundoapellido = segundoapellido;
    }

    public String getCorreocorporativo() {
        return correocorporativo;
    }

    public void setCorreocorporativo(String correocorporativo) {
        this.correocorporativo = correocorporativo;
    }
    
}
