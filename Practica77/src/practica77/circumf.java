package practica77;

public class circumf {
    private float longitud,area,rad;
    
    public void setDatos(float valor1){
        rad=valor1;
    }
    public void setLongi(){
        this.longitud=rad*2;
    }
    public void setArea(){
        this.area=(float) (Math.PI * Math.pow(rad, 2));
    }

    public float getLongi(){
        return longitud;
    }
    public float getArea(){
        return area;
    }
}
