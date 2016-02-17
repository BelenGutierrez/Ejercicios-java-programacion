/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c8funcionesejercicios;

/**
 *
 * @author belen
 */


import java.util.Scanner;
import matematicas.Varias;
public class C8FUNCIONESejercicios {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
      
    
    ///////////////esCapicua////////////////////////////////
    
    //int volteado = 0;
    //boolean capicua = false;
   
    System.out.print("Introduzca un número entero y le diré si es capicúa: ");
    int numIntro = Integer.parseInt(s.nextLine());
    
    
     //int copiado = numIntro;
     
  
    if ( Varias.esCapicua(numIntro)) {
      System.out.println("El " + numIntro + " es capicúa.");
    } else {
      System.out.println("El " + numIntro + " no es capicúa.");
    }

    
////////////////////// esPrimo //////////////////////////////////////////////////

    
    
    System.out.println("\nEste programa le dirá si el número introducido es primo");
    System.out.println("\nPor favor introduzca un número");
    numIntro = Integer.parseInt(s.nextLine());
    

    if (Varias.esPrimo(numIntro)) {
    System.out.println("El " + numIntro + " es primo.");
    } else {
    System.out.println("El " + numIntro + " no es primo.");
    }
    
    
    //////////////////// siguiente primo ////////////////////////////
    
   
    //boolean esPrimo = false;
    
    System.out.println("\nEste programa le dirá el menor primo siguiente al número introducido");
    System.out.println("\nPor favor introduzca un número");
    numIntro = Integer.parseInt(s.nextLine());
   
    System.out.println("El número primo siguiente a " + numIntro + " es : " + (Varias.siguientePrimo(numIntro)));
    
    
    
    
    
    ///////////////////// POTENCIA ///////////////////////////////////////////
    
    System.out.println("\nEste programa calcula la potencia.");
    System.out.println("Teclee por favor, la base: ");
    int base = Integer.parseInt(s.nextLine());
    
    System.out.println("Teclee ahora, el exponente: ");
    int exponente = Integer.parseInt(s.nextLine());
    
    
     System.out.println("La potencia de " + base + " elevado a  " + exponente + " es: "  + (Varias.potencia(base, exponente)));
    
    
    
    ///////////////////// DIGITOS ///////////////////////////////////////////
    
    System.out.println("\nEste programa cuenta los dígitos que tiene un número.");
    System.out.println("Introduzca un número: ");
    numIntro = Integer.parseInt(s.nextLine());
    
    System.out.println("La cantidad de dígitos de " + numIntro + " es  "  + (Varias.digitos(numIntro)));
     
    
    
     
    ///////////////////// VOLTEA ///////////////////////////////////////////
    
    System.out.println("\nEste programa le da la vuelta a un número.");
    System.out.println("Introduzca un número: ");
    numIntro = Integer.parseInt(s.nextLine());
    
    System.out.println("El " + numIntro + " volteado es,  "  + (Varias.voltea(numIntro))); 
     
     
    ///////////////////// DIGITO N ///////////////////////////////////////////
    
    System.out.println("\nEste programa dice qué dígito está en una posición dada.");
    System.out.println("Introduzca un número: ");
    numIntro = Integer.parseInt(s.nextLine());
    System.out.println("Introduzca un número: ");
    int posicion = Integer.parseInt(s.nextLine());
    
    System.out.print("Contando desde la posición 0 y de izquierda a derecha, en la posicion :  " +  posicion + "  aparece el digito: " );  
    System.out.println(" " + (Varias.digitoN(numIntro, posicion)));   
     
     
    
    
    
    
    
    
   }
}