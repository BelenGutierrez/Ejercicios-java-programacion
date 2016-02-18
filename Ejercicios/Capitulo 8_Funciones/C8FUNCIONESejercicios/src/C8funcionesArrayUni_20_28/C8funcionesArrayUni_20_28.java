/*
 * Funciones de Arrays Unidimensionales
 */
package C8funcionesArrayUni_20_28;

import arrays.Array;

/**
 *
 * @author belen
 */

import java.util.Scanner;
public class C8funcionesArrayUni_20_28 {
  

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
     Scanner s = new Scanner(System.in);  
  
     
    /////////////////// MUESTRA ARRAY //////////////////////////////// 
    
    
     System.out.println("Este programa muestra un Array Unidimensional ");
    
     
    int[] a = {3, 5, 7, 22, -9};
   
    
    arrays.Array.muestraArrayInt(a); 
    System.out.println();
            
     
     
     
     
     
     ////////////////// GENERA ARRAY ///////////////////////////////
     
  
     int [] b = arrays.Array.generaArrayInt(25, 30, 40);
     System.out.println();
     arrays.Array.muestraArrayInt(b); 
     System.out.println();
     
     
     
    ////////////////////// MINIMO ARRAY ///////////////////////////////
    
  
     System.out.println("Mínimo: " + arrays.Array.minimoArrayInt(b));
    
     
     
     ///////////////////////// MAXIMO ARRAY ///////////////////////////////
    
  
     System.out.println("Máximo: " + arrays.Array.maximoArrayInt(b));
    
     
     ///////////////////////// MEDIA ARRAY ///////////////////////////////
    
  
     System.out.println("Media: " + arrays.Array.mediaArrayInt(b)); 
     
     
     
    ///////////////////////// ESTA EN  ARRAY ///////////////////////////////
      
    System.out.print("Introduzca un dígito: ");
    int digito = Integer.parseInt(s.nextLine());  
     
     if (arrays.Array.estaEnArrayInt(b, digito)) {
      System.out.println("El " + digito + " está en el array.");
    } else {
      System.out.println("El " + digito + " no está en el array.");
    }
     
      ///////////////////////// POSICION EN  ARRAY ///////////////////////////////
      
    System.out.print("Introduzca un dígito, para saber su posición: ");
    digito = Integer.parseInt(s.nextLine());  
     
    System.out.println("El " + digito + " está en la posición: " +  arrays.Array.posicionEnArrayInt(b, digito)); 
  
     
     
     
     
     
     
  
  }
  
}
