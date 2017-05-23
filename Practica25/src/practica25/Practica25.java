/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica25;

/**
 *
 * @author ivan
 */
public class Practica25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sumaTres,multiplo,mostrar; //Declaramos variables
        sumaTres = 3; //Iniciamos variable con valor 3
        multiplo = 1; //Iniciamos variable con valor 1
         
        System.out.println("Los 10 primeros multiplos de 3 són: ");
        while (multiplo <= 10) //Mientras multiplo sea inferior o igual a 10
        {
            mostrar =(int) Math.pow(3, multiplo); //3 elevado a Multiplo
            sumaTres = sumaTres + mostrar; //Sumamos lo que contiene la variable a multilpo
            System.out.println(mostrar); //Mostramos el multiplo
            multiplo++; //sumamos 1 a multiplo
        }
        System.out.println("La suma de todos los multilos es: " + sumaTres); //MOstramos resultado final
    }
    
}
