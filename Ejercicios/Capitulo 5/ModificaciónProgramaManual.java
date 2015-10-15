/**
 * Bucle do-while Modificación programa del manual.
 *
 * @author Belén Gutierrez
 */

public class ModificaciónProgramaManual {
  public static void main(String[] args) {
        
    int numero;
    String respuesta;
    
    do {
      System.out.println("Dime un número, por favor");
      int numero = Integer.parseInt(System.console().readline());
      if (numero % 2 == 0) {
      System.out.println("Qué bonito es el " + numero);
      } else {
      
      System.out.printl("No me gustan los números impares, adiós ");
      }
      System.out.printl("Desea continuar ?  responda: "s"  o  "n" ");
      respuesta = System.console().readline();
      
    } while (numero % 2 == 0);
  }
}
