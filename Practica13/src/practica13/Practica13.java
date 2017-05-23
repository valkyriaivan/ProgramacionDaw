/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica13;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double root1,root2,a,b,c; //Declaramos variables
        
        /*Introducimos teclado1 en la clase Scanner*/
        Scanner teclado1=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce el valor de a: ");
        /*Lectura por texto*/
        a=teclado1.nextLong();
        
        /*Introducimos teclado2 en la clase Scanner*/
        Scanner teclado2=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce el valor de b: ");
        /*Lectura por texto*/
        b=teclado2.nextLong();
        
        /*Introducimos teclado3 en la clase Scanner*/
        Scanner teclado3=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce el valor de c: ");
        /*Lectura por texto*/
        c=teclado3.nextLong();
        
        root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a); //Primer tipo de equacion
        root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a); //Segundo tipo de equacion
        
        System.out.println("El resultado del + es:" + root1); //Mostramos el resultado
        System.out.println("El resultado del - es:" + root2); //Mostramos el resultado
    }
    
}
