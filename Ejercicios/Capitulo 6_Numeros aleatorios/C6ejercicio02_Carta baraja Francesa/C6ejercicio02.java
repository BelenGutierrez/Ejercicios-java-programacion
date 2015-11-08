/**
 *  Realiza un programa que muestre al azar el nombre de una carta de la baraja 
 *  francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes 
 *  y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son 
 *  numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1).
 *  Para convertir un número en una cadena de caracteres podemos usar String.valueOf(n)
 * 
 * @author Belén Gutierrez
 */
public class C6ejercicio02 {
  public static void main(String[] args) {
    
    String figura = "";
    String palo = "";
    
    System.out.print("Este programa muestra una carta y su palo\n ");

    int clasePalo = (int)(Math.random() * 4) + 1;
    switch(clasePalo) {
      case 1:
        palo = "Picas";
        break;
      case 2:
        palo = "Corazones";
        break;  
      case 3:
        palo = "Diamantes";
        break;  
      case 4:
        palo = "Tréboles";
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
        figura = "J";
        break;  
      case 12:
        figura = "Q";
        break;  
      case 13:
        figura = "K";
      default:  
    } 

      System.out.print(figuraNum  + " de " + palo);
  }
}


























