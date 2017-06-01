package extra2;

import java.util.Scanner;

public class Extra2 {

    public static void main(String[] args) {
        Operaciones p1 = new Operaciones();
        
        Scanner teclado= new Scanner (System.in);
        
        System.out.println("¿Cuántos segundos quieres introducir?");
        p1.setsegundos(teclado.nextInt());

        p1.operacion();
        
        for(int i=0; i<5; i++){
            if(p1.gettiempoarray()[i]>0){
                System.out.println(p1.gettiempoarray()[i]+" "+p1.getnombre()[i]);
            }
        }
    }
}
