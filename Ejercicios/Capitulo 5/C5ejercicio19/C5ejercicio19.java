/**
 * 
 *   Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 *   pedir por teclado. El carácter con el que se pinta la pirámide también se 
 *   debe pedir por teclado.
 *  
 * 
 * @author Belén Gutierrez
 */

public class C5ejercicio19 {

  public static void main(String[] args) {
    
    
    int linea = 1;
    //int alturaIntro;
    int i = 0;
    int espacios = alturaIntro-1;
    
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturaIntro = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = System.console().readLine();

    while (linea <= alturaIntro) {
 
    // inserta espacios
    for (i = 1; i <= espacios; i++) {
      System.out.print(" ");
      }
    
    // pinta la línea
    for (i = 1; i < linea * 2; i++) {
        System.out.print(relleno);
    }
    
    System.out.println();
  
    linea++;
    espacios--;
   }
   
  }
}
