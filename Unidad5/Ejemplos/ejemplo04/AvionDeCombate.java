public class AvionDeCombate {
    
    private String modelo;
    private int velocidadMaxima;
    private int alcanceMaximo;

    public AvionDeCombate(String modelo, int velocidadMaxima, int alcanceMaximo) {
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.alcanceMaximo = alcanceMaximo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getAlcanceMaximo() {
        return alcanceMaximo;
    }

    public void setAlcanceMaximo(int alcanceMaximo) {
        this.alcanceMaximo = alcanceMaximo;
    }

    public void despegar() {
        // Despegando...
    }

    public void aterrizar() {
        // Aterrizando...
    }
}