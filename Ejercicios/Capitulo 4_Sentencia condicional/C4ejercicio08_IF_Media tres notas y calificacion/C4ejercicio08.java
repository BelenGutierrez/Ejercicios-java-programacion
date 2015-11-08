 /**
 *
 * Amplía el programa anterior para que diga la nota del boletín ( Insuficiente,
 * Suficiente, Bien, Notable o Sobresaliente)
 *
 * @author Belén Gutierrez
 */

public class C4ejercicio08 {  
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
      System.out.printf("Tu promedio es: %1.2f "  , promedio );
    } 
    
    if (( promedio >= 0) && ( promedio < 5)) {
      System.out.println("Tu nota media es: Insuficiente");
    } else if ((promedio >= 5) && ( promedio < 6)) {
      System.out.println("Tu nota media es: Suficiente");
    } else if ((promedio >= 6) && ( promedio <= 7)) {
      System.out.println("Tu nota media es: Bien");
    } else if ((promedio >= 7) && ( promedio < 9)) {
      System.out.println("Tu nota media es: Notable");
    } else if ((promedio >= 9) && ( promedio <= 10)) {
      System.out.println("Tu nota media es: Sobresaliente, Felicidades ");
    }
  
  }
}
