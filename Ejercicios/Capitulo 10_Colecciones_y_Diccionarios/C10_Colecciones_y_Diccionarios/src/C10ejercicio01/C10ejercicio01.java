/*
 * 1. Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación, muestra esos nombres por pantalla. Utiliza para
 *    ello un bucle for que recorra todo el ArrayList sin usar ningún
 *    índice.
 */
package C10ejercicio01;

import java.util.ArrayList;

/**
 *
 * @author belen
 */
public class C10ejercicio01 {
  
   /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    
     ArrayList<String> compis = new ArrayList<>();

    compis.add("Alba");
    compis.add("Eli");
    compis.add("Mariló");
    compis.add("Elena");
    compis.add("Margarita");
    compis.add("Belén");

    System.out.println("Contenido de la lista: ");

    for (String nombre : compis) {
      System.out.println(nombre);
    }
    
    
  }
  
  
}
