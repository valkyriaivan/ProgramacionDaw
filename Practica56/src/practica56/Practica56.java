/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica56;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto, textoMin;

        Scanner teclado1=new Scanner(System.in);
        System.out.println("Introduce el texto: ");
        texto=teclado1.nextLine();
        
        texto=texto.toUpperCase();
        
        textoMin=texto.toLowerCase();
        
        System.out.println(texto);
        System.out.println(textoMin);
    }
}
