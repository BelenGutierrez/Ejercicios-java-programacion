/*
 * 9. Modifica el programa anterior de tal forma que las cartas se
 *    muestren ordenadas. Primero se ordenarán por palo: bastos,
 *    copas, espadas, oros. Cuando coincida el palo, se ordenará por
 *    número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
 *    
 */
package C10ejercicio09;

import java.util.Objects;



/**
 *
 * @author belen
 */
public class Baraja implements Comparable<Baraja> {

  private static String[] paloBaraja = {"basto", "espada", "oro", "copa"};
  private static String[] numero = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};

  private String figura;
  private String palo;
  private Integer pos;

  public Baraja() {
    this.pos = (int) (Math.random() * 10);
    this.figura = numero[pos];
    this.palo = paloBaraja[(int) (Math.random() * 4)];

  }

  public int getPos() {
    return pos;
  }

  public void setPos(int pos) {
    
        this.pos = pos;
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
    return figura + " " + palo;
  }

  @Override
  public int hashCode() {
    int hash = 3;
    return hash;
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
    if (!Objects.equals(this.pos, other.pos)) {
      return false;
    }
    return true;
  }

  
  
  
  @Override
  public int compareTo(Baraja b) {

    if (palo.equals(b.getPalo())) {
      return (this.pos).compareTo(b.getPos());

    } else {
      return palo.compareTo(b.getPalo());
    }
  }

}
