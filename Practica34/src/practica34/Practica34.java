/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica34;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cuenta = 0;
        char seleccion = '.';
        double numeroInput;
        
        while (seleccion != 'f')
        {
            System.out.println("¿Que acción quieres realizar?");
            System.out.println("--------------");
            System.out.println("i - Ingresar");
            System.out.println("r - Retirar");
            System.out.println("m - Mostrar saldo");
            System.out.println("f - Finalizar");

            /*Introducimos teclado2 en la clase Scanner*/
            Scanner teclado2=new Scanner(System.in);
            /*Pedimos imput del usuario perimetro*/
            System.out.println("¿Que tramite quieres realizar?: ");
            /*Lectura por texto*/
            seleccion=teclado2.next(".").charAt(0);
            
            switch (seleccion)
            {
            case 'i':
                /*Introducimos teclado1 en la clase Scanner*/
                Scanner teclado1=new Scanner(System.in);
                /*Pedimos imput del usuario perimetro*/
                System.out.println("Introduce cuanto quieres ingresar: ");
                /*Lectura por texto*/
                numeroInput=teclado1.nextDouble();
                cuenta += numeroInput;
                System.out.println("Tramite realizado con exito.");
                break;
            case 'r':
                /*Introducimos teclado3 en la clase Scanner*/
                Scanner teclado3=new Scanner(System.in);
                /*Pedimos imput del usuario perimetro*/
                System.out.println("Introduce cuanto quieres retirar: ");
                /*Lectura por texto*/
                numeroInput=teclado3.nextDouble();
                cuenta -= numeroInput;
                System.out.println("Tramite realizado con exito.");
                break;
            case 'm':
                System.out.println("Tienes un saldo de: " + cuenta + "€");
                break;
            case 'f':
                System.out.println("Saliendo, gracias.");
                break;
            default:
                System.err.println("No has introducido ningun caracter valido.");
                break;
            }
        }
    }
}
