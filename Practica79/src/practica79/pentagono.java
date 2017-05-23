package practica79;

public class pentagono {
    private float lado,apotema,area;
    
    public void setDatos(float valor1,float valor2){
        lado=valor1;
        apotema=valor2;
    }
    
    public void setArea(){
        this.area= ((lado*5)*apotema)/2;
    }
    public void setApotema(float lado){
        float pitagoras= (float) (Math.pow(lado,2) - Math.pow(lado/2,2));
        this.apotema= (float) Math.sqrt(pitagoras);
    }
    
    public float getArea(){
        return area;
    }
    public float getApotema(){
        return apotema;
    }
}
