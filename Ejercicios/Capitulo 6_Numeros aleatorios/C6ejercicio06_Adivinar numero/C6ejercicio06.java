/**
 * 
 *  Usuario adivina el numero pensado
 * 
 * @author Belén Gutierrez
 */
public class C6ejercicio06 {

  public static void main(String[] args) {
    
    
    int i;
    int numPensado;
    int numUsuario;
    int intento = 5;
    boolean acertado = false;
    
    System.out.print("Adivine el numero que estoy pensando");
    
    numPensado = (int)(Math.random()*101);
        
     do  { 
       System.out.println("\nIntroduce número");
       numUsuario = Integer.parseInt(System.console().readLine());
       intento--; 
       
       
          
          if (numUsuario == numPensado)  {
            acertado = true;
            System.out.println("Enhorabuena ha adivinado");
          }
       
          if (numUsuario > numPensado) {
            System.out.println("El numero pensado es menor");
            System.out.println("Le quedan" + intento + "intentos");
          }
           if (numUsuario < numPensado) {
            System.out.println("El numero pensado es mayor");
            System.out.println("Le quedan" + intento + "intentos");
          }
          
      } while ( !acertado && ( intento > 0));
      
        if (!acertado)  {
            System.out.println("\nLo siento ha agotado los intentos");
            System.out.println("El numero pensado es: " + numPensado);
          }
  }
}
