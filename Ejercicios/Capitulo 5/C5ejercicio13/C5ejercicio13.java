/**
 * 
 *  Escribe un programa que lea una lista de diez números y determine cuántos 
 *  son positivos y cuántos son negativos.
 *  
 * 
 * @author Belén Gutierrez
 */

public class C5ejercicio13 {

  public static void main(String[] args) {
    
    
    int numIntro;
    int positivo = 0;
    int negativo = 0;
    
    

    System.out.println("\nEste programa le dirá cuántos son positivos y cuántos negativos, de una lista de diez números.");
    System.out.println("\nTeclee por favor, los diez números enteros, y presione la tecla intro.");
    numIntro = Integer.parseInt(System.console().readLine());
    
    
    
    for (int i = 0 ; i < 10 ; i++) {
        if (numIntro < 0) {
          negativo++;
        } else {
          positivo++;
        }
        System.out.println("Hay un total de:" + positivo + "números positivos");
       
        System.out.println("y un total de:" + negativo + "números negativos");
    }    
  }
}
