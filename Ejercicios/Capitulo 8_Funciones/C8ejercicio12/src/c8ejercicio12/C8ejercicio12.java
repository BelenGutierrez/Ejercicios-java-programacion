/*
 * 12. pegaPorDelante: Añade un dígito a un número por delante.
 * 
 */
package c8ejercicio12;

/**
 *
 * @author belen
 */

import java.util.Scanner;
public class C8ejercicio12 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int numIntroducido;
    int digito;
    int resultado;
    int volteado = 0;
    int volteadoDos = 0;
    
     System.out.print("Introduzca un número entero: ");
     numIntroducido = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduzca el dígito que desea agregar por delante: ");
    digito = Integer.parseInt(s.nextLine()); 
    
    
      ////////// Volteamos el número introducido
     int numIntro = numIntroducido;
     while (numIntro > 0) {
      volteado = (volteado * 10) + (numIntro % 10);
      numIntro /= 10;
    } 
    
      ///// Agregamos el dígito .
    resultado = (volteado * 10) + digito;
    
    
     
     /////////// Ahora volteamos el resultado 
     
     while (resultado > 0) {
      volteadoDos = (volteadoDos * 10) + (resultado % 10);
      resultado /= 10;
     
    }  
     
    System.out.println("\n\nEl número introducido es :  " + numIntroducido);
    System.out.println("El dígito para agragar por delante es :  "  + digito);
    System.out.println("El número con el dígito pegado es :  " + volteadoDos); 
    
  }
  
}
