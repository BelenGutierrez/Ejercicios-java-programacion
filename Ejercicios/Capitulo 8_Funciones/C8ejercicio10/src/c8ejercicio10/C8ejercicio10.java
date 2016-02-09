/*
 * 10. quitaPorDelante: Le quita a un número n dígitos por delante (por la
 * izquierda).
 * 
 */
package c8ejercicio10;

/**
 *
 * @author belen
 */

import java.util.Scanner;
public class C8ejercicio10 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int numIntroducido;
    int quitarDigito;
    int volteado = 0;
    int volteadoDos = 0;
    
     System.out.print("Introduzca un número entero: ");
     numIntroducido = Integer.parseInt(s.nextLine());
   
    System.out.print("Introduzca los dígitos que quiere quitar al número introducido: ");
    quitarDigito = Integer.parseInt(s.nextLine());
  
    ////////// Volteamos el número introducido
     int numIntro = numIntroducido;
     while (numIntro > 0) {
      volteado = (volteado * 10) + (numIntro % 10);
      numIntro /= 10;
    } 
    
   ////////Quita la cantidad de dígitos que introdujo el usuario
   
    int resultadoVolteado =volteado;
    for ( int i = 0; i < quitarDigito; i++){
       resultadoVolteado = resultadoVolteado / 10;
   }
    
     /////////// Ahora volteamos el resultado 
     
     while (resultadoVolteado > 0) {
      volteadoDos = (volteadoDos * 10) + (resultadoVolteado % 10);
      resultadoVolteado /= 10;
     
    } 
    
    System.out.println("\n\nEl número introducido es :  " + numIntroducido);
    System.out.println("Quitando por delante,  la cantidad de :  "  + quitarDigito + " dígitos ");
    System.out.println("El número introducido se queda así :  " + volteadoDos);
    
    
    
    
  }
  
}
