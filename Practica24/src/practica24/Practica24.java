/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica24;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numerosDNI,letra; //Declaramos variables
        
        /*Introducimos teclado1 en la clase Scanner*/
        Scanner teclado1=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce los numeros de tu DNI: ");
        /*Lectura por texto*/
        numerosDNI=teclado1.nextInt();
        
        letra = numerosDNI % 23; //Dividimos numero DNI por 23
        
        /*
        Depende del resultado mostraremos una letra del DNI u otra.
        Si has introducido un numero que no es un dni, muestra error.
        */
        switch (letra)
        {
            case 0:
                System.out.println("Tu NIF es " + numerosDNI + "T");
                break;
            case 1:
                System.out.println("Tu NIF es " + numerosDNI + "R");
                break;
            case 2:
                System.out.println("Tu NIF es " + numerosDNI + "W");
                break;
            case 3:
                System.out.println("Tu NIF es " + numerosDNI + "A");
                break;
            case 4:
                System.out.println("Tu NIF es " + numerosDNI + "G");
                break;
            case 5:
                System.out.println("Tu NIF es " + numerosDNI + "M");
                break;
            case 6:
                System.out.println("Tu NIF es " + numerosDNI + "Y");
                break;
            case 7:
                System.out.println("Tu NIF es " + numerosDNI + "F");
                break;
            case 8:
                System.out.println("Tu NIF es " + numerosDNI + "P");
                break;
            case 9:
                System.out.println("Tu NIF es " + numerosDNI + "D");
                break;
            case 10:
                System.out.println("Tu NIF es " + numerosDNI + "X");
                break;
            case 11:
                System.out.println("Tu NIF es " + numerosDNI + "B");
                break;
            case 12:
                System.out.println("Tu NIF es " + numerosDNI + "N");
                break;
            case 13:
                System.out.println("Tu NIF es " + numerosDNI + "J");
                break;
            case 14:
                System.out.println("Tu NIF es " + numerosDNI + "Z");
                break;
            case 15:
                System.out.println("Tu NIF es " + numerosDNI + "S");
                break;
            case 16:
                System.out.println("Tu NIF es " + numerosDNI + "Q");
                break;
            case 17:
                System.out.println("Tu NIF es " + numerosDNI + "V");
                break;
            case 18:
                System.out.println("Tu NIF es " + numerosDNI + "H");
                break;
            case 19:
                System.out.println("Tu NIF es " + numerosDNI + "L");
                break;
            case 20:
                System.out.println("Tu NIF es " + numerosDNI + "C");
                break;
            case 21:
                System.out.println("Tu NIF es " + numerosDNI + "K");
                break;
            case 22:
                System.out.println("Tu NIF es " + numerosDNI + "E");
                break;
        }
    } 
}