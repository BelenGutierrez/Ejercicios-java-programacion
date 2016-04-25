/*
 * Ejercicio 5
 * Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar el control de los artículos de un almacén. De cada artículo se debe saber
 * el código, la descripción, el precio de compra, el precio de venta y el stock (número de unidades). El menú del programa debe tener, al menos, las
 * siguientes opciones:
 *
 * 1. Listado
 * 2. Alta
 * 3. Baja
 * 4. Modificación
 * 5. Entrada de mercancía
 * 6. Salida de mercancía
 * 7. Salir

 * La entrada y salida de mercancía supone respectivamente el incremento y decremento de stock de un determinado artículo. Hay que controlar que no se
 * pueda sacar más mercancía de la que hay en el almacén.
 */
package C9ejercicio05_ArraysO;

/**
 *
 * @author belen
 */
public class Gestisimal {
  
  private String codigo = "LIBRE";
  private String descripcion;
  private double precioCosto;
  private double pvp;
  private int stock = 0;
 
  

  public static int id = 1;

  public Gestisimal() {

  }
  
   public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecioCosto() {
    return precioCosto;
  }

  public void setPrecioCosto(double precioCosto) {
    this.precioCosto = precioCosto;
  }

  public double getPvp() {
    return pvp;
  }

  public void setPvp(double pvp) {
    this.pvp = pvp;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = this.stock + stock;
  }

 
  
  
  public static int getId() {
    return id;

  }

  public static void incrementaId() {
    Gestisimal.id++;
  }

  @Override
  public String toString() {
    String cadena = "\nCódigo: " + this.codigo;
    cadena += "\nDescripción: " + this.descripcion;
    cadena += "\nPrecio de Costo: " + this.precioCosto;
    cadena += "\nPrecio de Venta: " + this.pvp;
    cadena += "\nStock: " + this.stock; 
    cadena += "\n------------------------------------------";
    return cadena;

  }
  
  
  
  
  
}
