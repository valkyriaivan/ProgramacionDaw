/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica31;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Declaramos e iniciamos unas variables
        */
        int contador=0;
        int numeroInput;
        int resultado=0;
        int ultimoNum=0;
        
        Scanner reader = new Scanner(System.in); 
        System.out.println("Introduce un numero: "); 
        numeroInput = reader.nextInt();
        
        while (contador <= numeroInput) //Mientras contador sea inferior o igual a numeroInput
        {
            if (resultado < numeroInput) //Si el resultado es menor que NUmeroINput
            {
                resultado += contador; //Sumamos resultado y contador
                ultimoNum = contador; //Introducimos contador como ultimoNum
            }
            contador++; //Incrementamos contador en 1
        }
        System.out.println("El número final es " + resultado); //Mostramos resultado
        System.out.println("El número numero sumado es: " + ultimoNum); //Mostramos ultimoNUm
    }
}
