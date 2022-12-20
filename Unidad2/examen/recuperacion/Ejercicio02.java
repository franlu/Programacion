
import java.util.Scanner;
/**
 *
 * @author Fran <fran.lucena@gmail.com>
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] lista = new int[5];
        int posicion;

        System.out.println("==========================");
        System.out.println("=====  EJERCICIO 02  =====");
        System.out.println("==========================\n");

        // ArrayIndexOutOfBoundsException

        System.out.println("Indica la posición de la lista que quieres consultar: "
                  + " (de 0 a 4):");
        posicion = scanner.nextInt();

        try {

          System.out.println("El valor de la lista en la posición " + posicion +
                  " es: " + lista[posicion]);

        } catch (ArrayIndexOutOfBoundsException ex) {

            System.out.println("\n                  ERROR \n");
            System.out.println("**********************************************");
            System.out.println("*** La posicion NO esta dentro de la lista ***");
            System.out.println("**********************************************\n");

            // System.out.println(ex.getMessage());
        }

        // NumberFormatException

        System.out.println("Teclea un número entero:");
        String cadena = scanner.next();
        int entero;

        try {

            entero = Integer.parseInt(cadena);
            System.out.println("El número tecleado es: " + entero);

        } catch (NumberFormatException ex) {

            System.out.println("\n                  ERROR \n");
            System.out.println("**********************************************");
            System.out.println("** El valor tecleado NO es un número entero **");
            System.out.println("**********************************************\n");

            // System.out.println(ex.getMessage());

        }

        // ArithmeticException

        int dividendo, divisor, resultado;

        System.out.println("Ingresa el valor del dividendo:");
        dividendo = scanner.nextInt();
        System.out.println("Ingresa el valor del divisor:");
        divisor = scanner.nextInt();

        try {

          resultado = dividendo / divisor;
          System.out.println("El resultado de la division es: " + resultado);

        } catch (ArithmeticException ex) {

            System.out.println("\n                  ERROR \n");
            System.out.println("**********************************************");
            System.out.println("*** El valor del divisor NO puede ser cero ***");
            System.out.println("**********************************************\n");

            // System.out.println(ex.getMessage());
        }
