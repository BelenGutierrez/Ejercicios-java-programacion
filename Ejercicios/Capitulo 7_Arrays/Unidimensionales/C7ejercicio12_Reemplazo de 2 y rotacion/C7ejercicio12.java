/**
 * 
 *     Realiza un programa que pida 10 números por teclado y que los almacene en un array.
 *     A continuación se mostrará el contenido de ese array junto al índice (0 – 9).
 *     Seguidamente el programa pedirá dos posiciones a las que llamaremos "inicial" y
 *     "final". Se debe comprobar que inicial es menor que final y que ambos números están
 *     entre 0 y 9. El programa deberá colocar el número de la posición inicial en la posición
 *     final, rotando el resto de números para que no se pierda ninguno. Al final se debe mostrar
 *     el array resultante.
 *    
 *
 * @author Belén Gutierrez
 */
public class C7ejercicio12 {

  public static void main(String[] args) {

      int[] num = new int[10];
      int[] resultado = new int[10];
      int inicial;
      int fin;
      int i;
     
      
      
      System.out.println("\nIntroduzca 10 números: ");
      for ( i = 0; i < 10; i++) {
        num[i] = Integer.parseInt(System.console().readLine());
       } 
       System.out.println("El array original es: \n");
      for ( i = 0; i < 10; i++) {
      System.out.printf("|%3d" , i);
      }
      System.out.print("|");
      System.out.println();
      for ( i = 0; i < 40; i++) {
      System.out.print("-" );
      }
      System.out.println();
      for ( i = 0; i < 10; i++) {
      System.out.printf("|%3d" , num[i]);
      }
      System.out.print("|");
       

       
      System.out.println("\nIntroduzca la posición inicial, un número de 0 a 9 : ");  
      inicial = Integer.parseInt(System.console().readLine()); 
      System.out.println("\nIntroduzca la posición final, un número de 0 a 9 : ");  
      fin = Integer.parseInt(System.console().readLine());  
        
      if ( (inicial < 0) || (inicial > 9)) { 
        System.out.println("\nVerifique la posición inicial, un número de 0 a 9 : ");  
        inicial = Integer.parseInt(System.console().readLine());
      }
      if ( (fin < 0) || (fin > 9)) { 
        System.out.println("\nVerifique la posición final, un número de 0 a 9 : ");  
        fin = Integer.parseInt(System.console().readLine());
      }
      if ( inicial >= fin) {
       System.out.println("\nVerifique la posición inicial debe ser menor que la final: ");  
        inicial = Integer.parseInt(System.console().readLine());
      }

//////////////////////////////////////////////////////////      
      System.out.println("El array original es: \n");
      for ( i = 0; i < 10; i++) {
      System.out.printf("|%3d" , i);
      }
      System.out.print("|");
      System.out.println();
      for ( i = 0; i < 40; i++) {
      System.out.print("-" );
      }
      System.out.println();
      for ( i = 0; i < 10; i++) {
      System.out.printf("|%3d" , num[i]);
      }
      System.out.print("|");

///////////////////////////////////////////////////////
     for (i = 0; i < 10; i++) {
      resultado[i] = num[i];
    }
    
    resultado[fin] = num[inicial];
    
    for (i = fin + 1; i < 10; i++) {
      resultado[i] = num[i - 1];
    }
    resultado[0] = num[9];
    
    for (i = 0; i < inicial; i++) {
      resultado[i + 1] = num[i];
    }
////////////////////////////////////////////////////////      
      System.out.println();
      
      System.out.println("\nEl array resultante es: \n");
      for ( i = 0; i < 10; i++) {
      System.out.printf("|%3d" , i);
      }
      System.out.print("|");
      System.out.println();
      for ( i = 0; i < 40; i++) {
      System.out.print("-" );
      }
      System.out.println();
      for ( i = 0; i < 10; i++) {
      System.out.printf("|%3d" , resultado[i]);
      }
      System.out.print("|");
  }
}
