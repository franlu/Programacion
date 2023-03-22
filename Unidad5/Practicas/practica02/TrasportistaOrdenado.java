package examen;

import java.util.Collections;

/**
 * Representa una entidad encargada de gestionar envios ordenados a través de paquetes.

 * 
 * @author Fran <fran.lucena@gmail.com>
 * @since 21/03/2023
 * @version 1.0
 * @see Transportista
 */
public class TransportistaOrdenado extends Transportista {
    
    /**
     * Constructro con parámetros
     * 
     * @param te tiempo de entrega
     */
    public TransportistaOrdenado(long te) {
        
        super(te);
    
    }

    /**
     * Añadir un paquete al camión del transportista.
     * 
     * @param p paquete que va a ser enviado
     */
    @Override
    public void subirCamion(Paquete p) {
        
        super.subirCamion(p);
    
    }

    /**
     * Simular el envio de una lista ordenada de paquetes a su destino.
     */
    @Override
    public void enviar() {
        
        Collections.sort(super.getPaquetes());
        super.enviar();
    }
}

