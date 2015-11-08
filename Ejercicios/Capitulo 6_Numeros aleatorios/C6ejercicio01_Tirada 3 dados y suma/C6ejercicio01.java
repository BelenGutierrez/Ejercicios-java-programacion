/**
 * 
 *  Escribe un programa que muestre la tirada de tres dados. Se debe mostrar 
 *  también la suma total (los puntos que suman entre los tres dados).
 * 
 * @author Belén Gutierrez
 */
public class C6ejercicio01 {
  public static void main(String[] args) {
    
    int tirada;
    int suma = 0;
    
    System.out.print("Este programa muestra la tirada de 3 dados y la suma:\nTirada: ");

    for(int i = 0; i < 3; i++) {
      tirada = (int)(Math.random() * 6) + 1;
      System.out.print(tirada + " ");
      suma = suma + tirada;
    }

    System.out.println("\nSuma: " + suma);
  }
}
