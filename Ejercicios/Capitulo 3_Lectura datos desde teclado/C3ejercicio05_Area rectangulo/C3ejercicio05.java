/**
* Escribe un programa que calcule el área de un rectángulo.
*
* @author Belen Gutierrez
*/

public class C3ejercicio05 {
  public static void main(String[] args) {

    String linea;

    System.out.println("Para calcular el area de un rectangulo: ");
    System.out.print("Por favor, introduzca la medida de la base en cm : ");
    linea = System.console().readLine();
    double base = Double.parseDouble( linea ); 
    
    System.out.println("Por favor, introduzca la medida de la altura en cm : ");
    linea = System.console().readLine();
    double altura = Double.parseDouble( linea );   
    double area = base * altura;
  
    System.out.println("El area de un rectangulo es: "  + area +  "cm2");
    
  } 
}
