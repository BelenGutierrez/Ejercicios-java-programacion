 /**
 *
 * Realiza un minicuestionario con 10 preguntas tipo test, sobre las asignaturas
 * que se imparten en el curso, Cada pregunta acertada sumará un punto.
 * El programa mostrará al final la calificación obtenida.
 *
 * @author Belén Gutierrez
 */

public class C4ejercicio12 { 
  
  public static void main(String[] args) {
    
    String opcion;
    int puntaje = 0;   
      
    System.out.println("Por favor responda al cuestionario de 1º DAW\n" );
    System.out.println("1- ¿Qué significa FOL?: ");
    System.out.println("     a)- Fuerza, Orígen y Libertad ");
    System.out.println("     b)- Formación On Line ");
    System.out.println("     c)- Formación y Orientación Laboral ");
    System.out.print("=>");
    opcion = (System.console().readLine());
    if (opcion.equals("c")) {
      puntaje++;
    }
    
    System.out.println("2- ¿Qué significa HTML?: ");
    System.out.println("     a)- Hotmail ");
    System.out.println("     b)- Hiper Tex Markup Language ");
    System.out.println("     c)- Protocolo de transferencia ");
    System.out.print("=>");
    opcion = (System.console().readLine());
    if (opcion.equals("b")) {
      puntaje++;
    }
    
    System.out.println("3- ¿Donde está la memoria Caché?: ");
    System.out.println("     a)- En la memoria RAM ");
    System.out.println("     b)- En el procesador ");
    System.out.println("     c)- En la placa base ");
    System.out.print("=>");
    opcion = (System.console().readLine());
    if (opcion.equals("b")) {
      puntaje++;
    }
    
    System.out.println("4- ¿Cuando se rrecomienda usar Swicth?: ");
    System.out.println("     a)- Cuando son mas de 3 IF ");
    System.out.println("     b)- Cuando son programas largos ");
    System.out.println("     c)- Siempre ");
    System.out.print("=>");
    opcion = (System.console().readLine());
    if (opcion.equals("a")) {
      puntaje++;
    }
    
    System.out.println("5- ¿Cuando debemos usar Equals?: ");
    System.out.println("     a)- Con cualquier tipo de datos ");
    System.out.println("     b)- Solo para cadena de caracteres ");
    System.out.println("     c)- Solo para comparar enteros ");
    System.out.print("=>");
    opcion = (System.console().readLine());
    if (opcion.equals("b")) {
      puntaje++;
    }
    
    System.out.println("6- ¿Qué significa IDE?: ");
    System.out.println("     a)- Imagen digital ensamblada ");
    System.out.println("     b)- Entorno de Desarrollo Integrado ");
    System.out.println("     c)- Indice de Desarrollo ");
    System.out.print("=>");
    opcion = (System.console().readLine());
    if (opcion.equals("b")) {
      puntaje++;
    }
    
    System.out.println("7- ¿Cual es la Metodología usada en la Admin Pública?: ");
    System.out.println("     a)- Scrum ");
    System.out.println("     b)- General ");
    System.out.println("     c)- Metrica V3 ");
    System.out.print("=>");
    opcion = (System.console().readLine());
    if (opcion.equals("c")) {
      puntaje++;
    }
    
    System.out.println("8- ¿Java es un lenguaje?: ");
    System.out.println("     a)- Interpretado ");
    System.out.println("     b)- Compilado ");
    System.out.println("     c)- Ambas son correctas ");
    System.out.print("=>");
    opcion = (System.console().readLine());
    if (opcion.equals("b")) {
      puntaje++;
    }
    
    System.out.println("9- ¿Qué significa Camel Case?: ");
    System.out.println("     a)- Mayúscula la primera letra de cada palabra ");
    System.out.println("     b)- Minúscula la primera letra de cada palabra ");
    System.out.println("     c)- Mayúscula solo la primera letra de la segunda ");
    System.out.print("=>");
    opcion = (System.console().readLine());
    if (opcion.equals("a")) {
      puntaje++;
    }
    
    System.out.println("10- ¿Como se llama la profesora de Inglés?: ");
    System.out.println("     a)- Larry ");
    System.out.println("     b)- laura ");
    System.out.println("     c)- Lauren ");
    System.out.print("=>");
    opcion = (System.console().readLine());
    if (opcion.equals("c")) {
      puntaje++;
    }
    System.out.println("El  puntaje obtenido es: " + puntaje );
  }
}
