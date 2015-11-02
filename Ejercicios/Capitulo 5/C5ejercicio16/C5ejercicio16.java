/**
 * 
 *   Escribe un programa que diga si un número introducido por teclado es o no
 *   primo. Un número primo es aquel que sólo es divisible entre él mismo y la unidad.
 *  
 * 
 * @author Belén Gutierrez
 */

public class C5ejercicio16 {

  public static void main(String[] args) {
    
    
    int numIntro;
    boolean esPrimo = true;
    
    System.out.println("\nEste programa le dirá si el número introducido es primo");
    System.out.println("\nPor favor introduzca un número");
    numIntro = Integer.parseInt(System.console().readLine());
    
    for (int i = 2; i < numIntro; i++) {
      if ((numIntro % i) == 0) {
        esPrimo = false;
      }
    }
    if (esPrimo) {
      System.out.println("El número introducido es primo.");
    } else {
      System.out.println("El número introducido no es primo.");
      }
  }
}
