/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica20;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int plato; //declarar variable
        
        /*Introducimos teclado1 en la clase Scanner*/
        Scanner teclado1=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce el número del plato: ");
        /*Lectura por texto*/
        plato=teclado1.nextInt();
        
        /*
        Depende del numero que introduzca, muestra un plato u otro,
        si no está muestra error.
        */
        switch(plato)
        {
            case 1:
                System.out.println("Los ingrdientes de los Espaguetis a la cabonara son:");
                System.out.println("----------------------------------------------------");
                System.out.println("-Espaguetis.");
                System.out.println("-Panceta.");
                System.out.println("-Queso parmesano.");
                System.out.println("-Huevo.");
                break; //Corta el switch y sale de el.
            case 2:
                System.out.println("Los ingrdientes de la Paella valenciana son:");
                System.out.println("----------------------------------------------------");
                System.out.println("-Pollo.");
                System.out.println("-Conejo.");
                System.out.println("-Garrofón.");
                System.out.println("-Arroz.");
                System.out.println("-Azafrán.");
                System.out.println("-Tomate.");
                break;
            case 3:
                System.out.println("Los ingrdientes de la Hamburgesa son:");
                System.out.println("----------------------------------------------------");
                System.out.println("-Carne de vacuno.");
                System.out.println("-Lechuga.");
                System.out.println("-Tomate.");
                System.out.println("-Bacon.");
                System.out.println("-Ketchup.");
                System.out.println("-Tabasco de chipotle.");
                break;
            case 4:
                System.out.println("Los ingrdientes de la Tarta de chocolate son:");
                System.out.println("----------------------------------------------------");
                System.out.println("-Harina.");
                System.out.println("-Huevo.");
                System.out.println("-Levadura.");
                System.out.println("-Azucar.");
                System.out.println("-Cacao.");
                System.out.println("-Leche.");
                break;
            default:
                System.err.println("Ese plato no existe.");
                break;
        }
    } 
}
