/**
* Realiza un conversor de Mb a Kb.
*
* @author Belen Gutierrez
*/

public class C3ejercicio10 {      
  public static void main(String[] args) {

    String linea;

    System.out.println("Para convertir de Mb a Kb : ");
    System.out.print("Por favor, introduzca el numero de Mb :");
    linea = System.console().readLine();
    double mb = Double.parseDouble( linea ); 
    
    System.out.println(mb + "Mb son :" + (mb * 1024) + "Kb" );     
    
  } 
}
