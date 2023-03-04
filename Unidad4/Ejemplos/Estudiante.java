/**
 * Esta clase representa un estudiante.
 * 
 * @author Fran <fran.lucena@gmail.com>
 * @version 1.0
 * @since 2023-02-14
 */
public class Estudiante {
    
    private String nombre;
    private int edad;
    
    /**
     * Este constructor crea un nuevo estudiante.
     * 
     * @param nombre El nombre del estudiante.
     * @param edad La edad del estudiante.
     * @throws IllegalArgumentException Si la edad es menor que cero.
     */
    public Estudiante(String nombre, int edad) throws IllegalArgumentException {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser menor que cero.");
        }
        this.nombre = nombre;
        this.edad = edad;
    }
    
    /**
     * Este método devuelve el nombre del estudiante.
     * 
     * @return El nombre del estudiante.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Este método establece el nombre del estudiante.
     * 
     * @param nombre El nombre del estudiante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Este método devuelve la edad del estudiante.
     * 
     * @return La edad del estudiante.
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * Este método establece la edad del estudiante.
     * 
     * @param edad La edad del estudiante.
     * @throws IllegalArgumentException Si la edad es menor que cero.
     */
    public void setEdad(int edad) throws IllegalArgumentException {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser menor que cero.");
        }
        this.edad = edad;
    }
    
    /**
     * Este método devuelve una representación en cadena de texto del estudiante.
     * 
     * @return Una cadena de texto con el nombre y la edad del estudiante.
     */
    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", edad=" + edad + "]";
    }
    
    /**
     * Este método compara dos estudiantes.
     * 
     * @param otro El estudiante con el que se va a comparar.
     * @return true si los estudiantes son iguales, false en caso contrario.
     */
    public boolean equals(Estudiante otro) {
        if (this == otro) {
            return true;
        }
        if (otro == null) {
            return false;
        }
        if (getClass() != otro.getClass()) {
            return false;
        }
        Estudiante otroEstudiante = (Estudiante) otro;
        if (edad != otroEstudiante.edad) {
            return false;
        }
        if (nombre == null) {
            if (otroEstudiante.nombre != null) {
                return false;
            }
        } else if (!nombre.equals(otroEstudiante.nombre)) {
            return false;
        }
        return true;
    }
}
