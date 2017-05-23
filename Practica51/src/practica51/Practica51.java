/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica51;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena1, cadena2;
        
        Scanner teclado1=new Scanner(System.in);
        System.out.println("Introduce la primera cadena: ");
        cadena1=teclado1.nextLine();
        
        Scanner teclado2=new Scanner(System.in);
        System.out.println("Introduce la segunda cadena: ");
        cadena2=teclado2.nextLine();
        
        if(cadena1.equals(cadena2)){
            System.out.println("Las cadenas son iguales.");
        }
        else{
            System.out.println("Las cadenas no son iguales.");
        }
    }
    
}
