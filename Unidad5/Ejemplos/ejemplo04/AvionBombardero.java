public class AvionBombardero extends AvionDeCombate {
    private int capacidadCarga;

    public AvionBombardero(String modelo, int velocidadMaxima, int alcanceMaximo, int capacidadCarga) {
        super(modelo, velocidadMaxima, alcanceMaximo);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public void bombarderar() {
        System.out.println("Lanzando bombas...");
    }
}