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
public class Ejemplo06 {

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
    
    System.out.println("Contenido de la lista: ");
    
    for (String color : a) {
      System.out.println(color);
    }
    a.add(1, "turquesa");
    
    System.out.println("Contenido de la lista después de insertar en la posición 1: ");
    
    for (String color : a) {
      System.out.println(color);
    }
  }

}
