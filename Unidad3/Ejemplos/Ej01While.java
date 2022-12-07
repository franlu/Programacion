import java.util.Scanner;

/**
 *
 * @author Fran <fran.lucena@gmail.com>
 */
public class Ejercicio01 {

    public static void main(String[] args) {

        // creamos la variable que controla las repeticiones (forma "lenta pero segura")
        boolean repetir = true;
        
        System.out.println("Introduce un número...");
        while (repetir) {
            
            // pedimos un número al usuario
            int n = new Scanner(System.in).nextInt();
            
            // si el número es 0, paramos las repeticiones
            // y en caso contrario, lo mostramos en pantalla
            if (n == 0) {
                repetir = false;
            } else {
                System.out.println("Has escrito el número " + n);
            }
        }
    }
}
