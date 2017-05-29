package practica81;

public class esfera {
    private float radio,area,volumen;
    /**
     * Introduce el radio.
     * @param valor1 Radio
     */
    public void setDatos(float valor1){
        radio=valor1;
    }
    /**
     * Calcula el área.
     */
    public void setArea(){
        this.area= (float) (4*Math.PI*Math.pow(radio, 2));
    }
    /**
     * Calcula el volumen.
     */
    public void setVolumen(){
        this.volumen= (float) ((4*Math.PI*Math.pow(radio, 3))/3);
    }
    /**
     * Devuelve el área.
     * @return Area.
     */
    public float getArea(){
        return area;
    }
    /**
     * Devuelve el volumen.
     * @return Volumen.
     */
    public float getVolumen(){
        return volumen;
    }
}
