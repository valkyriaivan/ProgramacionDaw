package practica83;

import java.util.Scanner;
import libreriaNetbIvan.convertir;
import libreriaNetbIvan.tests;

public class Practica83 {

    public static void main(String[] args) {
        String input,input2,input3;
        String[] resultado = new String[2];
        float a,b,c;
        
        segundoGrado sG = new segundoGrado();
        tests t1 = new tests();
        convertir con1 = new convertir();
        
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Introduce el valor de a: ");
        input=teclado1.nextLine();
        
        Scanner teclado2=new Scanner(System.in);
        System.out.print("Introduce el valor de b: ");
        input2=teclado2.nextLine();
        
        Scanner teclado3=new Scanner(System.in);
        System.out.print("Introduce el valor de c: ");
        input3=teclado3.nextLine();
        
        if(t1.testFloat(input) && t1.testFloat(input2) && t1.testFloat(input3)){
            a=con1.convFloat(input);
            b=con1.convFloat(input2);
            c=con1.convFloat(input3);
            
            sG.setDatos(a,b,c);
            sG.setEcuacion();
            resultado=sG.getResultado();
            
            if("error".equals(resultado[0])){
                System.err.println("El discriminante es negativo.");
            }
            else{
                System.out.println("Los resultados de la ecuación son:");
                System.out.println(resultado[0]);
                System.out.println(resultado[1]);
            }
        }
        else{
            System.err.println("Introduce una cantidad de dinero sin centimos.");
        }
    }
    
}
