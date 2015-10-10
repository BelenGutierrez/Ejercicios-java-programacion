/**
 *
 * Realiza un programa que calcule el tiempo que tardará en caer un
 * objeto desde una altura h.
 * t = raiz(2h/g) siendo g = 9.81 m/s2
 *
 * @author Belén Gutierrez
 */

public class C4ejercicio06 {

  final static double g = 9.81;
  
  public static void main(String[] args) {
    
     
    System.out.println("Cálculo del tiempo que demora en caer un objeto" );
    System.out.print("Por favor, introduzca la altura (en metros):  ");
    double h = Double.parseDouble (System.console().readLine());
    
    double s = Math.sqrt(2*h/g);
    
    if (h <= 0) {
      System.out.println("Lo siento, la altura debe ser mayor que cero");
    } else {
      System.out.println("El objeto demora en caer:" + ( s ) + "segundos");
    }
  }
}
