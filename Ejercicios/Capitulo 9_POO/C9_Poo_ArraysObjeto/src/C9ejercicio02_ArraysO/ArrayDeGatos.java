/*
 * Ejercicio 2
 * Cambia el programa anterior de tal forma que los datos de los gatos se introduzcan
 * directamente en el código de la forma gatito[2].setColor(“marrón”) o bien
 * mediante el constructor, de la forma gatito[3] = new Gato(“Garfield”, “naranja”,
 * “macho”). Muestra a continuación los datos de todos los gatos utilizando un
 * bucle.
 */
package C9ejercicio02_ArraysO;

/**
 *
 * @author belen
 */
import java.util.Scanner;

public class ArrayDeGatos {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    Gato[] gatito = new Gato[4];

    String nombreIntro;
    String sexoIntro;
    String colorIntro;

  
         gatito[0] = new Gato("Gato1", "color1", "hembra");
         gatito[1] = new Gato("Gato2", "color2", "macho");
         gatito[2] = new Gato("Gato2", "marrón", "macho");
         gatito[3] = new Gato("Garfield", "naranja", "macho");
      
      
     

    System.out.println("Los datos introducidos son los siguientes:");

    for (int i = 0; i < 4; i++) {

      System.out.println("Gatito " + i);
      System.out.println("Nombre: " + gatito[i].getNombre());
      System.out.println("Color: " + gatito[i].getColor());
      System.out.println("Sexo: " + gatito[i].getSexo());
      System.out.println("----------------------------");

    }

  }
}
