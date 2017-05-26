package practica85;

import java.util.Scanner;
import libreriaNetbIvan.tests;

public class CuentaArray {
    private String nom,ap1,ap2,dni,nCuenta,interes,saldo,inporte,saldoCT;
    tests t1 = new tests();
    
    public void CuentaArray(){
        this.nom="";
        this.ap1="";
        this.ap2="";
        this.dni="";
        this.nCuenta="";
        this.interes="";
        this.saldo="";
    }
    
    public CuentaArray(String nom,String ap1,String ap2,String dni,String nCuenta,String interes,String saldo){
        this.nom=nom;
        this.ap1=ap1;
        this.ap2=ap2;
        this.dni=dni;
        this.nCuenta=nCuenta;
        this.interes=interes;
        this.saldo=saldo;
    }
    
    public CuentaArray(CuentaArray c){
        nom=c.nom;
        ap1=c.ap1;
        ap2=c.ap2;
        dni=c.dni;
        nCuenta=c.nCuenta;
        interes=c.interes;
        saldo=c.saldo;
    }

    //Getters
    public String getNom(){
        return nom;
    }
    public String getAp1(){
        return ap1;
    }
    public String getAp2(){
        return ap2;
    }
    public String getDni(){
        return dni;
    }
    public String getNCuenta(){
        return nCuenta;
    }
    public String getInteres(){
        return interes;
    }
    public String getSaldo(){
        return saldo;
    }
    public String getSaldoCT(){
        return saldoCT;
    }
    
    //Setters
    public void setNom(){
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Nombre: ");
        nom = teclado1.nextLine();
    }
    public void setAp1(){
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Apellido1: ");
        ap1 = teclado1.nextLine();
    }
    public void setAp2(){
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Apellido2: ");
        ap2 = teclado1.nextLine();
    }
    public void setDni(){
        Scanner teclado1=new Scanner(System.in);
        System.out.print("DNI: ");
        dni = teclado1.nextLine();
    }
    public void setNCuenta(){
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Número cuenta: ");
        nCuenta = teclado1.nextLine();
    }
    public void setInteres(){
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Interes: ");
        interes = teclado1.nextLine();
    }
    public void setSaldo(String saldo){
        this.saldo=saldo;
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
    public void transfer(String saldoCT){
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Introduce el importe a transferir: ");
        inporte=teclado1.nextLine();
        
        if(t1.testFloat(inporte)){
            if(Float.parseFloat(inporte)>0){
                saldo = Float.toString(Float.parseFloat(saldo)-Float.parseFloat(inporte));
                this.saldoCT = Float.toString(Float.parseFloat(saldoCT)+Float.parseFloat(inporte));
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
