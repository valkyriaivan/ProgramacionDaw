/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica35;

import java.math.BigDecimal;

/**
 *
 * @author ivan
 */
public class Practica35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double pi; //Declaramos variable
        double resultadoPi=0; //Declaramos e iniciamos variable
        int contador=0; //Declaramos e iniciamos variable
        
        while (contador < 1000) //Mientras contador sea inferior a 1000 
        {
            /*
            Sumamos resultadoPi y la division entre -1 elevado a contador y
            2 por contador.
            */
            resultadoPi += ((Math.pow(-1, contador))/((2*contador)+1));
            contador++; //Incrementamos contador en 1
        }
        
        pi = 4 * resultadoPi; //Pi es igual a resultadoPi por 4
        BigDecimal piBig = new BigDecimal(pi); //Creamos variable BigDecimal
        System.out.println("Pi = " + piBig); //Mostramos resultado
    }
    
}
