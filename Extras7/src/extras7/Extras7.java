/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras7;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Extras7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero,resultado,resulFinal,numeroInic,digito1,digito2,digito3,digito4;
        
        /*Introducimos teclado1 en la clase Scanner*/
        Scanner teclado1=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce un numero: ");
        /*Lectura por texto*/
        numero=teclado1.nextInt();
        numeroInic = numero;
        resulFinal= 0;
           
        if (numero >= 0 && numero <= 9999)
        {
            if (numero >= 1000)
            {
                resultado= numero % 10;
                numero= numero /10;
                digito1 = resultado;

                resultado= numero % 10;
                numero= numero /10;
                digito2 = resultado;

                resultado= numero % 10;
                numero= numero /10;
                digito3 = resultado;

                resultado= numero % 10;
                numero= numero /10;
                digito4 = resultado;

                if (digito1 == digito4 && digito2 == digito3)
                {
                    System.out.println(numeroInic +" es capicua.");
                }
                else
                {
                    System.out.println(numeroInic +" no es capicua.");
                }
       
            }
            else
            {
                if (numero >=100)
                {
                    resultado= numero % 10;
                    numero= numero /10;
                    digito1 = resultado;

                    resultado= numero % 10;
                    numero= numero /10;
                    digito2 = resultado;

                    resultado= numero % 10;
                    numero= numero /10;
                    digito3 = resultado;

                    if (digito1 == digito3)
                    {
                        System.out.println(numeroInic +" es capicua.");
                    }
                    else
                    {
                        System.out.println(numeroInic +" no es capicua.");
                    }
                }
                else
                {
                    if (numero >= 10)
                    {
                        resultado= numero % 10;
                        numero= numero /10;
                        digito1 = resultado;

                        resultado= numero % 10;
                        numero= numero /10;
                        digito2 = resultado;

                        if (digito1 == digito2)
                        {
                            System.out.println(numeroInic +" es capicua.");
                        }
                        else
                        {
                            System.out.println(numeroInic +" no es capicua.");
                        }
                    }
                    else
                    {
                        System.out.println(numeroInic +" es capicua.");
                    }
                }
            }
        }
        else
        {
            System.err.println("Introduce un número entre 0 y 9999");
        }
    }
    
}
