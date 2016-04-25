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
public class Ejemplo08 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    
    ArrayList<Integer> a = new ArrayList<>();
    
    a.add(20);
    a.add(7);
    a.add(14);
    a.add(32);
    a.add(3);
    
    System.out.println("Contenido de la lista: ");
    
    System.out.println(a);
    
    a.removeIf(numero -> numero < 10);
    
    System.out.println("Contenido de la lista después de borrar los menores de 10: ");
    
    System.out.println(a);
  }

}
