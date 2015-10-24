/**
 * 
 *  Realiza el control de acceso a una caja fuerte. La combinación será 
 *  un número de 4 cifras. El programa nos pedirá la combinación para abrirla. 
 *  Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” 
 *  y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 *  Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * @author Belén Gutierrez
 */
public class C5ejercicio07 {

  public static void main(String[] args) {
    
    int intentos = 4;
    int numeroIntroducido;
    boolean acertado = false;
    
        
    do {
      System.out.print("Introduzca la clave, por favor: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if ((numeroIntroducido < 1000)  || (numeroIntroducido > 9999)) {
        System.out.println("La clave debe ser de 4 cifras\n");
        intentos--;
      }
        
      if (numeroIntroducido == 3289) {
        acertado = true;
      } else {
        System.out.println("Clave incorrecta");
      }
      
      intentos--;
  
    } while((intentos > 0) && (!acertado));
    
        
    if (acertado) {
      System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
    } else {
      System.out.println("Lo siento, esa no es la combinación.");
    }
  }
}
