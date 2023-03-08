public class EjemploInsecto {

    public static void main(String[] args) {
        
        Insecto insecto1 = new Insecto("Abeja", "Flor", 6, "Amarillo");
        Insecto insecto2 = new Insecto("Abeja", "Flor", 6, "Amarillo");
        Insecto insecto3 = new Insecto("Mariquita", "Planta", 6, "Rojo");

        // Usando el método toString()
        System.out.println(insecto1.toString());

        // Usando el método equals()
        System.out.println(insecto1.equals(insecto2)); // Debería imprimir true
        System.out.println(insecto1.equals(insecto3)); // Debería imprimir false

        // Usando el método hashCode()
        System.out.println(insecto1.hashCode());
        System.out.println(insecto2.hashCode());
        System.out.println(insecto3.hashCode());
    }
}