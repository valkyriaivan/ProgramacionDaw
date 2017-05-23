/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica69;

import java.util.Random;

/**
 *
 * @author ivan
 */
public class Practica69 {

    public static void crearV(int[] vector) {
        Random randomGenerator = new Random();
        for (int i=0;i<vector.length;i++)
        {
            vector[i]=randomGenerator.nextInt(100);
        }
    }
    
    public static int buscaV(int[] vector){
        int mayor=0;
        for (int i=0; i<vector.length;i++)
        {
            if(vector[i]>mayor){
                mayor=vector[i];
            }
        }
        return mayor;
    }
    public static void main(String[] args) {
        int[] vector;
        int mayor;
        vector = new int[3];
        
        crearV(vector);
        mayor=buscaV(vector);
        
        System.out.println("El número más grande es: " + mayor);
    }
    
}
