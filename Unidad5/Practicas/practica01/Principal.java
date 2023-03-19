package practica01;

import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

// Al estar las clases en el mismo paquete no es necesario importarlas

/**
 * Ejemplo de uso de las clase Coche, Procesador y ProcesadoException
 * 
 * @author Fran <fran.lucena@gmail.com>
 * @since 19/03/2023
 * @version 1.0
 * @see Clase Coche, Procesador y ProcesadorException
 */
public class Principal {

    public static void main(String[] args) {
        
        final Logger LOGGER = Logger.getLogger("");
        
        Coche c1 = new Coche("ALHAMBRA", "Rojo", 5, "SEAT");
        Coche c2 = new Coche("C2", "Verde", 3, "CITROEN");
        Coche c3 = new Coche("MOKKA-e", "Azul", 5, "OPEL");
        
        List<Object> objetos = new ArrayList();
        List<Integer> enterosProcesados = new ArrayList();
        Procesador pro1 = new Procesador();
        Procesador pro2 = new Procesador();
        
        LOGGER.log(Level.INFO, "---> COCHE <---");
        
        System.out.println(c1.arrancar());
        System.out.println(c1.acelerar());
        System.out.println(c1.frenar());
        System.out.println(c1.parar());
        System.out.println(c1);
                
        LOGGER.log(Level.INFO, "---> PROCESADOR <---");
        
        objetos.add(120);
        objetos.add("Esto es una cadena de texto");
        objetos.add(c2);
        objetos.add(c3);
                
        try {
            
            enterosProcesados = pro1.procesar(objetos);
            
        } catch (ProcesadorException pe) {
         
             System.out.println(pe.getClass() + " :: " + pe.getMessage());
            // pe.printStackTrace();
            
        } finally {
        
            System.out.println("[VÁLIDOS]: " + enterosProcesados.size() 
                            + " enteros procesados.");
        }
             
        objetos.add(Math.PI); // double, para provocar la excepcion
        enterosProcesados.clear();
        
        System.out.println("Clase Procesador: " + pro2.totalInstancias() 
                            + " instancia/s"); // Procesador.totalInstancias();
                
        try {
            
            enterosProcesados = pro2.procesar(objetos);
            
        } catch (ProcesadorException pe) {
            
            System.out.println(pe.getClass() + " :: " + pe.getMessage() 
                                + " :: " + enterosProcesados.size() 
                                + " enteros procesados");            
        }        
        
    } // Main-End

} // Class-End