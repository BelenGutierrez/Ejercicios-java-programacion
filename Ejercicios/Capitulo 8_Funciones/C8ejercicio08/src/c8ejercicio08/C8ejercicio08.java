/*
 * 8. posicionDeDigito: Da la posición de la primera ocurrencia de un dígito
 * dentro de un número entero. Si no se encuentra, devuelve -1.
 * 
 */
package c8ejercicio08;

/**
 *
 * @author belen
 */

import java.util.Scanner;
public class C8ejercicio08 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
     System.out.print("Introduzca un número entero: ");
    int numeroIntroducido = Integer.parseInt(s.nextLine());

    System.out.print("Introduzca un dígito: ");
    int digito = Integer.parseInt(s.nextLine());

    System.out.print("Contando de izquierda a derecha, el " + digito + " aparece dentro de " + numeroIntroducido + " en las siguientes posiciones: ");
    
    // le da la vueta al número y calcula la longitud
    int numero = numeroIntroducido;
    int volteado = 0;
    int longitud = 0;
    int posicion = 1;
    
    if (numero == 0) {
      longitud = 1;
    }
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } // while
        
    // comprueba la posición
    while (volteado > 0) {
      if ((volteado % 10) == digito) {
        System.out.print(posicion + " ");
      }
      volteado /= 10;
      posicion++;
    } // while
    
    System.out.println();
    
    
    
  }
  
}
