/**
 *
 *  Escribe un programa que diga cuál es la última cifra de un número
 *     entero introducido por teclado.
 *
 * @author Belén Gutierrez
 */
public class C4ejercicio17 {

  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca un número entero: ");
    int n = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra del número introducido es: " + (n % 10));
  }
}
