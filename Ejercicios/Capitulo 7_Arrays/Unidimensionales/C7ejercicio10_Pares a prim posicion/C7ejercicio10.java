/**
 * 
 *    Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los
 *     almacene en un array. El programa debe ser capaz de pasar todos los números pares a
 *     las primeras posiciones del array (del 0 en adelante) y todos los números impares a
 *     las celdas restantes. Utiliza arrays auxiliares si es necesario.
 *    
 *
 * @author Belén Gutierrez
 */
public class C7ejercicio10 {

  public static void main(String[] args) {

      int[] num = new int[20];
      int[] par = new int[20];
      int[] impar = new int[20];
      int i;
      int pares = 0;
      int impares = 0;

      
      for ( i = 0; i < 20; i++) {
        num[i] = (int)(Math.random() * 101);
        }
        
        
        
      System.out.println( "\nEl array original es: \n");
      
      for ( i = 0; i < 20; i++) {
        System.out.printf( "|%3d" , i);
      }
      System.out.print("|");
      
      System.out.println();
      for ( i = 0; i < 81; i++) {
        System.out.print( "-");
      }
      System.out.println();
      
      for ( i = 0; i < 20; i++) {
        System.out.printf( "|%3d" , num[i]);
      }
      System.out.print("|");
    
      
      for ( i = 0; i < 20; i++) {
          if (num[i] % 2 == 0) {
            par[pares++] = num[i];
           } else {
            impar[impares++] = num[i];
           }
        }
      System.out.println();
      
       for ( i = 0; i < pares; i++) {
          num[i] = par[i];
        }
        for ( i = pares; i < 20; i++) {
          num[i] = impar[i - pares];
        }

      
     System.out.println( "\nEl array rotado es: \n");
      
      for ( i = 0; i < 20; i++) {
        System.out.printf( "|%3d" , i);
      }
      System.out.print("|");
      
      System.out.println();
      for ( i = 0; i < 81; i++) {
        System.out.print( "-");
      }
      System.out.println();
      
      for ( i = 0; i < 20; i++) {
        System.out.printf( "|%3d" , num[i]);
      }
      System.out.print("|"); 
      
      
  }
}

