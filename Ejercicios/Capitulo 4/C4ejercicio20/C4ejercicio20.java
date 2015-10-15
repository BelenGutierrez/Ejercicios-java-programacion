/**
 *
 *  Realiza un programa que diga si un número entero positivo introducido por
 *  teclado es capicúa. Se permiten números de hasta cinco cifras.
 * 
 *
 * @author Belén Gutierrez
 */
public class C4ejercicio20 {

  public static void main(String[] args) {
    
    int numero;
    boolean capicua = false;
    
    System.out.print("Por favor, introduzca un número entero ( 5 cifras máximo): ");
    numero = Integer.parseInt(System.console().readLine());
    
    
    if (numero >= 100000) {
      System.out.println("\nLo siento, el número tiene mas de 5 cifras\n");
      
      System.out.println("Intenta con otro número, por favor");
      numero = Integer.parseInt(System.console().readLine());
    }
        
    
    if (numero < 10) {
      capicua = true;
    }
    
    if ((numero >= 10) && (numero < 100)) {
      if ((numero / 10) == (numero % 10)) {
        capicua = true;
      }
    }

    if ((numero >= 100) && (numero < 1000)) {
      if ((numero / 100) == (numero % 10)) {
        capicua = true;
      }
    }

    if ((numero >= 1000) && (numero < 10000)) {
      if (((numero / 1000) == (numero % 10)) && ((( numero / 100 ) % 10)== (( numero / 10) % 10))) {
        capicua = true;
      }
    }
    
    if ((numero >= 10000) && (numero < 100000)) {
      if (((numero / 10000) == (numero % 10) ) && ((((numero / 1000) % 10)) == ((numero / 10) % 10))) {
        capicua = true;
      }
    }
            
    if (capicua) {
      System.out.println("El número introducido es capicúa.");
    } else {
      System.out.println("El número introducido no es capicúa.");
    }
  }
}
