/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C9ejercicio03_ArraysO;

/**
 *
 * @author belen
 */
import java.util.Scanner;

public class PruebaDisco {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String autorIntro;
    String tituloIntro;
    String generoIntro;
    int duracionIntro;
    int IdIntro;

    int eleccion = 0;

    Disco[] gramola = new Disco[4];
    
    for (int i = 0; i < gramola.length; i++) {
      gramola[i] = new Disco();

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
          System.out.print("Este es el listado actualizado \n ");

          for (int i = 0; i < gramola.length; i++) {

            System.out.print( gramola[i]);
                   
            System.out.println("");
          }
          break;
        case 2:
          System.out.print("Nuevo Disco:  \n ");

          int i = 0;
          while (!(gramola[i].getCodigo().equals("LIBRE"))) {
            i++;
          }

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

          System.out.print("\nLos datos del nuevo disco son: \nCódigo: " + Disco.getId()
                  + "\nAutor: " + gramola[i].getAutor()
                  + "\nTítulo: " + gramola[i].getTitulo()
                  + "\nGénero: " + gramola[i].getGenero()
                  + "\nDuración: " + gramola[i].getDuracion());
          System.out.println("");
          System.out.println("");
          gramola[i].setCodigo(Disco.getId() + "");
          Disco.incrementaId();
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

          for (i = 0; i < gramola.length; i++) {

            if ((IdIntro + "").equals(gramola[i].getCodigo())) {

              gramola[i] = new Disco();

            }

          }
          break;
        default:;
      }
    }
  }
}
