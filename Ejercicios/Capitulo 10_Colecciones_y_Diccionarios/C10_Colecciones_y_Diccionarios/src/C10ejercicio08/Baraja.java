/*
 * 8. Realiza un programa que escoja al azar 10 cartas de la baraja
 *    española (10 objetos de la clase <code>Carta</code>). Emplea un
 *    objeto de la clase <code>ArrayList</code> para almacenarlas y
 *    asegúrate de que no se repite ninguna.
 */
package C10ejercicio08;

import java.util.Objects;

/**
 *
 * @author belen
 */
public class Baraja {
  
   private static String[] paloBaraja= {"basto", "espada", "oro", "copa"};
  private static String[] numero = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
  private String figura;
  private String palo;
  
  public Baraja() {
    figura = numero[(int)(Math.random()*10)];
    palo = paloBaraja[(int)(Math.random()*4)];
   
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
    final Baraja other = (Baraja) obj;
    if (!Objects.equals(this.figura, other.figura)) {
      return false;
    }
    if (!Objects.equals(this.palo, other.palo)) {
      return false;
    }
    return true;
  }
  
  
  
  
  
  
}
