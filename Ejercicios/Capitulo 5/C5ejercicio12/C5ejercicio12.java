/**
 * 
 *  Escribe un programa que muestre los n primeros términos de la serie de 
 *  Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
 *  y el resto se calcula sumando los dos anteriores, por lo que tendríamos que 
 *  los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n
 *  se debe introducir por teclado.
 * 
 * @author Belén Gutierrez
 */

public class C5ejercicio12 {

  public static void main(String[] args) {
    
    int cantElementos;
    int numAnterior = 0;
    int numPosterior = 1;
    int aux;
    

    System.out.println("\nEste programa muestra la serie de Fibonacci.");
    System.out.println("\nIndique por favor, cuántos números de la serie desea ver.");
    cantElementos = Integer.parseInt(System.console().readLine());
    
    if (cantElementos == 0) {
        System.out.println("\n Está seguro que no desea ver ninguno?");
        System.out.println("\n Intente otra vez?");
        cantElementos = Integer.parseInt(System.console().readLine());
      } 
      
      if (cantElementos == 1) {
        System.out.println("El primer número de la serie Fibonacci es: 0");
      } 
      
      if (cantElementos == 2) {
        System.out.println("Los dos primeros números de la serie Fibonacci son: 0,1");
      } 
      
      System.out.print("Los números de la serie son:  0,1" );
      
      
       while(cantElementos > 2) {
        //System.out.print("Los números de la serie son:  0,1" );
        aux = numAnterior;
        numAnterior = numPosterior;
        numPosterior = aux + numPosterior;
        System.out.print( "," + numPosterior );
        cantElementos--;

    }
  }
}
