import java.util.Scanner;
/**
 *
 * @author Fran <fran.lucena@gmail.com>
 */
public class Ejercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int n = 0;
        int aux;
        double media;


        System.out.println("==========================");
        System.out.println("=====  EJERCICIO 04  =====");
        System.out.println("==========================\n");

        while (suma <= 10000) {

            System.out.print("Ingrese un valor (positivo) para acumularlo: ");
            aux = scanner.nextInt();

            if (aux <= 0){
                System.out.println("\n                  ERROR \n");
                System.out.println("**********************************************");
                System.out.println("* El último valor introducido NO es positivo *");
                System.out.println("**********************************************\n");
            }

            suma += aux;
            n++;
        }

        media = (double) suma / n;
        System.out.println("\nTotal de valores acumulados: " + suma);
        System.out.println("Total de valores introducidos: " + n);
        System.out.println("Media de valores: " + media + "\n");
    }
}
