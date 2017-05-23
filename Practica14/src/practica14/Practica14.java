/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica14;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Declaramos variables*/
        int edad;
        
        /*Introducimos teclado1 en la clase Scanner*/
        Scanner teclado1=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce tú edad: ");
        /*Lectura por texto*/
        edad=teclado1.nextInt();
        
        /*Si edad es mayor que 21, enseñamos mensaje*/
        if (edad >= 21)
        {
            System.out.println("Puedes sacarte el carnet de autobus.");
        }
        /*Si no es mayor que 21, mostramos otro texto diferente*/
        else
        {
            System.out.println("No puedes sacarte el carnet de autobus.");
        }
    }
}
