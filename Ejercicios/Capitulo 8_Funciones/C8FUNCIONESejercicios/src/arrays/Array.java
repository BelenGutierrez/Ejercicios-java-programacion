/*
 * Funciones de Arrays Unidimensionales.
 */
package arrays;

/**
 *
 * @author belen
 */
public class Array {
  
  
  /////////////////////// MUESTRA ARRAY //////////////////////////////////////////
  
  /**
   * Muestra por pantalla todos los elementos de un array de números enteros
   * separados por un espacio.
   * 
   * @param x array unidimiensional de números enteros
   */
  public static void muestraArrayInt(int x[]) {
     for ( int i = 0; i < x.length; i++) {
      System.out.print(x[i] + " ");
     }
   }
  
  /////////////////////// GENERA ARRAY //////////////////////////////////////////
  
   /**
   * Crea un array y lo rellena con valores aleatorios dentro de un rango.
   * 
   * @param tamano  número de elementos que contendrá el array
   * @param minimo límite inferior de números aleatorios
   * @param maximo límite superior de números aleatorios
   * @return array relleno con valores aleatorios entre el minimo y el máximo
   *               
   */
   public static int[] generaArrayInt(int tamano, int minimo, int maximo) {
    int[] x = new int[tamano];

    for( int i = 0; i < tamano; i++) {
      x[i] = (int)(Math.random() * ( maximo - minimo + 1 ) + minimo );
    }
      
    return x;
  }
  
  
  
  /////////////////////// MINIMO ARRAY //////////////////////////////////////////
  
   /**
   * Nos dice cual es el número mínimo dentro de un array.
   * 
   * @param  x array Unidimensional de números enteros
   * @return el valor minimo  del array
   *               
   */
   public static int minimoArrayInt(int[] x) {
    
    int minimo = Integer.MAX_VALUE;
    
    for( int num : x) {
     if (num < minimo) {
        minimo = num;
      }
    }  
    return minimo;
    
   } 
  
   
    /////////////////////// MAXIMO ARRAY //////////////////////////////////////////
  
   /**
   * Nos dice cual es el número máximo dentro de un array.
   * 
   * @param  x array Unidimensional de números enteros
   * @return el valor máximo  del array
   *               
   */
   public static int maximoArrayInt(int[] x) {
    
    int maximo = Integer.MIN_VALUE;
    
    for( int num : x) {
     if (num > maximo) {
        maximo = num;
      }
    }  
    return maximo;
    
   } 
  
   /////////////////////// MEDIA ARRAY //////////////////////////////////////////
  
   /**
   * Nos dice cual es la media del array. Es decir suma todos los elementos del array y los divide por la cantidad de elementos.
   * 
   * @param  x array Unidimensional de números enteros
   * @return la media del array
   *               
   */
   public static int mediaArrayInt(int[] x) {
    
    int suma = 0;
    int digito = 0;
    for( int num : x) {
        suma = suma + num;
        digito++;
      }
     
    return suma / digito;
    
   } 
   
   /////////////////////// ESTA EN ARRAY //////////////////////////////////////////
  
   /**
   * Nos dice si un número está dentro de un array.
   * 
   * @param  x array Unidimensional de números enteros
   * @param g es el dígito a encontrar dentro del array.
   * @return verdadero si el número indicado está en el array y falso si nolo esta.
   *               
   */
   public static boolean estaEnArrayInt(int[] x, int g) {
    
   
    for( int num : x) {
      if( num == g) {
       return true;
      }
     }
    return false;
   } 
   
   
   /////////////////////// POSICION EN ARRAY //////////////////////////////////////////
  
   /**
   * Nos dice la posición de un número dentro de un array.
   * 
   * @param  x array Unidimensional de números enteros
   * @param g es el dígito a encontrar dentro del array.
   * @return la posición de un dígito que está dentro del array. Si no lo encuentra devuelve -1.
   *               
   */
   public static int posicionEnArrayInt(int[] x, int g) {
    
   
    for( int i = 0; i < x.length; i++) {
      if( x[i] == g) {
       return i;
      }
     }
    return -1;
   } 
   
   
   
  
  
  
  
  
  
}
