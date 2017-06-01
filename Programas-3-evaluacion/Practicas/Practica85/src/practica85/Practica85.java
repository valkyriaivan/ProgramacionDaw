package practica85;

import java.util.ArrayList;
import java.util.Scanner;

public class Practica85 {
    
    public static void sleep(int time){
        try{
            Thread.sleep(time);
        } catch (InterruptedException e) {}
    }
    
    public static void main(String[] args) {
        int creaC=1,i,indexC=-1,inputM=0,indexCT=-1;
        String nom,ap1,ap2,dni,nCuenta,interes,saldo,inputC,inputCT;
        ArrayList<CuentaArray> cuentas = new ArrayList<>();
        Scanner input=new Scanner(System.in);
        Menu m1 = new Menu();
        
        while(creaC!=0){
            System.out.println("¿Quieres crea una cuenta?[0=no | 1=sí]: ");
            creaC=input.nextInt();
            if(creaC==1){
                System.out.println("Nombre: ");
                nom=input.nextLine();
                System.out.println("Apellido1: ");
                ap1=input.nextLine();
                System.out.println("Apellido2: ");
                ap2=input.nextLine();
                System.out.println("DNI: ");
                dni=input.nextLine();
                System.out.println("Número cuenta: ");
                nCuenta=input.nextLine();
                System.out.println("Interes: ");
                interes=input.nextLine();
                System.out.println("Saldo: ");
                saldo=input.nextLine();
                
                cuentas.add(new CuentaArray(nom,ap1,ap2,dni,nCuenta,interes,saldo));
            }
        }
        System.out.println();
        System.out.print("Introduce el número de la cuenta: ");
        inputC=input.nextLine();
        
        for(i=0;i<cuentas.size();i++){
            if(inputC.equals(cuentas.get(i).getNCuenta())){
                indexC=i;
            }
        }
        if(indexC!=-1){
            while(inputM!=6){
                inputM=m1.menu();
                switch(inputM){
                    case 1:

                        System.out.println("Datos de la cuenta:");
                        System.out.println("Nombre: " + cuentas.get(indexC).getNom());
                        System.out.println("Apellido 1: " + cuentas.get(indexC).getAp1());
                        System.out.println("Apellido 2: " + cuentas.get(indexC).getAp2());
                        System.out.println("DNI: " + cuentas.get(indexC).getDni());
                        System.out.println("Número cuenta: " + cuentas.get(indexC).getNCuenta());
                        System.out.println("Interes: " + cuentas.get(indexC).getInteres());
                        System.out.println("Saldo: " + cuentas.get(indexC).getSaldo());
                        System.out.println();
                        sleep(4000);
                        break;
                    case 2:
                        
                        cuentas.get(indexC).ingreso();
                        
                        System.out.println("Ingreso realizado con exito.");
                        System.out.println();
                        sleep(2000);
                        break;
                    case 3:
                        cuentas.get(indexC).retirar();
                        System.out.println("Transacción realizada con exito.");
                        System.out.println();
                        sleep(2000);
                        break;
                    case 4:
                        System.out.println();
                        System.out.print("Introduce el número de la cuenta a la que transferir: ");
                        inputCT=input.nextLine();

                        for(i=0;i<cuentas.size();i++){
                            if(inputCT.equals(cuentas.get(i).getNCuenta())){
                                indexCT=i;
                            }
                        }
                        cuentas.get(indexC).transfer(cuentas.get(indexCT).getSaldo());
                        cuentas.get(indexCT).setSaldo(cuentas.get(indexC).getSaldoCT());
                        
                        System.out.println("Transacción realizada con exito.");
                        System.out.println();
                        sleep(2000);
                        break;
                    case 5:
                        cuentas.get(indexC).setNom();
                        cuentas.get(indexC).setAp1();
                        cuentas.get(indexC).setAp2();
                        cuentas.get(indexC).setDni();
                        cuentas.get(indexC).setNCuenta();
                        cuentas.get(indexC).setInteres();
                        System.out.println("Cambios realizados con exito.");
                        System.out.println();
                        sleep(2000);
                        break; 
                }
            }
        }
    }
}
