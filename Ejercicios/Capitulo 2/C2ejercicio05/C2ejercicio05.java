/**
 * Muestra por pantalla un conversor de pesetas a euros. 
 *
 * @author Belen Gutierrez
 */

public class C2ejercicio05 {
  public static void main(String[] args) {

    double pesetas = 140000; // Esta es la cantidad de pesetas que se quiere convertir
    double facConv = 166.386;  // Este es el valor de un euro
    double euros = pesetas / facConv;
    System.out.println(pesetas + " pesetas es igual a  " + euros + " euros");     
  }
}
