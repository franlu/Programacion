package examen;

/**
 * Representa el módelo de un paquete que será gestionado por un empresa de 
 * transporte.
 * 
 * @author Fran <fran.lucena@gmail.com>
 * @since 21/03/2023
 * @version 1.0
 * @see Interfaz Comparable, Clase Object
 */
public class Paquete implements Comparable<Paquete> {
    
    public final static int ALTA = 1;
    public final static int MEDIA = 2;
    public final static int BAJA = 3;
    
    private String producto;
    private String direccionDestino;
    private int prioridad;
    
    public Paquete(String pro, String dd, int pri){}
    
    public String getProducto(){
    
        return this.producto;
    
    }
    
    public String getDireccion(){
    
        return this.direccionDestino;
    
    }
    public int getPrioridad(){
    
        return this.prioridad;
    
    }
    
    public void setProducto(String pro){
    
        this.producto = pro;
    
    }
    
    public void setDireccion(String dd){
    
        this.direccionDestino = dd;
    
    }
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
    
        return aux;
    }
    
}