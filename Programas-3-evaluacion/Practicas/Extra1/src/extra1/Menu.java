
package extra1;

import java.util.Scanner;

public class Menu {
    private char opciones;
    private Scanner read= new Scanner(System.in);
    /**
     * Constructor por defecto
     */
    public void setMenu(){
        opciones='.';
    }
    /**
     * Mostrar menu
     */
    public void setmostrar(){
        System.out.println("a=hipotenusa");
        System.out.println("b=cateto1");
        System.out.println("c=cateto2");
    }
    /**
     * Pedir input
     */
    public void setopcion(){
        this.opciones=read.next().charAt(0);
        System.out.println();
    }
    /**
     * @return opciones
     */
    public char getopcion(){
        return opciones;
    }
}
