package altapiezas;

public class Piezas {
    private String codPieza;
    private String descrip;
    private int cantidad;
    private String codProv;
    
    public Piezas()
    {
        codPieza="x000";
        descrip="Prueba contructor";
        cantidad=0;
        codProv="xxx";
    }
    
    public Piezas(String codPieza,String descrip,int cantidad,String codProv)
    {
        this.codPieza=codPieza;
        this.descrip=descrip;
        this.cantidad=cantidad;
        this.codProv=codProv;
    }
    
    public void setCodPieza(String codPieza){
        this.codPieza=codPieza;
    }
    public void setDescrip (String descrip){
        this.descrip=descrip;
    }
    public void setCantidad (int cantidad){
        this.cantidad=cantidad;
    }
    public void setCodProv(String codProv){
        this.codProv = codProv;
    }
    
    public String getCodPieza(){
        return codPieza;
    }
    public String getDescrip(){
        return descrip;
    }
    public int getCantidad(){
        return cantidad;
    }
    public String getCodProv(){
        return codProv;
    }
    
}
