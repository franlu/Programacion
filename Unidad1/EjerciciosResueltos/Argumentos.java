/**
 *
 * @author Fran <fran.lucena@gmail.com>
 */
public class Argumentos {

    public static void main(String[] args) {
        
        // OjO IndexOutOfBoundException
        
        if (args.length == 2){
            
            System.out.println("Argumento 1: " + args[0]);
            System.out.println("Argumento 2: " + args[1]);
                 
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            int suma = n1 + n2;

            System.out.println("La suma del valor de los argumentos es: " + suma);
        
        } else {
            
            System.out.println("El número de argumentos tiene que ser igual a 2");
        
        } 
    }
}
