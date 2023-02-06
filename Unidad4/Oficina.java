package Tema4;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class Oficina {
    
    //ATRIBUTOS
    private String nombre;
    private ArrayList <Persona> trabajadores;
    
    
    //CONSTRUCTORES
    public Oficina() {
        nombre = "Industrias DAW";
        
        trabajadores = new ArrayList<Persona>();
        
        trabajadores.add(new Persona("Ana Diaz Diaz",
                33333333, 'P', 1200, 
                LocalDate.of(1985,05,21)));
        trabajadores.add(new Persona("Luis Lopez Lopez",
                22222222, 'J', 1000, 
                LocalDate.of(1985,05,21)));
        trabajadores.add(new Persona("Antonio Perez Perez",
                11111111, 'H', 900, 
                LocalDate.of(1985,05,21)));
    }
    
    public Oficina(String n) {
        nombre = n;
        trabajadores = null;
    }
    
    public Oficina(String n, int tipo) {
        nombre = n;    
        
        if(tipo <= 0 || tipo > 3) {
            trabajadores = new ArrayList<Persona>();
        } else if(tipo == 1) {
            
            trabajadores.add(new Persona("Antonio Perez Perez",
                11111111, 'H', 900, 
                LocalDate.of(1985,05,21)));
            
        } else if(tipo == 2) {
            
            trabajadores.add(new Persona("Luis Lopez Lopez",
                22222222, 'J', 1000, 
                LocalDate.of(1985,05,21)));
            trabajadores.add(new Persona("Antonio Perez Perez",
                11111111, 'H', 900, 
                LocalDate.of(1985,05,21)));

        } else if(tipo == 3) {
            
            trabajadores.add(new Persona("Ana Diaz Diaz",
                33333333, 'P', 1200, 
                LocalDate.of(1985,05,21)));
            trabajadores.add(new Persona("Luis Lopez Lopez",
                22222222, 'J', 1000, 
                LocalDate.of(1985,05,21)));
            trabajadores.add(new Persona("Antonio Perez Perez",
                11111111, 'H', 900, 
                LocalDate.of(1985,05,21)));
        }
    }
    
    public ArrayList<Persona> getTrabajadores(){
        
        return this.trabajadores;
        
    }
    
    @Override
    public String toString(){
    
        String aux = "Nombre: " + this.nombre + "\n";
                
        for (Persona p : this.getTrabajadores()) {
            aux += p.toString() + "\n";
        }
        
        return aux;
    
    }
}
