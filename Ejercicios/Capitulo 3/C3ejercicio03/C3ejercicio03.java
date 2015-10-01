/**
* Conversor de pesetas a euros
*
* @author Belen Gutierrez
*/

public class C3ejercicio03 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce un cantidad en pesetas: ");
    linea = System.console().readLine();
    double numeroIntroducido = Double.parseDouble ( linea );  
    
    System.out.printf("%.2f, pesetas es igual a: , %.2f euros" , numeroIntroducido,  numeroIntroducido / 166.386 );
        
  } 
}
