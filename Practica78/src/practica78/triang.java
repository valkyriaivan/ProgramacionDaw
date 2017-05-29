package practica78;

public class triang {
    private float area,base,altura;
    /**
     * INtroduce la base y la altura.
     * @param valor1 Valor base.
     * @param valor2 Valor altura.
     */
    public void setDatos(float valor1,float valor2){
        base=valor1;
        altura=valor2;
    }
    /**
     * Calcula el área.
     */
    public void setArea(){
        this.area= (base*altura)/2;
    }
    /**
     * Devuelve el valor del área.
     * @return Area.
     */
    public float getArea(){
        return area;
    }
}
