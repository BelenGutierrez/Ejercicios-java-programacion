/*
 * 2. Crea la clase Vehiculo , así como las clases Bicicleta y Coche  como subclases de la primera. Para la clase Vehiculo , crea los
 *    atributos de clase vehiculosCreados y kilometrosTotales , así como el atributo de instancia kilometrosRecorridos . Crea también algún
 *    método específico para cada una de las subclases. Prueba las clases creadas mediante un programa con un menú como el que se
 *    muestra a continuación:
 *
 *    VEHICULOS
 *    =========
 *    1. Anda con la bicicleta
 *    2. Haz el caballito con la bicicleta
 *    3. Anda con el coche
 *    4. Quema rueda con el coche
 *    5. Ver kilometraje de la bicicleta
 *    6. Ver kilometraje del coche
 *    7. Ver kilometraje total
 *    8. Salir
 *    Elige una opción (1-8):
 */
package C9ejercicio02;

/**
 *
 * @author belen
 */
public class Vehiculo {

  // atributos de clase
  private static int vehiculosCreados = 0;
  private static int kilometrosTotales = 0;

  // atributo de instancia
  private int kilometrosRecorridos = 0;

  // Constructor
  public Vehiculo() {
     vehiculosCreados++;
  }
  

  // Metodos de clase
  public static int getVehiculosCreados() {
    return Vehiculo.vehiculosCreados;
  }

  public static int getKilometrosTotales() {
    return Vehiculo.kilometrosTotales;
  }

  // Metodo de instancia
  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }

  public void recorre(int km) {
    this.kilometrosRecorridos += km;
    Vehiculo.kilometrosTotales += km;
    
  

  }

}
