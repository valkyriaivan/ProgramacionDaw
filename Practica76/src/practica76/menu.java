package practica76;

import java.util.Scanner;
import libreriaNetbIvan.tests;

public class menu {
    tests t1 = new tests();
    /**
     * Muestra el menú.
     */
    public void mostrar() {
        System.out.println("--Calculadora--");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicación");
        System.out.println("4 - División");
        System.out.println("5 - Resto");
        System.out.println("6 - Salir"); 
    }
    /**
     * Lee, comprueba y devuelve el input del menú
     * @return Input.
     */
    public int leer() {
        String input;
        Scanner teclado1=new Scanner(System.in);
        System.out.print("¿Que acción quieres realizar?: ");
        input=teclado1.nextLine();
        
        if(t1.testInt(input)==true){
            return Integer.parseInt(input);
        }
        else{
            System.out.println("No has introducido un número.");
            return 6;
        }
    }
}
