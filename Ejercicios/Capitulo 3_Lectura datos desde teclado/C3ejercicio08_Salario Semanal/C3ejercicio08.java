/**
* Escribe un programa que calcule el salario semanal de un empleado
* en base a las horas trabajadas, a razón de 12 euros la hora.
*
* @author Belen Gutierrez
*/

public class C3ejercicio08 {
  public static void main(String[] args) {

    String linea;

    System.out.println("Para calcular su salario semanal: ");
    System.out.print("Por favor, introduzca las horas trabajadas en la semana:");
    linea = System.console().readLine();
    int horasTrabajadas = Integer.parseInt( linea ); 
    
      
    System.out.println("Su salario semanal es: "  + (horasTrabajadas * 12) + "euros");
    
  } 
}
