/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica12;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long solu,num1,solu2; //Declaramos las variables
        
        /*Introducimos teclado1 y 2 en la clase Scanner*/
        Scanner teclado1=new Scanner(System.in);
        
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce la cantidad de euros sin centimos: ");
        /*Lectura por texto*/
        num1=teclado1.nextLong();

        /*Ahora sacaremos el resto y el quaciente del imput e iremos 
        haciendolo sucesivamente por todos los valores de billetes y monedas.
        Cada vez que saquemos el quociente de la division, nos dará la cantidad
        de ese billete. Y guardaremos el resto para el siguiente valor.
        */
        
        /*Sacamos el quociente y el resto en 500 y mostramos el quociente*/
        solu=num1%500;
        solu2=num1/500;
        
        if (solu2 != 0)
        {
            System.out.println(solu2 + " billetes de 500.");
        }
        /*Sacamos el quociente y el resto en 200 y mostramos el quociente*/
        solu2=solu/200;
        solu=solu%200;
        
        if (solu2 != 0)
        {
        System.out.println(solu2 + " billetes de 200.");
        }
        
        /*Sacamos el quociente y el resto en 100 y mostramos el quociente*/
        solu2=solu/100;
        solu=solu%100;
         
        if (solu2 != 0)
        {
        System.out.println(solu2 + " billetes de 100.");
        }
        
        /*Sacamos el quociente y el resto en 50 y mostramos el quociente*/
        solu2=solu/50;
        solu=solu%50;
        
        if (solu2 != 0)
        {
        System.out.println(solu2 + " billetes de 50.");
        }
        
        /*Sacamos el quociente y el resto en 20 y mostramos el quociente*/
        solu2=solu/20;
        solu=solu%20;
        
        if (solu2 != 0)
        {
        System.out.println(solu2 + " billetes de 20."); 
        }
        
        /*Sacamos el quociente y el resto en 10 y mostramos el quociente*/
        solu2=solu/10;
        solu=solu%10;
        
        if (solu2 != 0)
        {
        System.out.println(solu2 + " billetes de 10.");
        }
        
        /*Sacamos el quociente y el resto en 5 y mostramos el quociente*/
        solu2=solu/5;
        solu=solu%5;
           
        if (solu2 != 0)
        {
        System.out.println(solu2 + " billetes de 5.");
        }
        
        /*Sacamos el quociente y el resto en 2 y mostramos el quociente*/
        solu2=solu/2;
        solu=solu%2;
        
        if (solu2 != 0)
        {
        System.out.println(solu2 + " monedas de 2.");
        }
        
        /*Sacamos el quociente y el resto en 1 y mostramos el quociente*/
        solu2=solu/1;
        solu=solu%1;
        
        if (solu2 != 0)
        {
        System.out.println(solu2 + " monedas de 1.");
        }
    }
    
}
