import java.util.HashSet;
import java.util.Set;

public class Submarino {
    private String nombre;
    private int tripulacion;
    private Set<String> armamento;

    public Submarino(String nombre, int tripulacion, Set<String> armamento) {
        this.nombre = nombre;
        this.tripulacion = tripulacion;
        this.armamento = armamento;
    }

    // Sobrescribe el método toString para imprimir información relevante del submarino
    @Override
    public String toString() {
        String aux = "";
          aux += "Nombre: " + this.nombre + ", Tripulación: " + this.tripulacion;
          for(String s : this.armamento){
            aux += "\n Armamento: " + s;
          }
          
        return aux;
    }

    // Sobrescribe el método equals para comparar dos submarinos por sus propiedades
    @Override
    public boolean equals(Object o) {
        boolean resultado = false;
      
        if (o != null || getClass() == o.getClass()) {
            Submarino submarino = (Submarino) o;
            resultado = (this.tripulacion == submarino.tripulacion) &&
            this.nombre.equals(submarino.nombre) &&
            this.armamento.equals(submarino.armamento);
        }
        return resultado;
    }

    // Sobrescribe el método hashCode para generar un código hash único para cada submarino
    @Override
    public int hashCode() {
        int hash;
          hash = 31 * (this.nombre.hashCode() + this.tripulacion + this.armamento.hashCode())
        return hash;
    }
}
