public class Abeja implements Comparable<Abeja> {
    private String nombre;
    private int edad;
    private int mielProducida;

    public Abeja(String nombre, int edad, int mielProducida) {
        this.nombre = nombre;
        this.edad = edad;
        this.mielProducida = mielProducida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getMielProducida() {
        return mielProducida;
    }

    @Override
    public int compareTo(Abeja otraAbeja) {
        // Comparar las abejas por la cantidad de miel que producen
        return Integer.compare(this.mielProducida, otraAbeja.mielProducida);
    }
}
