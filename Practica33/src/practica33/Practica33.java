/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica33;

/**
 *
 * @author ivan
 */
public class Practica33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador=2; //Declaramos e iniciamos la variables
        int resultado=0; //Declaramos e iniciamos la variables
        
        while (contador <= 10000) //Mientras contador sea menor o igual a 10000
        {
            if (contador%2 == 0) //Si el resto es igual a 0
            {
                resultado += contador; //Sumar resultado y contador
            }
            contador++; //Sumamos a contador
        }
        System.out.println("La suma de los numeros entre 2 y 10000 es :" + resultado); //MOstramos resultado
    }
}
