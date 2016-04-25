/*
 * Ejercicio 4
 * Modifica el programa “Colección de discos” como se indica a continuación:
 *
 * a) Mejora la opción “Nuevo disco” de tal forma que cuando se llenen todas las
 * posiciones del array, el programa muestre un mensaje de error. No se permitirá
 * introducir los datos de ningún disco hasta que no se borre alguno de la lista.
 * 
 * b) Mejora la opción “Borrar” de tal forma que se verifique que el código introducido por el usuario existe.
 * 
 * c) Modifica el programa de tal forma que el código del disco sea único, es decir que no se pueda repetir.
 * 
 * d) Crea un submenú dentro dentro de “Listado” de tal forma que exista un listado completo, un listado por autor (todos los discos 
 * que ha publicado un determinado autor), un listado por género (todos los discos de un género determinado)
 * y un listado de discos cuya duración esté en un rango determinado por el usuario.
 */
package C9ejercicio04_ArraysO;

/**
 *
 * @author belen
 */
import java.util.Scanner;

public class PruebaDiscoMejorado {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String autorIntro;
    String tituloIntro;
    String generoIntro;
    int duracionIntro;
    int IdIntro;
    int limiteInferior;
    int limiteSuperior;

    int eleccion = 0;
    int opcionListado = 0;

    DiscoMejorado[] gramola = new DiscoMejorado[4];

    for (int i = 0; i < gramola.length; i++) {
      gramola[i] = new DiscoMejorado();

    }

    while (eleccion != 5) {

      System.out.println("\nEscoja una opción del menú:");
      System.out.println("     1. Listado de Discos existentes\n"
              + "     2. Agregar Nuevo Disco\n"
              + "     3. Modificar datos Disco\n"
              + "     4. Quitar un Disco\n"
              + "     5. Salir\n");

      System.out.println("");

      eleccion = Integer.parseInt(s.nextLine());

      switch (eleccion) {

        case 1:

          do {
            System.out.println("\nLISTADO");
            System.out.println("=======");
            System.out.println("1. Completo");
            System.out.println("2. Por autor");
            System.out.println("3. Por género");
            System.out.println("4. En un rango de duración");
            System.out.println("5. Menú principal");

            System.out.print("Introduzca una opción: ");

            opcionListado = Integer.parseInt(s.nextLine());

            switch (opcionListado) {

              case 1: // Listado completo ////////////////

                for (int i = 0; i < gramola.length; i++) {
                  // if (!gramola[i].getCodigo().equals("LIBRE")) {

                  System.out.println(gramola[i]);

                  // }
                }
                break;

              case 2: // Listado por autor ////////////////

                System.out.print("Introduzca el autor: ");
                autorIntro = (s.nextLine());

                for (int i = 0; i < gramola.length; i++) {
                  if ((!gramola[i].getCodigo().equals("LIBRE")) && (gramola[i].getAutor().equals(autorIntro))) {

                    System.out.println(gramola[i]);

                  }
                }
                break;

              case 3: // Listado por género ////////////////

                System.out.print("Introduzca el género: ");
                generoIntro = (s.nextLine());

                for (int i = 0; i < gramola.length; i++) {
                  if ((!gramola[i].getCodigo().equals("LIBRE")) && (gramola[i].getGenero().equals(generoIntro))) {

                    System.out.println(gramola[i]);

                  }
                }
                break;

              case 4: // Listado en un rango de duración ////////////////

                System.out.println("Establezca el intervalo para la duración");
                System.out.print("Introduzca el límite inferior de duración en minutos: ");
                limiteInferior = Integer.parseInt(s.nextLine());
                System.out.print("Introduzca el límite superior de duración en minutos: ");
                limiteSuperior = Integer.parseInt(s.nextLine());

                /* for (int i = 0; i < gramola.length; i++) {
                  if ((!gramola[i].getCodigo().equals("LIBRE")) && (gramola[i].getDuracion() <= limiteSuperior) 
                          && (gramola[i].getDuracion() >= limiteInferior)) {
                    
                   System.out.println(gramola[i]);
                    
                  }
                }*/
                for (DiscoMejorado dm : gramola) {
                  
                  if ((!dm.getCodigo().equals("LIBRE")) && (dm.getDuracion() <= limiteSuperior)
                          && (dm.getDuracion() >= limiteInferior)) {

                    System.out.println(dm);

                  }
                }

            }
          } while (opcionListado != 5);

          break;

        case 2:

          int i = 0;
          while ((i < gramola.length) && (!(gramola[i].getCodigo().equals("LIBRE")))) {
            i++;
          }

          if (i < gramola.length) {

            System.out.print("Nuevo Disco:  \n ");

            System.out.print("Autor: ");
            autorIntro = (s.nextLine());
            (gramola[i]).setAutor(autorIntro);

            System.out.print("Título: ");
            tituloIntro = (s.nextLine());
            (gramola[i]).setTitulo(tituloIntro);

            System.out.print("Genero: ");
            generoIntro = (s.nextLine());
            (gramola[i]).setGenero(generoIntro);

            System.out.print("Duración: ");
            duracionIntro = Integer.parseInt(s.nextLine());
            (gramola[i]).setDuracion(duracionIntro);

            System.out.print("\nLos datos del nuevo disco son: \nCódigo: " + DiscoMejorado.getId()
                    + "\nAutor: " + gramola[i].getAutor()
                    + "\nTítulo: " + gramola[i].getTitulo()
                    + "\nGénero: " + gramola[i].getGenero()
                    + "\nDuración: " + gramola[i].getDuracion());

            System.out.println("");
            System.out.println("");

            gramola[i].setCodigo(DiscoMejorado.getId() + "");
            DiscoMejorado.incrementaId();

          }

          if (i == gramola.length) {
            System.out.println("La colección está llena. Para introducir un nuevo disco, deberá borrar alguno.");
            System.out.println("");
          }

          break;

        case 3:
          System.out.print("Indique el Id del disco que desea modificar:  \n ");
          System.out.print("Id: ");
          IdIntro = Integer.parseInt(s.nextLine());

          for (i = 0; i < gramola.length; i++) {

            if ((IdIntro + "").equals(gramola[i].getCodigo())) {

              System.out.print("Autor: ");
              autorIntro = (s.nextLine());
              (gramola[i]).setAutor(autorIntro);

              System.out.print("Título: ");
              tituloIntro = (s.nextLine());
              (gramola[i]).setTitulo(tituloIntro);

              System.out.print("Genero: ");
              generoIntro = (s.nextLine());
              (gramola[i]).setGenero(generoIntro);

              System.out.print("Duración: ");
              duracionIntro = Integer.parseInt(s.nextLine());
              (gramola[i]).setDuracion(duracionIntro);

            }

          }
          break;
        case 4:

          System.out.print("Indique el Id del disco que desea borrar:  \n ");
          System.out.print("Id: ");
          IdIntro = Integer.parseInt(s.nextLine());
          String opcion;

          for (i = 0; i < gramola.length; i++) {

            if ((IdIntro + "").equals(gramola[i].getCodigo())) {

              System.out.print("\nLos datos del disco que desea Borrar son: \nCódigo: " + gramola[i].getCodigo()
                      + "\nAutor: " + gramola[i].getAutor()
                      + "\nTítulo: " + gramola[i].getTitulo()
                      + "\nGénero: " + gramola[i].getGenero()
                      + "\nDuración: " + gramola[i].getDuracion());

              System.out.println("");
              System.out.println("");

              System.out.print("\nEstá seguro que desea borrar el disco? :  SI/NO\n");

              opcion = (s.nextLine());
              if (opcion.equals("SI")) {
                gramola[i] = new DiscoMejorado();
              }
            }

          }
          break;
        default:;
      }
    }
  }

}
