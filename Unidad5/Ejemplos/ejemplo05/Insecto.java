public class Insecto {
    private String especie;
    private String tipoAlimentacion;
    private int numPatas;
    private String color;

    public Insecto(String especie, String tipoAlimentacion, int numPatas, String color) {
        this.especie = especie;
        this.tipoAlimentacion = tipoAlimentacion;
        this.numPatas = numPatas;
        this.color = color;
    }

    // Sobrescribir el método toString()
    @Override
    public String toString() {
        String aux = "":
            aux = "Insecto [especie=" + especie + ", tipoAlimentacion=" 
                    + tipoAlimentacion + ", numPatas=" + numPatas + ", color=" 
                    + color + "]"; 
        return aux;
    }

    // Sobrescribir el método equals()
    @Override
    public boolean equals(Object obj) {
        
        if (obj == this)
            return true;
        if (!(obj instanceof Insecto))
            return false;
        Insecto insecto = (Insecto) obj;
        
        return insecto.especie.equals(especie) &&
               insecto.tipoAlimentacion.equals(tipoAlimentacion) &&
               insecto.numPatas == numPatas &&
               insecto.color.equals(color);
    }

    // Sobrescribir el método hashCode()
    @Override
    public int hashCode() {
        int hash = 7;
            hash = 31 * hash + especie.hashCode();
            hash = 31 * hash + tipoAlimentacion.hashCode();
            hash = 31 * hash + numPatas;
            hash = 31 * hash + color.hashCode();
        return hash;
    }
}