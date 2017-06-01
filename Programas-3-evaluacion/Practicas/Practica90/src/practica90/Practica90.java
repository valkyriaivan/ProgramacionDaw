package practica90;

public class Practica90 {

    public static void main(String[] args) {
        int input=0;
        CalcLetra cl1 = new CalcLetra();
        menu m1 = new menu();
        
        while(input!=3){
            input=m1.menu();
            switch(input){
                case 1:
                    cl1.setNum();
                    System.out.println("DNI añadido con exito.");
                    break;
                case 2:
                    cl1.getDNI();
                    break;
                case 3:
                    System.out.println("Saliendo...");
            }
        }
    }
}
