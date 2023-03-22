package examen;

import java.util.Objects;

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
     */
    private Paquete(){}
    

    /**
     * Constructor con parámetros
     *
     * @param pro descripción del producto
     * @param dd dirección de destino
     * @param pri nivel de prioridad
     * @throws IllegalArgumentException Se lanza cuando el nivel 
     *         de prioridad no es válido (1,2 y 3 son niveles válidos) 
     */
    public Paquete(String pro, String dd, int pri) throws IllegalArgumentException{

        if (pri <= Paquete.BAJA && pri >= Paquete.ALTA)
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
    
    /**
     * Comparar un paquete en función del nivel de prioridad
     * 
     * @param p paquete con el que comparar la prioridad
     * @return <ul>
     *          <li>Entero negativo en caso de que el objeto tenga menor prioridad</li>
     *          <li>0 en caso de tener el mismo nivel de prioridad</li>
     *          <li>Entero positivo en caso de que el objeto tenga mayor prioridad</li>
     *         </ul>
     */
    @Override
    public int compareTo(Paquete p){
    
        int diferencia = 0;
        
            diferencia = Integer.compare(this.prioridad, p.getPrioridad());
        
        return diferencia;
    
    }

    /**
     * Comprobar si dos objetos son iguales. Generado automáticamente por el IDE.
     * 
     * @param obj objeto a comparar
     * @return <ul>
     *          <li>true los objetos son iguales</li>
     *          <li>false los objetos son distintos</li>
     *         </ul>
     */
    @Override
    public boolean equals(Object obj) {
        
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paquete other = (Paquete) obj;
        if (!Objects.equals(this.producto, other.producto)) {
            return false;
        }
        
        return Objects.equals(this.direccionDestino, other.direccionDestino);
    }
    
    /**
     * Crear un código para identificar al objeto. Generado automáticamente por el IDE.
     * 
     * @return int código hash del objeto 
     */
    @Override
    public int hashCode() {
        
        int hash = 7;
            
            hash = 71 * hash + Objects.hashCode(this.producto);
            hash = 71 * hash + Objects.hashCode(this.direccionDestino);
            hash = 71 * hash + this.prioridad;
        
        return hash;
    }
    
    /**
     * Muestra información detallada sobre la clase
     * 
     * @return cadena de texto con los datos del paquete
     */    
    @Override
    public String toString(){
        
        String aux = "";

            aux += "\nProducto: " + this.getProducto();
            aux += "\nDirección de Destino: " + this.getDireccion();
            aux += "\nPrioridad: " + this.getPrioridad();

        return aux;
    }
    
}