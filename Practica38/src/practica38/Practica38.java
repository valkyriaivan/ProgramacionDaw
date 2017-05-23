/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica38;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] numerosArray;
        double numeroInput,positivos,negativos,ceros,resultado;
        int i,contadorP,contadorN,contadorC;
        positivos=0;
        negativos=0;
        ceros=0;
        resultado=0;
        contadorP=0;
        contadorN=0;
        contadorC=0;
        
        
        numerosArray = new double[10];
        /*
        positivos = new double[10];
        negativos = new double[10];
        ceros = new double[10];
        */
        
        for(i=0;i<numerosArray.length;i++)
        {
            /*Introducimos teclado1 en la clase Scanner*/
            Scanner teclado1=new Scanner(System.in);
            /*Pedimos imput del usuario perimetro*/
            System.out.println("Introduce un número: ");
            /*Lectura por texto*/
            numeroInput=teclado1.nextDouble();
            
            numerosArray[i]=numeroInput;
            teclado1.reset();
            System.out.flush();
        }
        for(i=0;i<numerosArray.length;i++)
        {            
            if (numerosArray[i] > 0)
            {
                positivos += numerosArray[i];
                contadorP++;
            }
            else if (numerosArray[i] < 0)
            {
                negativos+=numerosArray[1];
                contadorN++;
            }
            else if (numerosArray[i] == 0)
            {
                contadorC++;
            }
            else
            {
                System.err.println("Valor incorrecto");
            }
        }
        resultado= positivos / contadorP;
        System.out.println("Hay "+ contadorP + " números positivos. Su media es: " + resultado);
        resultado= negativos / contadorN;
        System.out.println("Hay "+ contadorN + " números negativos. Su media es: " + resultado);
        System.out.println("Hay "+ contadorC + " ceros.");
    }
    
}
