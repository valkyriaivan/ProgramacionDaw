
package practica84;

import java.util.Scanner;

public class menu {
    public int menu(){
        System.out.println("¿Que acción desea realizar?");
        System.out.println("----------------------------");
        System.out.println("1- Mostrar datos de la cuenta.");
        System.out.println("2- Ingresar dinero.");
        System.out.println("3- Retirar dinero.");
        System.out.println("4- Transferir dinero.");
        System.out.println("5- Cambiar datos de la cuenta.");
        System.out.println("6- Salir.");
        
        System.out.println();
        Scanner teclado1=new Scanner(System.in);
        System.out.print("¿Que quieres hacer?: ");
        System.out.println();
        return teclado1.nextInt();
    }
}
