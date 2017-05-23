package practica74;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica74 {
    public static int menu() {
        Scanner teclado1=new Scanner(System.in);
        System.out.println("¿Que quieres hacer?");
        System.out.println();
        System.out.println("1 - Añadir cantidad");
        System.out.println("2 - Finalizar");
        System.out.println();
        System.out.println("Acción a realizar: ");
        
        return teclado1.nextInt();
    }
    public static ArrayList addCantidad(ArrayList<Long> listaCantidad) {
        String eleccion= "si";
        long cantidadLong;
        boolean test;
        String cantidad;
        
        while("si".equals(eleccion)){
            Scanner teclado1=new Scanner(System.in);
            System.out.println("Quieres añadir una cantidad?[si/no]: ");
            eleccion=teclado1.nextLine();
            
            if(eleccion.equals("si")||eleccion.equals("Si")){
                Scanner teclado2=new Scanner(System.in);
                System.out.println("Cantidad de personas: ");
                cantidad=teclado2.nextLine();
                
                test=cantidad.matches("^[0-9]*$");
                
                if(test){
                    cantidadLong=Long.parseLong(cantidad);
                    listaCantidad.add(cantidadLong);
                }
                else{
                    System.err.println("No has introducido una cantidad valida.");
                }
                
                /*
                try
                {
                  System.out.println("Cantidad de personas: ");
                  cantidad=teclado2.nextInt();
                  if(cantidad>0){
                      listaCantidad.add(cantidad);
                  }
                  else{
                      System.err.println("La cantidad no puede ser negativa.");
                  }
                }
                catch(InputMismatchException exception)
                {
                  System.err.println("No has introducido una cantidad valida.");
                }
                */
            }
        }
        return listaCantidad;
    }
    public static void main(String[] args) {
        ArrayList<Long> listaCantidad = new ArrayList<>();
        int eleccion=0;
        
        while(eleccion!=2){

            eleccion=menu();
            
            switch(eleccion){
                case 1:{
                    addCantidad(listaCantidad);
                    break;
                }
                case 2:{
                    System.out.println("Saliendo...");
                    break;
                }
                default:{
                    System.err.println("Introduce una acción valida.");
                    break;
                }
            }
        }
    }
}
