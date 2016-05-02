/*
 * 10. Crea un mini-diccionario español-inglés que contenga, al menos,
 *     20 palabras (con su traducción).
 *     <p>
 *     Utiliza un objeto de la clase <code>HashMap</code> para almacenar
 *     las parejas de palabras. El programa pedirá una palabra en
 *     español y dará la correspondiente traducción en inglés.
 */
package C10ejercicio10;

import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author belen
 */
public class DiccInglesEspa {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    HashMap<String, String> mataburro = new HashMap<>();

    mataburro.put("Great", "Grandioso");
    mataburro.put("White", "Blanco");
    mataburro.put("Nice", "Agradable");
    mataburro.put("One", "Uno");
    mataburro.put("Fantastic", "Fantastico");
    mataburro.put("Sad", "Tristeza");
    mataburro.put("Beautiful", "Belleza");
    mataburro.put("Road", "Calle");
    mataburro.put("Dirty", "Sucio");
    mataburro.put("Mirror", "Espejo");
    mataburro.put("Meal", "Comida");
    mataburro.put("Fruit", "Fruta");
    mataburro.put("Travel", "Viaje");
    mataburro.put("Money", "Dinero");
    mataburro.put("Sound", "Sonido");
    mataburro.put("Water", "Agua");
    mataburro.put("Ice", "Hielo");
    mataburro.put("Vinegar", "Vinagre");
    mataburro.put("Meat", "Carne");
    mataburro.put("Child", "Niño");
    mataburro.put("Adult", "Adulto");

    System.out.print("Por favor, introduzca una palabra en ingles: ");
    String palabra = (s.nextLine());

    if (mataburro.containsKey(palabra)) {

      System.out.println("El significado de  " + palabra + " es: " + mataburro.get(palabra));
   
    } else {
      System.out.println("La palabra no existe.");
    }

  }

}
