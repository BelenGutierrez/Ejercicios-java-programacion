/**
 * Muestra por pantalla un conversor de euros pesetas. 
 *
 * @author Belen Gutierrez
 */

public class C2ejercicio04 {
  public static void main(String[] args) {

    double euros = 4;  // Esta es la cantidad en euros que se quiere convertir
    double pesetas = 166.38; // 1 euro vale 166.368 pesetas
    double mul = euros * pesetas;
    System.out.println(euros + " euros es igual a  " + mul + " pesetas");     
  }
}
