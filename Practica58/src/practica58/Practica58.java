/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica58;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica58 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palindromo;
        
        Scanner teclado1=new Scanner(System.in);
        System.out.println("Introduce el texto: ");
        palindromo=teclado1.nextLine();
        
        int len = palindromo.length();
        
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
        
        // Ponemos el strin en un array de car
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = palindromo.charAt(i);
        }
        
        // Le damos la vuelta al array
        for (int j = 0; j < len; j++) {
            charArray[j] = tempCharArray[len - 1 - j];
        }
        
        String revesPalindromo = new String(charArray);
        
        palindromo= palindromo.toLowerCase();
        revesPalindromo= revesPalindromo.toLowerCase();

        if(palindromo.equals(revesPalindromo)){
            System.out.println("El texto introducido es palindromo.");
        }
        else{
            System.err.println("El texto introducido no es palindromo.");
        }
    }
    
}
