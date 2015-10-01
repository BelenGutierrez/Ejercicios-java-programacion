/**
* Escribe un programa que calcule el total de una factura a partir
* de la base imponible.
*
* @author Belen Gutierrez
*/

public class C3ejercicio07 {
  public static void main(String[] args) {

    String linea;

    System.out.println("Para calcular el total de la factura: ");
    System.out.print("Por favor, introduzca la Base Imponible en euros : ");
    linea = System.console().readLine();
    double baseImponible = Double.parseDouble( linea ); 
           
  
    System.out.printf("BI                %6.2f\n"  , baseImponible);
    System.out.printf("IVA               %6.2f\n"  , (baseImponible * 0.21));
    System.out.printf("-----------------------\n" );
    System.out.printf("TOTAL             %6.2f\n"  , baseImponible + (baseImponible * 0.21));
  } 
}
