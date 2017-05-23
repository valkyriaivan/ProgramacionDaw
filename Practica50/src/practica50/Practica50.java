/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica50;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j,k,l;
        
        char seleccion = '.';
        float dorsal,m16,m15,m14;
        float[][] matriz = new float[10][4];
        float[] ordenado = new float [10];
        
        while (seleccion != 'f')
        {
            System.out.println("¿Que acción quieres realizar?");
            System.out.println("--------------");
            System.out.println("i - Inscribir participantes");
            System.out.println("d - Mostrar listado de dorsales");
            System.out.println("m - Mostrar listado de marcas 2016");
            System.out.println("f - Finalizar");

            /*Introducimos teclado1 en la clase Scanner*/
            Scanner teclado1=new Scanner(System.in);
            /*Pedimos imput del usuario perimetro*/
            System.out.println("¿Que quieres hacer?: ");
            /*Lectura por texto*/
            seleccion=teclado1.next(".").charAt(0);
            
            switch (seleccion)
            {
            case 'i':

                for (i=0;i<matriz.length;i++)
                {
                    for (j=0;j<matriz.length;j++)
                    {
                        switch (j)
                        {
                            case 0:
                                Scanner teclado2=new Scanner(System.in);
                                System.out.println("Introduce dorsal del atleta nº " + i +":");
                                dorsal=teclado2.nextFloat();
                                matriz[i][j]=dorsal;
                                break;
                            case 1:
                                Scanner teclado3=new Scanner(System.in);
                                System.out.println("Introduce la mejor marca en 2016: ");
                                m16=teclado3.nextFloat();
                                matriz[i][j]=m16;
                                break;
                            case 2:
                                Scanner teclado4=new Scanner(System.in);
                                System.out.println("Introduce la mejor marca en 2015: ");
                                m15=teclado4.nextFloat();
                                matriz[i][j]=m15;
                                break;

                            case 3:
                                Scanner teclado5=new Scanner(System.in);
                                System.out.println("Introduce la mejor marca en 2014: ");
                                m14=teclado5.nextFloat();
                                matriz[i][j]=m14;
                                break;
                        }
                    }
                }
                break;
            case 'd': 
                for (i = 0; i < 10; i++)
                    ordenado[i]=matriz[1][0];
                
                Arrays.sort(ordenado);
                System.out.println("Los dorsales apuntados son los:");
                for (i = 0; i < 10; i++)
                    System.out.println(ordenado[i]);
                break;
            case 'm':
                
                break;
            case 'f':
                
                break;
            default:
                System.err.println("No has introducido ningun caracter valido.");
                break;
            }
        }
    }
    
}
