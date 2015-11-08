 /**
 *
 * Escribe un programa que pinte una pirámide rellena con un carácter
 * introducido por teclado que podrá ser una letra, un número o un símbolo 
 * como *, +, -, $, &, etc. El programa debe permitir al usuario mediante un
 * menú elegir si el vértice de la pirámide está apuntando hacia arriba, hacia
 * abajo, hacia la izquierda o hacia la derecha.
 * 
 *
 * @author Belén Gutierrez
 */

public class C4ejercicio15 { 
  
  public static void main(String[] args) {
  
  
  
  
    System.out.println("\nEste programa hará una pirámide rellena\n");  
    System.out.println("Por favor introduzca el carácter de relleno: " );
    String rell = (System.console().readLine());
    
    System.out.println("Elija un tipo de pirámide\n");
    System.out.println("1. Con el vértice hacia arriba");
    System.out.println("2. Con el vértice hacia abajo");
    System.out.println("3. Con el vértice hacia la izquierda");
    System.out.println("4. Con el vértice hacia la derecha");
    
    int opcion = Integer.parseInt(System.console().readLine());
    
    switch(opcion) {
      case 1:
        System.out.println("  " + rell);
        System.out.println(" " + rell + rell + rell);
        System.out.println(rell + rell + rell + rell + rell);
        break;
      case 2:
        System.out.println(rell + rell + rell + rell + rell);
        System.out.println(" " + rell + rell + rell);
        System.out.println("  " + rell);
        break;
      case 3:
        System.out.println("    " + rell);
        System.out.println("  " + rell + " " + rell);
        System.out.println(rell + " " + rell + " " + rell);
        System.out.println("  " + rell + " " + rell);
        System.out.println("    " + rell);
        break;
      case 4:
        System.out.println(rell);
        System.out.println(rell + " " + rell);
        System.out.println(rell + " " + rell + " " + rell);
        System.out.println(rell + " " + rell);
        System.out.println(rell);
        break;
      default:
    }
  }
}



    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
