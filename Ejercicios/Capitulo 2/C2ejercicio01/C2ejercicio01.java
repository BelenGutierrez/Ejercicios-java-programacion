/**
 * Programa que declara variables x e y y les asigna el valor 144 y 999 respectivamente. 
 * Además realiza operaciones entre ellas.
 *
 * @author Belen Gutierrez
 */

public class C2ejercicio01 {
  public static void main(String[] args) {

    int x = 144;
    int y = 999;

    int sum = x + y;
    System.out.println("La suma de mis variables es " + sum);
    
    int rest = x - y;
    System.out.println("La resta de mis variables es " + rest);
    
    int mul = x * y;
    System.out.println("La multiplicación de mis variables es " + mul);
    
    double div =  (double)x / (double)y;
    System.out.println("La division de mis variables es " + div);   
  }
}
