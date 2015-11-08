/**
* Realiza un conversor de Kb a Mb.
*
* @author Belen Gutierrez
*/

public class C3ejercicio11 {      
  public static void main(String[] args) {

    String linea;

    System.out.println("Para convertir de Kb a Mb : ");
    System.out.print("Por favor, introduzca el numero de Kb :");
    linea = System.console().readLine();
    double kb = Double.parseDouble( linea ); 
    
    System.out.println(kb + "Kb son :" + (kb / 1024) + "Mb" );     
    
  } 
}
