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
import java.util.Scanner;

public class PruebaGestisimal {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    String codigoIntro;
    String descripcionIntro;
    double precioCostoIntro;
    double pvpIntro;
    int stockIntro;

    int eleccion = 0;

    Gestisimal[] articulo = new Gestisimal[4];

    for (int i = 0; i < articulo.length; i++) {
      articulo[i] = new Gestisimal();

    }

    while (eleccion != 7) {

      System.out.println("\nEscoja una opción del menú:");
      System.out.println("     1. Listado\n"
              + "     2. Alta\n"
              + "     3. Baja\n"
              + "     4. Modificación\n"
              + "     5. Entrada de Mercancía\n"
              + "     6. Salida de Mercancía\n"
              + "     7. Salir\n");

      System.out.println("");

      eleccion = Integer.parseInt(s.nextLine());

      switch (eleccion) {

        case 1: // LISTADO COMPLETO ////////////////

          for (int i = 0; i < articulo.length; i++) {

            System.out.println(articulo[i]);

          }
          break;

        case 2:  // ALTA NUEVO ARTICULO ///////

          int i = 0;
          while ((i < articulo.length) && (!(articulo[i].getCodigo().equals("LIBRE")))) {
            i++;
          }
          if (i < articulo.length) {

            System.out.print("Nuevo Articulo:  \n ");

            System.out.print("Codigo: ");
            codigoIntro = (s.nextLine());
          

            boolean repetido = false;
            for (Gestisimal a : articulo) {
              if (a.getCodigo().equals(codigoIntro)) {
                repetido = true;
              }

            }

            if (repetido) {
              System.out.println("\nEl código ya existe.");
            } else {
              articulo[i].setCodigo(codigoIntro);

              System.out.print("Descripcion: ");
              descripcionIntro = (s.nextLine());
              articulo[i].setDescripcion(descripcionIntro);

              System.out.print("Precio de Costo: ");
              precioCostoIntro = Double.parseDouble(s.nextLine());
              articulo[i].setPrecioCosto(precioCostoIntro);

              System.out.print("Precio de Venta: ");
              pvpIntro = Double.parseDouble(s.nextLine());
              articulo[i].setPvp(pvpIntro);

              System.out.print("Stock: ");
              stockIntro = Integer.parseInt(s.nextLine());
              articulo[i].setStock(stockIntro);

              System.out.print("\nLos datos del nuevo Artículo son: \nCódigo: " + articulo[i].getCodigo()
                      + "\nDescripción: " + articulo[i].getDescripcion()
                      + "\nPrecio de Costo: " + articulo[i].getDescripcion()
                      + "\nPrecio de Venta: " + articulo[i].getPvp()
                      + "\nStock: " + articulo[i].getStock());

              System.out.println("");
              System.out.println("");

            }
          }
          if (i == articulo.length) {
            System.out.println("La Base de datos está llena.");
            System.out.println("");
          }

          break;

        case 3:  //  BAJA  ARTICULO ///////////

          System.out.print("Indique el Código del articulo que desea borrar:  \n ");
          System.out.print("Código: ");
          codigoIntro = (s.nextLine());
          String opcion;

          for (i = 0; i < articulo.length; i++) {

            if (codigoIntro.equals(articulo[i].getCodigo())) {

              System.out.print("\nEl artículo que desea Borrar es: \nCódigo: " + articulo[i].getCodigo()
                      + "\nDescripción: " + articulo[i].getDescripcion()
                      + "\nPrecio de Costo: " + articulo[i].getPrecioCosto()
                      + "\nPrecio de Venta: " + articulo[i].getPvp()
                      + "\nStock: " + articulo[i].getStock());

              System.out.println("");
              System.out.println("");

              System.out.print("\nEstá seguro que desea borrar el Artículo? :  SI/NO\n");

              opcion = (s.nextLine());
              if (opcion.equals("SI")) {
                articulo[i] = new Gestisimal();
              }
            }

          }

          break;

        case 4:  // MODIFICACION ARTICULO //////////

          System.out.print("Indique el Código del artículo que desea modificar:  \n ");
          System.out.print("Código: ");
          codigoIntro = (s.nextLine());

          for (i = 0; i < articulo.length; i++) {

            if (codigoIntro.equals(articulo[i].getCodigo())) {

              System.out.print("Codigo: ");
              codigoIntro = (s.nextLine());
              articulo[i].setCodigo(codigoIntro);

              System.out.print("Descripcion: ");
              descripcionIntro = (s.nextLine());
              articulo[i].setDescripcion(descripcionIntro);

              System.out.print("Precio de Costo: ");
              precioCostoIntro = Double.parseDouble(s.nextLine());
              articulo[i].setPrecioCosto(precioCostoIntro);

              System.out.print("Precio de Venta: ");
              pvpIntro = Double.parseDouble(s.nextLine());
              articulo[i].setPvp(pvpIntro);

              System.out.print("Stock: ");
              stockIntro = Integer.parseInt(s.nextLine());
              articulo[i].setStock(stockIntro);

            }
          }

          break;

        case 5:  // ENTRADA DE MERCANCIA /////////

          System.out.print("Entrada de Mercancía:  \n ");

          System.out.print("Codigo: ");
          codigoIntro = (s.nextLine());

          for (i = 0; i < articulo.length; i++) {

            if ((!articulo[i].getCodigo().equals("LIBRE")) && (articulo[i].getCodigo().equals(codigoIntro))) {

              System.out.print("Cantidad: ");
              stockIntro = Integer.parseInt(s.nextLine());
              articulo[i].setStock(stockIntro);

              System.out.println("Añadido al stock con éxito");

            }
            if (i == articulo.length) {

              System.out.println("El artículo no existe, por favor, ir al menú principal y escoger: \"Alta\" ");
            }

          }

          break;

        case 6:  // SALIDA DE MERCANCIA ///////////

          System.out.print("Salida de Mercancía:  \n ");

          System.out.print("Codigo: ");
          codigoIntro = (s.nextLine());

          for (i = 0; i < articulo.length; i++) {

            if ((!articulo[i].getCodigo().equals("LIBRE")) && (articulo[i].getCodigo().equals(codigoIntro))) {

              System.out.print("Cantidad que sale: ");
              stockIntro = Integer.parseInt(s.nextLine());

              if (articulo[i].getStock() >= stockIntro) {

                articulo[i].setStock(stockIntro * -1);

              } else {
                System.out.println("No pueden salir éstas unidades ya que el stock es inferior");
              }

              if (i == articulo.length) {

                System.out.println("El artículo no existe, por favor, ir al menú principal y escoger: \"Alta\" ");
              }

            }
          }

          break;
        default:
      }
    }

  }
}
