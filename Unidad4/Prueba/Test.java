package satelite;

import java.util.ArrayList;

/**
 *
 * @author fran <fran.lucena@gmail.com>
 */
public class Test {

    public static void main(String[] args) {
    
        ArrayList<Satelite> sagitario = new ArrayList();
        
        Satelite sat1 = new Satelite(1000,10000, 1000 );
        
        sat1.agregarSATConstelacion(sagitario);

        System.out.println(sat1);       
        
    }
    
}
