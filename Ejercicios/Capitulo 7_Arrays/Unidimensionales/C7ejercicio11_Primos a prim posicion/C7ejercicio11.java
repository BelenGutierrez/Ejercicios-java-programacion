/**
 * 
 *     Realiza un programa que pida 10 números por teclado y que los almacene en un array.
 *     A continuación se mostrará el contenido de ese array junto al índice (0 – 9).
 *     Seguidamente el programa pasará los primos a las primeras posiciones, desplazando
 *     el resto de números (los que no son primos) de tal forma que no se pierda ninguno.
 *     Al final se debe mostrar el array resultante.
 *    
 *
 * @author Belén Gutierrez
 */
public class C7ejercicio11 {

  public static void main(String[] args) {

      int[] num = new int[10];
      int[] primo = new int[10];
      int[] noPrimo = new int[10];
      int i;
      int j;
      boolean esPrimo = true;
      int primos = 0;
      int noPrimos = 0;
      
      System.out.println("\nIntroduzca 10 números: ");
      for ( i = 0; i < 10; i++) {
        num[i] = Integer.parseInt(System.console().readLine());
        esPrimo = true;
          for ( j = 2; j < num[i] - 1; j++) {
            if (num[i] % i == 0) {
            esPrimo = false;
            }
          }
         if (esPrimo) {
          primo[primos++] = num[i];
         } else {
          noPrimo[noPrimos++] = num[i];
        }
     } 

//////////////////////////////////////////////////////////      
      System.out.println("El array original es: \n");
      for ( i = 0; i < 10; i++) {
      System.out.printf("|%3d" , i);
      }
      System.out.print("|");
      System.out.println();
      for ( i = 0; i < 40; i++) {
      System.out.print("-" );
      }
      System.out.println();
      for ( i = 0; i < 10; i++) {
      System.out.printf("|%3d" , num[i]);
      }
      System.out.print("|");

///////////////////////////////////////////////////////
      for ( i = 0; i < primos; i++) {
        num[i] = primo[i];
      }
      for (i = primos; i < primos + noPrimos; i++) {
      num[i] = noPrimo[i - primos];
      }
////////////////////////////////////////////////////////      
      System.out.println();
      
      System.out.println("\nEl array resultante es: \n");
      for ( i = 0; i < 10; i++) {
      System.out.printf("|%3d" , i);
      }
      System.out.print("|");
      System.out.println();
      for ( i = 0; i < 40; i++) {
      System.out.print("-" );
      }
      System.out.println();
      for ( i = 0; i < 10; i++) {
      System.out.printf("|%3d" , num[i]);
      }
      System.out.print("|");
  }
}
