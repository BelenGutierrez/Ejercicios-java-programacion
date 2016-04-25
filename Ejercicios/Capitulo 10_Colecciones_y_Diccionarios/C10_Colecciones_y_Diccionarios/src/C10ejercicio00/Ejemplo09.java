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
public class Ejemplo09 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    ArrayList<Gato> g = new ArrayList<>();

    g.add(new Gato("Garfield", "naranja", "mestizo"));
    g.add(new Gato("Pepe", "gris", "angora"));
    g.add(new Gato("Mauri", "blanco", "manx"));
    g.add(new Gato("Ulises", "marrón", "persa"));

    System.out.println("\nDatos de los gatos:\n");

    for (Gato gatoAux : g) {
      System.out.println(gatoAux + "\n");
    }
    
    /*System.out.println(g);*/
  }

}


