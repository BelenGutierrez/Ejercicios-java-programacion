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
public abstract class Mamifero extends Animal {
  
  
   public Mamifero (String n, String s, String r) {
    super(n, s, r);
  }

  
   public void mama() {
    System.out.println("Dame alimento");
  }
  public void pare() {
    System.out.println("Ayyyyyyy dolor");
  }
  public void corteja() {
    System.out.println("Demostraré mis dotes de enamoramiento");
  }
  
  
}
