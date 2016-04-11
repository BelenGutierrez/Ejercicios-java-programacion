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
public class Perro extends Mamifero {
  
  public Perro (String n, String s, String r) {
    super(n, s, r);
  }

  
   public void ladra() {
    System.out.println("Guau guau");
  }
  public void vigilaLaCasa() {
    System.out.println("Aquí no entrarán ladrones");
  } 
  
   public void escondeHueso() {
    System.out.println("Estoy cavando un pocito");
  } 
  
  
  
  
}
