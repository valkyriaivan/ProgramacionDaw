package practica82;

public class calcularDinero {
    private float dinero;
    int[] billetes = {500,200,100,50,20,10,5,2,1};
    int[] resultado = new int[9];
    /**
     * Introduce el valor del dinero.
     * @param valor1 Dinero.
     */
    public void setDatos(int valor1){
        dinero=valor1;
    }
    /**
     * Calcula la cantidad de billetes de 
     * cada tipo.
     */
    public void setBilletes(){
        for (int i=0;i<billetes.length;i++)
        {
            resultado[i]= (int) (dinero/billetes[i]);
            dinero = dinero%billetes[i];
        }
    }
    /**
     * Devuelve el array con los billetes
     * de cada tipo.
     * @return Array resultado.
     */
    public int[] getBilletes(){
        return resultado;
    }
}
