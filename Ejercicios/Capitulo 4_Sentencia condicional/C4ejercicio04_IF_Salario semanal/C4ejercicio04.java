/**
 *
 * Vamos a ampliar uno de los ejercicios de la relación anterior para 
 * considerar las extras. Escribe un programa que calcule el salario
 * semanal de un trabajador teniendo en cuenta que las horas
 * ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la
 * hora. A partir de la hora 41, se pagan a 16 euros la hora.
 *
 * @author Belén Gutierrez
 */

public class C4ejercicio04 {
  public static void main(String[] args) {
    
       
    System.out.println("Este programa calcula el salario semanal" );
    System.out.print("Por favor, introduzca las horas ordinarias trabajadas: ");
    int horasTrabajadas = Integer.parseInt (System.console().readLine());
    
    System.out.print("Por favor, ahora introduzca las horas extras:  ");
    int horasExtras = Integer.parseInt (System.console().readLine());
    
    int sueldoSemanal;

      
    if (horasTrabajadas <= 40) {
      sueldoSemanal = 12 * horasTrabajadas;
    } else {
      sueldoSemanal = (40 * 12) + (horasExtras * 16);    
    }
    System.out.println("El sueldo semanal es : " + sueldoSemanal + " euros");
     
  }
}
