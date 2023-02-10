package T4p01;

import Librerias.*;

/**
 *
 * @author fran
 */
public class T4p01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Incidencia inc1 = new Incidencia(105, "No tiene acceso a internet");
        Incidencia inc2 = new Incidencia(14, "No arranca");
        Incidencia inc3 = new Incidencia(5, "La pantalla se ve rosa");
        Incidencia inc4 = new Incidencia(237, "Hace un ruido extraño");
        Incidencia inc5 = new Incidencia(111, "Se cuelga al abrir 3 ventanas");
        inc2.resuelve("El equipo no estaba enchufado");
        inc3.resuelve("Cambio del cable VGA");
        
        System.out.println(inc1);
        System.out.println(inc2);
        System.out.println(inc3);
        System.out.println(inc4);
        System.out.println(inc5);
        System.out.println("Incidencias pendientes: " + Incidencia.getPendientes());
        
        /** SALIDA
         * 
         *   Incidencia 1 - Puesto: 105 - No tiene acceso a internet - Pendiente
         *   Incidencia 2 - Puesto: 14 - No arranca - Resuelta - El equipo no estaba enchufado
         *   Incidencia 3 - Puesto: 5 - La pantalla se ve rosa - Resuelta - Cambio del cable VGA
         *   Incidencia 4 - Puesto: 237 - Hace un ruido extraño - Pendiente
         *   Incidencia 5 - Puesto: 111 - Se queda colgado al abrir 3 ventanas - Pendiente
         *   Incidencias pendientes: 3
         * 
         */
        
        FichaDomino f1 = new FichaDomino(6,1);
        FichaDomino f2 = new FichaDomino(0,4);
        FichaDomino f3 = new FichaDomino(3,3);
        FichaDomino f4 = new FichaDomino(0,1);
        
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        
        System.out.println(f2.voltea());
        System.out.println(f2.encaja(f4));
        System.out.println(f1.encaja(f4));
        System.out.println(f1.encaja(f3));
        System.out.println(f1.encaja(f2));
        
         /** SALIDA
         * 
         *  [6|1]
         *  [ |4]
         *  [3|3]
         *  [ |1]
         *  [4| ]
         *  true
         *  true
         *  false
         *  false
         * 
         */
    }
    
}
