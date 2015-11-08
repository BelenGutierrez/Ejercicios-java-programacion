/**
 * 
 *   Realiza un programa que sume los 100 números  siguientes a un número entero
 *   y positivo introducido por teclado. Se debe comprobar que el dato introducido 
 *   es correcto (que es un número positivo).
 *  
 * 
 * @author Belén Gutierrez
 */

public class C5ejercicio17 {

  public static void main(String[] args) {
    
    
    int numIntro;
    int suma = 0;
    
    System.out.println("\nEste programa a partir de un número introducido,");
    System.out.println("sumará los 100 números siguientes");
    System.out.println("\nPor favor introduzca un número");
    numIntro = Integer.parseInt(System.console().readLine());
    
    if (numIntro < 0) {
      System.out.println("\nPor favor introduzca un número entero positivo");
      System.out.println("\nIntente otra vez");
      numIntro = Integer.parseInt(System.console().readLine());
    }
    
    for (int i = 0; i <= 99; i++) {
      numIntro++;
      suma = (suma + numIntro );
      }
      System.out.println("La suma de los 100 siguientes es: " + suma);
  }
}
