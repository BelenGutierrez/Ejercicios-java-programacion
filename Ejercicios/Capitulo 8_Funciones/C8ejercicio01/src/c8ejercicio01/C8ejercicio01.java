/*
 * 1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro
 * es capicúa y falso en caso contrario.
 * 
 */
package c8ejercicio01;

/**
 *
 * @author belen
 */
import java.util.Scanner;
public class C8ejercicio01 {

  /**
   * @param args the command line arguments
   */
  
   
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      
    
    
    int volteado = 0;
    boolean capicua = false;
   
    System.out.print("Introduzca un número entero y le diré si es capicúa: ");
    int numIntro = Integer.parseInt(s.nextLine());
    
    
     int copiado = numIntro;
     
     
    
     while (copiado > 0) {
      volteado = (volteado * 10) + (copiado % 10);
      copiado /= 10;
    } 
  
    if (volteado == numIntro) {
      capicua = true;
      System.out.println("El número introducido es capicúa.");
    } else {
      System.out.println("El número introducido no es capicúa.");
    }
    
  }
  
}
