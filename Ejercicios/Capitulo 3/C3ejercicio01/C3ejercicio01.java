/**
* Pide dos numeros y luegomuestra por pantalla el resultado de la multiplicacion
*
* @author Belen Gutierrez
*/

public class C3ejercicio01 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    int primerNumero = Integer.parseInt( linea );

    System.out.print("introduce otro, por favor: ");
    linea = System.console().readLine();
    int segundoNumero = Integer.parseInt( linea );

    int total =  primerNumero * segundoNumero;

    System.out.print("El primer número introducido es " + primerNumero);
    System.out.println(" y el segundo es " + segundoNumero);
    System.out.print("El resultado de la multiplicacion es ");
    System.out.print(total);   
  } 
}
