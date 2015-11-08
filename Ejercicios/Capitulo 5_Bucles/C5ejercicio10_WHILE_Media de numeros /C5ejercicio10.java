/**
 * 
 *  Escribe un programa que calcule la media de un conjunto de números positivos
 *  introducidos por teclado. A priori, el programa no sabe cuántos números se 
 *  introducirán. El usuario indicará que ha terminado de introducir los datos
 *  cuando meta un número negativo.
 * 
 * @author Belén Gutierrez
 */

public class C5ejercicio10 {

  public static void main(String[] args) {
    
    int cantidad = 0;
    int numeroIntroducido = 0;
    int suma = 0;

    System.out.println("\nEste programa calcula la media de los números positivos introducidos.");
    System.out.println("\nIntroduzca los números positivos y finalice intoduciendo un número negativo:");

    while (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      cantidad++;
      suma = suma + numeroIntroducido;
    }
    
    System.out.println("La media de los números positivos es " + ((suma - numeroIntroducido) / (cantidad - 1 ))) ;

  }
}
