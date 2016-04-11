/*
 * 7. Queremos gestionar la venta de entradas (no numeradas) de
 *    Expocoches Campanillas que tiene 3 zonas, la sala principal con
 *    1000 entradas disponibles, la zona de compra-venta con 200
 *    entradas disponibles y la zona vip con 25 entradas disponibles.
 *    Hay que controlar que existen entradas antes de venderlas.
 *    La clase <code>Zona</code> con sus atributos y métodos se
 *    proporciona al alumno.
 *    <p>
 *    El menú del programa debe ser el que se muestra a continuación.
 *    Cuando elegimos la opción <code>2</code>, se nos debe preguntar
 *    para qué zona queremos las entradas y cuántas queremos.
 *    Lógicamente, el programa debe controlar que no se puedan vender
 *    más entradas de la cuenta.
 *    <p>
 *    <code>
 *    <pre> 
 *    1. Mostrar número de entradas libres
 *    2. Vender entradas
 *    3. Salir
 *    </pre>
 *    </code>
 */
package C9ejercicio07;

/**
 *
 * @author belen
 */
public class Zona {
  
  private int entradasPorVender;
  
  public Zona(int n){
    entradasPorVender = n;
  }
  
  public int getEntradasPorVender() {
    return entradasPorVender;
  }
  
  /**
   * Vende un número de entradas.
   * <p>
   * Comprueba si quedan entradas libres antes de realizar la venta.
   * 
   * @param n número de entradas a vender
   */
  public void vender(int n) {
    
    if (this.entradasPorVender == 0) {
      System.out.println("Lo siento, las entradas para esa zona están agotadas.");
    } else if (this.entradasPorVender < n) {
      System.out.println("Sólo me quedan " + this.entradasPorVender
                          + " entradas para esa zona.");
    }
    
    if (this.entradasPorVender >= n) {
      entradasPorVender -= n;
      System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
    }
  }
  
  
}
