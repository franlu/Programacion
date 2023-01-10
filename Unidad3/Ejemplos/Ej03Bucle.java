
import java.lang.Math.pow;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Fran <fran.lucena@gmail.com>
 */
public class Ej03Bucle {

    
    public static void main(String[] args) {
        
        
        int num = 0, cuadrado = 0, cubo = 0;                
                
        System.out.println("Introduzca un numero entero");
        
        try {
            
            num = new Scanner(System.in).nextInt();
            System.out.println("ENTERO ---- CUADRADO ---- CUBO");
                   
            for(int x=num; x<num+5; x++){

                cuadrado = (int) pow(x,2);
                cubo = (int) pow(x,3);
                System.out.println(x + "   ---- " + cuadrado + "   ---- " + cubo);
            
            }
        }
        catch (InputMismatchException ex){
        
            System.out.println("ERROR: Debe introducir un número entero.");
            // System.out.println(ex.getMessage());
        }   
    }    
}
