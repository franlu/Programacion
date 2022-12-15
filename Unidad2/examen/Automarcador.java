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
        String aux;
        char opcion;
        boolean partidoEnJuego = true;
        int puntos;
        Scanner leerTeclado = new Scanner(System.in);

        // Declarar e inicializar el objeto MarcadorBaloncesto
        MarcadorBaloncesto marcador = new MarcadorBaloncesto(nLocal, nVisitante);

        // Menu Inicial
        System.out.println(
                "Marcador automático entre equipos. Local: " + marcador.getNombreLocal()
                + "; Visitante: " + marcador.getNombreVisitante());
        System.out.println(
                "Pulsa la letra 'P' para visualizar el marcador actual");
        System.out.println(
                "Pulsa la letra 'S' para visualizar el marcador final y terminar el partido.");
        System.out.println("1) indique el equipo anotador: 'L' (local) o 'V' (visitante)");
        System.out.println("2) Marque la puntuación anotada: (1,2,3) + INTRO");


        while (partidoEnJuego) { // opcion == 'S'

            System.out.println(
                    "a) indique equipo anotador (L|V), S (salir), P (puntos actuales):");

            // almacenar el primer caracter que pulsa el usuario
            opcion = leerTeclado.next().charAt(0);


            if (opcion == 'L' || opcion == 'V') {

                System.out.println("b) indique la puntuación de la canasta");
                aux = leerTeclado.next();
                puntos = Integer.parseInt(aux);

                while (puntos < 1 || puntos > 3) {

                    System.out.println("ERROR: Puntuación no válida");
                    System.out.println("Pulse una tecla válida: 1, 2 o 3.");
                    aux = leerTeclado.next();
                    puntos = Integer.parseInt(aux);

                }

                marcador.anotarCanasta(opcion, puntos);

                if (opcion == 'L') {

                    System.out.println(
                    "Marca LOCAL con una canasta de "
                            + puntos + " puntos.");
                } else {

                    System.out.println(
                    "Marca VISITANTE con una canasta de "
                            + puntos + " puntos.");
                }

            } else if (opcion == 'P') {

                System.out.println("En estos momentos:");
                System.out.println(marcador.toString());

                if (marcador.getPuntosLocal() > marcador.getPuntosVisitante()){

                    System.out.println(""
                        + "Va ganando el equipo LOCAL: "
                        + marcador.getNombreEquipoGanador());

                } else if (marcador.getPuntosLocal() < marcador.getPuntosVisitante()) {

                    System.out.println(""
                        + "Va ganando el equipo VISITANTE: "
                        + marcador.getNombreEquipoGanador());
                } else {
                    // Si el partido esta en EMPATE getNombreEquipoGanado devuelve null
                    System.out.println("El partido se encuentra en EMPATE");

                }

            } else if (opcion == 'S') {

                System.out.println("Ha pulsado salir del marcador.");
                System.out.println("Fin del partido. Marcador final:");
                System.out.println(marcador.toString());
                partidoEnJuego = false;

            } else {

                System.out.println("ERROR: Opción Incorrecta");
                System.out.println("Pulse una tecla válida (L, V, P o S)");

            }
        }
    }
}
