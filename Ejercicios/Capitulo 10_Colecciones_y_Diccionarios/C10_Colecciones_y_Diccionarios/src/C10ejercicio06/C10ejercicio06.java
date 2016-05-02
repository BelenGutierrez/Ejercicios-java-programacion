/*
 * 6. Implementa el control de acceso al área restringida de un  programa. Se debe pedir un nombre de usuario y una contraseña. Si
 *    el usuario introduce los datos correctamente, el programa dirá "Ha accedido al área restringida". El usuario tendrá un máximo de
 *    3 oportunidades. Si se agotan las oportunidades el programa dirá  "Lo siento, no tiene acceso al área restringida". Los nombres de
 *    usuario con sus correspondientes contraseñas deben estar  almacenados en una estructura de la clase HasMap.
 */
package C10ejercicio06;

/**
 *
 * @author belen
 */
import java.util.HashMap;
import java.util.Scanner;

public class C10ejercicio06 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    HashMap<String, String> permiso = new HashMap<>();

    int intentos = 3;
    boolean correcto = false;

    permiso.put("Ana", "11kl");
    permiso.put("Maria", "25gm");
    permiso.put("Luisa", "97jw");

    System.out.println("Por favor introduzca sus claves de acceso:");

    do {
      System.out.println("\n Usuario:");
      String usuario = (s.nextLine());

      System.out.println("Contraseña:");
      String pass = (s.nextLine());

      if (permiso.containsKey(usuario)) {   //VERIFICO SI LA KEY EXISTE PASANDO EL USUARIO INTRODUCIDO

        if (permiso.get(usuario).equals(pass)) {   // PIDO EL VALOR DE LA KEY Y LA COMPARO CON LA PASS INTRODUCIDA
          System.out.println("\nHola " + usuario + " ! ");
          correcto = true;

        } else {                            // SE VERIFICO QUE LA PASS  NO COINCIDE
          System.out.println("\nContraseña incorrecta");
        }

      } else {                                          //    SE VERIFICO QUE EL USUARIO NO EXISTE
        System.out.println("El usuario introducido no existe\n");
      }

      intentos--;

      if (!correcto && (intentos > 0)) {
        System.out.println("Le quedan " + (intentos) + " intentos");
      }

    } while ((intentos > 0) && (!correcto)); //   CORRECT == FALSE        

   //if (!correcto) {
      System.out.print("Lo siento, no tiene acceso al área restringida");
   // }

  }

}
