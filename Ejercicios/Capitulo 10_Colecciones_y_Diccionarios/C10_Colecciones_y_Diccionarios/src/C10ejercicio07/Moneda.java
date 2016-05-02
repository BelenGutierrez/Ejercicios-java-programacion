/*
 * 7. La máquina Eurocoin genera una moneda de curso legal cada vez que
 *    se pulsa un botón siguiendo la siguiente pauta: o bien coincide el
 *    valor con la moneda anteriormente generada - 1 céntimo, 2 céntimos,
 *    5 céntimos, 10 céntimos, 25 céntimos, 50 céntimos, 1 euro o 2 euros -
 *    o bien coincide la posición – cara o cruz. Simula, mediante un
 *    programa, la generación de 6 monedas aleatorias siguiendo la pauta
 *    correcta. Cada moneda generada debe ser una instancia de la clase
 *    Moneda y la secuencia se debe ir almacenando en una lista.
 *    Ejemplo:
 *    2 céntimos – cara
 *    2 céntimos – cruz
 *    50 céntimos – cruz
 *    1 euro – cruz
 *    1 euro – cara
 *    10 céntimos – cara
 */
package C10ejercicio07;

/**
 *
 * @author belen
 */
public class Moneda {
  
  private static String[] lado= {"cara", "cruz"};
  private static String[] cantidades = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "25 céntimos", "50 céntimos", "1 euro", "2 euros"};
  private String cantidad;
  private String posicion;
  
  public Moneda() {
    cantidad = cantidades[(int)(Math.random()*8)];
    posicion = lado[(int)(Math.random()*2)];
   
  }

  public String getCantidad() {
    return cantidad;
  }

  public void setCantidad(String cantidad) {
    this.cantidad = cantidad;
  }

  public String getPosicion() {
    return posicion;
  }

  public void setPosicion(String posicion) {
    this.posicion = posicion;
  }

  @Override
  public String toString() {
    return   cantidad + " "+ posicion ;
  }

 
  
  
}
