/*
 * Ejercicio 4
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
 * debe ordenar palabras en lugar de números.
 */
package C10ejercicio04;

/**
 *
 * @author belen
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C10ejercicio04 {
  
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    ArrayList<String> miArray = new ArrayList<>();

    System.out.println("Introduzca 10 palabras: ");

    for (int i = 0; i < 10; i++) {
      miArray.add((s.nextLine()));
    }

    System.out.println("El array original es: " + miArray);

    Collections.sort(miArray);

    System.out.println("El array ordenado de menor a mayor: " + miArray);

  }
  
}
