/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica44;

/**
 *
 * @author ivan
 */
public class Practica44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j,cont;
        cont=0;
        int[][] matriz = {
            {1, 4, 7, 5},
            {4, 6, 7, 1},
            {7, 7, 3, 4},
            {5, 1, 4, 4}
        };
        
        for (i=0;i<matriz[0].length;i++)
        {
            for (j=0;j<matriz[1].length;j++)
            {
                if (matriz[i][j] != matriz[j][i])
                {
                    cont=1;
                }
            }
        }
        if (cont==0)
        {
            System.out.println("La matriz es simetrica.");
        }
        else
        {
            System.out.println("La matriz no es simetrica.");
        }
    }
}