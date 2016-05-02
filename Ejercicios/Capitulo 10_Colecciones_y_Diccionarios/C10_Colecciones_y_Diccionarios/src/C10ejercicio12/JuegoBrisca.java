/*
 * 12. Escribe un programa que genere una secuencia de 5 cartas de la
 *     baraja española y que sume los puntos según el juego de la
 *     brisca. El valor de las cartas se debe guardar en una estructura
 *     <code>HashMap</code> que debe contener parejas (figura, valor),
 *     por ejemplo ("caballo", 3).
 *
 *     La secuencia de cartas debe ser una estructura de la clase <code>
 *     ArrayList</code> que contiene objetos de la clase <code>Carta
 *     </code>. El valor de las cartas es el siguiente: as → 11, tres →
 *     10, sota → 2, caballo → 3, rey → 4; el resto de cartas no vale
 *     nada.
 *
 *     Ejemplo:
 *     as de oros
 *     cinco de bastos
 *     caballo de espadas
 *     sota de copas
 *     tres de oros
 *     Tienes 26 puntos
 *
 */
package C10ejercicio12;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author belen
 */
public class JuegoBrisca {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    HashMap<String, Integer> valores = new HashMap<>();

    valores.put("as", 11);
    valores.put("dos", 0);
    valores.put("tres", 10);
    valores.put("cuatro", 0);
    valores.put("cinco", 0);
    valores.put("seis", 0);
    valores.put("siete", 0);
    valores.put("sota", 2);
    valores.put("caballo", 3);
    valores.put("rey", 4);

    int puntos = 0;

    ArrayList<Carta> naipesBrisca = new ArrayList<>();

    Carta aux = new Carta();
    naipesBrisca.add(aux);

    for (int i = 1; i < 5; i++) {

      do {

        aux = new Carta();

      } while (naipesBrisca.contains(aux));

      naipesBrisca.add(aux);

    }
    System.out.println("Sus cartas son: ");

    for (Carta b : naipesBrisca) {
      System.out.println(b);
      puntos = puntos + valores.get(b.getFigura());
    }
    System.out.println("");
    System.out.println("Tiene " + puntos + "puntos");

  }
}
