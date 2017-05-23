/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica27;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroInput,tablaMult,resMult; //Declaramos variables
        tablaMult = 1; //Iniciamos variable con valor 1
        
        /*Introducimos teclado1 en la clase Scanner*/
        Scanner teclado1=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce un numero: ");
        /*Lectura por texto*/
        numeroInput=teclado1.nextInt();
        
        while (tablaMult <= 10) //Mientras variable sea menor o igual a 10
        {
            resMult = numeroInput * tablaMult; //Multiplicamos numeroINput por el contador
            System.out.println(numeroInput + " por " + tablaMult + " = " + resMult); //Mostramos resultado
            tablaMult++; //Sumamos 1 a la variable
        }
    }
}
