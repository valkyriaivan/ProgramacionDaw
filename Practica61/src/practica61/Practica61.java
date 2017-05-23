/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica61;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica61 {

    public static char menu() {
        System.out.println();
        System.out.println("¿De que figura quieres sacar el área?");
        System.out.println("--------------");
        System.out.println("t - Triangulo");
        System.out.println("o - Circulo");
        System.out.println("p - Pentagono");
        System.out.println("c - Cuadrado");
        System.out.println("s - Salir");
        System.out.println();
        
        Scanner teclado3=new Scanner(System.in);
        System.out.print("¿Que figura quieres?: ");
        return teclado3.next(".").charAt(0);
    }
    public static float areaT(float base, float altura) {
        return (base*altura)/2; 
    }
    public static float areaO(float radio) {
        return (float) (Math.PI * Math.pow(radio, 2));
    }
    public static float areaP(float perimetro, float apotema) {
        return (perimetro*apotema)/2;
    }
    public static float areaC(float lado) {
        return (float) Math.pow(lado, 2); 
    }
    
    public static void main(String[] args) {
        float resultado,base,altura,radio,perimetro,apotema,lado;
        char seleccion;
        
        seleccion= menu();
        
        switch (seleccion)
        {
            case 't':{
                Scanner teclado1=new Scanner(System.in);
                System.out.print("Introduce la base: ");
                base=teclado1.nextFloat();

                Scanner teclado2=new Scanner(System.in);
                System.out.print("Introduce la altura: ");
                altura=teclado2.nextFloat();
                
                System.out.print("El área del triangulo es: " + areaT(base, altura));
                break;
            }
            case 'o': {
                Scanner teclado1=new Scanner(System.in);
                System.out.print("Introduce el radio: ");
                radio=teclado1.nextFloat();

                System.out.println("El área de la circumferencia es: " + areaO(radio));
                break;
            }
            case 'p': {
                Scanner teclado1=new Scanner(System.in);
                System.out.print("Introduce el perimetro: ");
                perimetro=teclado1.nextFloat();

                Scanner teclado2=new Scanner(System.in);
                System.out.print("Introduce el apotema: ");
                apotema=teclado2.nextFloat();
                
                System.out.println("El área del pentagono es: " + areaP(perimetro,apotema));
                break;
            }
            case 'c': {
                Scanner teclado1=new Scanner(System.in);
                System.out.println("Introduce el lado: ");
                lado=teclado1.nextFloat();

                System.out.println("El área del cuadrado es: " + areaC(lado));
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
    }
}
