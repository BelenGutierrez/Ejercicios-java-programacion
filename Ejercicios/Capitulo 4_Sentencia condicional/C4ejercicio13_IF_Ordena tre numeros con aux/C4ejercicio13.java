 /**
 *
 * Escribe un programa que ordene 3 números enteros introducidos por teclado
 *
 * @author Belén Gutierrez
 */

public class C4ejercicio13 { 
  
  public static void main(String[] args) {
    
      
    int aux;  
      
    System.out.println("Este programita ordenará los 3 números enteros \n");  
    System.out.println("Por favor introduzca el primer número: " );
    int primerNum = Integer.parseInt (System.console().readLine());
    
    System.out.println("Ahora el segundo número: ");
    int segundoNum = Integer.parseInt (System.console().readLine());
    
    System.out.println("Y por último, el tercero: ");
    int tercerNum = Integer.parseInt (System.console().readLine());    

    if (primerNum > segundoNum) {
      aux = primerNum;
      primerNum = segundoNum;
      segundoNum = aux;
      }
     
     if (segundoNum > tercerNum) {
      aux = segundoNum;
      segundoNum = tercerNum;
      tercerNum = aux;
      } 
      
     if (primerNum > segundoNum) {
      aux = primerNum;
      primerNum = segundoNum;
      segundoNum = aux;
      }
      
     System.out.println("Los números introducidos ordenados de menor a mayor son: " + primerNum + ", " + segundoNum + " y " + tercerNum + "."); 
  }
}   
      
      
