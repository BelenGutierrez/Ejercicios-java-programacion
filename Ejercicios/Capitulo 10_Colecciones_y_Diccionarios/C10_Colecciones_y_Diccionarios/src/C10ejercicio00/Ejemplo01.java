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
public class Ejemplo01 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    ArrayList<String> a = new ArrayList<>();
    
    System.out.println("Nº de elementos: " + a.size());
    
    a.add("rojo");
    a.add("verde");
    a.add("azul");
    System.out.println("Nº de elementos: " + a.size());
    
    a.add("blanco");
    System.out.println("Nº de elementos: " + a.size());
    
    
    System.out.println("El elemento que hay en la posición 0 es " + a.get(0));
    System.out.println("El elemento que hay en la posición 3 es " + a.get(3));
  }
}

