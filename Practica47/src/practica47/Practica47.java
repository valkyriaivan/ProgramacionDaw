/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica47;

import java.util.Arrays;

/**
 *
 * @author ivan
 */
public class Practica47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz;
        int i,j;
        matriz = new int[8][6];
        
        for (i=0;i<matriz.length;i++)
        {
            for (j=0;j<matriz[0].length;j++)
            {
                if ((i == 0) || (i==(matriz.length-1)) || (j == 0) || (j==(matriz[0].length-1)))
                {
                    matriz[i][j] = 1;
                }
                else 
                {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
