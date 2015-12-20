/**
 * 
 *    Define un array de 10 caracteres con nombre simbolo y asigna los valores
 *    según la tabla que se muestra a continuación. Muestra el contenido de todos
 *    los elementos del array. ¿Qué sucede con los valores de los elementos que
 *    no han sido inicializados?
 *    Posición  0   1   2   3   4   5   6   7   8   9  
 *    Valor     a   x               @      ' '  +   Q
 *
 * @author Belén Gutierrez
 */
public class C7ejercicio02 {

  public static void main(String[] args) {

      char[] simbolo = new char[10];
    
      simbolo[0] = 'a';
      simbolo[1] = 'x';
      simbolo[5] = '@';
      simbolo[7] = ' ';
      simbolo[8] = '+';
      simbolo[9] = 'Q';
      
      System.out.println("Los elementos del array son:\n");
      
      for (int i = 0; i < 10; i++) {
        System.out.printf("simbolo[%2d]: %c\n", i, simbolo[i]);
        }
      
  // Los elementos del array que no tienen valor se muestran vacíos.
  }
}
