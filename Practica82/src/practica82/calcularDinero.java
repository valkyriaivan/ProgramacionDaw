package practica82;

public class calcularDinero {
    private float dinero;
    int[] billetes = {500,200,100,50,20,10,5,2,1};
    int[] resultado = new int[9];
    
    public void setDatos(int valor1){
        dinero=valor1;
    }
    
    public void setBilletes(){
        for (int i=0;i<billetes.length;i++)
        {
            resultado[i]= (int) (dinero/billetes[i]);
            dinero = dinero%billetes[i];
        }
    }
    public int[] getBilletes(){
        return resultado;
    }
}
