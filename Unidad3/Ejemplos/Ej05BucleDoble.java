/**
 * Muestra por pantalla la siguiente figura
 *
 *    *********
 *    ********
 *    *******
 *    ******
 *    *****
 *    ****
 *    ***
 *    **
 *    *
 *
 * @author Fran <fran.lucena@gmail.com>
 */
public class Ej05BucleDoble {

    public static void main(String[] args) {
        
        for(int x=0; x<=8; x++){
          for(int y=x; y<=8; y++){
            System.out.print("*");
          }
          System.out.println();
        } 
    } // main
} // clase
