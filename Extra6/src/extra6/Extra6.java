/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra6;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero,resultado,resulFinal,numeroInic;
        
        /*Introducimos teclado1 en la clase Scanner*/
        Scanner teclado1=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce un numero: ");
        /*Lectura por texto*/
        numero=teclado1.nextInt();
        numeroInic = numero;
        resulFinal= 0;
           
        if (numero > 0 && numero < 9999)
        {
            if (numero >= 1000)
            {
                resultado= numero % 10;
                numero= numero /10;
                resulFinal = resulFinal * 10 + resultado;

                resultado= numero % 10;
                numero= numero /10;
                resulFinal = resulFinal * 10 + resultado;

                resultado= numero % 10;
                numero= numero /10;
                resulFinal = resulFinal * 10 + resultado;

                resultado= numero % 10;
                numero= numero /10;
                resulFinal = resulFinal * 10 + resultado;

                System.out.println(numeroInic + " al reves es: " + resulFinal);
            }
            else
            {
                if (numero >=100)
                {
                    resultado= numero % 10;
                    numero= numero /10;
                    resulFinal = resulFinal * 10 + resultado;

                    resultado= numero % 10;
                    numero= numero /10;
                    resulFinal = resulFinal * 10 + resultado;

                    resultado= numero % 10;
                    numero= numero /10;
                    resulFinal = resulFinal * 10 + resultado;

                    System.out.println(numeroInic + " al reves es: " + resulFinal);
                }
                else
                {
                    if (numero >= 10)
                    {
                        resultado= numero % 10;
                        numero= numero /10;
                        resulFinal = resulFinal * 10 + resultado;

                        resultado= numero % 10;
                        numero= numero /10;
                        resulFinal = resulFinal * 10 + resultado;

                        System.out.println(numeroInic + " al reves es: " + resulFinal);
                    }
                    else
                    {
                        System.out.println(numeroInic + " al reves es: " + numero);
                    }
                }
            }
        }
    }
}
