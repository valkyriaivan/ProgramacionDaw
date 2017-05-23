package practica84;

public class Cuenta {
    private String nom,ap1,ap2,dni,nCuenta,interes,saldo;
    
    public void Cuenta(){
        this.nom="";
        this.ap1="";
        this.ap2="";
        this.dni="";
        this.nCuenta="";
        this.interes="";
        this.saldo="";
    }
    
    public void Cuenta(String nom,String ap1,String ap2,String dni,String nCuenta,String interes,String saldo){
        this.nom=nom;
        this.ap1=ap1;
        this.ap2=ap2;
        this.dni=dni;
        this.nCuenta=nCuenta;
        this.interes=interes;
        this.saldo=saldo;
    }
    public Cuenta(Cuenta cuenta){
        this.nom=cuenta.nom;
        this.ap1=cuenta.ap1;
        this.ap2=cuenta.ap2;
        this.dni=cuenta.dni;
        this.nCuenta=cuenta.nCuenta;
        this.interes=cuenta.interes;
        this.saldo=cuenta.saldo;
    }
    
}
