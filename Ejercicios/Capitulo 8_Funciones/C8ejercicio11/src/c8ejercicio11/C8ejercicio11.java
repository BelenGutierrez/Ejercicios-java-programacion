/*
 * 11. pegaPorDetras: Añade un dígito a un número por detrás.
 * 
 */
package c8ejercicio11;

/**
 *
 * @author belen
 */

import java.util.Scanner;
public class C8ejercicio11 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     
     
    int numIntroducido;
    int digito;
    int resultado;
   
    
     System.out.print("Introduzca un número entero: ");
     numIntroducido = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduzca el dígito que desea agregar por detrás: ");
    digito = Integer.parseInt(s.nextLine());
    
    
    ///// Agregamos el dígito .
    resultado = (numIntroducido * 10) + digito;
    
    System.out.println("\n\nEl número introducido es :  " + numIntroducido);
    System.out.println("El dígito para agragar por detrás es :  "  + digito);
    System.out.println("El número con el dígito pegado es :  " + resultado);
  }
  
}
