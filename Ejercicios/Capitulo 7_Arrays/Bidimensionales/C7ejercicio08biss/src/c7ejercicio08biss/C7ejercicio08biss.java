/*
 * Escribe un programa que, dada una posición en un tablero de ajedrez,
 *    nos diga a qué casillas podría saltar un alfil que se encuentra en esa
 *    posición. Como se indica en la figura, el alfil se mueve siempre en
 *    diagonal. El tablero cuenta con 64 casillas.
 *    Las columnas se indican con las letras de la "a" a la "h" y las filas
 *    se indican del 1 al 8.
 *    Ejemplo:
 *    Introduzca la posición del alfil: d5
 *    El alfil puede moverse a las siguientes posiciones: h1 a2 g2 b3 e3 c4 e4 c6 e6 b7 f7 a8 g8
 */
package c7ejercicio08biss;

/**
 *
 * @author belen
 */
import java.util.Scanner;

public class C7ejercicio08biss {

  /**
   * @param args the command line arguments
   */
  
  static final int MOV = 1;
  static final int VACIO = 0;
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[][] tablero = new int [9][9]; // la fila 0 y la columna 0 no se utilizan
    int fila;
    int col;
    char[][] tableroConMovimAlfil = new char [9][9]; // aquí se guardan los posibles mov del alfil
    
    int filaIntro;
    int colIntro;
    int colum = 0;
    
    
    // pide las coordenadas  
    System.out.print("\nIntroduzca la posición del alfil, por ejemplo d5: ");
    System.out.println("Por favor introduzca la fila: ");
    filaIntro = Integer.parseInt(s.nextLine());
    System.out.println("Por favor introduzca la columna: ");
    colIntro = Integer.parseInt(s.nextLine());

      System.out.println();
      
      
      // calcula movimientos hacia izquierda y arriba
      
      System.out.println("\nLos movimientos hacia la izquierda y arriba son: ");
      col = colIntro;
      fila = filaIntro;
      if ( (fila > 1) && (col > 1)){
       for (fila = fila - 1; fila >= 1 && col > 1 ; fila --) {
       
        col = col - 1;
        System.out.print(" "+ fila + "."  + col  + "|");
        
       
      }
    }
      System.out.println();

       // calcula movimientos hacia izquierda y abajo
      System.out.println("Los movimientos hacia la izquierda y abajo son: ");
      col = colIntro;
      fila = filaIntro;
      if ( (fila < 8) && (col > 1)){
        for (fila = filaIntro + 1; fila <= 8 && col > 1; fila ++) {

         col = col - 1;

       
        System.out.print(" "+ fila + "."  + col  + "|");
        }

      }

      System.out.println();

       // calcula movimientos hacia derecha y arriba
      System.out.println("Los movimientos hacia la derecha y arriba son: ");
      col = colIntro;
      fila = filaIntro;
      if ( (fila > 1) && (col < 8)){
        for (fila = filaIntro - 1; fila >= 1 && col < 8; fila --) {
          
          col = col + 1;
 
       
        System.out.print(" "+ fila + "."  + col  + "|");
        }
      }

      System.out.println();

       // calcula movimientos hacia derecha y abajo
      System.out.println("Los movimientos hacia la derecha y abajo son: ");
      col = colIntro;
      fila = filaIntro;
      if ( (fila < 8) && (col < 8)){
        for (fila = filaIntro + 1; fila <= 8 && col < 8; fila ++) {
       
           col = col + 1;
        
      
        System.out.print(" "+ fila + "."  + col  + "|");
      
       }
     } 
    
  }
  
}
