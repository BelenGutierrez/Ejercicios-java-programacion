/**
 * 
 *  Escribe un programa que muestre entre 3 columnas el cuadrado y el cubo
 *  de los 5 primeros enteros a partir de uno que se introduce por teclado.
 * 
 * @author Belén Gutierrez
 */

public class C5ejercicio111 {

  public static void main(String[] args) {
    
    int cantidad = 1;
    int numIntro = 0;
    int cuadrado = 0;
    int cubo = 0;

    System.out.println("\nIntroduzca un número y le mostraré el cuadrado y el cubo de ese y los 4 siguientes.");
    numIntro = Integer.parseInt(System.console().readLine());

    //cantidad = numIntro;
    
    System.out.println("Numero \t Cuadrado \t Cubo");
    
    do {
      cuadrado = numIntro * numIntro;
      cubo = cuadrado * numIntro;
    
      System.out.println(numIntro + " \t " + cuadrado + " \t \t "+ cubo);
      numIntro++;
      cantidad++;
      
     
          
    } while  (cantidad <= 5) ;      
     
     //System.out.println(numIntro + cuadrado + cubo);
  }
}
