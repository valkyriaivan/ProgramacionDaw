/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica46;

/**
 *
 * @author ivan
 */
public class Practica46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz;
        int i,j,diagonal;
        diagonal = 0;
        matriz = new int[7][7];
        
        for (i=0;i<matriz[0].length;i++)
        {
            for (j=0;j<matriz[1].length;j++)
            {
                if ((i==diagonal) && (j==diagonal))
                {
                    matriz[i][j] = 1; 
                }
                else 
                {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
            diagonal++;
            System.out.println();
        }
    }
}
