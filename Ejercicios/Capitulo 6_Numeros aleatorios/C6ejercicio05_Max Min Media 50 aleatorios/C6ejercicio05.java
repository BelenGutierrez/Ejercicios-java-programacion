/**
 * 
 *  Muestra 50 num aleat, max, min, y media.
 * 
 * @author Belén Gutierrez
 */
public class C6ejercicio05 {

  public static void main(String[] args) {
    
    
    int i;
    int numero;
    int suma = 0;
    int max = 100;
    int min = 199;
    
        
     for ( i = 0; i < 50; i++) {  
        numero = (int)(Math.random()*100) + 100;
        System.out.print(numero + " ");
        suma += numero;
            
        if (numero < min) {
        min = numero;
        }
       
        if (numero > max) {
        max = numero;
        }
      }
      
       System.out.println("\nLa media es: " + suma / 50); 
       System.out.println("El max: " + max); 
       System.out.println("El min es: " + min); 
  }
}
