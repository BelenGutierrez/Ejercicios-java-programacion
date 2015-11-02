/**
 * 
 *   Escribe un programa que obtenga los números enteros comprendidos entre dos 
 *   números introducidos por teclado y validados como distintos, el programa 
 *   debe empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.
 *  
 * 
 * @author Belén Gutierrez
 */

public class C5ejercicio18 {

  public static void main(String[] args) {
    
    
    int primerNum;
    int segundoNum;
    int aux;
    
    
    
    System.out.println("\nEste programa a partir de 2 números introducidos,");
    System.out.println("mostrará los números comprendidos de 7 en 7");
    System.out.println("\nPor favor introduzca el primer número: ");
    primerNum = Integer.parseInt(System.console().readLine());
    System.out.println("\nAhora introduzca el segundo y distinto del anterior: ");
    segundoNum = Integer.parseInt(System.console().readLine());
    
    if (primerNum == segundoNum) {
      System.out.println("\nLos números deben ser diferentes");
      System.out.println("\nIntente otra vez");
      primerNum = Integer.parseInt(System.console().readLine());
      System.out.println("\nAhora introduzca el segundo: ");
      segundoNum = Integer.parseInt(System.console().readLine());
    }
    if (primerNum > segundoNum) {
    aux = segundoNum;
    segundoNum = primerNum;
    primerNum = aux;
    }
    for(int i = primerNum; i <= segundoNum; i += 7) {
      System.out.print(i + " ");
    }
    
    System.out.println();
  }
}
