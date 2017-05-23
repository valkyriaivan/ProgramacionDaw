package altapiezas;

public class AltaPiezas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Piezas p1 = new Piezas("z25","Segundo constructor",33,"zzz");
        
        //Imprimir inicialización CONSTRUCTOR
        System.out.println("Codigo de pieza: "+p1.getCodPieza());
        System.out.println("Descripción: "+p1.getDescrip());
        System.out.println("Codigo de proveedor: "+p1.getCodProv());
        System.out.println("Cantidad: "+p1.getCantidad());
        System.out.println("============================");
        
        /*Inicializar objeto de forma directa
            ¡¡¡NOOO HACER!!!
        p1.codPieza = "x001";
        p1.descrip = "Recambio cojinete";
        p1.codProv = "p01";
        p1.cantidad = 25;
        */
        
        //Inicializaar con los setters
        p1.setCodPieza("x001");
        p1.setDescrip("Recambio cojinetes");
        p1.setCodProv("p01");
        p1.setCantidad(25);
       
        
        //Imprimir con los getters
        System.out.println("Codigo de pieza: "+p1.getCodPieza());
        System.out.println("Descripción: "+p1.getDescrip());
        System.out.println("Codigo de proveedor: "+p1.getCodProv());
        System.out.println("Cantidad: "+p1.getCantidad());
        System.out.println("============================");

    }
    
}
