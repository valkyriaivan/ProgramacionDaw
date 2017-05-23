/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica68;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica68 {

    public static int factorial(int valor){
        int resultado=1;
        for(int i=valor; i>0;i--){
            resultado *= i;
        }
        return resultado;
    }
    public static void main(String[] args) {
        int valor;
        
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Introduce el valor del que quieres sacar el factorial: ");
        valor=teclado1.nextInt();
        
        System.out.println("El factorial de " + valor + " es: " + factorial(valor));
    }
}
