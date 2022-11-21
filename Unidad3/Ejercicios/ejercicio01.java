
import java.util.Scanner;

/**
 *
 * @author Fran <fran.lucena@gmail.com>
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        
       String[] canciones = {
           "paquito-chocolatero.mp3",
           "highway-to-hell.mp3",
           "eso-que-tu-me-das.mp3",
           "despecha.mp3",
           "la-bilirrubina.mp3"
       };
       
       System.out.println("===============================================");
       System.out.println("= Elige el número de canción para reproducir  =");
       System.out.println("===============================================");
       System.out.println("=       1 - Paquito el chocolatero.           =");
       System.out.println("=       2 - Highway to Hell.                  =");
       System.out.println("=       3 - Eso que tú me das.                =");
       System.out.println("=       4 - Despechá.                         =");
       System.out.println("=       5 - La Bilirrubina.                   =");
       System.out.println("===============================================");
       
       Scanner cadena = new Scanner(System.in);
       int num = Integer.parseInt(cadena.nextLine());
       
       switch(num){
           case 1:
               System.out.println("Reproduciendo: "+ canciones[0]);
               break;
           case 2:
               System.out.println("Reproduciendo: "+ canciones[1]);
               break;
           case 3:
               System.out.println("Reproduciendo: "+ canciones[2]);
               break;
           case 4:
               System.out.println("Reproduciendo: "+ canciones[3]);
               break;
           case 5:
               System.out.println("Reproduciendo: "+ canciones[4]);
               break;
           default:
                System.out.println("El número elegido NO aparece en la lista.");
       }
        
    }
}
