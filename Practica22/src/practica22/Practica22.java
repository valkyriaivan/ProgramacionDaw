/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica22;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota; //Declaramos variables
        
        /*Introducimos teclado1 en la clase Scanner*/
        Scanner teclado1=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce introduce la nota: ");
        /*Lectura por texto*/
        nota=teclado1.nextFloat();
        /*
        Si la nota es mayor o igual a la especificada, muestra el mensaje
        definido, si no es igual al primer if, al siguiente y asi sucesivamente
        */
        if (nota >= 5 && nota < 6.5)
        {
            System.out.println("Estás aprobado.");
        }
        else if (nota >= 6.5 && nota < 8.5)
        {
            System.out.println("Tienes un notable.");
        }
        else if (nota >= 8.5 && nota < 10)
        {
            System.out.println("Tienes un sobresaliente.");
        }
        else if (nota == 10)
        {
            System.out.println("¡¡Tienes matricula de honor!!");
        }
        else if (nota <= 5 && nota >= 0)
        {
            System.out.println("Estás suspendido.");
        }
        else
        {
            System.err.println("Introduce una nota valida.");
        }
    }
}
