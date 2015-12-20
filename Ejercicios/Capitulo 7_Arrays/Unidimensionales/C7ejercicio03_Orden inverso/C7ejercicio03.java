/**
 * 
 *    Escribe un programa que lea 10 números por teclado y que luego los muestre
 *    en orden inverso, es decir, el primero que se introduce es el último en 
 *    mostrarse y viceversa.
 *
 * @author Belén Gutierrez
 */
public class C7ejercicio03 {

  public static void main(String[] args) {

      int[] numIntro = new int[10];
      int i;
      
      System.out.println("Introduzca 10 números :\n");
      System.out.println("Y el programa se los mostrará en orden inverso.\n");
      //numIntro = Integer.parseInt(System.console().readLine());
      
      for ( i = 0; i < 10; i++) {
        numIntro[i] = Integer.parseInt(System.console().readLine());
        
        }
      for ( i = 9; i >= 0; i--) {
      System.out.printf("numIntro[%2d]: %2d\n", i, numIntro[i]);
       }
  }
}
