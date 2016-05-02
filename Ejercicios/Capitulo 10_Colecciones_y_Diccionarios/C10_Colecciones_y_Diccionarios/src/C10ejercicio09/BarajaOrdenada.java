/*
 * 9. Modifica el programa anterior de tal forma que las cartas se
 *    muestren ordenadas. Primero se ordenarán por palo: bastos,
 *    copas, espadas, oros. Cuando coincida el palo, se ordenará por
 *    número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
 *    
 */
package C10ejercicio09;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author belen
 */
public class BarajaOrdenada {

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

    System.out.println("El array original es: ");

    for (Baraja b : naipes) {
      System.out.println(b);

    }

    Collections.sort(naipes);

    System.out.println("\nEl array ordenado es: ");

    for (Baraja b : naipes) {
      System.out.println(b);

    }

  }

}
