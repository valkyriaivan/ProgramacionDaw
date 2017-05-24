
package practica84;

import java.util.Scanner;

public class menu {
    public String menu(){
        System.out.println("¿Que acción desea realizar?");
        System.out.println("----------------------------");
        System.out.println("Mostrar datos de la cuenta.");
        System.out.println("Ingresar dinero.");
        System.out.println("Retirar dinero.");
        System.out.println("Transferir dinero.");
        System.out.println("Cambiar datos de la cuenta.");
        
        System.out.println();
        Scanner teclado1=new Scanner(System.in);
        System.out.print("¿Que quieres hacer?: ");
        return teclado1.nextLine();
    }
}
