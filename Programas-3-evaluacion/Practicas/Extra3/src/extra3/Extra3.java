package extra3;

import java.util.Scanner;

public class Extra3 {

    public static void main(String[] args) {
        Menú p1 = new Menú();
        Operaciones p2 = new Operaciones();
        
        Scanner teclado= new Scanner (System.in);
        
        System.out.println("¿Cuantos pies tienes? ");
        p2.setpies(teclado.nextDouble());
        
        p1.setmostrar();
        p1.setopcion();
        
       switch(p1.getopcion()){
           case 'y':
                p2.opeyardas();
                
                System.out.println("La cantidad de yardas es "+p2.getyardas());
                break;
            
           case 'p':
                p2.opepulgadas();

                System.out.println("La cantidad de pulgadas es "+p2.getpulgadas());
                break;
            
           case 'c':
                p2.opecentimetros();
                
                System.out.println("La cantidad de centimetros es "+p2.getcentimetros());
                break;
       }
    }
}
