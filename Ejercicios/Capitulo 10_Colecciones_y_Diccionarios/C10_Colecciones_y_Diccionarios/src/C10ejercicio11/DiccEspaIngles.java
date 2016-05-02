/*
 * 11. Realiza un programa que escoja al azar 5 palabras en español del
 *     minidiccionario del ejercicio anterior. El programa irá pidiendo
 *     que el usuario teclee la traducción al inglés de cada una de las
 *     palabras y comprobará si son correctas. Al final, el programa
 *     deberá mostrar cuántas respuestas son válidas y cuántas erróneas.
 */
package C10ejercicio11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author belen
 */
public class DiccEspaIngles {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    HashMap<String, String> mataburrou = new HashMap<>();

    mataburrou.put("Grandioso", "Great");
    mataburrou.put("Blanco", "White");
    mataburrou.put("Agradable", "Nice");
    mataburrou.put("Uno", "One");
    mataburrou.put("Fantastico", "Fantastic");
    mataburrou.put("Tristeza", "Sad");
    mataburrou.put("Belleza", "Beautiful");
    mataburrou.put("Calle", "Road");
    mataburrou.put("Sucio", "Dirty");
    mataburrou.put("Espejo", "Mirror");
    mataburrou.put("Comida", "Meal");
    mataburrou.put("Fruta", "Fruit");
    mataburrou.put("Viaje", "Travel");
    mataburrou.put("Dinero", "Money");
    mataburrou.put("Sonido", "Sound");
    mataburrou.put("Agua", "Water");
    mataburrou.put("Hielo", "Ice");
    mataburrou.put("Vinagre", "Vinegar");
    mataburrou.put("Carne", "Meat");
    mataburrou.put("Niño", "Child");
    mataburrou.put("Adulto", "Adult");

    System.out.println("El programa pedirá que traduzca las palabras al inglés.");

    //CREA ARRAY CON LAS CLAVES 
    String[] claves = mataburrou.keySet().toArray(new String[0]);

    // CREA ARRAY CON LAS PALABRAS SELECCIONADAS
    ArrayList<String> seleccion = new ArrayList<>();

    seleccion.add(claves[(int) (Math.random() * 21)]);

    String aux;
    String respuesta;
    int puntos = 0;

    for (int i = 1; i < 5; i++) {

      do {

        aux = claves[(int) (Math.random() * 21)];

      } while (seleccion.contains(aux));

      seleccion.add(aux);

    }

    for (String p : seleccion) {

      System.out.print(p + " : ");
      respuesta = (s.nextLine());

      if (respuesta.equalsIgnoreCase(mataburrou.get(p))) {
        puntos = puntos + 1;
      }
    }
    System.out.println("");
    System.out.println("Correctas: " + puntos);
    System.out.println("Incorrectas: " + (5 - puntos));
    System.out.println("Ha obtenido: " + puntos + " puntos");
  }

}
