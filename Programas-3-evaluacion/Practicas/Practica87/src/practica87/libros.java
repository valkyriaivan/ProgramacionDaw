package practica87;

public class libros {
    private String titulo,autor;
    private int ejemplares=2;
    
    public libros(){
        this.titulo="";
        this.autor="";
    }
    
    public libros(String titulo,String autor){
        this.titulo=titulo;
        this.autor=autor;
    }
    
    public libros(libros l1){
        titulo=l1.titulo;
        autor=l1.autor;
    }
    
    public void setPrestamo(){
        if(ejemplares>=1){
            ejemplares-=1;
            System.out.println("Ejemplar prestado.");
        }
        else{
            System.err.println("No hay ejemplares de ese libro.");
        }
    }
    public void setDevolucion(){
        ejemplares+=1;
    }
    
    public void getLibros(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ejemplares: " + ejemplares);
    }
    
}
