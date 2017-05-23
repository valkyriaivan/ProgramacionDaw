/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica18;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int año; //Crear integer
        String mes; //Crear variable string
        
        /*Introducimos teclado1 en la clase Scanner*/
        Scanner teclado1=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce un año: ");
        /*Lectura por texto*/
        año=teclado1.nextInt();
        
        /*Introducimos teclado2 en la clase Scanner*/
        Scanner teclado2=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce el mes (Ej. Enero): ");
        /*Lectura por texto*/
        mes=teclado2.next();
        
        /*
        Si mes es igual a uno de los nombres de mes con 31 dias, lo muestra, si no es ninguno de esos,
        comprobamos que sea un nombre de los de 30 dias y lo muestra. Si es febrero, usamos la formula
        para saber si es bisiesto el año.
        */
        if (mes == "Enero" || mes == "Marzo" || mes == "Mayo" || mes == "Julio" || mes == "Agosto" || mes == "Octubre" || mes == "Diciembre")
        {
            System.out.println(mes + " del año " + año + " tiene 31 días."); //Muestra dias, año y mes
        }
        else
        {
            if (mes == "Abril" || mes == "Junio" || mes == "Septiembre" || mes == "Noviembre")
            {
                System.out.println(mes + " del año " + año + " tiene 30 días."); //Muestra dias, año y mes
            }
            else
            {
                //Si es igual a Febrero, comprobamos si es bisiesto
                if (mes == "Febrero")
                    if ((año%100) == 0 && (año%400) == 0) //Si el año es multiplo de 100 y de 400, es bisiesto
                    {
                        System.out.println(mes + " del año " + año + " tiene 29 días."); //Muestra dias, año y mes
                    }
                    else //Si no es multiplo de 100 y 400, hacer esto
                    {
                        if (año%4 == 0 && año%100 != 0) //Si es multiplo de 4 y no de 100, es bisiesto
                        {
                            System.out.println(mes + " del año " + año + " tiene 29 días."); //Muestra dias, año y mes
                        }
                        else //Si no cumple ninguna condicion, no es bisiesto
                        {
                            System.out.println(mes + " del año " + año + " tiene 28 días."); //Muestra dias, año y mes
                        }
                    }
                else //si no introduces un mes valido, muestra mensaje de error
                {
                    System.err.println("Introduce un mes valido."); //Mensaje de error
                }
            }
        }
    }
}
