/**
 *
 * @author Fran <fran.lucena@gmail.com>
 */
public class Circulo implements Figura {
   private double radio;
   
   public Circulo(double radio) {
      this.radio = radio;
   }
   
   public double calcularArea() {
      return Math.PI * radio * radio;
   }
   
   public double calcularPerimetro() {
      return 2 * Math.PI * radio;
   }
}
