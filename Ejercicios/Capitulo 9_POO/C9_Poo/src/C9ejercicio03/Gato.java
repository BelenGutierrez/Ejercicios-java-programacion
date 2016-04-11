/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C9ejercicio03;

/**
 *
 * @author belen
 */
public class Gato  extends Mamifero {
  
   public Gato (String n, String s, String r) {
    super(n, s, r);
  }

  
   public void maulla() {
    System.out.println("Miauuuu");
  }
  public void ronronea() {
    System.out.println("rrrrrrrrrrrrrrrrrrr");
  } 
  
   public void cazaRatones() {
    System.out.println("No quedará ni un ratón");
  } 
  
  
  
  
}
