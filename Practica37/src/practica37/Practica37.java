/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica37;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] numerosArray;
        double numeroInput;
        int i;
        
        numerosArray = new double[5];
        
        for(i=0;i<5;i++)
        {
            /*Introducimos teclado1 en la clase Scanner*/
            Scanner teclado1=new Scanner(System.in);
            /*Pedimos imput del usuario perimetro*/
            System.out.println("Introduce un número: ");
            /*Lectura por texto*/
            numeroInput=teclado1.nextDouble();
            
            numerosArray[i]=numeroInput;
            teclado1.reset();
            System.out.flush();
        }
        System.out.println("Los números introducidos son: ");
        for(i=4;i>=0;i--)
        {            
            System.out.println(numerosArray[i]);
        }
    }
    
}
