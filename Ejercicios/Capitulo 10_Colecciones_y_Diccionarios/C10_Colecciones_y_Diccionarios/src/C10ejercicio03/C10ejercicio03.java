/*
 * 3. Escribe un programa que ordene 10 números enteros introducidos por
 *    teclado y almacenados en un objeto de la clase ArrayList .
 */
package C10ejercicio03;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author belen
 */
import java.util.Scanner;

public class C10ejercicio03 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    ArrayList<Integer> miArray = new ArrayList<>();

    System.out.println("Introduzca 10 números enteros: ");

    for (int i = 0; i < 10; i++) {
      miArray.add(Integer.parseInt(s.nextLine()));
    }

    System.out.println("El array original es: " + miArray);

    Collections.sort(miArray);

    System.out.println("El array ordenado de menor a mayor: " + miArray);

  }

}
