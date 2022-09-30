
package hl.tema1.formulamatematica;


public class FormulaMatematica {

    public static void main(String[] args) {
        
        double numerador, denominador, resultado, base = 0;
        int x;
        
        x=0;
        numerador = 3 * Math.pow(x/2,3);
        denominador = Math.pow(x, 2) - x + 3;
        resultado = numerador / denominador;
        
        System.out.println("f(0) = "+ resultado);
        
        x=1;
        numerador = 3 * Math.pow(x/2,3);
        denominador = Math.pow(x, 2) - x + 3;
        resultado = numerador / denominador;
        
        System.out.println("f(1) = "+ resultado);
        
        x=-2;
        numerador = 3 * Math.pow(x/2,3);
        denominador = Math.pow(x, 2) - x + 3;
        resultado = numerador / denominador;
        
        System.out.println("f(-2) = "+ resultado);       
        
    }
}
