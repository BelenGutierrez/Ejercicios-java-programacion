/*
 * 7. La máquina Eurocoin genera una moneda de curso legal cada vez que
 *    se pulsa un botón siguiendo la siguiente pauta: o bien coincide el
 *    valor con la moneda anteriormente generada - 1 céntimo, 2 céntimos,
 *    5 céntimos, 10 céntimos, 25 céntimos, 50 céntimos, 1 euro o 2 euros -
 *    o bien coincide la posición – cara o cruz. Simula, mediante un
 *    programa, la generación de 6 monedas aleatorias siguiendo la pauta
 *    correcta. Cada moneda generada debe ser una instancia de la clase
 *    Moneda y la secuencia se debe ir almacenando en una lista.
 *    Ejemplo:
 *    2 céntimos – cara
 *    2 céntimos – cruz
 *    50 céntimos – cruz
 *    1 euro – cruz
 *    1 euro – cara
 *    10 céntimos – cara
 */
package C10ejercicio07;

import java.util.ArrayList;

/**
 *
 * @author belen
 */
public class Eurocoin {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    ArrayList<Moneda> dineritoFacil = new ArrayList<>();

    Moneda aux = new Moneda();
    dineritoFacil.add(aux);

    String ultimaPosicion = aux.getPosicion();
    String ultimaCantidad = aux.getCantidad();

    for (int i = 0; i < 5; i++) {

      do {
        aux = new Moneda();

      } while (!((aux.getPosicion()).equals(ultimaPosicion)) && !((aux.getCantidad()).equals(ultimaCantidad)));

      dineritoFacil.add(aux);

      ultimaPosicion = aux.getPosicion();
      ultimaCantidad = aux.getCantidad();

    }
    
    for ( Moneda m: dineritoFacil)
    System.out.println(m);

  }

}
