/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica60;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica60 {
    public static char menu() {
        System.out.println();
        System.out.println("¿Que acción quieres realizar?");
        System.out.println("--------------");
        System.out.println("s - Sumar");
        System.out.println("r - Restar");
        System.out.println("m - Multiplicar");
        System.out.println("d - División");
        System.out.println("x - Sacar resto");
        System.out.println("f - Finalizar");
        
        Scanner teclado3=new Scanner(System.in);
        System.out.print("¿Que quieres hacer?: ");
        return teclado3.next(".").charAt(0);
    }
    public static float sumaP(float valor1, float valor2) {
        return valor1 + valor2;
    }
    public static float restaP(float valor1, float valor2) {
        return valor1 - valor2;
    }
    public static float multiP(float valor1, float valor2) {
        return valor1 * valor2;
    }
    public static float diviP(float valor1, float valor2) {
        return valor1 / valor2;
    }
    public static float restoP(float valor1, float valor2) {
        return valor1 % valor2;
    }
    
    public static void main(String[] args) {
        float valor1,valor2;
        char seleccion='.';
        
        while (seleccion != 'f')
        {
            seleccion= menu();
            
            System.out.println();
            Scanner teclado1=new Scanner(System.in);
            System.out.print("Introduce el primer valor: ");
            valor1=teclado1.nextFloat();

            Scanner teclado2=new Scanner(System.in);
            System.out.print("Introduce el segundo valor: ");
            valor2=teclado2.nextFloat();
            
            switch (seleccion)
            {
                case 's':{
                    System.out.println(valor1 + " + " + valor2 + " = " + sumaP(valor1, valor2));
                    break;
                }
                case 'r': {
                    System.out.println(valor1 + " - " + valor2 + " = " + restaP(valor1, valor2));
                    break;
                }
                case 'm': {
                    System.out.println(valor1 + " * " + valor2 + " = " + multiP(valor1, valor2));
                    break;
                }
                case 'd': {
                    System.out.println(valor1 + " / " + valor2 + " = " + diviP(valor1, valor2));
                    break;
                }
                case 'x': {
                    System.out.println(valor1 + " % " + valor2 + " = " + restoP(valor1, valor2));
                    break;
                }
                case 'f':{
                    break;
                }
                default:{
                    System.err.println("No has introducido ningun caracter valido.");
                    break;
                }
            }
        }
    }
    
    
}
