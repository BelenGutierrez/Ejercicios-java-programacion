/**
 * 
 *  Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author Belén Gutierrez
 */
public class C5ejercicio08 {

  public static void main(String[] args) {
    
    System.out.print("Introduzca un número entero y le mostraré la tabla de multiplicar: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
        
    for (int factor = 0; factor <= 10; factor++) {
      System.out.println(numeroIntroducido + " x " + factor + " = " + numeroIntroducido * factor);
    }

  }
}
