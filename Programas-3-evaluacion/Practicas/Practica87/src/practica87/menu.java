package practica87;

import java.util.Scanner;

public class menu {
    public int menu(){
        System.out.println("¿Que acción desea realizar?");
        System.out.println("----------------------------");
        System.out.println("1- Mostar libro.");
        System.out.println("2- Prestar libro.");
        System.out.println("3- Devolver libro");
        System.out.println("4- Salir.");
        
        System.out.println();
        Scanner teclado1=new Scanner(System.in);
        System.out.print("¿Que quieres hacer?: ");
        System.out.println();
        return teclado1.nextInt();
    }
}