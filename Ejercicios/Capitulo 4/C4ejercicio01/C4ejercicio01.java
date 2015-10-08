/**
 * Sentencia if
 *
 * Escribe un programa que pide por teclado un dia de la semana y que diga
 * qué asignatura toca a primera hora ese día. 
 *
 * @author Belén Gutierrez
 */

public class C4ejercicio01 {
  public static void main(String[] args) {   
    System.out.print("Por favor escriba un dia de la semana ");
    String dia = (System.console().readLine());
    dia.toLowerCase();
    
    
    if (dia.equals("lunes")) {
      System.out.println("La primera asignatura ese día es Fol");
    } 
    if (dia.equals("martes")) {
      System.out.println("La primera asignatura ese día es Programación");
    } 
    if (dia.equals("miercoles")) {
      System.out.println("La primera asignatura ese día es Sistemas Informáticos");
    } 
    if (dia.equals("jueves")) {
      System.out.println("La primera asignatura ese día es Programación");
    } 
    if (dia.equals("viernes")) {
      System.out.println("La primera asignatura ese día es Base de Datos");
    } 
    if (dia.equals("sabado")) {
      System.out.println("Lo siento ese día no hay clases");
    } 
     if (dia.equals("domingo")) {
      System.out.println("Lo siento ese día no hay clases");    
    }
  }
}

