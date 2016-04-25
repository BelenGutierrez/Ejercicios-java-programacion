/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C10ejercicio00;

/**
 *
 * @author belen
 */
public class Gato implements Comparable<Gato> {

  private String nombre;
  private String color;
  private String raza;

  public Gato(String nombre, String color, String raza) {
    this.nombre = nombre;
    this.color = color;
    this.raza = raza;
  }

  public String getNombre() {
    return nombre;
  }

  public String getRaza() {
    return raza;
  }

  public String toString() {
    return "Nombre: " + this.nombre + "\nColor: " + this.color + "\nRaza: " + this.raza;
  }

  public int compareTo(Gato g) {
    return (this.nombre).compareTo(g.getNombre());
  }

  public boolean equals(Gato g) {
    return (this.nombre).equals(g.getNombre());
  }

}
