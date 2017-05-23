/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica41;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] primerArray;
        int numeroInput;
        int i;
        int test=0;
        primerArray = new int[] {1,3,5,7,9,11,13,15,17,19};
        
        /*Introducimos teclado1 en la clase Scanner*/
        Scanner teclado1=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce número a buscar: ");
        /*Lectura por texto*/
        numeroInput=teclado1.nextInt();
                
        for (i=0;i<primerArray.length;i++)
        {
            if(numeroInput == primerArray[i])
            {
                System.out.println("El número introducido: " + numeroInput + " está en la posición: " + i);
                test = 1;
            }
        }
        if (test == 0)
        {
            System.err.println("El número introducido no está en el array");
        }
    }
}
