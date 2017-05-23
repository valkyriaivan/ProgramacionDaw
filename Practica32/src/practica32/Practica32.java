/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica32;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Declaramos e iniciamos algunas variables
        */
        int contador=2;
        int numeroInput;
        long resultado=1;
        
        Scanner reader = new Scanner(System.in); 
        System.out.println("Introduce un numero: "); 
        numeroInput = reader.nextInt();
        
        while (contador <= numeroInput) //MIentras contador sea menor o igual a numeroInput
        {
            resultado *= contador; //Resultado por contador
            contador++; //Incrementamos contador en 1
        }
        System.out.println("El factorial de " + numeroInput + " es " + resultado); //Mostramos resultado
    }
}
