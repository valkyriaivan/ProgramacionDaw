/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica48;

/**
 *
 * @author ivan
 */
public class Practica48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j,resultado;
        resultado=0;
        int[][] matriz = {
            {1, 4, 7, 5, 8, 9, 1, 6, 9, 4},
            {4, 6, 7, 1, 4, 7, 5, 8, 9, 1},
            {7, 7, 3, 4, 4, 6, 7, 1, 5, 6},
            {5, 1, 4, 4, 1, 4, 7, 5, 8, 5},
            {1, 4, 7, 5, 7, 3, 4, 4, 1, 6},
            {4, 6, 7, 1, 4, 7, 5, 4, 6, 7},
            {7, 7, 3, 4, 7, 7, 3, 4, 6, 2},
            {4, 6, 7, 1, 4, 7, 5, 8, 9, 1},
            {1, 4, 7, 5, 4, 6, 7, 1, 5, 6},
            {4, 6, 7, 1, 4, 7, 5, 8, 5, 8},
        };
        for (i=0;i<matriz.length;i++)
        {
            for (j=0;j<matriz[0].length;j++)
            {
                resultado += matriz[i][j];
            }
            System.out.println("El resultado de la fila " + i + " es: " + resultado);
            resultado= 0;
        }
        for (j=0;j<matriz[0].length;j++)
        {
            for (i=0;i<matriz.length;i++)
            {
                resultado += matriz[i][j];
            }
            System.out.println("El resultado de la columna " + j + " es: " + resultado);
            resultado= 0;
        }
    }
}
