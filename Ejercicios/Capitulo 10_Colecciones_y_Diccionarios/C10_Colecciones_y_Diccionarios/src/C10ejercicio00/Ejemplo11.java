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
public class Ejemplo11 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    ArrayList<Gato> g = new ArrayList<>();
    
g.add(new Gato("Garfield", "naranja", "mestizo"));
g.add(new Gato("Pepe", "gris", "angora"));
g.add(new Gato("Mauri", "blanco", "manx"));
g.add(new Gato("Ulises", "marrón", "persa"));
g.add(new Gato("Adán", "negro", "angora"));

Collections.sort(g);

System.out.println("\nDatos de los gatos ordenados por nombre:");

for (Gato gatito: g) {
System.out.println(gatito+"\n");
}
  }
  
}
