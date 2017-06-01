package practica79;

public class pentagono {
    private float lado,apotema,area;
    /**
     * Introduce el lado y el apotema.
     * @param valor1 Lado.
     * @param valor2 Apotema.
     */
    public void setDatos(float valor1,float valor2){
        lado=valor1;
        apotema=valor2;
    }
    /**
     * Calcula el área.
     */
    public void setArea(){
        this.area= ((lado*5)*apotema)/2;
    }
    /**
     * Calcula el valor del apotema.
     * @param lado Lado
     */
    public void setApotema(float lado){
        float pitagoras= (float) (Math.pow(lado,2) - Math.pow(lado/2,2));
        this.apotema= (float) Math.sqrt(pitagoras);
    }
    /**
     * Devuelve el valor del área.
     * @return Area.
     */
    public float getArea(){
        return area;
    }
    /**
     * Devuelve el valor del apotema.
     * @return Apotema.
     */
    public float getApotema(){
        return apotema;
    }
}
