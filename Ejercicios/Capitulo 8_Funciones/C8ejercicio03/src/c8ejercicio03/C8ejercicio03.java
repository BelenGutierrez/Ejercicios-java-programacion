/*
 * 3. siguientePrimo: Devuelve el menor primo que es mayor al número que
 * se pasa como parámetro.
 * 
 */
package c8ejercicio03;

/**
 *
 * @author belen
 */
import java.util.Scanner;
public class C8ejercicio03 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    
    
    int numIntro;
   //int num = numIntro;
    boolean esPrimo = false;
    
    System.out.println("\nEste programa le dirá el menor primo siguiente al número introducido");
    System.out.println("\nPor favor introduzca un número");
    numIntro = Integer.parseInt(s.nextLine());
    
    
    do {
    esPrimo = true;  
      numIntro++;
       
      for (int i = 2; i < numIntro; i++) {
          if ((numIntro % i) == 0) {
              esPrimo = false;
          }
      }           
 
    } while  ( !esPrimo);
    
      
    if (esPrimo) {
      System.out.println("El número primo siguiente al número introducido es : " + numIntro);
    }
  }
  
}
