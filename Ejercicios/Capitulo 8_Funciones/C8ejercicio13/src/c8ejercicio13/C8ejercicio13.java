/*
 *  13. trozoDeNumero: Toma como parámetros las posiciones inicial y final
 * dentro de un número y devuelve el trozo correspondiente.
 * 
 */
package c8ejercicio13;

/**
 *
 * @author belen
 */

import java.util.Scanner;
public class C8ejercicio13 {

  /**
   * @param args the command line arguments
   */
  
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    
    int numIntroducido;
    int numSinDigitoFinal;
    int numSinDigitoInicial;
    int volteado = 0;
    int volteadoDos = 0;
    
     System.out.print("Introduzca un número entero: ");
     numIntroducido = Integer.parseInt(s.nextLine());
    
    
     numSinDigitoFinal = numIntroducido / 10;
     
      ////////// Volteamos el número sin digito final
     int numIntro = numSinDigitoFinal;
     while (numIntro > 0) {
      volteado = (volteado * 10) + (numIntro % 10);
      numIntro /= 10;
     }
     
     numSinDigitoInicial = volteado / 10;
     
      ////////// Volteamos el número sin digito inicial
    // int numIntro = numSinDigitoFinal;
     while (numSinDigitoInicial > 0) {
      volteadoDos = (volteadoDos * 10) + (numSinDigitoInicial % 10);
      numSinDigitoInicial /= 10;
     } 
     
    System.out.println("\n\nEl número introducido es :  " + numIntroducido);
    System.out.println("El numero sin los digitos inicial y final es :  "  + volteadoDos);
    
     
    
  }
  
}
