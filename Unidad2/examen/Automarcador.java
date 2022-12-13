package automarcador;

import java.util.Scanner;
import bpc.daw.objetos.MarcadorBaloncesto;
/**
 *
 * @author Fran <fran.lucena@gmail.com>
 */
public class Automarcador {

    public static void main(String[] args) {
        
        String nLocal = "Estudiantes";
        String nVisitante = "CB Granada";
        char opcion = ' ';
        String puntos;
        int ptos;
        Scanner scan = new Scanner(System.in);
        
        MarcadorBaloncesto marcador = new MarcadorBaloncesto(nLocal, nVisitante);
        
        System.out.println(
                "Marcador automático entre equipos. Local: " + marcador.getNombreLocal()
                + "; Visitante: " + marcador.getNombreVisitante());
        System.out.println(
                "Pulsa la letra 'P' para visualizar el marcador actual");
        System.out.println(
                "Pulsa la letra 'S' para visualizar el marcador final y terminar el partido.");
        System.out.println("1) indique el equipo anotador: 'L' (local) o 'V' (visitante)");
        System.out.println("2) Marque la puntuación anotada: (1,2,3) + INTRO");
        
        
        while (opcion != 'S') {
            
            System.out.println(
                    "a) indique equipo anotador (L|V), S (salir), P (puntos actuales):");
            opcion = scan.next().charAt(0);
            
            switch (opcion){
                case 'L':
                    System.out.println("b) indique la puntuación de la canasta");
                    puntos = scan.next();
                    ptos = Integer.parseInt(puntos);
                    marcador.anotarCanasta(opcion, ptos);
                    System.out.println(
                            "Marca Local con una canasta de "
                            + puntos + "puntos.");
                    break;
                case 'V':
                    System.out.println("b) indique la puntuación de la canasta");
                    puntos = scan.next();
                    ptos = Integer.parseInt(puntos);
                    marcador.anotarCanasta(opcion, ptos);
                    System.out.println(
                            "Marca Visitante con una canasta de " 
                            + puntos + "puntos.");
                    break;
                case 'P':
                    System.out.println("En estos momentos:");
                    System.out.println(marcador.toString());
                    System.out.println(""
                            + "Va ganando el equipo: " 
                            + marcador.getNombreEquipoGanador());
                    break;
                case 'S':
                    System.out.println("Ha pulsado salir del marcador.");
                    System.out.println("Fin del partido. Marcador final:");
                    System.out.println(marcador.toString());
                    break;
                default:
                    System.out.println("Opción Incorrecta.");
            }  
        }
    }
}
