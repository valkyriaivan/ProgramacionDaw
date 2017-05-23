/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica49;

/**
 *
 * @author ivan
 */
public class Practica49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j,k;
        int[][][] matriz3d = new int[9][9][9];
        
        for (k=0;k<matriz3d.length;k++)
        {
            for (i=0;i<matriz3d.length;i++)
            {
                for (j=0;j<matriz3d[0].length;j++)
                {
                    if (k == 0 || k == matriz3d.length-1)
                    {
                        if ((i == 0) || (i==(matriz3d.length-1)) || (j == 0) || (j==(matriz3d[0].length-1)))
                        {
                            matriz3d[k][i][j] = 1;
                        }
                        else 
                        {
                            matriz3d[k][i][j] = 0;
                        }
                        System.out.print(matriz3d[k][i][j] + " ");
                    }
                    else
                    {
                        if ((i==0 && (j==0 || j==matriz3d.length-1)) || (i==matriz3d[0].length-1 && (j==0 || j==matriz3d.length-1)))
                        {
                            matriz3d[k][i][j] = 1;
                        }
                        else 
                        {
                            matriz3d[k][i][j] = 0;
                        }
                        System.out.print(matriz3d[k][i][j] + " ");
                    }
                }
                System.out.println();
            }
        System.out.println();
        }
    }
}