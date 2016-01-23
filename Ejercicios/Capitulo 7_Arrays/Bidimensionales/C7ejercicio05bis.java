/**
 *
 *    Realiza un programa que rellene un array de 6 filas por 10 columnas
 *    con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
 *    A continuación, el programa deberá dar la posición tanto del máximo como del
 *    mínimo.
 * 
 * @author Belén Gutierrez
 */
public class C7ejercicio05bis {

  public static void main(String[] args)  {
    
    int[][] num = new int[6][10];

    int fila;
    int columna;
 
    int minimo = Integer.MAX_VALUE;
    int filaMinimo = 0;
    int columnaMinimo = 0;
    
    int maximo = Integer.MIN_VALUE;
    int filaMaximo = 0;
    int columnaMaximo = 0;

    
        
    for(fila = 0; fila < 6; fila++) {
      for(columna = 0; columna < 10; columna++) { 
        num[fila][columna] = (int)(Math.random() * 1001);
        System.out.printf("%4d  " , num[fila][columna]);
           
        
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
     System.out.println();
    }
   

    System.out.println("\n\nEl máximo es " + maximo + " y está en la fila " + filaMaximo + ", columna " + columnaMaximo);
    System.out.println("El mínimo es " + minimo + " y está en la fila " + filaMinimo + ", columna " + columnaMinimo);
  }
}
