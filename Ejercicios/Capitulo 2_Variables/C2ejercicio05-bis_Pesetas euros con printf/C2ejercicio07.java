/**
 * Muestra por pantalla un conversor de pesetas a euros
 * usando el printf. 
 *
 * @author Belen Gutierrez
 */

public class C2ejercicio07 {
  public static void main(String[] args) {

    double pesetas = 140000; // Esta es la cantidad de pesetas que se quiere convertir
    double euros = 166.386;  // Este es el valor de un euro
    double div = pesetas / euros;
    
    printf( %2f pesetas , " pesetas es igual a  " , div , " euros");     
  }
}
