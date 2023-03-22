package examen;

import java.util.List;

/**
 * Define los requisitos que tiene que tener una clase para ser considerada
 * una empresa de paquetería.
 * 
 * @author Fran <fran.lucena@gmail.com>
 * @since 21/03/2023
 * @version 1.0
 * @see Paquete, Transportista
 */
public interface EmpresaPaqueteria {
    
    /**
     * Aceptar pedido y asignar un repartidor
     * 
     * @param p el paquete que va a ser registrado 
     */
    public void registrarPedido(Paquete p);
    
    /**
     * Consulta los transportista que trabajan para la empresa.
     * 
     * @return List lista de transportistas
     */
    public List<Transportista> getTransportistas();
    
    /**
     *  Enviar paquetes a su destino.
     */
    public default void enviarPaquetes(){}
}