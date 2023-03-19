package practica01;

/**
 * Representa un módelo muy básico de un Coche en la realidad 
 *   
 * @author Fran <fran.lucena@gmail.com>
 * @since 19/03/2023
 * @version 1.0
 */
public class Coche {
    
    private int numeroPuertas;
    private String color;
    private String marca;
    private String modelo;

    
    /**
     * Constructor por defecto
     */
    private Coche(){};
    
    /**
     * Constructor con parámetros
     *
     * @param m Indica el módelo de un coche
     * @param c Representa el color de un coche
     * @param np Valor con el número de puerta de un coche
     * @param ma Marca del fabricante del vehiculo
     */
    public Coche(String m, String c, int np, String ma) {
        
        this.numeroPuertas = np;
        this.color = c;
        this.marca = ma;
        this.modelo = m;
    }

    /**
     * Consulta la cantidad de puertas del coche
     *
     * @return número de puertas
     */
    public int getNumeroPuertas() {
        
        return this.numeroPuertas;
    
    }
    
    /**
     * Consulta el color del coche
     *
     * @return cadena de texto con el color
     */
    public String getColor() {
        
        return this.color;
    
    }
    
    /**
     * Consulta la marca del fabricante
     *
     * @return cadena de texto con la marca
     */
    public String getMarca() {
        
        return this.marca;
    
    }
    
    /**
     * Consulta el modelo del fabricante
     *
     * @return cadena de texto que contiene el fabricante
     */
    public String getModelo() {
        
        return this.modelo;
    
    }    
    
    /**
     * Asigna la cantidad de puertas del coche
     *
     * @param np número de puertas
     */
    public void setNumeroPuertas(int np) {
        
        this.numeroPuertas = np;
        
    }
    
    /**
     * Establece el color del coche
     *
     * @param color valor para el color de la parte exterior del coche
     */
    public void setColor(String color) {
        
        this.color = color;
        
    }
    
    /**
     * Establece la marca del coche
     *
     * @param marca valor para la marca del coche
     */
    public void setMarca(String marca) {
        
        this.marca = marca;
        
    }
    
    /**
     * Define el modelo del coche
     *
     * @param modelo valor para el modelo del coche
     */
    public void setModelo(String modelo) {
        
        this.modelo = modelo;
        
    }
    

    /**
     * Simula el proceso de arranque del motor de un coche
     *
     * @return cadena de texto con información sobre el estado
     */
    public String arrancar() {
        
        String aux= "";
            
            aux += "Arrancando el motor...";
        
        return aux;
    }

    /**
     * Simula el proceso de aceleración
     *
     * @return cadena de texto con información sobre el estado
     */
    public String acelerar() {
        String aux= "";
            
            aux += "Acelerando...";
        
        return aux;
    }

    /**
     * Simula el proceso de frenado de un coche
     *
     * @return cadena de texto con información sobre el estado
     */
    public String frenar() {
        
        String aux= "";
            
            aux += "Frenando...";
        
        return aux;
    }

    /**
     * Simula el proceso de parada del motor de un coche
     *
     * @return cadena de texto con información sobre el estado
     */
    public String parar() {
        
        String aux= "";
            
            aux += "Parando el motor...";
        
        return aux;
    }
    
    /**
     * Muestra información detallada sobre la clase
     * 
     * @return cadena de texto con los datos del coche 
     */
    @Override
    public String toString(){
    
        String aux = "";
        
            aux += "Marca: " + this.getMarca();
            aux += "\nModelo: " + this.getModelo();
            aux += "\nColor: " + this.getColor();
            aux += "\nNúmero de puertas: " + this.getNumeroPuertas();
        
        return aux;
    
    }
}