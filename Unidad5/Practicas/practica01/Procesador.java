package practica01;

import java.util.ArrayList;
import java.util.List;

/**
 * Describe un módelo encargado de procesar diferentes tipos de dato 
 *   
 * @author Fran <fran.lucena@gmail.com>
 * @since 19/03/2023
 * @version 1.0
 * @see ProcesadorException
*/
public class Procesador {
    
    public static int totalProcesados = 0;
    
    
    /**
     * Constructor por defecto
     */
    public Procesador(){
    
        Procesador.totalProcesados++;
        
    }
    
    /**
     * Obtiene la longitud de un tipo de dato cadena de caracteres
     * 
     * @param cadena conjunto de caracteres que va a ser procesado
     * @return número de caracteres de la cadena de texto
     */
    private int procesarCadena(String cadena) {
        
        return cadena.length();
    
    }

    /**
     * Obtiene el valor exacto de un tipo de dato entero
     * 
     * @param entero valor entero que va a ser procesado
     * @return valor de un tipo de dato entero
     */
    private int procesarInteger(int entero) {
        
        return entero;
    
    }

    /**
     * Consulta el número de puertas de un coche
     * 
     * @param coche objeto que se va a procesar
     * @return número de puertas
     */
    private int procesarCoche(Coche coche) {
        
        return coche.getNumeroPuertas();
    
    }
    
    /**
     * Recoge información sobre diferentes tipos de dato
     * @param elementos lista de objetos que se van a procesar
     * @return lista de tipos de dato entero que han sido tratados
     * @throws ProcesadorException Es lanzada cuando un tipo de dato no es admitido
     */
    public List<Integer> procesar(List<Object> elementos)
            throws ProcesadorException {

        List<Integer> enteros = new ArrayList();
        
        for (Object tipo : elementos) {
            
            if (tipo instanceof String) {
                
                enteros.add(this.procesarCadena((String) tipo));
                
            } else if (tipo instanceof Integer) {
                
                enteros.add(this.procesarInteger((Integer) tipo));
                
            } else if (tipo instanceof Coche ) {
                
                enteros.add(this.procesarCoche((Coche) tipo));

            } else {
                
                throw new ProcesadorException("Tipo de dato NO válido");
            }
        }
        
        return enteros;
    }

    /**
     * Consulta la cantidad de instancias que se han creado
     * 
     * @return total de instancias creadas
     */
    public static int totalInstancias(){
    
        return Procesador.totalProcesados;
    
    }
}