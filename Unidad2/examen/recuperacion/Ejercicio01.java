import java.io.*;
import java.time.*;
import java.util.Scanner;
/**
 *
 * @author Fran <fran.lucena@gmail.com>
 */
public class Ejercicio01 {

    public static void main(String[] args) {

        Scanner leerTeclado = new Scanner(System.in);
        char opcion = ' ';
        boolean salir = false;

        // estilos.css debe estar en el mismo directorio que el fichero .java
        File archivo = new File("estilos.css");

        while (!salir) {

            // pintar menu
            System.out.println("=================================");
            System.out.println("=             MENÚ              =");
            System.out.println("=-------------------------------=");
            System.out.println("= a - Mostra nombre y ruta      =");
            System.out.println("= b - Mostrar nombre y tamaño   =");
            System.out.println("= c - Ver contenido CSS         =");
            System.out.println("= d - Cambiar nombre            =");
            System.out.println("= e - Crear fichero minifier    =");
            System.out.println("= f - Ver contenido de minifier =");
            System.out.println("= g - Calcular diferencia       =");
            System.out.println("= h - Mostrar tiempo empleado   =");
            System.out.println("= s - Salir                     =");
            System.out.println("=================================");

            opcion = leerTeclado.next().charAt(0);

            switch (opcion) {
                    case 'a': // nombre y ruta

                        break;

                    case 'b': // nombre y tamaño

                        break;

                    case 'c': // Contenido

                        break;

                    case 'd': // Cambiar nombre

                        break;

                    case 'e': // Eliminar separadores

                        break;

                    case 'f': // Ver minifier

                        break;

                    case 'g': // Diferecia después de eliminar separadores

                        break;

                    case 'h': // tiempo empleado en eliminar separadores

                        break;

                    case 's': // Salir
                        System.out.println("\nFIN del programa.");
                        System.out.println("¡Qué la suerte te acompañe!");
                        salir = true;
                        break;

                    default:
                        System.out.println("Opción NO válida.");
                        System.out.println("Teclee: a, b, c , d , e, f, g, h o s");

            }
        }
    }
}
