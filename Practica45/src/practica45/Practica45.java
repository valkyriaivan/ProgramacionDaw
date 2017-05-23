/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica45;

/**
 *
 * @author ivan
 */
public class Practica45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j;
        int[][] matriz1 = {
            {1, 5, 7},
            {9, 2, 4},
            {5, 5, 7},
        };
        int[][] matriz2 = {
            {2, 8, 2},
            {3, 1, 6},
            {1, 5, 8},
        };

        for (i=0;i<matriz1[0].length;i++)
        {
            for (j=0;j<matriz1[1].length;j++)
            {
                matriz1[i][j] += matriz2[i][j];
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
