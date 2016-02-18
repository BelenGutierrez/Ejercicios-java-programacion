/*
 * Biblioteca de Funciones de Matematicas varias.
 */
package matematicas;



/**
 *
 * @author belen
 */
public class Varias {
  

     
    /////////////////// CAPICUA //////////////////////////////////////////////////
    /**
     * Devuelve verdadero si el número que se pasa como parámetro es capicúa y
     * falso en caso contrario.
     * 
     * Un número capicúa es el que se lee igual de izquierda a derecha que de
     * derecha a izquierda.
     *
     * @param x un número entero positivo
     * @return verdadero si el número es capicúa y falso si no lo es.
     */
    public static boolean esCapicua(int x) {
      x = Math.abs(x);
     return(voltea(x)==x);
     } 
   

   
    ///////////////////////// PRIMO /////////////////////////////////////////////////////////////
    /**
     * Devuelve verdadero si el número que se pasa como parámetro es primo y falso
     * en caso contrario.
     * 
     * Un número es primo cuando es divisible únicamente entre el mismo y entre 1.
     *
     * @param x número del que se quiere saber si es primo
     * @return  verdadero si el número que se pasa como parámetro es primo y falso
     *          en caso contrario
     */
    public static boolean esPrimo(int x) {
      
    
      for (int i = 2; i < x; i++) {
        if ((x % i) == 0) {
          return false;
        }
      }
      return true;
    }

    
    //////////////////////// SIGUIENTE PRIMO ////////////////////////////////////////
    /**
      * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
      *
      * @param x un número entero
      * @return  el menor primo que es mayor al número que se pasa como parámetro
      */
     public static int siguientePrimo(int x) {
       while (!esPrimo(++x)) {  }
       return x;
     } 
     
     
    //////////////////////// POTENCIA ////////////////////////////////////////
   
     /* Dado un número como base y otro como exponente, la potencia es el resultado de multiplicar  la base 
      *  tantas veces como indique el exponente. Si el exponente es cero, el resultado será 1;  si lel exponente es uno, el resultado 
      *  será igual que la base.
      *
      * @param base 
      * @param exponente
      * @return  La base multiplicada tantas veces como indica el exponente.
      */
     public static double potencia(int base, int exponente) {
       
      if (exponente == 0) {
      return 1;
    }

    if (exponente < 0) {
      return 1/potencia(base, -exponente);
    }

    int potencia = 1;

    for (int i = 0; i < Math.abs(exponente); i++) {
      potencia = potencia * base;
     }

    return potencia;
    }
     
     
    //////////////////////// DIGITOS ////////////////////////////////////////
    /**
      * Cuenta la cantidad de dígitos que tiene un número,por ejemplo el 256845547, tiene 9 dígitos
      *
      * @param x un número entero
      * @return  La cantidad de dígitos del número.
      */
     public static int digitos(long x) {
       
     int numeroDeDigitos = 0;
     
     if ( x < 0) {
       x = -x;
     }
     
     if ( x == 0) {
       return 1;
     } else {
          
       while (x > 0) {
       x = x / 10;
       numeroDeDigitos++;
       }
      return  numeroDeDigitos;
      }
   }
     
    
      ///////////////// VOLTEA ///////////////////////////////////////////////
  
    /**
     * Voltear el número es darle la vuelta por ejemplo 357 se queda en 753.
     * 
     * 
     * @param x un número entero
     * @return  el número volteado
     *         
     */
     public static long voltea(long x) {
    
      long volteado = 0;
      
      if (x < 0) {
        return -voltea(-x);
      }

      while (x > 0) {
        volteado = (volteado * 10) + (x % 10);
        x /= 10;
      } 

      return  volteado;
    }
     
     
     ///////////////// digito N ///////////////////////////////////////////////
  
    /**
     * Con ésta función podemos saber el dígito que está en una posición dada.
     * Se empieza contando por el 0 y de izquierda a derecha, para ello se le da la vuelta al número.
     * 
     * @param x el número entero
     * @param n que es la posición dentro del número
     * @return  el  dígito que está en esa posición.
     *         
     */
     public static long digitoN(long x, int n) {
     
      x = Math.abs(x);
      x = voltea(x);

      while (n-- > 0) {
        x = x / 10;
      }

      return (int)x % 10;
      }

       
       
       
     
     
     
     
     
     
     
     
    
       
       
    
}