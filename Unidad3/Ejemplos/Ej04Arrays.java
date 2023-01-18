import java.util.ArrayList;

public class Ej04Arrays {
  
	public static void main(String[] args) {
		
		ArrayList<String> canciones = new ArrayList<>();
		
		canciones.add("El porompompero - Manolo Escobar");
		canciones.add("Salta - King África");
		canciones.add("La mané - Cantajuegos");
		
    System.out.println("Recorriendo 1ª forma");
		
    for (String cancion : canciones) {
			System.out.println(cancion);
		}
		
    System.out.println("Recorriendo 2ª forma");
		
    for (int x = 0; x < canciones.size(); x++) {
			System.out.println(canciones.get(x));
		}
		
    System.out.println("Recorriendo 3ª forma");
		
		canciones.forEach((cancion) -> {
			System.out.println(cancion);
		});
	}
}
