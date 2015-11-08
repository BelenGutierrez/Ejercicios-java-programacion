/**
* Conversor de euros a pesetas
*
* @author Belen Gutierrez
*/

public class C3ejercicio02 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce un cantidad en euros: ");
    linea = System.console().readLine();
    double numeroIntroducido = Double.parseDouble ( linea );  
    
    System.out.printf("%.2f, euros es igual a: , %.2f pesetas" , numeroIntroducido,  numeroIntroducido * 166.386 );
        
  } 
}
