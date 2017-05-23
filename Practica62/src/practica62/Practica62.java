/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica62;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica62 {

    public static char menu() {
        
        System.out.println("¿Que tipo de temperatura vas a convertir?");
        System.out.println("--------------");
        System.out.println("c - Celcius");
        System.out.println("f - Fahrenheit");
        System.out.println("k - Kelvin");
        System.out.println("s - Salir");
        System.out.println();
        
        Scanner teclado3=new Scanner(System.in);
        System.out.print("¿Que tipo es?: ");
        return teclado3.next(".").charAt(0);
    }
    public static char menuC() {
        System.out.println();
        System.out.println("¿A que tipo quieres pasar los Cº?");
        System.out.println("--------------");
        System.out.println("f - Fahrenheit");
        System.out.println("k - Kelvin");
        System.out.println("s - Salir");
        System.out.println();
        
        Scanner teclado3=new Scanner(System.in);
        System.out.print("¿A que quieres pasarlo?: ");
        return teclado3.next(".").charAt(0);
    }
    public static char menuF() {
        System.out.println();
        System.out.println("¿A que tipo quieres pasar los Fº?");
        System.out.println("--------------");
        System.out.println("c - Celcius");
        System.out.println("k - Kelvin");
        System.out.println("s - Salir");
        System.out.println();
        
        Scanner teclado3=new Scanner(System.in);
        System.out.print("¿A que quieres pasarlo?: ");
        return teclado3.next(".").charAt(0);
    }
    public static char menuK() {
        System.out.println();
        System.out.println("¿A que tipo quieres pasar los Kº?");
        System.out.println("--------------");
        System.out.println("c - Celcius");
        System.out.println("f - Fahrenheit");
        System.out.println("s - Salir");
        System.out.println();
        
        Scanner teclado3=new Scanner(System.in);
        System.out.print("¿A que quieres pasarlo?: ");
        return teclado3.next(".").charAt(0);
    }
    
    public static float CaF(float temperatura){
        return (9*temperatura)/5 + 32;
    }
    public static float CaK(float temperatura){
        return (float) (temperatura+273.15);
    }
    public static float FaC(float temperatura){
        return (5*(temperatura-32))/9;
    }
    public static float FaK(float temperatura){
        return (float) ((float) ((5*(temperatura-32))/9) + 273.15);
    }
    public static float KaC(float temperatura){
        return (float) (temperatura-273.15);
    }
    public static float KaF(float temperatura){
        return (float) ((5*(temperatura-273.15)/5)+32);
    }
    
    public static void main(String[] args) {
        float temperatura;
        char seleccion='.';
        char tipo='.';
        
        seleccion= menu();
        
        System.out.println();
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Introduce la temperatura: ");
        temperatura=teclado1.nextFloat();
        
        switch (seleccion){
            case 'c':{
                tipo=menuC();
                switch(tipo){
                    case 'f':{
                        System.out.println("Conversión: " + temperatura + "Cº = " + CaF(temperatura) + "Fº");
                        break;
                    }
                    case 'k':{
                        System.out.println("Conversión: " + temperatura + "Cº = " + CaK(temperatura) + "Kº");
                        break;
                    }
                    case 's':{
                        break;
                    }
                    default:{
                        System.err.println("No has introducido ningun caracter valido.");
                        break;
                    }
                }
                break;
            }
            case 'f':{
                tipo=menuF();
                switch(tipo){
                    case 'c':{
                        System.out.println("Conversión: " + temperatura + "Fº = " + FaC(temperatura) + "Cº");
                        break;
                    }
                    case 'k':{
                        System.out.println("Conversión: " + temperatura + "Fº = " + FaK(temperatura) + "Kº");
                        break;
                    }
                    case 's':{
                        break;
                    }
                    default:{
                        System.err.println("No has introducido ningun caracter valido.");
                        break;
                    }
                }
                break;
            }
            case 'k':{
                tipo=menuK();
                switch(tipo){
                    case 'c':{
                        System.out.println("Conversión: " + temperatura + "Kº = " + KaC(temperatura) + "Cº");
                        break;
                    }
                    case 'f':{
                        System.out.println("Conversión: " + temperatura + "Kº = " + KaF(temperatura) + "Fº");
                        break;
                    }
                    case 's':{
                        break;
                    }
                    default:{
                        System.err.println("No has introducido ningun caracter valido.");
                        break;
                    }
                }
                break;
            }
        }
    }
}
