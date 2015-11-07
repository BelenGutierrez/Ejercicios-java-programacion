/**
 *  Igual que el ejercicio anterior pero con la baraja española. Se utilizará la
 *  baraja de 48 cartas: 2, 3, 4, 5, 6, 7, 8, 9, sota, caballo, rey y as.
 * 
 * @author Belén Gutierrez
 */
public class C6ejercicio03 {
  public static void main(String[] args) {
    
    String figura = "";
    String palo = "";
    
    System.out.print("Este programa muestra una carta (Baraja Española) y su palo\n ");

    int clasePalo = (int)(Math.random() * 4) + 1;
    switch(clasePalo) {
      case 1:
        palo = "Basto";
        break;
      case 2:
        palo = "Copa";
        break;  
      case 3:
        palo = "Oro";
        break;  
      case 4:
        palo = "Espada";
      default:
    } 
        
         
    int figuraNum = (int)(Math.random() * 13) + 1; 
    switch(figuraNum) {
      case 1:
        figura = "As";
        break;
      case 2:
      case 3:  
      case 4:    
      case 5:  
      case 6:  
      case 7:  
      case 8:  
      case 9:  
      case 10:  
        figura = String.valueOf(figuraNum);
        break;
      case 11:
        figura = "Sota";
        break;  
      case 12:
        figura = "Caballo";
        break;  
      case 13:
        figura = "Rey";
      default:  
    } 

      System.out.print(figuraNum  + " de " + palo);
  }
}
