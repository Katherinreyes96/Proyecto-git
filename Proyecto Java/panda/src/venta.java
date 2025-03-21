
import java.util.Date;

public class venta {
    private int idventa;
    private Date fechaventa;
    private  int precioventa;
    private int subtotalventa;
    private int impuestoventa;
    private double descuentoventa;

    public venta ()
    {

    }
    public venta (int  idventa,Date fechaventa, int precioventa,int subtotalventa,int impuestoventa,double descuentoventa)
    {
    this.idventa=idventa;
    this.fechaventa=fechaventa;
    this.precioventa=precioventa;
    this.subtotalventa=subtotalventa;
    this.impuestoventa=impuestoventa;
    this.descuentoventa=descuentoventa;
    }
    public int getIdventa() {
        return idventa;
    }
    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }
    public Date getFechaventa() {
        return fechaventa;
    }
    public void setFechaventa(Date fechaventa) {
        this.fechaventa = fechaventa;
    }
    public int getPrecioventa() {
        return precioventa;
    }
    public void setPrecioventa(int precioventa) {
        this.precioventa = precioventa;
    }
    public int getSubtotalventa() {
        return subtotalventa;
    }
    public void setSubtotalventa(int subtotalventa) {
        this.subtotalventa = subtotalventa;
    }
    public int getImpuestoventa() {
        return impuestoventa;
    }
    public void setImpuestoventa(int impuestoventa) {
        this.impuestoventa = impuestoventa;
    }
    public double getDescuentoventa() {
        return descuentoventa;
    }
    public void setDescuentoventa(double descuentoventa) {
        this.descuentoventa = descuentoventa;
    }
    
}
