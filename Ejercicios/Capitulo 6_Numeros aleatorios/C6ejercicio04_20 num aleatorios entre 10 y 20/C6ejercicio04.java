/**
 *  Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados 
 *  por espacios.
 * 
 * @author Belén Gutierrez
 */
public class C6ejercicio04 {
  public static void main(String[] args) {
    
    
    System.out.print("Este programa muestra 20 números aleatorios entre 0 y 10\n ");

    for (int i = 0; i < 20; i++) {
      System.out.print((int)(Math.random()*11) + " ");
    }
    System.out.println();
  }
}
