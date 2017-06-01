package extra2;

public class Operaciones {
    private int segundos;
    private int [] tiempoarray = new int [5];
    int i=0;
    int [] tiemposec= {604800, 86400, 3600, 60, 1};
    private String[] nombre = {"semanas", "dias", "horas", "minutos", "segundos"};
    
    /**
     * Introduce los segundos.
     * @param segundos segundos
     */
    public void setsegundos(int segundos){
        this.segundos=segundos;
    }
    /**
     * Introduce el array.
     * @param tiempoarray Array del tiempo
     */
    public void settiempoarray(int [] tiempoarray){
        this.tiempoarray=tiempoarray;
}
    /**
     * Introduce el tiemposec
     * @param tiemposec tiemposec
     */
    public void settiemposec(int[] tiemposec){
        this.tiemposec=tiemposec;
    }
    
    /**
     * Introduce el nombre
     * @param nombre Nombre.
     */
    public void settnombre(String[] nombre){
        this.nombre=nombre;
    }
    
    /**
     * Devuelve los segundos.
     * @return segundos
     */
    public int getsegundos(){
        return segundos;
    }
    
    /**
     * Devuelve el tiemposec
     * @return tiemposec 
     */
    public int [] gettiemposec(){
        return tiemposec;
    }
    
    /**
     * Devuelve el nombre
     * @return nombre
     */
    public String [] getnombre(){
        return nombre;
    }
    
    /**
     * Devuelve el tiempoarray
     * @return tiempoarray
     */
    public int [] gettiempoarray(){
        return tiempoarray;
    }
    
    /**
     * Realiza la operacion.
     */
    public void operacion(){
        for(i=0; i<5; i++){
            tiempoarray[i]= (segundos/tiemposec [i]);
            segundos=segundos%tiemposec [i];
        }
    }
}
