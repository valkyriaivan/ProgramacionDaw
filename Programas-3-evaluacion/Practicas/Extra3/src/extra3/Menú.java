/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra3;

import java.util.Scanner;

/**
 *
 * @author adrian
 */
public class Menú {
    /**
     * Declaro variables
     */
    private char opciones;
    private Scanner read= new Scanner(System.in);
    
    /**
     * Hago el setter
     */
    public void setMenu(){
        opciones='.';
    }
    
    /**
     * Hago el setter
     */
    public void setmostrar(){
        System.out.println("¿A qué quieres pasar los pies?");
        System.out.println("y=yardas");
        System.out.println("p=pulgadas");
        System.out.println("c=centimetros");
    }
    /**
     * Hago el setter
     */
    public void setopcion(){
        this.opciones=read.next().charAt(0);
        System.out.println();
    }
    /**
     * Hago el getter
     * @return opcion
     */
    public char getopcion(){
        return opciones;
    }
}
