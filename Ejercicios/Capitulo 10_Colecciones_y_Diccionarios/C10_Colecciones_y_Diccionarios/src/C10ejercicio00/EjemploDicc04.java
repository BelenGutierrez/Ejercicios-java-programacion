/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C10ejercicio00;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author belen
 */
public class EjemploDicc04 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    HashMap<Integer, String> m = new HashMap<>();

    m.put(924, "Amalia Núñez");
    m.put(921, "Cindy Nero");
    m.put(700, "César Vázquez");
    m.put(219, "Víctor Tilla");
    m.put(537, "Alan Brito");
    m.put(605, "Esteban Quito ");

    System.out.println("Código\tNombre\n------\t-------------");

    for (Map.Entry pareja : m.entrySet()) {

      System.out.print(pareja.getKey() + "\t");
      System.out.println(pareja.getValue());
    }
  }

}
