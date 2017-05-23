/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica53;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto, palabra;
        int busqueda;
        
        Scanner teclado1=new Scanner(System.in);
        System.out.println("Introduce el texto: ");
        texto=teclado1.nextLine();
        
        Scanner teclado2=new Scanner(System.in);
        System.out.println("Introduce una palabra a buscar: ");
        palabra=teclado2.nextLine();
        
        int index = texto.indexOf(palabra);
        while (index >= 0) {  // indexOf devuelve -1 si no encuentra nada
            System.out.println("La palabra '" + palabra + "' está en la posición " + index + ".");
            index = texto.indexOf(palabra, index + 1);
        }
    }
}
