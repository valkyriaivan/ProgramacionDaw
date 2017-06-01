package practica86;

public class Practica86 {

    public static void main(String[] args) {
        int input=0;
        contador c1 = new contador();
        Menu m1 = new Menu();
        
        while(input!=5){
            input=m1.menu();
            switch(input){
                case 1:
                    c1.setValue();
                    c1.incrementar();
                    break;
                case 2:
                    c1.setValue();
                    c1.decrementar();
                    break;
                case 3:
                    c1.setValue();
                    c1.setCont();
                    break;
                case 4:
                    c1.getCont();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
            }
        }
    }
}
