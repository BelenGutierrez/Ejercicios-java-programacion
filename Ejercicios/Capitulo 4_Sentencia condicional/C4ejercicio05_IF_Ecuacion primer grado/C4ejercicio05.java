/**
 *
 * Realiza un programa que resuelva una ecuación de primer grado, del tipo
 * ax + b = 0
 *
 * @author Belén Gutierrez
 */

public class C4ejercicio05 {
  public static void main(String[] args) {
    
     
    System.out.println("Este programa calcula una ecuación de 1º grado del tipo ax + b = 0" );
    System.out.print("Por favor, introduzca el valor de a:  ");
    double primeraIncognita = Double.parseDouble (System.console().readLine());
    
    System.out.print("Por favor, ahora introduzca el valor de b:  ");
    double segundaIncognita = Double.parseDouble (System.console().readLine());
    
    
    if (primeraIncognita == 0) {
      System.out.println("No se puede dividir por cero");
    }
    if (segundaIncognita == 0) {
      System.out.println("Si la segunda incognita es cero, el resultado será cero");
    } else {
      System.out.println("El valor de x es:" + (-segundaIncognita / primeraIncognita ));
    }
  }
}
