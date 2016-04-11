/*
 * Ejercicio 1
 * Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos
* de cada uno de ellos mediante un bucle. Muestra a continuación los datos de
* todos los gatos utilizando también un bucle.
 */
package C9ejercicio01_ArraysO;

/**
 *
 * @author belen
 */
import java.util.Scanner;

public class ArrayDeGatos {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    Gato[] gatito = new Gato[5];

    String nombreIntro;
    String sexoIntro;
    String razaIntro;

    for (int i = 0; i < 5; i++) {

      gatito[i] = new Gato();

      System.out.println("Gatito " + i);
      System.out.print("Nombre: ");
      nombreIntro = (s.nextLine());
      (gatito[i]).setNombre(nombreIntro);

      System.out.print("Sexo: ");
      sexoIntro = (s.nextLine());
      gatito[i].setSexo(sexoIntro);

      System.out.print("Raza: ");
      razaIntro = (s.nextLine());
      gatito[i].setRaza(razaIntro);

    }

    System.out.println("Los datos introducidos son los siguientes:");
   
    for (int i = 0; i < 5; i++) {
      
      System.out.println("Gatito " + i);
      System.out.println("Nombre: " + gatito[i].getNombre());
      System.out.println("Sexo: " + gatito[i].getSexo());
       System.out.println("Raza: " + gatito[i].getRaza());
      System.out.println("----------------------------");
     
    } 
    
    
  }
}
