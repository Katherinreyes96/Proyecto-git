
import java.util.Date;

public class despacho {
    private int iddespacho;
    private String historicodespacho;
    private Date fechadespacho;
    private  int informaciondespacho;

    public despacho ()
    {

    }
    public despacho (int iddespacho, String historicodespacho, Date fechadespacho,int informaciondespacho )
    {
    this.iddespacho=iddespacho;
    this.historicodespacho=historicodespacho;
    this.fechadespacho=fechadespacho;
    this.informaciondespacho=informaciondespacho;
    
    }
    public int getIddespacho() {
        return iddespacho;
    }
    public void setIddespacho(int iddespacho) {
        this.iddespacho = iddespacho;
    }
    public String getHistoricodespacho() {
        return historicodespacho;
    }
    public void setHistoricodespacho(String historicodespacho) {
        this.historicodespacho = historicodespacho;
    }
    public Date getFechadespacho() {
        return fechadespacho;
    }
    public void setFechadespacho(Date fechadespacho) {
        this.fechadespacho = fechadespacho;
    }
    public int getInformaciondespacho() {
        return informaciondespacho;
    }
    public void setInformaciondespacho(int informaciondespacho) {
        this.informaciondespacho = informaciondespacho;
    }
    
}
