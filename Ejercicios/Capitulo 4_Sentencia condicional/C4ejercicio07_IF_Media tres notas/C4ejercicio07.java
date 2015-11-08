 /**
 *
 * Realiza un programa que calcule la media de tres notas
 *
 * @author Belén Gutierrez
 */

public class C4ejercicio07 {  
  public static void main(String[] args) {
    
     
    System.out.println("Cálculo de la media de 3 notas" );
    System.out.print("Por favor, introduzca la primera nota (del 1 al 10): ");
    double primeraNota = Double.parseDouble (System.console().readLine());
    
    System.out.print("Por favor, introduzca la segunda nota (del 1 al 10) :  ");
    double segundaNota = Double.parseDouble (System.console().readLine());
    
    System.out.print("Ahora, introduzca la tercera nota (del 1 al 10):  ");
    double terceraNota = Double.parseDouble (System.console().readLine());
    
    double promedio = (primeraNota + segundaNota + terceraNota)/3;

    if((primeraNota < 0 ) || (segundaNota < 0 ) || (terceraNota < 0) ||
      (primeraNota > 10) || (segundaNota > 10 ) || (terceraNota > 10 )) {
      System.out.println("Por favor verifique que las notas sean del 1 al 10");
    } else {
    System.out.printf("La nota media es: %1.2f" , promedio  );
    }
  }
}
