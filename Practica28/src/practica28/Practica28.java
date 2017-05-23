/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica28;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 2; //Declaramos e iniciamos la variables
        int resultado = 0; //Declaramos e iniciamos la variables
        int numero = 0; //Declaramos e iniciamos la variables
        
        /*Introducimos teclado1 en la clase Scanner*/
        Scanner teclado1 = new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce un numero: "); 
        /*Lectura por texto*/
        numero = teclado1.nextInt();
        
        while (contador <= numero / 2) //Mientras contador sea menor o igual a numero/2
        {                             
            if (numero % contador == 0) //Si el resto es igual a 0
            {
                resultado = 1; //Ponemos que resultado es igual a 1
            }                
            contador++; //Incrementamos contador en 1
        }
        if (resultado == 1) //Si resultado es igual a 1
        {
            System.out.println("El numero: " + numero + " no es primo."); //MOstramos que es primo
        }
        else
        {
            System.out.println("El numero: " + numero + " es primo. "); //Si no, no es primo
        }  
    }
    
}
