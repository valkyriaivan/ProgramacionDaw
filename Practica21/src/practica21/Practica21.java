/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica21;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero; //Declarar variables
        
        /*Introducimos teclado1 en la clase Scanner*/
        Scanner teclado1=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce el número: ");
        /*Lectura por texto*/
        numero=teclado1.nextInt();
        
        if (numero >= 30) //Si numero es mayor o igual a 30 lo mostramos.
        {
            System.out.println("El número " + numero + " es mayor o igual a 30.");
        }
        else if (numero < 0) //Si es menor que 0, lo mostramos.
        {
            System.out.println("El numero " + numero + " es negativo.");
        }
        else //Si no es ninguno de los anterior hace el switch
        {
            switch(numero)
            {
                //Comprueba si es un numero primo o 2
                case 2: case 3: case 5: case 7: case 11: case 13: case 17: case 19: case 23: case 29:
                    if (numero == 2) //si es un 2, es primo y potencia de 2
                    {
                        System.out.println("El número introducido es primo y potencia de 2.");
                    }
                    else //si no es 2, es primo.
                    {
                        System.out.println("El número introducido es primo.");
                    } 
                    break; //paramos el switch
                default: //si no es ninguno de esos, vamos al default
                    if (numero%2 == 0) //si es multiple de 2, mostramos 
                    {
                        System.out.println("El número introducido es compuesto y potencia de 2.");
                    }
                    else //si no, mostramos otro mensaje
                    {
                        System.out.println("El número introducido es compuesto.");
                    } 
            }
        }
    }
}
