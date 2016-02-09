/*
 * 7. digitoN: Devuelve el dígito que está en la posición n de un número
 * entero. Se empieza contando por el 0 y de izquierda a derecha.
 * 
 */
package c8ejercicio07;

/**
 *
 * @author belen
 */

import java.util.Scanner;
public class C8ejercicio07 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    
  
    int volteado = 0;
    int posicionIntro;
    int digito;
    int numeroIntro;
    int posNum = 1;
    
     System.out.print("Introduzca un número entero: ");
     numeroIntro = Integer.parseInt(s.nextLine());

    System.out.print("Introduzca una posicion: ");
    posicionIntro = Integer.parseInt(s.nextLine());
    
    
    // le da la vueta al número y calcula la longitud
     int numero = numeroIntro;
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } 
        
    
    // comprueba la posición
    while (volteado > 0) {
      digito = volteado%10;
      if ( posNum == posicionIntro) {
         System.out.print("Contando de izquierda a derecha, en la posicion :  " +  posicionIntro + "   aparece el digito: " + digito );
      }
      volteado /= 10;
      posNum++;
    } 
    
  
   System.out.println();
  
    
  }
  
}
