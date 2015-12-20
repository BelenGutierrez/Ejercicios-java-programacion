/**
 * 
 *    Escribe un programa que pida 10 números por teclado y que luego muestre los 
 *    números introducidos junto con las palabras "maximo" y "mínimo" al lado del 
 *    máximo y mínimo respectivamente.
 *
 * @author Belén Gutierrez
 */
public class C7ejercicio05 {

  public static void main(String[] args) {

      int[] numIntro = new int[10];
      int maximo = Integer.MIN_VALUE;
      int minimo = Integer.MAX_VALUE;
      int i;
      
      System.out.println("Introduzca 10 números\n");
      
      
      for ( i = 0; i < 10; i++) {
        numIntro[i] = Integer.parseInt(System.console().readLine());
          if (numIntro[i] > maximo) {
            maximo = numIntro[i];
          }
        
          if (numIntro[i] < minimo) {
            minimo = numIntro[i];
          }
        }
        
      System.out.println( "Los números max y min son: \n");
      
      for ( i = 0; i < 10; i++) {
      System.out.print( numIntro[i]);
        if (numIntro[i] == minimo) {
            System.out.print( "  Mínimo");
          }
        if (numIntro[i] == maximo) {
            System.out.print( "  Maximo");
          }
           System.out.println();
      }
  }
}
