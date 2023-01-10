/**
 *
 * @author Fran <fran.lucena@gmail.com>
 */
public class Ej02TriBucle {

    
    public static void main(String[] args) {
        
              
        for(int x=0; x<=100; x++){
        
            if (x % 5 == 0) {
                System.out.println(x);
            }
        }
        
        
        int y = 0;
        while (y<=100){
            
            if (y % 5 == 0) {
                System.out.println(y);
            }
            
            y++;
        }     
        
        
        int z=0;
        do {
            
            if (z % 5 == 0) {
                System.out.println(z);
            }
            
            z++;
            
        }while(z<=100);        
        
    }    
}
