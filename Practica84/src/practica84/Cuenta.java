package practica84;

import java.util.Scanner;
import libreriaNetbIvan.tests;

public class Cuenta {
    private String nom,ap1,ap2,dni,nCuenta,interes,saldo,inporte,saldoCT;
    tests t1 = new tests();
    /**
     * Constructor por defecto.
     */
    public void Cuenta(){
        this.nom="";
        this.ap1="";
        this.ap2="";
        this.dni="";
        this.nCuenta="";
        this.interes="";
        this.saldo="";
    }
    /**
     * Constructor de la cuenta.
     * @param nom Nombre
     * @param ap1 Apellido1
     * @param ap2 Apellido2
     * @param dni DNI
     * @param nCuenta Número de cuenta
     * @param interes Interes
     * @param saldo Saldo
     */
    public Cuenta(String nom,String ap1,String ap2,String dni,String nCuenta,String interes,String saldo){
        this.nom=nom;
        this.ap1=ap1;
        this.ap2=ap2;
        this.dni=dni;
        this.nCuenta=nCuenta;
        this.interes=interes;
        this.saldo=saldo;
    }
    /**
     * Constructor copia.
     * @param c 
     */
    public Cuenta(Cuenta c){
        nom=c.nom;
        ap1=c.ap1;
        ap2=c.ap2;
        dni=c.dni;
        nCuenta=c.nCuenta;
        interes=c.interes;
        saldo=c.saldo;
    }

    //Getters
    //Getters
    /**
     * Devuelve el nombre.
     * @return Nom
     */
    public String getNom(){
        return nom;
    }
    /**
     * Devuelve el apellido 1.
     * @return Apellido1
     */
    public String getAp1(){
        return ap1;
    }
    /**
     * Devuelve el apellido 2.
     * @return Apellido2
     */
    public String getAp2(){
        return ap2;
    }
    /**
     * Devuelve el DNI.
     * @return DNI
     */
    public String getDni(){
        return dni;
    }
    /**
     * Devuelve el número de cuenta.
     * @return Número cuenta
     */
    public String getNCuenta(){
        return nCuenta;
    }
    /**
     * Devuelve el interes.
     * @return Interes
     */
    public String getInteres(){
        return interes;
    }
    /**
     * Devuelve el saldo.
     * @return Saldo cuenta
     */
    public String getSaldo(){
        return saldo;
    }
    /**
     * Devuelve el saldo de la cuenta de transferencia.
     * @return Saldo cuenta transferencia
     */
    public String getSaldoCT(){
        return saldoCT;
    }
    
    //Setters
    /**
     * Cambia el nombre.
     */
    public void setNom(){
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Nombre: ");
        nom = teclado1.nextLine();
    }
    /**
     * Cambia el apellido1
     */
    public void setAp1(){
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Apellido1: ");
        ap1 = teclado1.nextLine();
    }
    /**
     * Cambia el apellido2
     */
    public void setAp2(){
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Apellido2: ");
        ap2 = teclado1.nextLine();
    }
    /**
     * Cambia el DNI.
     */
    public void setDni(){
        Scanner teclado1=new Scanner(System.in);
        System.out.print("DNI: ");
        dni = teclado1.nextLine();
    }
    /**
     * Cambia el número de cuenta.
     */
    public void setNCuenta(){
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Número cuenta: ");
        nCuenta = teclado1.nextLine();
    }
    /**
     * Cambia el interes.
     */
    public void setInteres(){
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Interes: ");
        interes = teclado1.nextLine();
    }
    /**
     * Cambia el saldo.
     * @param saldo 
     */
    public void setSaldo(String saldo){
        this.saldo=saldo;
    }
    /**
     * Pide el inporte y realiza el ingreso en la cuenta.
     */
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
    /**
     * Pide el importe y realiza la retirada de dinero
     * de la cuenta.
     */
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
    /**
     * Realiza la transferencia entre las dos cuentas
     * @param saldoCT Saldo de la cuenta destino.
     */
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
