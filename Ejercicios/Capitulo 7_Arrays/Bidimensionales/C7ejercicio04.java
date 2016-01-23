/**
 * 
 *    Modifica el programa anterior de tal forma que las sumas parciales y la suma total
 *    aparezcan en la pantalla con un pequeño retardo, dando la impresión de que el
 *    ordenador se queda pensando antes de mostrar los números.
 * 
 * @author Belén Gutierrez
 */
public class C7ejercicio04 {
  public static void main(String[] args) 
    throws InterruptedException {
      
    int[][] num = new int[4][5]; 

    int fila;
    int columna;
        
    
    for(fila = 0; fila < 4; fila++)
      for(columna = 0; columna < 5; columna++)
        num[fila][columna] = (int)(Math.random() * 900) + 100;

    
    int sumaFila; // Muestra los números del array y la suma de cada fila
    for(fila = 0; fila < 4; fila++) {
      sumaFila = 0;  
      for(columna = 0; columna < 5; columna++) {
        //System.out.printf("%7d   ", num[fila][columna]);
        sumaFila += num[fila][columna];
        System.out.printf("%7d   ", num[fila][columna]);
        Thread.sleep(200);
      }  
      System.out.printf("|%7d\n", sumaFila);
      Thread.sleep(600);
    }
    
    
    for(columna = 0; columna < 5; columna++) {
      System.out.print("----------");
    }
    System.out.print("-----------"); // fuera del array
    System.out.println();            // Para que los resultados queden bien colocados
    
    
    
    // Muestra la suma de cada columna y suma total
    int sumaColumna;   
    int sumaTotal = 0;
    
    for(columna = 0; columna < 5; columna++) {
      sumaColumna = 0;
      for(fila = 0; fila < 4; fila++) {
        sumaColumna += num[fila][columna];
      }

      sumaTotal += sumaColumna;
      System.out.printf("%7d   ", sumaColumna);
      Thread.sleep(950);
    }
    System.out.printf("|%7d   ", sumaTotal);
  }
}

      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
       
 
   
