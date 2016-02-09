/*
 * 4. potencia: Dada una base y un exponente devuelve la potencia.
 * 
 */
package c8ejercicio04;

/**
 *
 * @author belen
 */
import java.util.Scanner;
public class C8ejercicio04 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    
    
    int base;
    int exponente;
    int potencia = 1;
    
    System.out.println("\nEste programa calcula la potencia.");
    System.out.println("\nTeclee por favor, la base.");
    base = Integer.parseInt(s.nextLine());
    
    System.out.println("\nTeclee ahora, el exponente.");
    exponente = Integer.parseInt(s.nextLine());
    
    if (exponente == 0) {
      System.out.println("\nTodo número elevado a cero es: 0 ");
    }
    if (exponente == 1) {
      System.out.println("\nEl resultado de la potencia es: " + base);
    }
    
    if (exponente >= 2) {
      for (int i = 0 ; i < exponente ; i++) {
        potencia = potencia * base;
        }
      System.out.println(base + " elevado a " + exponente + " es: " + potencia);  
      }

  }
  
}
