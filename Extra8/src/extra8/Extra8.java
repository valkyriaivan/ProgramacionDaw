/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra8;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int año,dia;
        String mes;
        
        /*Introducimos teclado1 en la clase Scanner*/
        Scanner teclado1=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce un año: ");
        /*Lectura por texto*/
        año=teclado1.nextInt();
        
        /*Introducimos teclado1 en la clase Scanner*/
        Scanner teclado2=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce el mes (Ej. Enero): ");
        /*Lectura por texto*/
        mes=teclado2.next();
        
        /*Introducimos teclado1 en la clase Scanner*/
        Scanner teclado3=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce un dia: ");
        /*Lectura por texto*/
        dia=teclado3.nextInt();
        
        
        if ("Enero".equals(mes) || "Marzo".equals(mes) || "Mayo".equals(mes) || "Julio".equals(mes) || "Agosto".equals(mes) || "Octubre".equals(mes) || "Diciembre".equals(mes))
        {
            if (dia <= 31)
            {
                System.out.println(dia + " de " + mes + " del " + año + " es una fecha valida.");
            }
            else
            {
                System.err.println(dia + " de " + mes + " del " + año + " no es una fecha valida.");
            }
        }
        else
        {
            if ("Abril".equals(mes) || "Junio".equals(mes) || "Septiembre".equals(mes) || "Noviembre".equals(mes))
            {
                if (dia <= 30)
                {
                    System.out.println(dia + " de " + mes + " del " + año + " es una fecha valida.");
                }
                else
                {
                    System.err.println(dia + " de " + mes + " del " + año + " no es una fecha valida.");
                }
            }
            else
            {
                if ("Febrero".equals(mes))
                    if ((año%100) == 0 && (año%400) == 0)
                    {
                        if (dia <= 29)
                        {
                            System.out.println(dia + " de " + mes + " del " + año + " es una fecha valida.");
                        }
                        else
                        {
                            System.err.println(dia + " de " + mes + " del " + año + " no es una fecha valida.");
                        }
                    }
                    else
                    {
                        if (año%4 == 0 && año%100 != 0)
                            if (dia <= 29)
                            {
                                System.out.println(dia + " de " + mes + " del " + año + " es una fecha valida.");
                            }
                            else
                            {
                                System.err.println(dia + " de " + mes + " del " + año + " no es una fecha valida.");
                            } 
                        else
                        {
                            if (dia <= 28)
                            {
                                System.out.println(dia + " de " + mes + " del " + año + " es una fecha valida.");
                            }
                            else
                            {
                                System.err.println(dia + " de " + mes + " del " + año + " no es una fecha valida.");
                            }
                        }
                    }
                else
                {
                    System.err.println("Introduce un mes valido.");
                }
            }
        }
    }
    
}
