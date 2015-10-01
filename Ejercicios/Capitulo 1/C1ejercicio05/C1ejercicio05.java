/**
 * Muestra por pantalla Horario de clases en colores
 *
 * @author Belén Gutierrez
 */


public class C1ejercicio05{ // Clase principal
  public static void main(String[] args) {
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    System.out.println(morado + "            \t LUNES MARTES MIERCOLES JUEVES VIERNES");
    System.out.println(rojo + "08:15-09:15 \t FOL \t PROG \t SIN \t PROG \t BBDD");
    System.out.println(verde + "09:15-10:15 \t FOL \t PROG \t SIN \t PROG \t BBDD");
    System.out.println(azul + "10:15-11:15 \t FOL \t PROG \t SIN \t PROG \t BBDD");
    System.out.println(blanco + "11:15-11:45 \t R     E     C      R      E     O");
    System.out.println(morado + "11:45-12:40 \t PROG\t BBDD \t SIN \t ED   \t PROG");
    System.out.println(naranja + "12:40-13:35 \t ED  \t BBDD \t LM  \t LM   \t SIN");
    System.out.println(verde + "13:35-14:30 \t ED  \t BBDD \t LM  \t LM   \t SIN");   
  }
}

