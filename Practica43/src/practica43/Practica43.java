/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica43;

/**
 *
 * @author ivan
 */
public class Practica43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz;
        int i,j;
        
        matriz = new int[5][5];
        
        for (i=0;i<matriz[0].length;i++)
        {
            for (j=0;j<matriz[1].length;j++)
            {
                matriz[i][j] = i+j;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
