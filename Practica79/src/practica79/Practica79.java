package practica79;

import java.util.Scanner;
import libreriaNetbIvan.tests;
import libreriaNetbIvan.convertir;

public class Practica79 {

    public static void main(String[] args) {
        String input;
        float lado,apotema;
        
        pentagono pent1 = new pentagono();
        tests t1 = new tests();
        convertir con1 = new convertir();
        
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Introduce el lado: ");
        input=teclado1.nextLine();
        
        if(t1.testFloat(input)){
            lado=con1.convFloat(input);

            pent1.setApotema(lado);

            apotema=pent1.getApotema();

            pent1.setDatos(lado,apotema);
            
            pent1.setArea();
            System.out.println("El área es: " + pent1.getArea() + "cm cuadrados.");
        }
        else{
            System.err.println("El lado debe ser un float");
        }
    }
}
