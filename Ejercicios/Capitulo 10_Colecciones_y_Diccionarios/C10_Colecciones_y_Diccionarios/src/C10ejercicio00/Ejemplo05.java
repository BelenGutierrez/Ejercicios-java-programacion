/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C10ejercicio00;

import java.util.ArrayList;

/**
 *
 * @author belen
 */
public class Ejemplo05 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    ArrayList<String> a = new ArrayList<String>();
    
    a.add("rojo");
    a.add("verde");
    a.add("azul");
    a.add("blanco");
    a.add("amarillo");
    
    System.out.println("Contenido del vector: ");
    
    for (String color : a) {
      System.out.println(color);
    }
    a.set(2, "turquesa");
    
    System.out.println("Contenido del vector después de machacar la posición 2: ");
    
    for (String color : a) {
      System.out.println(color);
    }
  }

}
