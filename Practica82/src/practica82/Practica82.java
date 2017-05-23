package practica82;

import java.util.Arrays;
import java.util.Scanner;
import libreriaNetbIvan.convertir;
import libreriaNetbIvan.tests;

public class Practica82 {

    public static void main(String[] args) {
        int dinero;
        String input;
        int[] resultado = new int[9];
        int[] billetes = {500,200,100,50,20,10,5,2,1};
        
        calcularDinero cD = new calcularDinero();
        tests t1 = new tests();
        convertir con1 = new convertir();
        
        
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Introduce la cantidad de dinero(sin centimos): ");
        input=teclado1.nextLine();
        
        if(t1.testInt(input)){
            dinero=con1.convInt(input);
            if(dinero>0){
                cD.setDatos(dinero);
                cD.setBilletes();
                resultado=cD.getBilletes();
                System.out.println(dinero + "€ se desglosa en estos billetes/monedas:");
                for (int i=0;i<resultado.length;i++)
                {
                    System.out.println(billetes[i] + "€ = " + resultado[i]);
                }
            }
            else{
                System.err.println("No puedes introducir una cantidad negativa.");
            }
        }
        else{
            System.err.println("Introduce una cantidad de dinero sin centimos.");
        }
        
    }
}
