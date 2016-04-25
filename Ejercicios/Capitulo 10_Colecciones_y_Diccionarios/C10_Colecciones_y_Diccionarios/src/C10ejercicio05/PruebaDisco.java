/*
 * Ejercicio 5
Realiza de nuevo el ejercicio de la colección de discos pero utilizando esta vez
una lista para almacenar la información sobre los discos en lugar de un array
convencional. Comprobarás que el código se simplifica notablemente ¿Cuánto
ocupa el programa original hecho con un array? ¿Cuánto ocupa este nuevo
programa hecho con una lista?
 */
package C10ejercicio05;

/**
 *
 * @author belen
 */
import java.util.ArrayList;
import java.util.Scanner;

public class PruebaDisco {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    String codigoIntro;
    String autorIntro;
    String tituloIntro;
    String generoIntro;
    int duracionIntro;

    int limiteInferior;
    int limiteSuperior;

    int eleccion = 0;
    int opcionListado = 0;

    ArrayList<Disco> gramola = new ArrayList<>();

    gramola.add(new Disco());
    gramola.add(new Disco());


    /*for (int i = 0; i < gramola.length; i++) {
      gramola[i] = new Disco();

    }*/
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

                for (Disco lc : gramola) {

                  System.out.println(lc);

                }
                break;

              case 2: // Listado por autor ////////////////

                System.out.print("Introduzca el autor: ");
                autorIntro = (s.nextLine());

                for (Disco aut : gramola) {
                  if ((!aut.getCodigo().equals("LIBRE")) && (aut.getAutor().equals(autorIntro))) {

                    System.out.println(aut);

                  }
                }
                break;

              case 3: // Listado por género ////////////////

                System.out.print("Introduzca el género: ");
                generoIntro = (s.nextLine());

                for (Disco gen : gramola) {
                  if ((!gen.getCodigo().equals("LIBRE")) && (gen.getGenero().equals(generoIntro))) {

                    System.out.println(gen);

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
                for (Disco dm : gramola) {

                  if ((!dm.getCodigo().equals("LIBRE")) && (dm.getDuracion() <= limiteSuperior)
                          && (dm.getDuracion() >= limiteInferior)) {

                    System.out.println(dm);

                  }
                }

            }
          } while (opcionListado != 5);

          break;

        case 2:

          System.out.print("Nuevo Disco:  \nIntroduzca el código:");
          codigoIntro = (s.nextLine());

          while (gramola.contains(new Disco(codigoIntro, "", "", "", 0))) {

            System.out.println("Ese código ya existe en la colección.");
            System.out.print("Introduzca otro código: ");
            codigoIntro = s.nextLine();
          }

          System.out.print("Autor: ");
          autorIntro = (s.nextLine());

          System.out.print("Título: ");
          tituloIntro = (s.nextLine());

          System.out.print("Genero: ");
          generoIntro = (s.nextLine());

          System.out.print("Duración: ");
          duracionIntro = Integer.parseInt(s.nextLine());

          System.out.print("\nLos datos del nuevo disco son: \nCódigo: " + codigoIntro
                  + "\nAutor: " + autorIntro
                  + "\nTítulo: " + tituloIntro
                  + "\nGénero: " + generoIntro
                  + "\nDuración: " + duracionIntro);

          System.out.println("");
          System.out.println("");

          gramola.add(new Disco(codigoIntro, autorIntro, tituloIntro, generoIntro, duracionIntro));

          break;

        case 3:
          System.out.print("Indique el Id del disco que desea modificar:  \n ");
          System.out.print("Código: ");
          codigoIntro = (s.nextLine());

          for (Disco d : gramola) {

            if (d.getCodigo().equals(codigoIntro)) {

              int indice = gramola.indexOf(d);

              System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

              System.out.println("Código: " + gramola.get(indice).getCodigo());
              System.out.print("Nuevo código: ");
              codigoIntro = s.nextLine();
              gramola.get(indice).setCodigo(codigoIntro);

              System.out.println("Autor: " + gramola.get(indice).getAutor());
              System.out.print("Nuevo autor: ");
              autorIntro = s.nextLine();
              gramola.get(indice).setAutor(autorIntro);

              System.out.println("Título: " + gramola.get(indice).getTitulo());
              System.out.print("Nuevo título: ");
              tituloIntro = s.nextLine();
              gramola.get(indice).setTitulo(tituloIntro);

              System.out.println("Género: " + gramola.get(indice).getGenero());
              System.out.print("Nuevo género: ");
              generoIntro = s.nextLine();
              gramola.get(indice).setGenero(generoIntro);

              System.out.println("Duración: " + gramola.get(indice).getDuracion());
              System.out.print("Nueva duración: ");
              duracionIntro = Integer.parseInt(s.nextLine());
              gramola.get(indice).setDuracion(duracionIntro);

            }

          }

          break;

        case 4:

          System.out.print("Indique el Id del disco que desea borrar:  \n ");
          System.out.print("Código: ");
          codigoIntro = (s.nextLine());
          String opcion;

          for (Disco d : gramola) {

            if (codigoIntro.equals(d.getCodigo())) {

              int indice = gramola.indexOf(d);

              System.out.print("\nLos datos del disco que desea Borrar son: \nCódigo: " + d.getCodigo()
                      + "\nAutor: " + d.getAutor()
                      + "\nTítulo: " + d.getTitulo()
                      + "\nGénero: " + d.getGenero()
                      + "\nDuración: " + d.getDuracion());

              System.out.println("");
              System.out.println("");

              System.out.print("\nEstá seguro que desea borrar el disco? :  SI/NO\n");

              opcion = (s.nextLine());
              if (opcion.equals("SI")) {
                gramola.remove(indice);
              }
            }

          }
          break;
        default:;

      }
    }
  }
}
