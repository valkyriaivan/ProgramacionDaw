package practica77;

public class circumf {
    private float longitud,area,rad;
    /**
     * Introduce el valor del radio.
     * @param valor1 Valor del radio.
     */
    public void setDatos(float valor1){
        rad=valor1;
    }
    /**
     * Calcula el valor de la longitud.
     */
    public void setLongi(){
        this.longitud=rad*2;
    }
    /**
     * Calcula el área.
     */
    public void setArea(){
        this.area=(float) (Math.PI * Math.pow(rad, 2));
    }
    /**
     * Devuelve la longitud.
     * @return Longitud.
     */
    public float getLongi(){
        return longitud;
    }
    /**
     * Devuelve el área.
     * @return Area.
     */
    public float getArea(){
        return area;
    }
}
