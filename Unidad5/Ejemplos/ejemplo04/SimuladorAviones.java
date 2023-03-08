import java.util.ArrayList;

public class SimuladorAviones {
    
    public static void main(String[] args) {
        
        AvionDeCombate avion1 = new AvionDeCombate("F-16", 2400, 3000);
        AvionCaza avion2 = new AvionCaza("F-22", 2800, 3500, 8);
        AvionBombardero avion3 = new AvionBombardero("B-2", 2000, 5000, 5000);
        AvionCaza avion4 = new AvionCaza("MiG-29", 2400, 2500, 6);

        ArrayList<AvionDeCombate> listaAviones = new ArrayList<>();
        listaAviones.add(avion1);
        listaAviones.add(avion2);
        listaAviones.add(avion3);
        listaAviones.add(avion4);

        for (AvionDeCombate avion : listaAviones) {
            
            if (avion instanceof AvionCaza) {
                AvionCaza caza = (AvionCaza) avion;
                caza.atacar();
                System.out.println("Armas: " + caza.getArmamento());
            } else if (avion instanceof AvionBombardero) {
                AvionBombardero bombardero = (AvionBombardero) avion;
                bombardero.bombardear();
                System.out.println("Capacidad de carga: " + bombardero.getCapacidadCarga());
            }
            
            avion.despegar();
            avion.aterrizar();
        }
    }
}