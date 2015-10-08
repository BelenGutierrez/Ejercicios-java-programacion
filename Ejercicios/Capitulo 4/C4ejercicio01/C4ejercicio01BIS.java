/**
 * Sentencia switch
 *
 * Escribe un programa que pide por teclado un dia de la semana y que diga
 * qué asignatura toca a primera hora ese día. 
 *
 * @author Belén Gutierrez
 */

public class C4ejercicio01BIS {
  public static void main(String[] args) {   
    System.out.print("Por favor escriba un dia de la semana ");
    String dia = (System.console().readLine());
    dia.toLowerCase();
    
    
    switch (dia) {
      case "lunes" :
        System.out.println("La primera asignatura ese día es Fol");
        break;
     
      case "martes" :
        System.out.println("La primera asignatura ese día es Programación");
        break;
        
      case "miercoles" :
        System.out.println("La primera asignatura ese día es Sistemas Informáticos");
        break;
        
      case "jueves" :
        System.out.println("La primera asignatura ese día es Programación");
        break;
        
      case "viernes" :
        System.out.println("La primera asignatura ese día es Base de Datos");
        break;
        
      case "sabado" :
        System.out.println("Lo siento ese día no hay clases");
        break;
        
      case "domingo" :
      System.out.println("Lo siento ese día no hay clases");    
    }
  }
}
