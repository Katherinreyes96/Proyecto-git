public class cliente {
    private String namecliente;
    private String direccioncliente;
    private String telefonocliente;
    private String correocliente;
    private String formadepagocliente;
    private String direcciondefacturacliente;

    //creacion del constructor -publico - sin parametros

    public cliente ()
    {

    }

    //creacion del constructor con parametros -publico

    

    public   cliente (String namecliente,String direccioncliente, String telefonocliente, String correocliente , String formadepagocliente, String direcciondefacturacliente )
    {
        this.namecliente=namecliente;
        this.direccioncliente=direccioncliente;
        this.telefonocliente=telefonocliente;
        this.correocliente=correocliente;
        this.formadepagocliente=formadepagocliente;
        this.direcciondefacturacliente=direcciondefacturacliente;
    }
    //metodo setter se carga el codigo cliente
    public  void setnamecliente (String namecliente){
        this.namecliente=namecliente;
    }
    public  void setdireccioncliente (String direccioncliente){
        this.direccioncliente=direccioncliente;
    }
    public  void settelefonocliente (String telefonocliente){
        this.telefonocliente=telefonocliente;
    }
    public  void setcorreocliente (String correocliente){
        this.correocliente=correocliente;
    }
    public  void setformadepagocliente (String formadepagocliente){
        this.formadepagocliente=formadepagocliente;
    }
    public  void setdirecciondefacturacliente (String direcciondefacturacliente){
        this.direcciondefacturacliente=direcciondefacturacliente;
    }    
    
    //metodo getter :muestra el codigo del cliente
    public  String getnamecliente (){
        return namecliente;
    }
    public  String getdireccioncliente (){
        return direccioncliente;
    }
    public  String gettelefonocliente (){
        return telefonocliente;
    }
    public  String getcorreocliente (){
        return correocliente;
    }
    public  String getformadepagocliente (){
        return formadepagocliente;
    }
    public  String getdirecciondefacturacliente (){
        return direcciondefacturacliente;
    }
}
