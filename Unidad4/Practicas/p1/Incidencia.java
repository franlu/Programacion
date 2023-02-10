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
    
    static int auto = 0;
    
    
    
    public Incidencia(){}
    
    public Incidencia(int puesto, String descripcion){
    
        this.codigo = Incidencia.auto++;
        this.estado = "Pendiente";
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.resolucion = "";
        
       
        
    }
    
    public void resuelve(String resolucion) {
        
        this.estado = "Resuelta";
        this.resolucion = resolucion;
    
        
    }
    
    @Override
    public String toString(){
    
        String aux;
        
        aux = "Incidencia " + this.codigo;
        aux+= " - Puesto " + this.puesto;
        aux+= " - " + this.descripcion;
        aux+= " - " + this.estado;
        
        if (this.estado.equals("Resuelta"))
            
            aux+= " - " + this.resolucion;
    
        return aux;
    
    }
    
    public static final int getPendientes(){
    
       
        
        return auto;
        
    }
    
    
    
}
