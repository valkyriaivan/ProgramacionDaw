/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica59;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author ivan
 */
public class Practica59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input1, input2;
        boolean resultado;
        
        Scanner teclado1=new Scanner(System.in);
        System.out.println("Introduce la primera cadena: ");
        input1=teclado1.nextLine();
        
        Scanner teclado2=new Scanner(System.in);
        System.out.println("Introduce la segunda cadena: ");
        input2=teclado2.nextLine();
        
        input1=input1.toLowerCase();
        input2=input2.toLowerCase();
        
        char[] cadena1 = input1.replaceAll("[\\s]", "").toCharArray();
        char[] cadena2 = input2.replaceAll("[\\s]", "").toCharArray();
        
        Arrays.sort(cadena1);
        Arrays.sort(cadena2);
        
        resultado=Arrays.equals(cadena1, cadena2);
        
        if(resultado==true){
            System.out.println("Las dos cadenas son anagramas.");
        }
        else{
            System.err.println("Las dos cadenas no son anagramas.");
        }
    }
}
