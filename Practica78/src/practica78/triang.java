package practica78;

public class triang {
    private float area,base,altura;
    
    public void setDatos(float valor1,float valor2){
        base=valor1;
        altura=valor2;
    }
    
    public void setArea(){
        this.area= (base*altura)/2;
    }
    public float getArea(){
        return area;
    }
}
