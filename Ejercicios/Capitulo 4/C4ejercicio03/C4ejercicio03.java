/**
 * Sentencia switch
 *
 * Escribe un programa en que dado un número del 1 al 7, escriba el 
 * correspondiente nombre del dia de la semana.
 *
 * @author Belén Gutierrez
 */

public class C4ejercicio03 {
  public static void main(String[] args) {   
    System.out.print("Por favor escriba un número del 1 al 7 :  ");
    int numero = Integer.parseInt (System.console().readLine());
    
    
    
    switch (numero) {
      case 1:
        System.out.println("El numero 1 es el Lunes");
        break;
    
      case 2:
        System.out.println("El numero 2 es el Martes");
        break;
    
      case 3:
        System.out.println("El numero 3 es el Miércoles");
        break;
    
      case 4:
        System.out.println("El numero 4 es el Jueves");
        break;
    
      case 5:
        System.out.println("El numero 5 es el Viernes");
        break;
    
      case 6:
        System.out.println("El numero 6 es el Sábado");
        break;
      
      case 7:
        System.out.println("El numero 7 es el Domingo");
        break;
      
      default: 
        System.out.println("Por favor introduzca un número del 1 al 7");
    }         
  }
}
