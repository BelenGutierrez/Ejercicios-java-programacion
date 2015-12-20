/**
 * 
 *    Realiza un programa que pida 8 números enteros y que luego muestre esos números
 *    junto con la palabra "par" o "impar" según proceda.
 *    
 *
 * @author Belén Gutierrez
 */
public class C7ejercicio09 {

  public static void main(String[] args) {

      int[] num = new int[8];
      int i;
      

      System.out.println("\nIntroduzca 8 números y le diré cual es par y cuál impar: ");
      for ( i = 0; i < 8; i++) {
       num[i] = Integer.parseInt(System.console().readLine()); 
        }
        
       System.out.println("\nAquí le muestro los pares y los impares: "); 
      for ( i = 0; i < 8; i++) {
        System.out.print( num[i] );
          if ( num[i] % 2 == 0) {
            System.out.print( "  Par" );
          }else {
           System.out.print( "  Impar" );
          }
        System.out.println();
       }
     
  }
}
