/**
* Escribe un programa que sume, reste, multiplique y divida dos
* números introducidos por teclado.
*
* @author Belen Gutierrez
*/

public class C3ejercicio04 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce un numero entero: ");
    linea = System.console().readLine();
    int primerNumIntr = Integer.parseInt( linea ); 
    
    System.out.print("Por favor, introduce otro numero entero: ");
    linea = System.console().readLine();
    int segundoNumIntr = Integer.parseInt( linea );
    
    int suma = primerNumIntr + segundoNumIntr;
    int resta = primerNumIntr - segundoNumIntr;
    int mul = primerNumIntr * segundoNumIntr;
    double div = ((double)primerNumIntr / (double)segundoNumIntr);   
     
    
    System.out.println("El resultado de la suma es: "  + suma);
    System.out.println("El resultado de la resta es: "  + resta);
    System.out.println("El resultado de la multiplicación es: "  + mul);
    System.out.println("El resultado de la división es: "  + div);
  } 
}
