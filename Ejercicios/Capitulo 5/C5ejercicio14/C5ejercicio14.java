/**
 * 
 *  Escribe un programa que pida una base y un exponente (entero positivo) y que
 *  calcule la potencia
 *  
 * 
 * @author Belén Gutierrez
 */

public class C5ejercicio14 {

  public static void main(String[] args) {
    
    
    int base;
    int exponente;
    double potencia = 1;
    
    System.out.println("\nEste programa calcula la potencia.");
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
      for (int i = 0 ; i < exponente ; i++) {
        potencia = potencia * base;
        }
      System.out.println(base + " elevado a " + exponente + " es: " + potencia);  
      }
  }
}
