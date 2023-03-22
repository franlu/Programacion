package examen;

/**
 * Ejemplo de uso de las clase Paquete, Transportista, TransportistaOrdenado
 * 
 * @author Fran <fran.lucena@gmail.com>
 * @since 21/03/2023
 * @version 1.0
 * @see Paquete, Transportista, TransportistaOrdenado
 */
public class Principal {

    public static void main(String[] args) {
    
        Paquete amazon, libreria, dgt;
        Transportista ups;
        TransportistaOrdenado fedex;
        
        amazon = new Paquete(
                    "Logitech K120 Teclado",
                    "C/Ancha, 14",
                    1);

        libreria = new Paquete(
                    "El libro de la biología",
                    "Av. de la innovación, 1",
                    3); 
        
        try {
            
            dgt = new Paquete(
                    "Carta Certificada",
                    "C/de la colcha, 10",
                    -1); // lanza excepcion
        
        } catch (IllegalArgumentException ia){
            
            System.out.println("EXCEPCIÓN :: " + ia.getMessage() + " ::");
            
        }
        
        System.out.println(
                "El paquete de amazon y el de la libreria son: ");
        
        if (amazon.equals(libreria))
            System.out.print("iguales.");
        else
            System.out.print("diferentes.");
        
        
        
        // intrducir un tiempo de entrega pequeño para hacer las pruebas.
        ups = new Transportista(10);
        fedex = new TransportistaOrdenado(3);
        
        ups.subirCamion(amazon);
        ups.subirCamion(libreria);
                
        ups.enviar();
        
        fedex.subirCamion(amazon);
        fedex.subirCamion(libreria);
        
        fedex.enviar();
        
        System.out.println("\nPAQUETES ENTREGADOS :-) ");
    }
    
}
