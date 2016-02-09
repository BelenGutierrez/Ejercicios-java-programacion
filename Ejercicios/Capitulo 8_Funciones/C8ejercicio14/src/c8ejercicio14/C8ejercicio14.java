/*
 * 14. juntaNumeros: Pega dos números para formar uno.
 * 
 */
package c8ejercicio14;

/**
 *
 * @author belen
 */

import java.util.Scanner;
public class C8ejercicio14 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int primerNum;
    int segundoNum;
    int digitosSegundoNum = 0;
    int multiplicador = 1;
    
    
     System.out.print("Introduzca el primer número entero: ");
     primerNum = Integer.parseInt(s.nextLine());
    
    System.out.print("Ahora el segundo : ");
    segundoNum = Integer.parseInt(s.nextLine()); 
    
    ////// Cuenta los dígitos que tiene el segundo número introducido.
    int segundo = segundoNum;
    while (segundo > 0) {
      segundo = segundo / 10;
      digitosSegundoNum++;
    }
    
    ////// crea el multiplicador de unidad seguida de ceros.
    for ( int i = 0; i < digitosSegundoNum; i++ ) {
      multiplicador = multiplicador * 10;
    }
    
    System.out.println("\n\nEl resultado de pegar dos números introducidos es :  " +( ( primerNum * multiplicador) + segundoNum));
  
  }
  
}
