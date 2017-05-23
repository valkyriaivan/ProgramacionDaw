/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica52;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena1, cadena2;
        boolean busqueda;
        
        Scanner teclado1=new Scanner(System.in);
        System.out.println("Introduce la primera palabra: ");
        cadena1=teclado1.nextLine();
        
        Scanner teclado2=new Scanner(System.in);
        System.out.println("Introduce una palabra a buscar: ");
        cadena2=teclado2.nextLine();
        
        busqueda=cadena1.toLowerCase().contains(cadena2.toLowerCase());

        if(busqueda==true){
            System.out.println("La segunda cadena se encuentra en la primera cadena");
        }
        else{
            System.err.println("La segunda cadena no se encuentra en la primera cadena");
        }
    }
}
