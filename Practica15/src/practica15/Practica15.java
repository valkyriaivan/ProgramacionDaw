/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica15;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float sueldo,precioHora,precioHoraEx,horas,impuestos; //Creamos variables
        
        /*Introducimos teclado1 en la clase Scanner*/
        Scanner teclado1=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce precio por hora: ");
        /*Lectura por texto*/
        precioHora=teclado1.nextFloat();
        
        /*Introducimos teclado2 en la clase Scanner*/
        Scanner teclado2=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("Introduce horas trabajadas: ");
        /*Lectura por texto*/
        horas=teclado2.nextFloat();
        
        if (horas >= 38) //Si trabaja más de 38 horas aplicamos las horas extra
        {
            precioHoraEx=(float) (precioHora+(precioHora*0.5)); //Sacamaos el precio por hora extra
            sueldo= (38*precioHora)+((horas-38)*precioHoraEx); //Sacamos el sueldo con las horas extra
        }
        else //Si no llega a las 38, no aplicamos horas extra
        {
            sueldo= precioHora*horas; 
        }
        
        System.out.println("El sueldo bruto es: " + sueldo + "€"); //Mostramos el sueldo bruto, sin tasas.
        
        if (sueldo > 300) //Si cobra más de 300, se le aplica una tasa del 0.1
        {
            impuestos=(float) (sueldo * 0.1); //Cantidad a quitar del sueldo
            System.out.println("Tienes que pagar " + impuestos + "€ de impuestos."); //Mostrar cantidad de tasa
            impuestos=sueldo-impuestos; //Calcular sueldo neto
            System.out.println("El sueldo neto es: " + impuestos + "€"); //Mostrar sueldo neto
        }
        else //Si no llega a 300€, no se le aplica tasa
        {
            impuestos=(float) (sueldo * 0); //Sacamos una tasa de 0€
            System.out.println("Tienes que pagar " + impuestos + "€ de impuestos."); //Mostrar que no hay tasa
            System.out.println("El sueldo neto es: " + sueldo + "€"); //Mostrar sueldo neto
        }
    }
}
