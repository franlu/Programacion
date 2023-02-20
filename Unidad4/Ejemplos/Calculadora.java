/**
* Interfaz Calculadora
*
* Contiene un método estatico que convierte los kilogramos en libras.
*
*
*/

public interface Calculadora {
    double sumar(double a, double b);
    double restar(double a, double b);
    double multiplicar(double a, double b);
    double dividir(double a, double b);
    
    static double convertirKgALb(double kg) {
        return kg * 2.20462;
    }
}


/**
*
* Ejemplo de uso
*
* double kg = 10;
* double lbs = Calculadora.convertirKgALb(kg);
* System.out.println(kg + " kg = " + lbs + " lbs");
*
*/
