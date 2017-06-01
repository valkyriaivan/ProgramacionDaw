package practica76;

import java.util.Scanner;
import libreriaNetbIvan.tests;

public class Practica76 {

    public static void main(String[] args) {
        int elec;
        float valor1=0,valor2=0;
        String input1, input2;

        calcular calc = new calcular();
        tests t1 = new tests();
        menu m1 = new menu();
        
        m1.mostrar();
        elec=m1.leer();
        
        if(elec>0 && elec<6){
            Scanner teclado1=new Scanner(System.in);
            System.out.print("Introduce el primer valor: ");
            input1=teclado1.nextLine();

            Scanner teclado2=new Scanner(System.in);
            System.out.print("Introduce el segundo valor: ");
            input2=teclado2.nextLine();
            
            if(t1.testFloat(input1) && t1.testFloat(input2)){
                valor1=Float.parseFloat(input1.replace(',', '.'));
                valor2=Float.parseFloat(input2.replace(',', '.'));
            }
            else{
                System.out.println("Los valores introducidos no son correctos. Introduce dos floats.");
                elec=6;
            }
        }
        
        switch(elec){
            case 1:
                calc.setDatos(valor1,valor2);
                calc.setSuma();
                System.out.println(valor1 + " + " + valor2 + " = " + calc.getSuma());
                break;
            case 2:
                calc.setDatos(valor1,valor2);
                calc.setResta();
                System.out.println(valor1 + " - " + valor2 + " = " + calc.getResta());
                break;
            case 3:
                calc.setDatos(valor1,valor2);
                calc.setMulti();;
                System.out.println(valor1 + " * " + valor2 + " = " + calc.getMulti());
                break;
            case 4:
                calc.setDatos(valor1,valor2);
                calc.setDivi();
                System.out.println(valor1 + " / " + valor2 + " = " + calc.getDivi());
                break;
            case 5:
                calc.setDatos(valor1,valor2);
                calc.setResto();
                System.out.println(valor1 + " % " + valor2 + " = " + calc.getResto());
                break;
            case 6:
                System.out.println("Saliendo...");
                break;
        }
    }
}
