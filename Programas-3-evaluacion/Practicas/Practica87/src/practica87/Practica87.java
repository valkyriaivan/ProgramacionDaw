package practica87;

import java.util.Scanner;

public class Practica87 {
    
    public static void sleep(int time){
        try{
            Thread.sleep(time);
        } catch (InterruptedException e) {}
    }

    public static void main(String[] args) {
        int input=0,elecL=0;
        libros l1 = new libros("Magnus chase: La espada del tiempo.","Rick Riordan");
        libros l2 = new libros("Magnus chase: El martillo de Thor.","Rick Riordan");
        menu m1 = new menu();
        
        Scanner teclado1=new Scanner(System.in);
        System.out.print("¿Sobre que libro son las transacciones?[1-2]: ");
        elecL=teclado1.nextInt();
        
        while(input!=4){
            input=m1.menu();
            switch(input){
                case 1:
                    if(elecL==1){
                        l1.getLibros();
                        sleep(2000);
                    }
                    else{
                        l2.getLibros();
                        sleep(2000);
                    }
                    break;
                case 2:
                    if(elecL==1){
                        l1.setPrestamo();
                        sleep(2000);
                    }
                    else{
                        l2.setPrestamo();
                        sleep(2000);
                    }
                    break;
                case 3:
                    if(elecL==1){
                        l1.setDevolucion();
                        sleep(2000);
                    }
                    else{
                        l2.setDevolucion();
                        sleep(2000);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
            }
        }
    }
}
