package practica84;

import java.util.Scanner;

public class Practica84 {

    public static void sleep(int time){
        try{
            Thread.sleep(time);
        } catch (InterruptedException e) {}
    }
    
    public static void main(String[] args) {
        int elecC,input=0;
        
        Cuenta c1 = new Cuenta("Ivan","García","Gálvez","53785874Y","123456789","3","15000");
        Cuenta c2 = new Cuenta("Enric","Gil","Onda","12547863M","987654321","5","8000");
        menu m1 = new menu();
        
        Scanner teclado1=new Scanner(System.in);
        System.out.print("¿Que cuenta quieres abrir?[1-2]: ");
        elecC=teclado1.nextInt();
        
        while(input!=6){
            input=m1.menu();
            switch(input){
                case 1:
                    if(elecC==1){
                        System.out.println("Datos de laa cuenta:");
                        System.out.println("Nombre: " + c1.getNom());
                        System.out.println("Apellido 1: " + c1.getAp1());
                        System.out.println("Apellido 2: " + c1.getAp2());
                        System.out.println("DNI: " + c1.getDni());
                        System.out.println("Número cuenta: " + c1.getNCuenta());
                        System.out.println("Interes: " + c1.getInteres());
                        System.out.println("Saldo: " + c1.getSaldo());
                    }
                    else{
                        System.out.println("Datos de laa cuenta:");
                        System.out.println("Nombre: " + c2.getNom());
                        System.out.println("Apellido 1: " + c2.getAp1());
                        System.out.println("Apellido 2: " + c2.getAp2());
                        System.out.println("DNI: " + c2.getDni());
                        System.out.println("Número cuenta: " + c2.getNCuenta());
                        System.out.println("Interes: " + c2.getInteres());
                        System.out.println("Saldo: " + c2.getSaldo());
                    }
                    System.out.println();
                    sleep(4000);
                    break;
                case 2:
                    if(elecC==1){
                        c1.ingreso();
                    }
                    else{
                        c2.ingreso();
                    }
                    System.out.println("Ingreso realizado con exito.");
                    System.out.println();
                    sleep(2000);
                    break;
                case 3:
                    if(elecC==1){
                        c1.retirar();
                    }
                    else{
                        c2.retirar();
                    }
                    System.out.println("Transacción realizada con exito.");
                    System.out.println();
                    sleep(2000);
                    break;
                case 4:
                    if(elecC==1){
                        c1.transfer(c2.getSaldo());
                        c2.setSaldo(c1.getSaldo());
                    }
                    else{
                        c2.transfer(c1.getSaldo());
                        c1.setSaldo(c2.getSaldo());
                        
                    }
                    System.out.println("Transacción realizada con exito.");
                    System.out.println();
                    sleep(2000);
                    break;
                case 5:
                    if(elecC==1){
                        c1.setNom();
                        c1.setAp1();
                        c1.setAp2();
                        c1.setDni();
                        c1.setNCuenta();
                        c1.setInteres();
                    }
                    else{
                        c2.setNom();
                        c2.setAp1();
                        c2.setAp2();
                        c2.setDni();
                        c2.setNCuenta();
                        c2.setInteres();
                    }
                    System.out.println("Cambios realizados con exito.");
                    System.out.println();
                    sleep(2000);
                    break;
            }
        }
    }
}
