/**
 * 
 *   Escribe un programa que dados dos números, uno real (base) y un entero 
 *   positivo (exponente), saque por pantalla todas las potencias con base el
 *   numero dado y exponentes entre uno y el exponente introducido. No se deben 
 *   utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y 
 *   el 5, se deberán mostrar 2¹, 2², 2³, 2⁴ y 2⁵.
 *  
 * 
 * @author Belén Gutierrez
 */

public class C5ejercicio15 {

  public static void main(String[] args) {
    
    
    int base;
    int exponente;
    double potencia = 1;
    
    System.out.println("\nEste programa calcula las potencias incluídas, entre el ");
    System.out.println("exponente introducido y el exponente 1.");
    System.out.println("\nTeclee por favor, la base.");
    base = Integer.parseInt(System.console().readLine());
    
    System.out.println("\nTeclee ahora, el exponente.");
    exponente = Integer.parseInt(System.console().readLine());
    
    if (exponente == 0) {
      System.out.println("\nTodo número elevado a cero es: 0 ");
    }
    if (exponente == 1) {
      System.out.println("\nEl resultado de la potencia es: " + base);
    }
    
    if (exponente >= 2) {
      for (int i = 1 ; i <= exponente ; i++) {
        potencia = potencia * base;
        System.out.println( base + " elevado a " + i + " = " + potencia);
        }
      }
  }
}
