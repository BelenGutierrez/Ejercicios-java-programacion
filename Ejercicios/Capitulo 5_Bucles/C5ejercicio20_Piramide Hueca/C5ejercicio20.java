/**
 * 
 *  Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 * 
 * @author Belén Gutierrez
 */

public class C5ejercicio20 {

  public static void main(String[] args) {
    
    
    int linea = 1;
    int alturaIntroducida;
    int i = 0;
    int espaciosPorDelante = alturaIntroducida - 1;
    int espaciosInternos = 0;
    
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    alturaIntroducida = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = System.console().readLine();
    
    while (linea < alturaIntroducida) {
      
      // inserta espacios delante
      for (i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }
      
      // pinta la línea
      System.out.print(relleno);
      for (i = 1; i < espaciosInternos; i++) {
        System.out.print(" ");
      }
      
      if (linea > 1) {
        System.out.print(relleno);
      }
      
      System.out.println();
      linea++;
      espaciosPorDelante--;
      espaciosInternos += 2;
    }
    
    // base de la pirámide
    for (i = 1; i < linea*2; i++) {
      System.out.print(relleno);

   }
   
  }
}
