/*
 * 2. Realiza un programa que introduzca valores aleatorios (entre 0 y
 *    100) en un ArrayList y que luego calcule la suma, la media, el
 *    máximo y el mínimo de esos números. El tamaño de la lista también
 *    será aleatorio y podrá oscilar entre 10 y 20 elementos ambos
 *    inclusive.
 */
package C10ejercicio02;

import java.util.ArrayList;

/**
 *
 * @author belen
 */
public class C10ejercicio02 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    

    ArrayList<Integer> miArray = new ArrayList<>();
    
    int suma = 0;
    int minimo = 100;
    int maximo = 0;
    int tamagno = (int) (Math.random() * 11 + 10);

    for (int i = 0; i < tamagno; i++) {
      miArray.add((int) (Math.random() * 101));
    }

    System.out.println("El array aleatorio es: " + miArray);

    for (int m : miArray) {
      suma += m;

      if (m < minimo) {
        minimo = m;
      }

      if (m > maximo) {
        maximo = m;
      }
    }

    System.out.println("La suma total es : " + suma);
    System.out.println("La media es : " + suma / tamagno);
    System.out.println("El mínimo es : " + minimo);
    System.out.println("El máximo es : " + maximo);

  }
}
