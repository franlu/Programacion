package ejercicio23;

import java.util.Scanner;


public class Ejercicio23 {

    public static void main(String[] args) {
        
        final double APROBADO = 5.0;
        final String BACKGROUND_GREEN = "\u001B[32m";
        final String ANSI_RESET = "\u001B[0m";
        
        double n1, n2, n3;
        double media;
        boolean esta_aprobado;
        
        System.out.println(BACKGROUND_GREEN + "============================" + ANSI_RESET);
        System.out.println(BACKGROUND_GREEN + "=      Ejercicio 23        =" + ANSI_RESET);
        System.out.println(BACKGROUND_GREEN + "============================" + ANSI_RESET);
        
        System.out.println("Introduce la nota del primer ejercicio");
        n1 = new Scanner(System.in).nextDouble();
        System.out.println("Introduce la nota del segundo ejercicio");
        n2 = new Scanner(System.in).nextDouble();
        System.out.println("Introduce la nota del tercer ejercicio");
        n3 = new Scanner(System.in).nextDouble();
        
        media = (n1 + n2 + n3) / 3;
        esta_aprobado = media >= APROBADO;
        
        /*
            El uso de la estructura condicional es opcional
            Lo veremos al final del tema en profundidad
        */
        if (media >= APROBADO) {
            System.out.println("El alumno esta aprobado");
        }
        else {
        
            System.out.println("El alumno esta kateado");       
        }
    }
    
}
