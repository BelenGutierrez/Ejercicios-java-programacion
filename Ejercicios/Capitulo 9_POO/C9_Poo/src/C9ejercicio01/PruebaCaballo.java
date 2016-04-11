/*
 *  Ejercicio 1
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 */
package C9ejercicio01;

/**
 *
 * @author belen
 */
public class PruebaCaballo {

  public static void main(String[] args) {

    Caballo a = new Caballo("Rocinante", "Arabigo", "Hembra", 2);
    Caballo b = new Caballo("Pegaso", "Indiano del Sur", "Macho", 6);
    Caballo estrella = new Caballo("estrella", "Asiatico", "Hembra", 4);

    System.out.println("Hola caballito");
    a.relincha();

    System.out.println("Cual es tu nombre?");
    System.out.println(a.getNombre());

    System.out.println("Cual es tu raza?");
    System.out.println(a.getRaza());

    System.out.println("Y tu sexo?");
    System.out.println(a.getSexo());

    System.out.println("Te importa decirme la edad?");
    System.out.println(a.getEdad() + " años");

    System.out.println("");

    System.out.println("Hola a ti también!!");
    a.relincha();

    System.out.println("Cual es tu nombre?");
    System.out.println(b.getNombre());

    System.out.println("Cual es tu raza?");
    System.out.println(b.getRaza());

    System.out.println("Y tu sexo?");
    System.out.println(b.getSexo());

    System.out.println("Te importa decirme la edad?");
    System.out.println(b.getEdad() + " años");

    System.out.println("");

    System.out.println("Ey y tu de dónde haz salido?");
    a.relincha();

    System.out.println("Cual es tu nombre?");
    System.out.println(estrella.getNombre());

    System.out.println("Cual es tu raza?");
    System.out.println(estrella.getRaza());

    System.out.println("Y tu sexo?");
    System.out.println(estrella.getSexo());

    System.out.println("Te importa decirme la edad?");
    System.out.println(estrella.getEdad() + " años");

  }

}
