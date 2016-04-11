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
public class Pinguino extends Ave {
  
  
   public Pinguino (String n, String s, String r) {
    super(n, s, r);
  }

  
   @Override
   public void vuela() {
    System.out.println("No puedo volar");
  }
  public void corre() {
    System.out.println("No puedo correr");
  } 
  
   public void nada() {
    System.out.println("Menos mal que puedo nadar");
  } 
  
  
  
  
}
