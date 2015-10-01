/**
* Muestra resultado de suma, resta, multiplicacion y division de 2 números enteros
*
* @author Belen Gutierrez
*/

public class C3ejercicio04 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce un numero entero: ");
    linea = System.console().readLine();
    int primerNumIntr = Interger.parseInt ( linea ); 
    
    System.out.print("Por favor, introduce otro numero entero: ");
    linea = System.console().readLine();
    int segundoNumIntr = Interger.parseInt ( linea );
    
    int suma = primerNumIntr + segundoNumIntr
    int resta = primerNumIntr - segundoNumIntr
    int mul = primerNumIntr * segundoNumIntr
    int div = primerNumIntr / segundoNumIntr    
     
    
    System.out.println("El resultado de la suma es: "  + suma);
    System.out.println("El resultado de la resta es: "  + resta);
    System.out.println("El resultado de la multiplicación es: "  + multiplicacion);
    System.out.println("El resultado de la división es: "  + div);
  } 
}
