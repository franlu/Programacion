package Librerias;

/**
 *
 * @author fran
 */
public class Incidencia {
    
    private int codigo;
    private String estado;
    private int puesto;
    private String descripcion;
    private String resolucion;
    
    private static int codigoAuto = 0;
    private static int pendiente = 0;
    
    
    public Incidencia(){}
    
    public Incidencia(int puesto, String descripcion){
    
        this.codigo = Incidencia.codigoAuto++;
        this.estado = "Pendiente";
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.resolucion = "";
        
        Incidencia.pendiente++;
    }
    
    public void resuelve(String resolucion) {
        
        this.estado = "Resuelta";
        this.resolucion = resolucion;
        
        Incidencia.pendiente--;
    }
    
    @Override
    public String toString(){
    
        String aux;
        
        aux = "Incidencia " + this.codigo;
        aux+= " - Puesto " + this.puesto;
        aux+= " - " + this.descripcion;
        aux+= " - " + this.estado;
        
        if (this.estado.equalsIgnoreCase("Resuelta"))
            
            aux+= " - " + this.resolucion;
    
        return aux;
    
    }
    
    public static final int getPendientes(){
    
       return Incidencia.pendiente;
        
    } 
    
}
