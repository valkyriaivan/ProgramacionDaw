package practica90;

import java.util.Scanner;
import libreriaNetbIvan.tests;

public class CalcLetra {
    private int numDNI,index;
    private char letrDNI;
    private String input;
    private char[] arrayDNI =  {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    tests t1 = new tests();
    
    public CalcLetra(){
        numDNI=0;
        letrDNI=' ';
    }
    
    public void setNum(){
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Número DNI: ");
        input = teclado1.nextLine();
        System.out.println("Hola");
        if(input.length()==8){
            if(t1.testInt(input)){
                numDNI=Integer.parseInt(input);
                System.out.println("Hola2");
                this.calcularLetra();
            }
            else{
                System.out.println("El número tiene que se un integer.");
            }
        }
        else{
            System.out.println("Debe contener 8 dígitos.");
        }

    }
    public void setLetr(char letrDNI){
        this.letrDNI=letrDNI;
    }
    
    public void calcularLetra(){
        index=numDNI/23;
        letrDNI=arrayDNI[index];
    }
    
    public void getDNI(){
        System.out.println("El DNI es:");
        System.out.println(numDNI + letrDNI);
    }
}
