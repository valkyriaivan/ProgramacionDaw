package practica80;

public class cubo {
    private float area,lado;
    
    public void setDatos(float valor1){
        lado=valor1;
    }
    
    public void setArea(){
        this.area= 6*(lado*lado);
    }
    public float getArea(){
        return area;
    }
}
