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
public class Ejemplo04 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    ArrayList<String> a = new ArrayList<>();
    
    
    a.add("rojo");
    a.add("verde");
    a.add("azul");
    a.add("blanco");
    a.add("amarillo");
    a.add("blanco");
    
    System.out.println("\nContenido de la lista: ");
    
    for (String color : a) {
      System.out.println(color);
    }
    if (a.contains("blanco")) {
      System.out.println("\nEl blanco está en la lista de colores");
    }
    a.remove("blanco");
    
    System.out.println("\nContenido de la lista después de quitar la "
            + "primera ocurrencia del color blanco: ");
    
    for (String color : a) {
      System.out.println(color);
    }
    a.remove(2);
    
    System.out.println("\nContenido de la lista después de quitar el "
            + "elemento de la posición 2: ");
    
    for (String color : a) {
      System.out.println(color);
    }
  }

}
