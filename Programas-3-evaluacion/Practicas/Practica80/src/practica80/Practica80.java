package practica80;

import java.util.Scanner;
import libreriaNetbIvan.tests;
import libreriaNetbIvan.convertir;

public class Practica80 {

    public static void main(String[] args) {
        String input;
        float lado;
        
        cubo c1 = new cubo();
        tests t1 = new tests();
        convertir con1 = new convertir();
        
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Introduce el lado: ");
        input=teclado1.nextLine();
        
        if(t1.testFloat(input)){
            lado=con1.convFloat(input);

            c1.setDatos(lado);
            c1.setArea();
            System.out.println("El área es: " + c1.getArea() + "cm cuadrados.");
        }
        else{
            System.err.println("El lado debe ser un float");
        }
    }
    
}
