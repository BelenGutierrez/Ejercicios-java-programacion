 /**
 *
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
 * los segundos que quedan para llegar a medianoche) 
 *
 * @author Belén Gutierrez
 */

public class C4ejercicio11 {  
  public static void main(String[] args) {
    
   
     
    System.out.println("Programa que nos dice los segundos que faltan para medianoche" );
    System.out.print("Por favor, introduzca la hora (formato 24h por ej 17) : ");
    int hora = Integer.parseInt (System.console().readLine());
    
    System.out.print("Por favor, introduzca los segundos :  ");
    int minutos = Integer.parseInt (System.console().readLine());
    
    int segundosRestantes = (86400 - (((hora * 60) * 60 ) + (minutos * 60)));
      
    System.out.println("Restan para medianoche: " + segundosRestantes + "segundos");
    
  }
}
