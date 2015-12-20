/**
 * 
 *    Escribe un programa que lea 15 números por teclado y que los almacene en un array. 
 *    Rota los elementos de ese array, es decir, el elemento de la posición 0 debe 
 *    pasar a la posición 1 y el de la 1 a la 2, etc. El número que se encuentra 
 *    la última posición debe pasar a la 0. Finalmente muestra el contenido del array.
 *    
 *
 * @author Belén Gutierrez
 */
public class C7ejercicio06 {

  public static void main(String[] args) {

      int[] numIntro = new int[15];
      int i;
      int aux;
      
      System.out.println("Introduzca 15 números\n");
      for ( i = 0; i < 15; i++) {
        numIntro[i] = Integer.parseInt(System.console().readLine());
        }

      System.out.println( "\nEl array original es: \n");
      
      for ( i = 0; i < 15; i++) {
        System.out.printf( "|%3d " , i);
      }
      System.out.print("|");
      
      System.out.println();
      for ( i = 0; i < 75; i++) {
        System.out.print( "-");
      }
      System.out.println();
      
      
      for ( i = 0; i < 15; i++) {
        System.out.printf( "|%3d " , numIntro[i]);
      }
      System.out.print("|");
      
      
      // Rotación
       aux = numIntro[14];
      for ( i = 14; i > 0; i--) { 
        numIntro[i] = numIntro[i-1];
      }
      numIntro[0] = aux;
      
      System.out.println();
      System.out.println( "\nEl array rotado es: \n");
      
      for ( i = 0; i < 15; i++) {
        System.out.printf( "|%3d " , i);
      }
      System.out.print("|");
      
      System.out.println();
      for ( i = 0; i < 75; i++) {
        System.out.print( "-");
      }
      System.out.println();
      
      
      for ( i = 0; i < 15; i++) {
        System.out.printf( "|%3d " , numIntro[i]);
      }
      System.out.print("|"); 

  }
}
