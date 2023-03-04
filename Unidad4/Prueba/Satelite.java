package satelite;

import java.util.ArrayList;

/**
 * Representa un modelo de objeto basado en las caracteristicas y funciones que 
 * tiene un satelite artificial de reconocimiento. Esta clase define el ciclo de 
 * vida de un satelite que orbita alrededor de un planeta.
 * https://www.esa.int/
 * 
 * @author fran <fran.lucena@gmail.com>
 * @version 1.0 
 * @since 22-02-2023
 * @see "Ejemplo de uso en Test.java"
 */
public class Satelite {
    
    // CONSTANTES
    public static final int BAT_MAX = 2000;
    public static final int BAT_80 = 1600;
    public static final int BAT_50 = 1000;
    public static final int HGEO = 35786; // Expresado en Kms
    public static final int MIN_SATS = 3;
    
    // VARIABLES
    private int ID;
    private int nivelBateria;
    private double sensorAltura;
    private boolean operativo;
    
    public static int totalSatelites;
    
    /**
     * Constructor por defecto
     */
    private Satelite(){};
    
    /**
     * Constructor con parámetros
     * 
     * @param id Representa el nº de serie de un satelite
     * @param bateria Define el nivel de carga de la bateria. Rango [0-2000]
     * @param altura Distacia entre el satelite y la superficie del planeta.
     *               Se expresa en Kms dentro del rango [0-35786]
     */
    public Satelite(int id, int bateria, double altura){
    
        this.ID = id;
        this.nivelBateria = bateria;
        this.sensorAltura = altura;
        this.operativo = false;
        
        Satelite.totalSatelites++;
    
    }
    
    /**
     * Obtiene la altura a la que se encuentra un satelite.
     * 
     * @return  Distacia entre el satelite y la superficie del planeta
     */
    public int getAlturaSAT(){
    
        return (int)(this.sensorAltura);
        
    }
    
    /**
     * Obtiene el nivel de carga de la bateria del satelite.
     * 
     * @return Nivel de carga de la bateria.
     */
    public int getEstadoCargaSAT(){
    
        return this.nivelBateria;
        
    }
    
    /**
     * Añadir el satelite a una constelación
     * 
     * @param grupoSatelites Constelación a la que se va a añadir el satelite
     * @return <ul><li>true El satelite se ha añadido a la constelación</li>
     *         <li>false El satelite no ha sido añaddido a la constelación</li></ul>
     */
    public boolean agregarSATConstelacion(ArrayList<Satelite> grupoSatelites){
    
        boolean operacion = false;
        
        grupoSatelites.add(this);
 
        if (grupoSatelites.size() == grupoSatelites.size() + 1)
        
            operacion = true;
            
        return operacion;
    
    }    
    
    /**
     * Comprueba si un grupo de satelites cumple los requisitos para ser lanzados.
     * 
     * @param flota Conjunto de satelites que se quieren lanzar.
     * @return <ul><li>true Se cumplen los requisitos para realizar el lanzamiento.</li>
               <li>false NO se cumplen los requisitos de lanzamiento.</li></ul> 
     * @throws Exception No se han cumplido los requisitos para el lanzamiento.
     */
    public static boolean lanzamientoSatelites(ArrayList<Satelite> flota) throws Exception {
    
        if (flota.size() < Satelite.MIN_SATS) {
        
            throw new Exception(
                    "Son necesarios al menos 3 satelites, para poder"
                    + " realizar el lanzamiento de la flota.");
        
        }
        
        for (Satelite s : flota) {
        
            if (s.getEstadoCargaSAT() <= Satelite.BAT_80){
                
                throw new Exception(
                    "El nivel de carga de alguno de los satelites esta"
                    + "por debajo del 80%.");
            }
        }
        
        return true;
    
    
    }
    
    /**
     * Obtiene el número de satelites operativos de una constelación o flota.
     * En caso de que el número de elementos de la flota sea menor a dos,
     * se sacan de orbita los satelites de la flota.
     * 
     * @param flota Conjunto de satelites que estan en orbita
     * @return Número de satelites operativos.
     * @throws Exception La flota contienes menos de dos satelites operativos
     */
    public static int operacionFlotaSatelites(ArrayList<Satelite> flota) throws Exception {
    
        int satOperativos = 0;
        int satInoperativos = 0;
               
        for (Satelite s : flota){
            
            if ((s.getAlturaSAT() == Satelite.HGEO) && (s.getEstadoCargaSAT() <= Satelite.BAT_50)){
                
                satOperativos++;
                
            } else {
                
                Satelite.desintegracionSAT(s, s.ID); // opcional
                
            }
            
        }
        
        if (satOperativos < 2) {
        
            satInoperativos = Satelite.desorbitarFlotaSATS(flota);
            
            throw new Exception(
                    "El tamaño de la flota es inferior a dos satelites. Se han"
                    + "sacado de orbita los satelites de la flota");
        
        }
               
        return satOperativos;
    
    }
    
    
    /**
     * Desintegrar un satélite
     * 
     * @param satelite Satélite que va a ser destruido.
     * @param id Identificador del satelite que va a ser destruido.
     * @return el identifcador del satelite desintegrado
     */
    private static int desintegracionSAT(Satelite satelite, int id){
        
        if (satelite.ID == id) {
        
            satelite.operativo = false;
            satelite.sensorAltura = 300;
            
            Satelite.totalSatelites--;
        
        }
               
        return satelite.ID;
    
    }
    
    
    /**
     * Sacar de su orbita un conjunto de satelites.
     * 
     * @param flota Conjunto de satelites que se quieren sacar de orbita.
     * @return El número de satelites que se han sacado de orbita 
     */
    public static int desorbitarFlotaSATS(ArrayList<Satelite> flota){
        
        int total = 0;
        int idSat = 0;
        
        for (Satelite s: flota) {
            
            idSat = Satelite.desintegracionSAT(s,s.ID);
            total++;
            
        }
        
        return total; //flota.size()
    
    }
    
    /**
     * Muestra información sobre el satélite
     * 
     * @return Cadena de caracteres con los datos del satélite
     */
    @Override
    public String toString() {
        
        String aux = "";
        
            aux += "ID: "+ this.ID;
            aux += "\nAltura: " + this.getAlturaSAT();
            aux += "\nBateria: " + this.getEstadoCargaSAT();
            
            if (this.operativo) {
                aux += "\nEstado: Operativo.";        
            }
            else{
                aux += "\nEstado: Inoperativo.";
            }
            
            aux += "\nTotal de Satelites: " + Satelite.totalSatelites;
        
        return aux;
    }
}
