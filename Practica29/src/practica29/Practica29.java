/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica29;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double contador; //Declaramos variable
        int numeroInput; //Declaramos variable
        double resultado = 0; //Declaramos e iniciamos variable
        
        Scanner reader = new Scanner(System.in); 
        System.out.println("Introduce un numero mayor que 9: "); 
        numeroInput = reader.nextInt(); 
        
        contador = numeroInput; //El contador es igual al numero introducido
        
        if (numeroInput > 9) //Si el numero es mayor que 9
        {
            while (contador > 0) //MIentras contador sea mayor que 0
            {
                resultado += 1/contador; //Sumamos resultador y 1 dividido entre contador
                contador--; //Decrementados en 1 el contador
            }
            System.out.println("El resultado es: " + resultado); //MOstramos resultado
        }
        else
        {
            System.err.println("Introduce un numero mayor de 9"); //Si no es mayor que 9, mostramos error
        }
    }
}
