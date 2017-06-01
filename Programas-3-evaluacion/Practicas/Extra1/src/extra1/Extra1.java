package extra1;

import java.util.Scanner;

public class Extra1 {

    public static void main(String[] args) {
        Menu p1 = new Menu();
        Operaciones p2 = new Operaciones();
        
        Scanner teclado= new Scanner (System.in);
        
        p1.setmostrar();
        p1.setopcion();
        
       switch(p1.getopcion()){
           case 'a':
                System.out.println("Introduce el primer cateto");
                p2.setcateto1(teclado.nextDouble());
        
                System.out.println("Introduce el segundo cateto");
                p2.setcateto2(teclado.nextDouble());
        
                p2.operacion1();
                
                System.out.println("El resultado de la hipotenusa es "+p2.gethipotenusa());
                break;
            
           case 'b':
                System.out.println("Introduce la hipotenusa");
                p2.sethipotenusa(teclado.nextDouble());
        
                System.out.println("Introduce el segundo cateto");
                p2.setcateto2(teclado.nextDouble());
        
                p2.operacion2();
                
                System.out.println("El resultado del primer cateto es "+p2.getcateto1());
                break;
            
           case 'c':
                System.out.println("Introduce el primer cateto");
                p2.setcateto1(teclado.nextDouble());
        
                System.out.println("Introduce la hipotenusa");
                p2.sethipotenusa(teclado.nextDouble());
        
                p2.operacion1();
                
                System.out.println("El resultado del segundo cateto es "+p2.getcateto2());
                break;
       }
    }
}
