
public class ComparandoAbejas {

  List<Abeja> listaAbejas = new ArrayList<>();
  listaAbejas.add(new Abeja("Abeja1", 2, 20));
  listaAbejas.add(new Abeja("Abeja2", 3, 15));
  listaAbejas.add(new Abeja("Abeja3", 1, 25));

  // ordena la lista de abejas por cantidad de miel producida
  Collections.sort(listaAbejas); 

  for (Abeja abeja : listaAbejas) {
      System.out.println(abeja.getNombre() + " produce " 
                         + abeja.getMielProducida() 
                         + " unidades de miel.");
  }
  
}
