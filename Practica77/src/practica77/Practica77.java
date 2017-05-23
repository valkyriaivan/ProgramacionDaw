package practica77;

import java.util.Scanner;
import libreriaNetbIvan.tests;
import libreriaNetbIvan.convertir;

public class Practica77 {

    public static void main(String[] args) {
        float radio;
        String input;
        circumf c1 = new circumf();
        tests t1 = new tests();
        convertir con1 = new convertir();
        
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Introduce el radio: ");
        input=teclado1.nextLine();
        
        if(t1.testFloat(input)){
            radio=con1.convFloat(input);
            c1.setDatos(radio);
            c1.setLongi();
            System.out.println("La longitud es: " + c1.getLongi());
            c1.setArea();
            System.out.println("El área es: " + c1.getArea());
        }
        else{
            System.err.println("Los valores introducidos tienen que ser float.");
        }
    }
}
