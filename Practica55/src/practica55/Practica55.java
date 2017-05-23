/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica55;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto, busca, reemplaza;

        Scanner teclado1=new Scanner(System.in);
        System.out.println("Introduce el texto: ");
        texto=teclado1.nextLine();
        
        Scanner teclado2=new Scanner(System.in);
        System.out.println("Introduce una palabra a buscar: ");
        busca=teclado2.nextLine();
        
        Scanner teclado3=new Scanner(System.in);
        System.out.println("Introduce una palabra a reemplazar: ");
        reemplaza=teclado3.nextLine();
        
        texto=texto.replaceAll(busca, reemplaza);
        System.out.println(texto);
    }
    
}
