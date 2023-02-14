/**
 * Clase que representa una persona.
 *
 * @author Fran <fran.lucena@gmail.com>
 */
public class Persona {
    // Atributos
    private String nombre;
    private int edad;
    
    /**
     * Constructor de la clase Persona.
     * @param nombre El nombre de la persona.
     * @param edad La edad de la persona.
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    /**
     * Método que devuelve el nombre de la persona.
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Método que establece el nombre de la persona.
     * @param nombre El nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Método que devuelve la edad de la persona.
     * @return La edad de la persona.
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * Método que establece la edad de la persona.
     * @param edad La edad de la persona.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
