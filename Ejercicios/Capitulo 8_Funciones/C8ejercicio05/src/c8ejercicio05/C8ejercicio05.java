/*
 * 5. digitos: Cuenta el número de dígitos de un número entero.
 * 
 */
package c8ejercicio05;

/**
 *
 * @author belen
 */
import java.util.Scanner;
public class C8ejercicio05 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int numeroDeDigitos = 1, n, numeroIntroducido;

    System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
    numeroIntroducido = Integer.parseInt(s.nextLine());
    
    n = numeroIntroducido;
    
    while (n > 10) {
      n = n / 10;
      numeroDeDigitos++;
    }
    
    System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");
  
  }
  
}
