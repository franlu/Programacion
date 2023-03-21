package examen;

/**
 * Representa el módelo de un paquete que será gestionado por un empresa de 
 * transporte.
 * 
 * @author Fran <fran.lucena@gmail.com>
 * @since 21/03/2023
 * @version 1.0
 * @see java.lang.object, java.lang.comparable
 */
public class Paquete implements Comparable<Paquete> {
    
    public final static int ALTA = 1;
    public final static int MEDIA = 2;
    public final static int BAJA = 3;
    
    private String producto;
    private String direccionDestino;
    private int prioridad;

    /**
     * Contructor por defecto.
     * Se declara privado para forzar la creación de objetos con el constructor
     * con parámetros. 
     */
    private Paquete(){}
    

    /**
     * Constructor con parámetros
     *
     * @param pro descripción del producto
     * @param dd dirección de destino
     * @param pri nivel de prioridad
     * @throws IllegalArgumentException Se lanza cuando el nivel 
     *         de prioridad no es válido 
     */
    public Paquete(String pro, String dd, int pri) throws IllegalArgumentException {

        if (pri > 0 && pri < 4)
            this.prioridad = pri;
        else
            throw new IllegalArgumentException("El nivel de prioridad no es válido");
        
        this.producto = pro;
        this.direccionDestino = dd;

    }
    
    /**
     * Obtener el producto que contiene el paquete
     *
     * @return String descripción del producto
     */
    public String getProducto(){
    
        return this.producto;
    
    }
    
    /**
     * Consultar la dirección de destino
     *
     * @return String dirección
     */
    public String getDireccion(){
    
        return this.direccionDestino;
    
    }

    /**
     * Consultar prioridad de entrega
     *
     * @return int nivel de prioridad
     */
    public int getPrioridad(){
    
        return this.prioridad;
    
    }
    
    /**
     * Establecer la descripción del producto
     * 
     * @param pro descripción del producto
     */
    public void setProducto(String pro){
    
        this.producto = pro;
    
    }
    
    /**
     * Asignar la dirección de destino
     * 
     * @param dd dirección de destino
     */
    public void setDireccion(String dd){
    
        this.direccionDestino = dd;
    
    }
    
    /**
     * Fijar la prioridad de envio
     * 
     * @param pri nivel de prioridad
     */
    public void setPrioridad(int pri){
    
        this.prioridad = pri;
    
    }

    @Override
    public int compareTo(Paquete p){
    
        int resultado = 0;
        
        return resultado;
    
    }
    
    @Override
    public boolean equals(Object o){
    
        boolean iguales = false;
        
        return iguales;
    
    }
    
    @Override
    public int hashCode(){
    
        int hashC = 0;
        
        return hashC;
        
    }
    
    @Override
    public String toString(){
        
        String aux = "";

            aux += "Producto: " + this.getProducto();
            aux += "\nDirección de Destino: " + this.getDireccion();
            aux += "\nPrioridad: " + this.getPrioridad();

        return aux;
    }
    
}