/*
 * 6. voltea: Le da la vuelta a un número.
 * 
 */
package c8ejercicio06;

/**
 *
 * @author belen
 */

import java.util.Scanner;
public class C8ejercicio06 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());

    int numero = numeroIntroducido;
    int volteado = 0;
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while
    
    System.out.println("Si le damos la vuelta al " + numeroIntroducido + " tenemos el " + volteado);
    

  }
  
}
