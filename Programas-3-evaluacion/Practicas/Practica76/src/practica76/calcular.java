package practica76;

public class calcular {
    private float suma,resta,multiplica,divide,resto,num1,num2;
    /**
     * Constructor con parametros
     * @param valor1
     * @param valor2 
     */
    
    /**
     * Introduce los datos en el objeto.
     * @param valor1 Primer valor,
     * @param valor2 Segundo valor.
     */
    public void setDatos(float valor1,float valor2){
        num1=valor1;
        num2=valor2;
    }
    /**
     * Realiza la suma
     */
    public void setSuma(){
        this.suma=num1+num2;
    }
    /**
     * Realiza la resta.
     */
    public void setResta(){
        this.resta=num1-num2;
    }
    /**
     * Realiza la multiplicación.
     */
    public void setMulti(){
        this.multiplica=num1*num2;
    }
    /**
     * Realiza la división.
     */
    public void setDivi(){
        this.divide=num1/num2;
    }
    /**
     * Realiza el resto.
     */
    public void setResto(){
        this.resto=num1%num2;
    }
    /**
     * Devuelve el resultado de la suma.
     * @return Suma.
     */
    public float getSuma(){
        return suma;
    }
    /**
     * Devuelve el resultado de la resta.
     * @return Resta.
     */
    public float getResta(){
        return resta;
    }
    /**
     * Devuelve el resultado de la multiplicación.
     * @return Multiplicación.
     */
    public float getMulti(){
        return multiplica;
    }
    /**
     * Devuelve el resultado de la división.
     * @return División.
     */
    public float getDivi(){
        return divide;
    }
    /**
     * Devuelve el resultado del resto. 
     * @return Resto.
     */
    public float getResto(){
        return resto;
    }
}
