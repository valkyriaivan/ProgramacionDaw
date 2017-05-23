package practica78;

import java.util.Scanner;
import libreriaNetbIvan.tests;
import libreriaNetbIvan.convertir;

public class Practica78 {

    public static void main(String[] args) {
        String input,input2;
        float base,altura;
        triang tri1 = new triang();
        tests t1 = new tests();
        convertir con1 = new convertir();
        
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Introduce la base: ");
        input=teclado1.nextLine();
        
        Scanner teclado2=new Scanner(System.in);
        System.out.print("Introduce la altura: ");
        input2=teclado2.nextLine();
        
        if(t1.testFloat(input) && t1.testFloat(input2)){
            base=con1.convFloat(input);
            altura=con1.convFloat(input2);
            tri1.setDatos(base,altura);
            tri1.setArea();
            System.out.println("El área es: " + tri1.getArea());
        }
        else{
            System.err.println("Los valores introducidos tienen que ser float.");
        }
    }
}
