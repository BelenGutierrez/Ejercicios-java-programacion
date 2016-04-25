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
public class Ejemplo02 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    ArrayList<Integer> a = new ArrayList<>();
    
    
    a.add(18);
    a.add(22);
    a.add(-30);
    
    
    System.out.println("Nº de elementos: " + a.size());
    System.out.println("El elemento que hay en la posición 1 es " + a.get(1));
  }

}
