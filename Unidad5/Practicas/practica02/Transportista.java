
package examen;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa una persona que puede enviar un paquete a su destino.
 * 
 * @author Fran <fran.lucena@gmail.com>
 * @since 21/03/2023
 * @version 1.0
 */
public class Transportista {
    
    private List<Paquete> paquetes;
    private long tiempoEntrega; // expresado en minutos
    
    /**
     * Constructor por defecto
     */
    private Transportista(){}
    
    /**
     * Constructor con parámetros
     * 
     * @param te cantidad de tiempo que se tarda en entregar un paquete. 
     *           Se expresa en minutos.
     */
    public Transportista(long te){
    
        this.tiempoEntrega = te;
        paquetes = new ArrayList();
    
    }
    
    /**
     * Obtener los paquetes del transportista
     * 
     * @return List conjunto de paquetes a repartir 
     */
    public List<Paquete> getPaquetes() {
        
        return this.paquetes;
    
    }
    
    /**
     * Recuperar el tiempo de entrega que tiene el transportista
     * 
     * @return long duranción del envio de un paquete 
     */
    public long getTiempoEntrega() {
        
        return this.tiempoEntrega;
    
    }
    
    /**
     * Asignar una lista de paquetes al trasportista
     * 
     * @param paquetes paquetes que se trendran que repartir
     */
    public void setPaquetes(List<Paquete> paquetes) {
        
        this.paquetes = paquetes;
    
    }
    
    /**
     * Establecer el tiempo que tarda en hacer la entrega
     * 
     * @param tiempoEntrega 
     */
    public void setTiempoEntrega(long tiempoEntrega) {
        
        this.tiempoEntrega = tiempoEntrega;
    
    }
       
    /**
     * Añadir un paquete al camión del transportista.
     * 
     * @param p paquete que va a ser enviado
     */
    public void subirCamion(Paquete p){
    
        this.paquetes.add(p);
    
    }
    
    /**
     * Simular el envio de una lista de paquetes a su destino.
     */
    public void enviar(){
        
        Instant inicioEnvio, enReparto;
        Duration d;
        
        System.out.println("\nEntregando paquetes...");
        
        for ( Paquete p : this.paquetes){
            
            inicioEnvio = Instant.now();
            
            do {
                
                enReparto = Instant.now();
                d = Duration.between(inicioEnvio, enReparto);
                
            } while(d.getSeconds() <= this.tiempoEntrega * 60);
        
            System.out.println(p); // toString
        }
        
        this.paquetes.clear();
    
    }
    
    /**
     * Muestra información detallada sobre la clase
     * 
     * @return cadena de texto con los datos del transportista
     */     
    @Override
    public String toString(){
    
        String aux="";
        
            aux += "Tiempo de entrega: " + this.getTiempoEntrega();
            
            for (Paquete p : this.getPaquetes())
                
                aux += "\n" + p.toString();
        
        return aux;
    }
}
