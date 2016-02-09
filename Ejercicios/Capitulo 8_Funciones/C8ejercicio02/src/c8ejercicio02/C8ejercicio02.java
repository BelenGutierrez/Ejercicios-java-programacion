/*
 * 2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro
 * es primo y falso en caso contrario.
 * 
 */
package c8ejercicio02;

/**
 *
 * @author belen
 */
import java.util.Scanner;
public class C8ejercicio02 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    
    int numIntro;
    boolean esPrimo = true;
    
    System.out.println("\nEste programa le dirá si el número introducido es primo");
    System.out.println("\nPor favor introduzca un número");
    numIntro = Integer.parseInt(s.nextLine());
    
    for (int i = 2; i < numIntro; i++) {
      if ((numIntro % i) == 0) {
        esPrimo = false;
      }
    }
    if (esPrimo) {
      System.out.println("El número introducido es primo.");
    } else {
      System.out.println("El número introducido no es primo.");
      }
    
  }
  
}
