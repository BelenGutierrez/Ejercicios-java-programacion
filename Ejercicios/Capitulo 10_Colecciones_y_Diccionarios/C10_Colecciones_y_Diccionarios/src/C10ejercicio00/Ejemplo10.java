/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C10ejercicio00;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author belen
 */
public class Ejemplo10 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    ArrayList<Integer> a = new ArrayList<>();
    
    
    a.add(67);
    a.add(78);
    a.add(10);
    a.add(4);
    
    System.out.println("\nNúmeros en el orden original:");
    
    for (int numero : a) {
      System.out.println(numero);
    }
    
    Collections.sort(a);
    
    System.out.println("\nNúmeros ordenados:");
    
    for (int numero : a) {
      System.out.println(numero);
    }
  }

}
