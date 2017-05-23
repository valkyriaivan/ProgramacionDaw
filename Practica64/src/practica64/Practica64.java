/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica64;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica64 {

    public static void crearV(int[] vector) {
        Random randomGenerator = new Random();
        for (int i=0;i<vector.length;i++)
        {
            vector[i]=randomGenerator.nextInt(1000000);
        }
    }
    
    public static boolean buscarV(int[] vector, int busqueda) {
        int i;
        boolean temp=false;

        for (i=0;i<vector.length;i++)
        {
            if (busqueda==vector[i]){
                temp= true;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] vector;
        int tamaño, busqueda;
        boolean respuesta;
        
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Introduce el tamaño del vector: ");
        tamaño=teclado1.nextInt();
        
        vector = new int[tamaño];
        
        crearV(vector);
        
        Scanner teclado2=new Scanner(System.in);
        System.out.print("¿Que numero quieres buscar?: ");
        busqueda=teclado2.nextInt();
        
        respuesta=buscarV(vector, busqueda);
        
        if (respuesta==true)
        {
            System.out.println("El número " + busqueda + " está en el vector");
        }
        else 
        {
            System.err.println("El número " + busqueda + " no está en el vector");
        }
    }
}
