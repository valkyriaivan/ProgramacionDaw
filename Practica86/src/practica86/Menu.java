package practica86;

import java.util.Scanner;

public class Menu {
    public int menu(){
        System.out.println("¿Que acción desea realizar?");
        System.out.println("----------------------------");
        System.out.println("1- Icrementar contador.");
        System.out.println("2- Decrementar contador.");
        System.out.println("3- Set contador.");
        System.out.println("4- Ver contador.");
        System.out.println("5- Salir.");
        
        System.out.println();
        Scanner teclado1=new Scanner(System.in);
        System.out.print("¿Que quieres hacer?: ");
        System.out.println();
        return teclado1.nextInt();
    }
}
