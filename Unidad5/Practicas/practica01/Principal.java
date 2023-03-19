package practica01;

import java.util.List;
import java.util.ArrayList;

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
        
        Coche c1 = new Coche("ALHAMBRA", "Rojo", 5, "SEAT");
        Coche c2 = new Coche("C2", "Verde", 3, "CITROEN");
        Coche c3 = new Coche("MOKKA-e", "Azul", 5, "OPEL");
        
        List<Object> objetos = new ArrayList();
        
        
        // Coche
        System.out.println(c1.arrancar());
        System.out.println(c1.acelerar());
        System.out.println(c1.frenar());
        System.out.println(c1.parar());
        System.out.println("Número de puertas del coche: " + c1.getNumeroPuertas());
        System.out.println(c1); // llamada a toString
        
        objetos.add(120);
        objetos.add("Esto es una cadena de texto");
        objetos.add(c2);
        objetos.add(Math.PI); // double, para provocar la excepcion
        
        
    }
    
}
