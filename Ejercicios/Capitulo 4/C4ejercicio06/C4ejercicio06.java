/**
 *
 * Realiza un programa que calcule el tiempo que tardará en caer un
 * objeto desde una altura h.
 * t = raiz(2h/g) siendo g = 9.81 m/s2
 *
 * @author Belén Gutierrez
 */

public class C4ejercicio06 {

  Double g = 9.81
  
  public static void main(String[] args) {
    
     
    System.out.println("Cálculo del tiempo que demora en caer un objeto" );
    System.out.print("Por favor, introduzca la altura (en metros):  ");
    Double h = Double.parseDouble (System.console().readLine());
    
    Double s = Math.srqt(2h/g)
    
    if (h == 0) {
      System.out.println("La altura debe ser mayor que cero");
    } else {
      System.out.println("El objeto demora:" + ( ));
    }
  }
}
