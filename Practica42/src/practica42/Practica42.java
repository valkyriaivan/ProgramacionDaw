 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica42;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Practica42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos variables
        char accion;
        int evaluacion,i,alumno;
        float resultado=0; 
        int cuenta=0;
        int [][] grupo;
        grupo = new int[][] { {1,10,9,8}, {2,6,5,4}, {3,5,5,4}, {4,7,6,9}, {5,9,8,6} };
                
        //Mostramos mensaje por pantalla con opciones
        System.out.println("¿Qué quieres hacer?");
        System.out.println("--------------");
        System.out.println("g - Nota media grupo");
        System.out.println("a - Nota media alumno");
        
        /*Introducimos teclado2 en la clase Scanner*/
        Scanner teclado1=new Scanner(System.in);
        /*Pedimos imput del usuario perimetro*/
        System.out.println("¿Qué acción quieres realizar?: ");
        /*Lectura por texto*/
        accion=teclado1.next(".").charAt(0);
        
        switch (accion)
        {
            case 'g':
                //Mostramos mensaje por pantalla con opciones
                System.out.println("¿De que evaluación quieres la media?");
                System.out.println("--------------");
                System.out.println("1 - Primera evaluación");
                System.out.println("2 - Segunda evaluación");
                System.out.println("3 - Tercera evaluación");
                
                /*Introducimos teclado2 en la clase Scanner*/
                Scanner teclado2=new Scanner(System.in);
                /*Pedimos imput del usuario perimetro*/
                System.out.println("¿Qué evaluación quieres?: ");
                /*Lectura por texto*/
                evaluacion=teclado2.nextInt();
                
                switch (evaluacion)
                {
                    case 1:
                        for (i=0;i<grupo.length;i++)
                        {
                            resultado += grupo[i][1];
                        }
                        resultado = resultado / grupo.length;
                        System.out.println("La media de la primera evaluación es: " + resultado);
                        break;
                    case 2:
                        for (i=0;i<grupo.length;i++)
                        {
                            resultado += grupo[i][2];
                        }
                        resultado = resultado / grupo.length;
                        System.out.println("La media de la segunda evaluación es: " + resultado);
                        break;
                    case 3:
                        for (i=0;i<grupo.length;i++)
                        {
                            resultado += grupo[i][3];
                        }
                        resultado = resultado / grupo.length;
                        System.out.println("La media de la tercera evaluación es: " + resultado);
                        break;
                    default:
                    {
                        System.err.println("Número de evaluación incorrecto.");
                    }    
                }
                break;
            case 'a':
                /*Introducimos teclado2 en la clase Scanner*/
                Scanner teclado3=new Scanner(System.in);
                /*Pedimos imput del usuario perimetro*/
                System.out.println("¿Qué alumno quieres?: ");
                /*Lectura por texto*/
                alumno=teclado3.nextInt();
                
                if ((alumno >= 0) && (alumno < grupo.length))
                {
                    for (i=1;i<grupo[alumno].length;i++)
                    {
                        resultado += grupo[alumno][i];
                        cuenta++;
                    }
                    resultado = resultado / cuenta;
                    System.out.println("La media las evalucaciones del alumno: " + alumno + " es: " + resultado);
                }
                else
                {
                    System.err.println("No existe tal alumno.");
                }
                break;
        }
    }
}