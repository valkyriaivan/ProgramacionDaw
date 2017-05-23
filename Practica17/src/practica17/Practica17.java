/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica17;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int año,año2; //Declarar variables
        
        /*Introducimos teclado1 en la clase Scanner*/
        Scanner teclado1=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce un año: ");
        /*Lectura por texto*/
        año=teclado1.nextInt();
        
        if ((año%100) == 0 && (año%400) == 0) //Si el año es multiplo de 100 y de 400, es bisiesto
        {
            System.out.println("El año " + año + " es bisiesto."); //Mostrar que es bisiesto
        }
        else //Si no es multiplo de 100 y 400, hacer esto
        {
            if (año%4 == 0 && año%100 != 0) //Si es multiplo de 4 y no de 100, es bisiesto
            {
                System.out.println("El año " + año + " es bisiesto."); //Mostrar que es bisiesto
            }
            else //Si no cumple ninguna condicion, no es bisiesto
            {
                System.out.println("El año " + año + " no es bisiesto."); //Mostrar que no es bisiesto
            }
        }
    }
}
