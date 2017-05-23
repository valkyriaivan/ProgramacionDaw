/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica19;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia; //Declarar variable
        
        /*Introducimos teclado1 en la clase Scanner*/
        Scanner teclado1=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce el día de la semana: ");
        /*Lectura por texto*/
        dia=teclado1.nextInt();
        
        switch(dia) //Comprobamos que dia de la semana es
            {
                case 1:
                    System.out.println("Es Lunes"); //Mostrar nombre del dia
                    break; //Corta el switch y sale de el.
                case 2:
                    System.out.println("Es Martes"); //Mostrar nombre del dia
                    break;
                case 3:
                    System.out.println("Es Miercoles"); //Mostrar nombre del dia
                    break;
                case 4:
                    System.out.println("Es Jueves"); //Mostrar nombre del dia
                    break;
                case 5:
                    System.out.println("Es Viernes"); //Mostrar nombre del dia
                    break;
                case 6:
                    System.out.println("Es Sabado"); //Mostrar nombre del dia
                    break;
                case 7:
                    System.out.println("Es Domingo"); //Mostrar nombre del dia
                    break;
                default:
                    //Si introduce un dia erroneo, muestra error
                    System.err.println("Introduce un día de la semana correcto."); 
                    break;
            }
    }
    
}
