/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica66;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica66 {

    public static void crearV(int[] vector) {
        Random randomGenerator = new Random();
        for (int i=0;i<vector.length;i++)
        {
            vector[i]=randomGenerator.nextInt(100);
        }
    }
    public static int[] ordenarV(int[] vector){
        int aux;
        for(int i=0; i<vector.length;i++){
            for(int j=i+1; j<vector.length; j++){
                if(vector[j]< vector[i]){
                    aux= vector[i];
                    vector[i]=vector[j];
                    vector[j]=aux;
                }
            }
        }
        return vector;
    }
    public static void main(String[] args) {
        int[] vector;
        int tamaño;
        
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Introduce el tamaño del vector: ");
        tamaño=teclado1.nextInt();
        
        vector = new int[tamaño];
        
        crearV(vector);
        vector=ordenarV(vector);
        
        System.out.print("El vector ordenado: ");
        for(int i=0; i<vector.length;i++){
            if (i == vector.length-1){
                System.out.print(vector[i] + ".");
            }
            else{
                System.out.print(vector[i] + ", ");
            }
        }
    }
}
