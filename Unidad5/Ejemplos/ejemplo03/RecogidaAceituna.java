public class RecogidaAceituna {
    
    private String tipoAceituna;
    private int peso;
    private int cantidad;

    public RecogidaAceituna(String tipoAceituna, int peso, int cantidad) {
        this.tipoAceituna = tipoAceituna;
        this.peso = peso;
        this.cantidad = cantidad;
    }

    public String getTipoAceituna() {
        return this.tipoAceituna;
    }

    public void setTipoAceituna(String tipoAceituna) {
        this.tipoAceituna = tipoAceituna;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) throws AceitunaException {
        if (peso < 0) {
            throw new AceitunaException("El peso de la aceituna no puede ser negativo");
        }
        this.peso = peso;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double calcularRendimiento() {
        return (double) this.peso / this.cantidad;
    }

    public double calcularValorVenta(double precioPorKilo) {
        return this.peso * this.precioPorKilo;
    }

    public String toString() {
        
        String aux = "Recogida de aceituna: " + tipoAceituna + ", " + cantidad 
                + " unidades, " + peso + " kg.";
       
        return aux; 
    }
}