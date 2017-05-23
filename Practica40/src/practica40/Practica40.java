/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica40;

import java.util.Arrays;

/**
 *
 * @author ivan
 */
public class Practica40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        
        int[] primerArray,segundoArray,finalArray;
        
        primerArray = new int[] {0,2,4,6,8,10,12,14,16,18};
        segundoArray = new int[] {1,3,5,7,9,11,13,15,17,19};
        finalArray = new int[20];
        int i;
        
        //System.arraycopy( primerArray, 0, finalArray, 0, primerArray.length );
        //System.arraycopy( segundoArray, 0, finalArray, 10, primerArray.length );
        
        for(i=0;i<primerArray.length;i++)
        {
            finalArray[i]=primerArray[i];
        }
        
        for(i=0;i<segundoArray.length;i++)
        {
            finalArray[i+(primerArray.length-1)]=segundoArray[i]; 
        }
        
        //Arrays.sort(finalArray);
        
        for (i = 0; i < finalArray.length; i++) {
            for (int j = i + 1; j < finalArray.length; j++) {
		int tmp = 0;
		if (finalArray[i] > finalArray[j]) {
			tmp = finalArray[i];
			finalArray[i] = finalArray[j];
			finalArray[j] = tmp;
		}
            }
        }
        
        System.out.println("El primer array es:");
        System.out.println(Arrays.toString(primerArray));
        
        System.out.println("El segundo array es:");
        System.out.println(Arrays.toString(segundoArray));
        
        System.out.println("El array final ordenado es:");
        System.out.println(Arrays.toString(finalArray));
    }
}
