/**
 * Clase que representa un satelite.
 *
 * @author Fran <fran.lucena@gmail.com>
 */
public class Satelite implements MedidorAmbiental {
   
  public double medirTemperatura() {
      // código para medir la temperatura desde el satélite
      return temperatura;
   }
   
   public double medirPresion() {
      // código para medir la presión atmosférica desde el satélite
      return presion;
   }
}
