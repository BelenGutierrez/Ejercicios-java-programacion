 /**
 *
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5.
 *
 * @author Belén Gutierrez
 */

public class C4ejercicio14 { 
  
  public static void main(String[] args) {
    
      
      
      
    System.out.println("\nEste programa dirá si el número introducido es par y/o divisible entre 5 \n");  
    System.out.println("Por favor introduzca el número: " );
    int numero = Integer.parseInt (System.console().readLine());
    
    
    if (numero == 0 ) {
      System.out.println("El número introducido ni es par ni es divisible por ningún número"); 
    } else {
    }
    if ((numero % 2 ) == 0)  {
      System.out.println("El número es par " );
    } else { 
      System.out.println("El número es impar " );
    }
    
    if ((numero % 5 ) == 0) {
      System.out.println("El número es divisible entre 5 " );
    } else { 
      System.out.println("El número no es divisible entre 5 " );
     }
  }
}


