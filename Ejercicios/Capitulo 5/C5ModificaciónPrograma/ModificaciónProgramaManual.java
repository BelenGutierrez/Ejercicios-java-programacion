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
      numero = Integer.parseInt(System.console().readLine());
      
      if (numero % 2 == 0) {
        System.out.println("Qué bonito es el " + numero);
        
       System.out.println("Desea continuar ?  responda: s / n ");
       respuesta = System.console().readLine(); 
        
        
      } else {
        System.out.println("No me gustan los números impares, adiós ");
      }
     
    } while (numero % 2 == 0);
  }
}
