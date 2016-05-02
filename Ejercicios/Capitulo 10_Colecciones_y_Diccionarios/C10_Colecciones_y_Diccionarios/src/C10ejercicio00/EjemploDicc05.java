/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C10ejercicio00;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author belen
 */
public class EjemploDicc05 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
     Scanner s = new Scanner(System.in);

    HashMap<Integer, String> m = new HashMap<>();

    m.put(924, "Amalia Núñez");
    m.put(921, "Cindy Nero");
    m.put(700, "César Vázquez");
    m.put(219, "Víctor Tilla");
    m.put(537, "Alan Brito");
    m.put(605, "Esteban Quito ");

    System.out.print("Por favor, introduzca un código: ");
    int codigoIntro = Integer.parseInt(s.nextLine());

    if (m.containsKey(codigoIntro)) {
      System.out.print("El código " + codigoIntro + " corresponde a ");
      System.out.println(m.get(codigoIntro));
    } else {
      System.out.print("El código introducido no existe.");
    }
  }

}
