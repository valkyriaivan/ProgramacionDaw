package practica80;

public class cubo {
    private float area,lado;
    /**
     * Introduce el lado.
     * @param valor1 Lado
     */
    public void setDatos(float valor1){
        lado=valor1;
    }
    /**
     * Calcula el área.
     */
    public void setArea(){
        this.area= 6*(lado*lado);
    }
    /**
     * Devuelve el valor del área.
     * @return Area.
     */
    public float getArea(){
        return area;
    }
}
