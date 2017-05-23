package practica75;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica75 {
    public static int menu() {
        Scanner teclado1=new Scanner(System.in);
        System.out.println("¿Que quieres hacer?");
        System.out.println();
        System.out.println("1 - Ver todas");
        System.out.println("2 - Ver una");
        System.out.println("3 - Introducir");
        System.out.println("4 - Modificar");
        System.out.println("5 - Borrar");
        System.out.println("6 - Finalizar");
        System.out.println();
        System.out.println("Acción a realizar: ");
        
        return teclado1.nextInt();
    }
    public static ArrayList borrarCiudades(ArrayList<String> listaCiudades) {
        if (listaCiudades.isEmpty()){
            System.err.println("El array está vacio.");
        }
        else{
            listaCiudades.clear();
        }
        return listaCiudades;
    }
    public static ArrayList borrarCantidad(ArrayList<Long> listaCantidad) {
        if (listaCantidad.isEmpty()){
            System.err.println("El array está vacio.");
        }
        else{
            listaCantidad.clear();
        }
        return listaCantidad;
    }
    public static void mostrarCiudades(ArrayList<String> listaCiudades, ArrayList<Long> listaCantidad) {
        int i;
        
        if (listaCiudades.isEmpty()){
            System.err.println("El array está vacio.");
        }
        else{
            System.out.println("Están estas ciudades en la lista:");
            for(i=0;i<listaCiudades.size();i++){
                System.out.println(listaCiudades.get(i) + "-" + listaCantidad.get(i));
            }
        }
    }
    
    public static void mostrarCiudad(ArrayList<String> listaCiudades, ArrayList<Long> listaCantidad) {
        int i;
        
        if (listaCiudades.isEmpty()){
            System.err.println("El array está vacio.");
        }
        else{
            Scanner teclado1=new Scanner(System.in);
            System.out.println("Introduce el indice de la ciudad:");
            i=teclado1.nextInt();
            System.out.println(listaCiudades.get(i) + "-" + listaCantidad.get(i));
        }
    }
    
    public static ArrayList modCiudad(ArrayList<String> listaCiudades, int i) {
        String ciudad;
        
        if (i>0 && 1<listaCiudades.size()){
            Scanner teclado2=new Scanner(System.in);
            System.out.println("Introducir nombre ciudad: ");
            ciudad=teclado2.nextLine();
            if(testCiudad(ciudad)){
                listaCiudades.add(i, ciudad);
            }
            else{
                System.err.println("Introduce un nombre valido.");
            }
        }
        else{
            System.out.println("No hay ninguna ciudad en ese indice.");
        }
        return listaCiudades;
    }
    public static ArrayList modCantidad(ArrayList<Long> listaCantidad,int i) {
        long cantidadLong;
        boolean test;
        String cantidad;
        
        if (i>0 && 1<listaCantidad.size()){
            Scanner teclado3=new Scanner(System.in);
            System.out.println("Introducir cantidad personas: ");
            cantidad=teclado3.nextLine();
            if(testCiudad(cantidad)){
                cantidadLong = Long.parseLong(cantidad);
                listaCantidad.add(i, cantidadLong);
            }
            else{
                System.err.println("Introduce un nombre valido.");
            }
        }
        else{
            System.out.println("No hay ninguna ciudad en ese indice.");
        }
        return listaCantidad;
    }
    public static boolean testCiudad(String ciudad) {
        boolean test=ciudad.matches("^([A-ZÑÁÉÍÓÚ][a-zñáéíóú]+)(\\s[A-ZÑÁÉÍÓÚ][a-zñáéíóú]+)*$");
        return test;
    }
    public static boolean testCantidad(String cantidad) {
        boolean test=cantidad.matches("^[0-9]*$");
        return test;
    }
    public static ArrayList addCiudad(ArrayList<String> listaCiudades) {
        String ciudad;
        
        Scanner teclado2=new Scanner(System.in);
        System.out.println("Nombre de la ciudad: ");
        ciudad=teclado2.nextLine();       
        if(testCiudad(ciudad)){
            if(listaCiudades.contains(ciudad)){
                System.out.println("Esa ciudad ya está en la lista.");
            }
            else{
                listaCiudades.add(ciudad);
            }
        }
        else{
            System.err.println("Introduce un nombre valido.");
        }
        return listaCiudades;
    }
    public static ArrayList addCantidad(ArrayList<Long> listaCantidad) {
        long cantidadLong;
        boolean test;
        String cantidad;

        Scanner teclado2=new Scanner(System.in);
        System.out.println("Cantidad de personas: ");
        cantidad=teclado2.nextLine();
              
        if(testCantidad(cantidad)){
            cantidadLong=Long.parseLong(cantidad);
            listaCantidad.add(cantidadLong);
        }
        else{
            System.err.println("No has introducido una cantidad valida.");
        }    
        return listaCantidad;
    }
    
    public static void main(String[] args) {
        ArrayList<String> listaCiudades = new ArrayList<>();
        ArrayList<Long> listaCantidad = new ArrayList<>();
        int eleccion=0, i;
        String test;
        
        while(eleccion!=6){

            eleccion=menu();
            
            switch(eleccion){
                case 1:{
                    mostrarCiudades(listaCiudades,listaCantidad);
                    break;
                }
                case 2:{
                    mostrarCiudad(listaCiudades, listaCantidad);
                    break;
                }
                case 3:{
                    listaCiudades=addCiudad(listaCiudades);
                    listaCantidad=addCantidad(listaCantidad);
                    System.out.println();
                    System.out.println("Ciudades añadidas.");
                    break;
                }
                case 4:{
                    Scanner teclado1=new Scanner(System.in);
                    System.out.println("Introduce el indice de la ciudad a modificar:");
                    i=teclado1.nextInt();
                    
                    listaCiudades=modCiudad(listaCiudades, i);
                    listaCantidad=modCantidad(listaCantidad, i); 
                    System.out.println();
                    System.out.println("Ciudades modificadas.");
                    break;
                }
                case 5:{
                    listaCiudades=borrarCiudades(listaCiudades);
                    listaCantidad=borrarCantidad(listaCantidad);
                    System.out.println();
                    System.out.println("Ciudades borradas.");
                    break;
                }
                case 6:{
                    System.err.println("Saliendo....");
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
