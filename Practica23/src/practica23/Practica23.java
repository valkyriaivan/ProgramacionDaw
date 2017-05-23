/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica23;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos variables
        char estadoSocial;
        double salario,tasa,reductor;
        int hijos;
        
        /*Introducimos teclado1 en la clase Scanner*/
        Scanner teclado1=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce tu salario: ");
        /*Lectura por texto*/
        salario=teclado1.nextInt();
        //Mostramos mensaje por pantalla con opciones
        System.out.println("Estado social");
        System.out.println("--------------");
        System.out.println("s - Soltero");
        System.out.println("c - Casado");
        System.out.println("d - Divorciado");
        System.out.println("o - Otros");
        
        /*Introducimos teclado2 en la clase Scanner*/
        Scanner teclado2=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce tu estado social: ");
        /*Lectura por texto*/
        estadoSocial=teclado2.next(".").charAt(0);
        
        /*Introducimos teclado3 en la clase Scanner*/
        Scanner teclado3=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("¿Cuantos hijos tienes?: ");
        /*Lectura por texto*/
        hijos=teclado3.nextInt();
        
        //iniciamos tasa
        tasa = 0;
                
        switch (estadoSocial)
        {
            case 's':
                System.out.println("Tienes una tasa de 0.25 por ser soltero.");
                tasa = salario * 0.25;
                System.out.println("La tasa es de " + tasa + "€");
                break;
            case 'c':
                System.out.println("Tienes una tasa de 0.05 por estar casado.");
                tasa = salario * 0.05;
                System.out.println("La tasa es de " + tasa + "€");
                break;
            case 'd':
                System.out.println("Tienes una tasa de 0.20 por ser divorciado.");
                tasa = salario * 0.20;
                System.out.println("La tasa es de " + tasa + "€");
                break;
            case 'o':
                System.out.println("No tienes ninguna tasa.");
                tasa = salario * 0.0;
                System.out.println("La tasa es de " + tasa + "€");
                break;
            default:
                System.err.println("NO has introducido ningun estado social valido.");
                break;
        }
        
        if (hijos == 1 || hijos == 2)
        {
            salario = salario - tasa + (salario*0.15);
            System.out.println("Después de una bonificación de 0.15, te queda un salario limpio de: " + salario + "€");
        }
        else if (hijos >= 3)
        {
            salario = salario - tasa + (salario*0.5);
            System.out.println("Después de una bonificación de 0.50, te queda un salario limpio de: " + salario + "€");
        }
        else if (hijos == 0)
        {
            salario = salario - tasa;
            System.out.println("No tienes bonificación por hijos, te queda un salario limpio de: " + salario + "€");
        }
        else
        {
            System.err.println("¿¡Pero que!? ¿Como puedes tener hijos negativos?");
        }
    }
    
}
