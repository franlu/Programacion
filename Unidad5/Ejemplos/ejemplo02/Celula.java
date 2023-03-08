public final class Celula {
    
    private String tipo;
    private int edad;
    private String organelos;
    private boolean estaViva;

    public Celula(String tipo, int edad, String organelos, boolean estaViva) {
        this.tipo = tipo;
        this.edad = edad;
        this.organelos = organelos;
        this.estaViva = estaViva;
    }

    public void realizarMitosis() {
        if (estaViva) {
            // La célula está realizando la mitosis
        } else {
            // La célula está muerta, no puede realizar la mitosis
        }
    }

    public void metabolizar() {
        if (estaViva) {
            // La célula está metabolizando
        } else {
            // La célula está muerta, no puede metabolizar
        }
    }

    public void morir() {
        estaViva = false;
        // La célula ha muerto
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOrganelos() {
        return this.organelos;
    }

    public void setOrganelos(String organelos) {
        this.organelos = organelos;
    }

    public boolean getEstaViva() {
        return this.estaViva;
    }

    public void setEstaViva(boolean estaViva) {
        this.estaViva = estaViva;
    }
}