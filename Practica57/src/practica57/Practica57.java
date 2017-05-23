/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica57;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] caracteres;
        String texto;
        int tamaño;
        
        Scanner teclado1=new Scanner(System.in);
        System.out.println("Introduce el texto: ");
        texto=teclado1.nextLine();
        
        tamaño=texto.length();
        caracteres = new char[tamaño];
        
        for(int i=0; i<caracteres.length;i++){
            caracteres[i]=texto.charAt(i);
        }
    }
}
