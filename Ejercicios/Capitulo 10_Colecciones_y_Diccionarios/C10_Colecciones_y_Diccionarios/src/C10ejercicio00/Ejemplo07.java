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
public class Ejemplo07 {

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
    System.out.println(a);

    a.removeIf(palabra -> palabra.contains("a"));

    System.out.println("Contenido de la lista después de borrar las palabras que contienen la letra \"a\": ");

    System.out.println(a);
  }

}
