/*
 * 8. Realiza un programa que escoja al azar 10 cartas de la baraja
 *    española (10 objetos de la clase <code>Carta</code>). Emplea un
 *    objeto de la clase <code>ArrayList</code> para almacenarlas y
 *    asegúrate de que no se repite ninguna.
 */
package C10ejercicio08;

import java.util.ArrayList;

/**
 *
 * @author belen
 */
public class PruebaBaraja {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    ArrayList<Baraja> naipes = new ArrayList<>();

    Baraja aux = new Baraja();
    naipes.add(aux);

    for (int i = 0; i < 9; i++) {

      do {
        
        aux = new Baraja();

      } while (naipes.contains(aux));

      naipes.add(aux);
    }
    for (Baraja b : naipes) {
      System.out.println(b);

    }

  }

}
