package practica01;

/** 
 * Representa una excepción personalizada
 * 
 *  @author Fran <fran.lucena@gmail.com>
 *  @since 18/03/2023
 *  @version 1.0
 *  @see Clase Procesador
 */
public class ProcesadorException extends Exception {
    
    /**
     * Constructor por defecto
     */
    private ProcesadorException(){}
        
    /**
     * Constructor con parámetros
     * 
     * @param mensaje información sobre el motivo de la excepción 
     */
    public ProcesadorException(String mensaje){
        
        super(mensaje);
    }
}