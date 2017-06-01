package practica86;

import java.util.Scanner;
import libreriaNetbIvan.convertir;
import libreriaNetbIvan.tests;

public class contador {
    private int cont,i,value;
    private String input;
    tests t1 = new tests();
    convertir con1 = new convertir();
    
    public void contador(int cont){
        this.cont=cont;
    }
    public void setCont(){
        cont=value;
    }
    public void getCont(){
        System.out.println("El contador está en: " + cont);
        System.out.println();
    }
    public void incrementar(){
        System.out.println("Contador incrementado " + value);
        for(i=0;i<=value;i++){
            System.out.print(cont + " ");
            cont+=1;
        }
        System.out.println();
    }
    public void decrementar(){
        System.out.println("Contador decrementado " + value);
        for(i=0;i<=value;i++){
            System.out.print(cont + " ");
            cont-=1;
        }
        System.out.println();
    }
    public void setValue(){
        Scanner teclado1=new Scanner(System.in);
        System.out.print("Introduce la cantidad: ");
        input = teclado1.nextLine();
        
        if(t1.testInt(input)){
            value=con1.convInt(input);
        }
    }
}
