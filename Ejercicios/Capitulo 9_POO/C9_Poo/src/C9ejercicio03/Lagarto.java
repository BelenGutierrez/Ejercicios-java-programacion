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
public class Lagarto extends Animal {
  
  
   public Lagarto (String n, String s, String r) {
    super(n, s, r);
  }

  
   public void sacaLengua() {
    System.out.println("Mira como saco mi bífida a velocidad de vértigo");
  }
  public void hiberna() {
    System.out.println("Adios, no vemos en unos meses");
  } 
  
   public void repta() {
    System.out.println("Estoy reptando");
  } 
  
  
  
  
}
