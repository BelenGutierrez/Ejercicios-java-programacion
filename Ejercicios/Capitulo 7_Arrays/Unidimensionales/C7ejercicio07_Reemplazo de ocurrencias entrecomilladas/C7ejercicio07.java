/**
 * 
 *    Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por
 *    pantalla separados por espacios. El programa pedirá entonces por teclado dos valores y a
 *    continuación cambiará todas las ocurrencias del primer valor por el segundo en la lista
 *    generada anteriormente. Los números que se han cambiado deben aparecer entrecomillados.
 *    
 *
 * @author Belén Gutierrez
 */
public class C7ejercicio07 {

  public static void main(String[] args) {

      int[] num = new int[100];
      int i;
      int primerValor;
      int segundoValor;
      

      
      for ( i = 0; i < 100; i++) {
        num[i] = (int)(Math.random() * 21);
        System.out.print( num[i] + " "); 
        }
        
      System.out.println("\nIntroduzca 1 número de 0 a 20");
      primerValor = Integer.parseInt(System.console().readLine());
      System.out.println("Ahora introduzca el segundo de 0 a 20");
      segundoValor = Integer.parseInt(System.console().readLine());
      
      for ( i = 0; i < 100; i++) {
        if (num[i] == primerValor) {
          num[i] = segundoValor;
          System.out.print( "\"" + num[i] + "\"  ");
        } else {
        System.out.print(  num[i] + "  ");
       }
     }

      System.out.println();
      
  }
}
