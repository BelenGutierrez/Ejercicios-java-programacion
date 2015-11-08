/**
* Escribe un programa que calcule el volumen de un cono según la
* fórmula V = (1/3)πr^2h
*
* @author Belen Gutierrez
*/

public class C3ejercicio09 {
  
  static final double pi = 3.141592654;
  
  public static void main(String[] args) {

    String linea;

    System.out.println("Para calcular el volumen de un cono: ");
    System.out.print("Por favor, introduzca la altura (cm):");
    linea = System.console().readLine();
    double altura = Double.parseDouble( linea ); 
    
    System.out.print("Por favor, introduzca el radio (cm):");
    linea = System.console().readLine();
    double radio = Double.parseDouble( linea );
    
    double volumen = (1.3/3.0) * pi * radio * radio * altura;
      
    System.out.println("El volumen del cono es: "  + volumen + "cm3");
    
  } 
}
