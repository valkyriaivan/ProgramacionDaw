package practica81;

import java.util.Scanner;
import libreriaNetbIvan.convertir;
import libreriaNetbIvan.tests;

public class Practica81 {

    public static void main(String[] args) {
        String input;
        float lado;
        
        esfera e1 = new esfera();
        tests t1 = new tests();
        convertir con1 = new convertir();
        
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Introduce el radio: ");
        input=teclado1.nextLine();
        
        if(t1.testFloat(input)){
            lado=con1.convFloat(input);

            e1.setDatos(lado);
            
            e1.setArea();
            System.out.println("El área es: " + e1.getArea() + "cm cuadrados.");
            
            e1.setVolumen();
            System.out.println("El volumen es: " + e1.getVolumen() + "cm cubicos.");
        }
        else{
            System.err.println("El radio debe ser un float");
        }
    }
    
}
