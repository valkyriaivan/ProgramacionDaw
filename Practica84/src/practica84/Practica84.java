package practica84;

import java.util.Scanner;
import libreriaNetbIvan.convertir;
import libreriaNetbIvan.tests;

public class Practica84 {

    public static void main(String[] args) {
        int input,cantidad;
        Cuenta c1 = new Cuenta("Ivan","García","Gálvez","53785874Y","123456789","3","15000");
        Cuenta c2 = new Cuenta("Enric","Gil","Onda","12547863M","987654321","5","8000");
        tests t1 = new tests();
        convertir con1 = new convertir();
        
        Scanner teclado1=new Scanner(System.in);
        System.out.print("¿Que cuenta quieres abrir?[1-2]:");
        input=teclado1.nextInt();
    }
    
}
