/*
 * 5. Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza se necesita saber el tamaño - mediana o familiar - el
 *    tipo - margarita, cuatro quesos o funghi - y su estado - pedida o servida. La clase debe almacenar información sobre el número total
 *    de pizzas que se han pedido y que se han servido. Siempre que se
 *    crea una pizza nueva, su estado es "pedida".
 */
package C9ejercicio05;

/**
 *
 * @author belen
 */
public class Pizza {

  private static int totalPedidas = 0;
  private static int totalServidas = 0;

  private String sabor;
  private String tamano;
  private String estado;

  public Pizza(String sabor, String tamano) {
    this.sabor = sabor;
    this.tamano = tamano;
    this.estado = "pedida";
    Pizza.totalPedidas++;

  }
  
  @Override
  public String toString() {
   return "pizza " + this.sabor + " " + this.tamano + ", " + this.estado;
  }
  public String getEstado() {
    return estado;
  }


  public static int getTotalPedidas() {
    return Pizza.totalPedidas;
  }

  public static int getTotalServidas() {
    return Pizza.totalServidas;
  }

 
 
  public void sirve() {
    if (this.estado.equals("pedida")) {
      this.estado = "servida";
      Pizza.totalServidas++;
    } else {
      System.out.println("esa pizza ya se ha servido");
    }
  }

}
