/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica16;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota; //Declarar variables
        
        /*Introducimos teclado1 en la clase Scanner*/
        Scanner teclado1=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce introduce la nota: ");
        /*Lectura por texto*/
        nota=teclado1.nextFloat();
        /*
        Miramos si la nota es mayor que 5, luego si es mayor que 6.5 y así sucesivamente
        hasta que pare y nos muestre el mensaje con la nota.
        */
        if (nota >= 5)
        {
            if (nota >= 6.5)
            {
                if (nota >= 8.5)
                {
                    if (nota ==10)
                    {
                        System.out.println("¡¡Tienes matricula de honor!!");
                    }
                    else
                    {
                        System.out.println("Tienes un sobresaliente.");
                    }
                }
                else
                {
                    System.out.println("Tienes un notable.");
                }
            }
            else
            {
                System.out.println("Estás aprobado.");
            }
        }
        else
        {
            System.out.println("Estás suspendido!");
        }
    }
}
