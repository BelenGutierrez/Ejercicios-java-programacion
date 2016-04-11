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
import java.util.Scanner;

public class PruebaVehiculo {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int eleccion = 0;
    int km;

    Coche toyota = new Coche(2000);
    Bicicleta pinarello = new Bicicleta(96);

    while (eleccion != 9) {

      System.out.println("Escoja una opción del menú:");
      System.out.println("     1. Anda con la bicicleta\n"
              + "     2. Anda sin manos con la bicicleta\n"
              + "     3. Anda con el coche\n"
              + "     4. Aparca con el coche\n"
              + "     5. Ver kilometraje de la bicicleta\n"
              + "     6. Ver kilometraje del coche\n"
              + "     7. Ver kilometraje total\n"
              + "     8. Ver total Vehículos creados\n"
              + "     9. Salir\n");

      System.out.println("");

      eleccion = Integer.parseInt(s.nextLine());

      switch (eleccion) {
        case 1:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          km = Integer.parseInt(s.nextLine());
          pinarello.recorre(km);
          break;
        case 2:
          pinarello.sinManos();
          break;
        case 3:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          km = Integer.parseInt(s.nextLine());
          toyota.recorre(km);
          break;
        case 4:
          toyota.aparca();
          break;
        case 5:
          System.out.println("La bicicleta lleva recorridos ");
          System.out.println(pinarello.getKilometrosRecorridos() + " Km");
          break;
        case 6:
          System.out.println("El coche lleva recorridos ");
          System.out.println(toyota.getKilometrosRecorridos() + " Km");
          break;
        case 7:
          System.out.println("Los vehículos llevan recorridos ");
          System.out.println(Vehiculo.getKilometrosTotales() + " Km");
          break;
          case 8:
          System.out.println("Los vehículos creados son: ");
          System.out.println(Vehiculo.getVehiculosCreados());
        default:
      }
      System.out.println("");
    }
  }

}
