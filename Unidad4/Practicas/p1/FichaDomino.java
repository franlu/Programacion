package Librerias;

/**
 *
 * @author fran
 */
public class FichaDomino {
    
    private int lado1;
    private int lado2;
    
    
    public FichaDomino(int l1, int l2){
    
        this.lado1 = l1;
        this.lado2 = l2;
    
    }
    
    public int getLado1(){
    
        return this.lado1;
    
    }
    
    public int getLado2(){
    
        return this.lado2;
    
    }
    
    public FichaDomino voltea(){
    
        int aux = this.lado1;
        
        this.lado1 = this.lado2;
        this.lado2 = aux;
        
        return this;
    
    }
    
    public Boolean encaja(FichaDomino ficha){
    
        boolean encaja = false;
        
        boolean coincide_cara1 = (this.lado1 == ficha.getLado1() || this.lado1 == ficha.getLado2()); 
        boolean coincide_cara2 = (this.lado2 == ficha.getLado1() || this.lado2 == ficha.getLado2());
              
        if (coincide_cara1 || coincide_cara2)
            
            encaja = true;
        
        return encaja;
    
    }
    
    
    @Override
    public String toString(){
    
        String aux;
        
        int l1 = this.lado1;
        int l2 = this.lado2;
        
        boolean es_cero_l1 = (l1 == 0 && l2 != 0);
        boolean es_cero_l2 = (l1 != 0 && l2 == 0);
        boolean es_cero_l1l2 = (l1 == 0 && l2 == 0);
        
        
        if (es_cero_l1)
            
            aux = "[ " + "|" + l2 +"]";
        
        else if (es_cero_l2)
            
            aux = "["+ l1 + "| ]";
        
        else if (es_cero_l1l2)
            
            aux = "[ | ]";
        
        else
            
            aux = "["+ l1 + "|"+ l2 + "]";
        
        return aux;   
        
    }
    
    
}
