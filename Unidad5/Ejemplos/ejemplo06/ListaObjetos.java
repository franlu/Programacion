import java.util.ArrayList;
import java.util.List;

public class ListaObjetos {
    public static void main(String[] args) {
        List<Object> lista = new ArrayList<Object>();

        lista.add("Hola");
        lista.add(123);
        lista.add(3.14);
        lista.add(true);

        for (Object obj : lista) {
            System.out.println(obj);
        }
    }
}
