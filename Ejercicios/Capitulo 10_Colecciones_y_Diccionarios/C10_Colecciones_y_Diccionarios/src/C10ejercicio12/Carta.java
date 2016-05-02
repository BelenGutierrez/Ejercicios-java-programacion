/*
 * * 12. Escribe un programa que genere una secuencia de 5 cartas de la
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
 */
package C10ejercicio12;

import java.util.Objects;

/**
 *
 * @author belen
 */
public class Carta {

  private static String[] paloBaraja = {"basto", "espada", "oro", "copa"};
  private static String[] numero = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};

  private String figura;
  private String palo;

  
  public Carta() {

    this.figura = numero[(int) (Math.random() * 10)];
    this.palo = paloBaraja[(int) (Math.random() * 4)];

  }

  public String getFigura() {
    return figura;
  }

  public void setFigura(String figura) {
    this.figura = figura;
  }

  public String getPalo() {
    return palo;
  }

  public void setPalo(String palo) {
    this.palo = palo;
  }

  @Override
  public String toString() {
    return  figura + " " + palo ;
  }

 

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Carta other = (Carta) obj;
    if (!Objects.equals(this.figura, other.figura)) {
      return false;
    }
    if (!Objects.equals(this.palo, other.palo)) {
      return false;
    }
    return true;
  }

  
  

}
