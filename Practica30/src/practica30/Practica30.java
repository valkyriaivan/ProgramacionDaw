/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica30;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double contador; //Declaramos variable
        double numeroInput; //Declaramos variable
        double resultado = 0; //Declaramos e inicamos cariable
        
        Scanner reader = new Scanner(System.in); 
        System.out.println("Introduce un numero: "); 
        numeroInput = reader.nextDouble(); 
        
        contador = numeroInput; //Contado e igual alnumero introducido
        
        while (contador > 0) //Mientras contador sea mayor que 0
        {
            /*
            Contador dividido por 2 elevado a contador
            */
            resultado += contador/(Math.pow(2, contador)); 
            contador--; //Decrementamos contador en 1
        }
        /*
        MOstramos resulado usando una variable BigDecimal para que muestre un numero grande
        */
        System.out.println("El resultado es: " + new BigDecimal(resultado)); 
    }
    
}
