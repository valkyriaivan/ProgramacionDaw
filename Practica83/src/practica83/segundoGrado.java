package practica83;

public class segundoGrado {
    private float a,b,c,prueba;
    private String[] resultado = new String[2];

    public void setDatos(float in1,float in2,float in3){
        this.a=in1;
        this.b=in2;
        this.c=in3;
    }
    
    public void setEcuacion(){
        prueba= (float) (Math.pow(b, 2)-(4*a*c));
        
        if(prueba>0){
            resultado[0]= Float.toString((float) ((-b-Math.sqrt(prueba))/(2*a)));
            resultado[1]= Float.toString((float) ((-b+Math.sqrt(prueba))/(2*a)));
        }
        else{
            resultado[0]= "error";
            resultado[1]= "error";
        }

    }
    public String[] getResultado(){
        return resultado;
    }
}
