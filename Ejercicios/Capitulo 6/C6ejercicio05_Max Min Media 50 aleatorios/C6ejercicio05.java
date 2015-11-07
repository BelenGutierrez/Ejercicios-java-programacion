/**
 *  Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 *  separados por espacios. Muestra el máximo, el mínimo y la media de esos números.
 * 
 * @author Belén Gutierrez
 */
public class C6ejercicio05 {
  public static void main(String[] args) {
    
    int numAleatorio;
    int minimo = 199;
    int maximo = 100;
    int suma = 0;
    
    System.out.print("Este programa muestra 50 números aleatorios entre 100 y 199\n ");

    for (int i = 0; i < 50; i++) {
      numAleatorio = (int)(Math.random()*100) + 100;
      System.out.print(numAleatorio + " ");
      suma = suma + numAleatorio;
           
     if (numAleatorio < minimo) {
        minimo = numAleatorio;
      }
      
      if (numAleatorio > maximo) {
        maximo = numAleatorio;
      }
    }
    
    System.out.println("\nMínimo: " + minimo + "\nMáximo: " + maximo + "\nMedia: " + suma / 50);  
  }
}













