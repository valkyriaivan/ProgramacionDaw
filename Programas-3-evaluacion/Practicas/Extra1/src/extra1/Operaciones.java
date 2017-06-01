package extra1;

public class Operaciones {
    private double cateto1;
    private double cateto2;
    private double hipotenusa;
    
    /**
     * Introduce el primer cateto
     * @param cateto1 Cateto 1
     */
    public void setcateto1(double cateto1){
        this.cateto1=cateto1;
    }
    /**
     * Introduce el segundo cateto
     * @param cateto2 Cateto 2
     */
    public void setcateto2(double cateto2){
        this.cateto2=cateto2;
    }
    /**
     * Introduce la hipotenusa.
     * @param hipotenusa Hipotenusa
     */
    public void sethipotenusa(double hipotenusa){
        this.hipotenusa=hipotenusa;
    }
    
    /**
     * Realiza la operacion
     */
    public void operacion1(){
        hipotenusa=(float) Math.sqrt((float) ((float) Math.pow(cateto2,2) + (float) Math.pow(cateto1,2)));
    }
    /**
     * Realiza la operacion
     */
    public void operacion2(){
        cateto1=Math.sqrt(Math.pow(hipotenusa, 2)-Math.pow(cateto2, 2));
    }
    /**
     * Realiza la operacion.
     */
    public void operacion3(){
        cateto2=Math.sqrt(Math.pow(hipotenusa, 2)-Math.pow(cateto1, 2));
    }
    
    /**
     * @return cateto1 
     */
    public double getcateto1(){
        return cateto1;
    } 
    /**
     * @return cateto 2
     */
    public double getcateto2(){
        return cateto2;
    }
    /**
     * @return hipotenusa
     */
    public double gethipotenusa(){
        return hipotenusa;
    }
}
