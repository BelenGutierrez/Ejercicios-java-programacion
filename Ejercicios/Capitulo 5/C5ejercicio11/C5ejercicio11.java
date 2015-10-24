/**
 * 
 *  Escribe un programa que muestre entre 3 columnas el cuadrado y el cubo
 *  de los 5 primeros enteros a partir de uno que se introduce por teclado.
 * 
 * @author Belén Gutierrez
 */

public class C5ejercicio11 {

  public static void main(String[] args) {
    
    int cantidad = 0;
    int numIntro = 0;
    int cuadrado = 0;
    int cubo = 0;

    System.out.println("\nIntroduzca un número y le mostraré el cuadrado y el cubo de ese y los 4 siguientes.");
    numIntro = Integer.parseInt(System.console().readLine());

    cantidad = numIntro;
    
    System.out.println("Numero \t Cuadrado \t Cubo");
    
    do {
      cuadrado = cantidad * cantidad;
      cubo = cuadrado * cantidad;
      //numIntro++;
      System.out.println(cantidad + " \t " + cuadrado + " \t \t "+ cubo);
      cantidad++;
      
     
          
    } while  (cantidad <= numIntro + 4) ;      
     
     //System.out.println(numIntro + cuadrado + cubo);
  }
}
