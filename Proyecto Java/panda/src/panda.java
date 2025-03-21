public class panda {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // se crea  el objeto con el constructor sin parametros
        cliente objcliente=new cliente();

        //usar los set para cargar los datos 

        objcliente.setnamecliente("jairo");
        objcliente.setdireccioncliente("cra24d #20-30");
        objcliente.settelefonocliente("3333333333");
        objcliente.setcorreocliente("jairo@gmail.com");
        objcliente.setformadepagocliente("debito");
        objcliente.setdirecciondefacturacliente("cra24d #20-30");
        //devolver la informacion almacenada de los atributos
        System.out.println("El nombre del cliente es "+objcliente.getnamecliente());
        System.out.println("la direccion del cliente es "+objcliente.getdireccioncliente());
        System.out.println("El telefono del cliente es "+objcliente.gettelefonocliente());
        System.out.println("El correo del cliente es "+objcliente.getcorreocliente());
        System.out.println("la forma de pago del cliente es "+objcliente.getformadepagocliente());
        System.out.println("Direccion facturacion del cliente es "+objcliente.getdirecciondefacturacliente());

        cliente objCliente2=new cliente ("jose", "cra 23 #12-12", "3123213122", "jose@gmail.com","debito","cra 23#12-12");
        
        //devolver la informacion almacenada de los atributos
        System.out.println("El nombre del cliente es "+objCliente2.getnamecliente());
        System.out.println("la direccion del cliente es "+objCliente2.getdireccioncliente());
        System.out.println("El telefono del cliente es "+objCliente2.gettelefonocliente());
        System.out.println("El correo del cliente es "+objCliente2.getcorreocliente());
        System.out.println("la forma de pago del cliente es "+objCliente2.getformadepagocliente());
        System.out.println("Direccion facturacion del cliente es "+objCliente2.getdirecciondefacturacliente());

    }
} 
