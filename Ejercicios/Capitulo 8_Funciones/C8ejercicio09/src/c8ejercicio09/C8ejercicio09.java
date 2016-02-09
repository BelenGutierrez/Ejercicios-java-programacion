/*
 * 9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la
 * derecha).
 * 
 */
package c8ejercicio09;

/**
 *
 * @author belen
 */

import java.util.Scanner;
public class C8ejercicio09 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
   
    int numIntro;
    int quitarDigito;
  
  
    
     System.out.print("Introduzca un número entero: ");
     numIntro = Integer.parseInt(s.nextLine());
   
    System.out.print("Introduzca los dígitos que quiere quitar al número introducido: ");
    quitarDigito = Integer.parseInt(s.nextLine());
  
    
   //Quita la cantidad de dígitos que introdujo el usuario
    int resultado =numIntro;
    for ( int i = 0; i < quitarDigito; i++){
       resultado = resultado / 10;
     
   }
    System.out.println("El número introducido es :  " + numIntro);
    System.out.println("Quitando por la derecha, la cantidad de :  "  + quitarDigito + " dígitos ");
    System.out.println("El número introducido se queda así :  " + resultado);
    
  }
  
}
