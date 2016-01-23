/**
 *
 *    
 *   Modica el programa anterior de tal forma que no se repita ningún número en el array.
 * 
 * @author Belén Gutierrez
 */
public class C7ejercicio06bis {

  public static void main(String[] args) throws InterruptedException {
    
    int[][] num = new int[6][10];
    int fila = 0;
    int columna = 0;
    
    int[] arrayLineal = new int[60];
    int numArrayLineal = 0;
    int i = 0;
    int contador = 0;
    
    
    int minimo = Integer.MAX_VALUE;
    int filaMinimo = 0;
    int columnaMinimo = 0;
    
    int maximo = Integer.MIN_VALUE;
    int filaMaximo = 0;
    int columnaMaximo = 0;

    
    
    
    numArrayLineal = (int)(Math.random() * 1001); 
    arrayLineal[i] = numArrayLineal;
  
    
    for(int h = 1; h < 60; h++) {
    
      boolean existeNumero;
     
      do{
        existeNumero = false;
        
        numArrayLineal = (int)(Math.random() * 1001);
        System.out.print(" " + numArrayLineal + " ");
        System.out.println("contador" + contador);
          for( i = 0; i < contador + 1; i++) { 
            System.out.println("i" + i);
            if(numArrayLineal == arrayLineal[i]) {
              existeNumero = true;
            }
          
          }
              
         contador++;     
       } while(existeNumero);
       

      arrayLineal[h] = numArrayLineal;
  
      
      System.out.println("array lineal");
     for( int m = 0; m < 60; m++) {
       System.out.print(arrayLineal[m] + " "); 
     }
       System.out.println();        
     } // for h

     
     i= 0;
      for(fila = 0; fila < 6; fila++) {
        for(columna = 0; columna < 10; columna++) {
          num[fila][columna]  = arrayLineal[i]; 
          i++;
          System.out.print(" " + num[fila][columna] + " ");
       }
      }
   
      System.out.print("\n      ");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("   " + columna + "  ");
    }
    System.out.println();
    
    System.out.print("    ┌");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("──────");
    }
    System.out.println("┐");
    
    for(fila = 0; fila < 6; fila++) {
      System.out.print("  " + fila + " │");
      for(columna = 0; columna < 10; columna++) {
        System.out.printf("%5d ", num[fila][columna]);
        Thread.sleep(20);   
        
        // Verifica el mínimo y guarda sus coordenadas
        if (num[fila][columna] < minimo) {
          minimo = num[fila][columna];
          filaMinimo = fila;
          columnaMinimo = columna;
        }
        
        // Verifica el máximo y guarda sus coordenadas
        if (num[fila][columna] > maximo) {
          maximo = num[fila][columna];
          filaMaximo = fila;
          columnaMaximo = columna;
        }
      }
       System.out.println("│");
    }
    System.out.print("    └");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("──────");
      }
      System.out.print("┘");
 

    System.out.println("\n\nEl máximo es " + maximo + " y está en la fila " + filaMaximo + ", columna " + columnaMaximo);
    System.out.println("El mínimo es " + minimo + " y está en la fila " + filaMinimo + ", columna " + columnaMinimo);
  }
}
