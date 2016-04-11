/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C9ejercicio02;

/**
 *
 * @author belen
 */
public class Coche extends Vehiculo {
  
  private int matriculacion = 0;
  
  public Coche(int m) {
    super();
    this.matriculacion = m;
  }

  public void aparca() {
    System.out.println("Mira como se aparca sin rozar a los demás coches");
  }
  
}
