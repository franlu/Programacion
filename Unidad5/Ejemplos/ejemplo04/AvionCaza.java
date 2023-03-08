
public class AvionCaza extends AvionDeCombate {
    
    private int armamento;

    public AvionCaza(String modelo, int velocidadMaxima, int alcanceMaximo, int armamento) {
        super(modelo, velocidadMaxima, alcanceMaximo);
        this.armamento = armamento;
    }

    public int getArmamento() {
        return armamento;
    }

    public void setArmamento(int armamento) {
        this.armamento = armamento;
    }

    public void atacar() {
        // Atacando...
    }
}