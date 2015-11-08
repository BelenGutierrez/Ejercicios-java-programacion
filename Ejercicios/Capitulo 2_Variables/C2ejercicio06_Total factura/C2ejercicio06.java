/**
 * Muestra por pantalla el total de una factura. 
 *
 * @author Belen Gutierrez
 */

public class C2ejercicio06 {
  public static void main(String[] args) {

    double baseImponible = 150; // Esta es la cantidad sin iva
    int iva = 21;  // Este es el tipo de iva
    double total = baseImponible + (baseImponible * iva/100);
    System.out.println( " El importe total de la factura es:   " + total  + " euros");     
  }
}
