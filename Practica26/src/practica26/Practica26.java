/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica26;

/**
 *
 * @author ivan
 */
public class Practica26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sumaInpar,contar,contadorInpar; //Declaramos variables
        
        contar = 1; //Iniciamos variable con valor 1
        sumaInpar = 0; //Iniciamos variable con valor 0
        contadorInpar = 1; //Iniciamos variable con valor 1
        
        while (contadorInpar <= 20) //Mientras variable sea menos o igual
        {
            if (contar%2 != 0) //Si el resto no es 0
            {
                sumaInpar += contar; //Sumamos el valor de la variables mas el de contar
                contadorInpar++; //Sumamos 1 a el contadorInpar
            }
            contar++; //Sumamos 1 a contar
        }
        System.out.println("La suma de los primeros 20 números impares es: " + sumaInpar);  //Ostramos resultado
    }
}
