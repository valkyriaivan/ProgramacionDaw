package practica81;

public class esfera {
    private float radio,area,volumen;
    
    public void setDatos(float valor1){
        radio=valor1;
    }
    
    public void setArea(){
        this.area= (float) (4*Math.PI*Math.pow(radio, 2));
    }
    public void setVolumen(){
        this.volumen= (float) ((4*Math.PI*Math.pow(radio, 3))/3);
    }
    
    public float getArea(){
        return area;
    }
    public float getVolumen(){
        return volumen;
    }
}
