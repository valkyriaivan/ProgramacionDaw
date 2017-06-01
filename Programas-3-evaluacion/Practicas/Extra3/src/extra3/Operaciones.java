package extra3;

public class Operaciones {
    private double pies;
    private double yardas;
    private double pulgadas;
    private double centimetros;
    
    /**
     * Introduce pies
     * @param pies pies
     */
    public void setpies(double pies){
        this.pies=pies;
    }
    /**
     * introduce yardas.
     * @param yardas yardas
     */
    public void setyardas(double yardas){
        this.yardas=yardas;
    }
    /**
     * Introduce pulgadas
     * @param pulgadas pulgadas
     */
    public void setpulgadas(double pulgadas){
        this.pulgadas=pulgadas;
    }
    /**
     * Introduce los centrimetros
     * @param centimetros centrimetros
     */
    public void setcentimetros(double centimetros){
        this.centimetros=centimetros;
    }
    
    /**
     * Realiza la operacion
     */
    public void opeyardas(){
        yardas=pies/0.33;
    }
    /**
     * Realiza la operacion
     */
    public void opepulgadas(){
        pulgadas=pies/12;
    }
    /**
     * Realiza la operacion
     */
    public void opecentimetros(){
        centimetros=pies*30.48;
    }
    
    /**
     * Devuelve pies.
     * @return pies
     */
    public double getpies(){
        return pies;
    } 
    /**
     * Devuelve yardas.
     * @return yardas
     */
    public double getyardas(){
        return yardas;
    }
    /**
     * Devuelve pulgadas.
     * @return pulgadas
     */
    public double getpulgadas(){
        return pulgadas;
    }
    /**
     * Devuelve centimetros.
     * @return centimetros
     */
    public double getcentimetros(){
        return centimetros;
    }
}
