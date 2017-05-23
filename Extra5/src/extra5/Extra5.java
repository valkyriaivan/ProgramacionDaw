/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra5;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        /*Introducimos teclado1 en la clase Scanner*/
        Scanner teclado1=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce un numero: ");
        /*Lectura por texto*/
        numero=teclado1.nextInt();
        
        if (numero > 0 && numero < 9999)
        {
            if (numero >= 1000)
            {
                System.out.println(numero + " tiene 4 digitos");
            }
            else
            {
                if (numero >=100)
                {
                    System.out.println(numero + " tiene 3 digitos");
                }
                else
                {
                    if (numero >= 10)
                    {
                        System.out.println(numero + " tiene 2 digitos");
                    }
                    else
                    {
                        System.out.println(numero + " tiene 1 digito");
                    }
                }
            }
        }
    }
}
