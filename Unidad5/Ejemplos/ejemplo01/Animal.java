public class Animal {
    
    protected String nombre;
    protected int edad;
    protected boolean hambriento;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.hambriento = true;
    }

    protected void comer() {
        this.hambriento = false;
    }

    protected void dormir() {
        
    }

    protected void mover() {
        
    }
}