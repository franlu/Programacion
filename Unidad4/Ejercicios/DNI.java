package Tema4;

/**
 *
 * @author Iván Parra <iparigl784@g.educaand.es>
 */
public class DNI {
    
    //ATRIBUTOS
    private int numero;
    private char letra;
    
    
    //CONSTRUCTORES
    public DNI(int n, char l) {
        this.numero = n;
        this.letra = l;
    };
    
    public DNI(String dni) {
               
        this(Integer.parseInt(
                dni.substring(0,7)),
                dni.charAt(dni.length()-1));
        
    }
    
    //GETTERS
    public String getDNI() {
       
        String aux;
        
        aux = String.valueOf(this.numero) + String.valueOf(this.letra);
                
        return aux;
    };
    
    @Override
    public String toString(){
    
        return this.getDNI();
    
    }
    
}