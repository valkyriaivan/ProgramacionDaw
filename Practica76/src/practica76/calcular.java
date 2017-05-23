package practica76;

public class calcular {
    private float suma,resta,multiplica,divide,resto,num1,num2;
    
    public void setDatos(float valor1,float valor2){
        num1=valor1;
        num2=valor2;
    }
    
    public void setSuma(){
        this.suma=num1+num2;
    }
    public void setResta(){
        this.resta=num1-num2;
    }
    public void setMulti(){
        this.multiplica=num1*num2;
    }
    public void setDivi(){
        this.divide=num1/num2;
    }
    public void setResto(){
        this.resto=num1%num2;
    }

    public float getSuma(){
        return suma;
    }
    public float getResta(){
        return resta;
    }
    public float getMulti(){
        return multiplica;
    }
    public float getDivi(){
        return divide;
    }
    public float getResto(){
        return resto;
    }
}
