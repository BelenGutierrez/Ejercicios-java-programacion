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
public class Ejemplo03 {

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

    /*for (int i = 0; i < a.size(); i++) {    // for tradicional

      System.out.println(a.get(i));
    }*/

    for (String color : a) {     // for each

      System.out.println(color);
    }

  }

}
