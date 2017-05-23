/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica65;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica65 {

    public static void crearV(int[] vector) {
        Random randomGenerator = new Random();
        for (int i=0;i<vector.length;i++)
        {
            vector[i]=randomGenerator.nextInt(1000000);
        }
    }
    public static void main(String[] args) {
        int[] vector;
        int tamaño;
        
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Introduce el tamaño del vector: ");
        tamaño=teclado1.nextInt();
        
        vector = new int[tamaño];
        
        crearV(vector);
        
        System.out.println("Vector creado correctamente.");
    }
}
