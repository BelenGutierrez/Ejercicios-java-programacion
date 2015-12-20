/**
 * 
 *    Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado
 *    año y que muestre a continuación un diagrama de barras horizontales con esos datos. Las barras
 *    del diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter.
 *    
 *
 * @author Belén Gutierrez
 */
public class C7ejercicio08 {

  public static void main(String[] args) {

      int[] temp = new int[12];
      String[] mes = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
         "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
      int i;
      int j;
      

      System.out.println("\nIntroduzca la temperatura media de cada mes: ");
      for ( i = 0; i < 12; i++) {
        System.out.println( mes[i] + ": ");
       temp[i] = Integer.parseInt(System.console().readLine()); 
        }
        
       System.out.println("\nGráfica con las Temperaturas medias de cada mes: "); 
      for ( i = 0; i < 12; i++) {
        System.out.printf( "%10s %2dº |" , mes[i] , temp[i] );
          for ( j = 1; j <= temp[i]; j++) {
            System.out.print( "@" );
          }
        System.out.println();
       }
     
  }
}
