package practica84;

import java.util.Scanner;
import libreriaNetbIvan.tests;

public class Cuenta {
    private String nom,ap1,ap2,dni,nCuenta,interes,saldo,inporte;
    tests t1 = new tests();
    
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
    public Cuenta(Cuenta c){
        nom=c.nom;
        ap1=c.ap1;
        ap2=c.ap2;
        dni=c.dni;
        nCuenta=c.nCuenta;
        interes=c.interes;
        saldo=c.saldo;
    }
    public String getNom(){
        return nom;
    }
    public String getAp1(){
        return ap1;
    }
    public String getAp2(){
        return ap2;
    }
    public String getNCuenta(){
        return nCuenta;
    }
    public String getInteres(){
        return interes;
    }
    public String saldo(){
        return saldo;
    }
    
    public void ingreso(){
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Introduce el importe a ingresar: ");
        inporte=teclado1.nextLine();
        
        if(t1.testFloat(inporte)){
            if(Float.parseFloat(inporte)>0){
                saldo = Float.toString(Float.parseFloat(saldo)+Float.parseFloat(inporte));
            }
            else{
                System.err.println("El inporte tiene que ser positivo.");
            }
        }
        else{
            System.err.println("El inporte tiene que ser un número.");
        }
    }
    
    public void retirar(){
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Introduce el importe a retirar: ");
        inporte=teclado1.nextLine();
        
        if(t1.testFloat(inporte)){
            if(Float.parseFloat(inporte)>0){
                saldo = Float.toString(Float.parseFloat(saldo)-Float.parseFloat(inporte));
            }
            else{
                System.err.println("El inporte tiene que ser positivo.");
            }
        }
        else{
            System.err.println("El inporte tiene que ser un número.");
        }
    }
    
    
}
