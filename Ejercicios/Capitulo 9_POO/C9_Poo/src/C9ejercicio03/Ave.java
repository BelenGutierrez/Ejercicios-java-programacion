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
public abstract class Ave extends Animal {
  
  public Ave (String n, String s, String r) {
    super(n, s, r);
  }

  
   public void vuela() {
    System.out.println("Mira que bonito vuelo");
  }
  public void extiendeAlas() {
    System.out.println("Este es mi ejercicio favorito");
  } 
  
   public void ponHuevos(String s) {
    if (this.getSexo() .equals ("macho")) {
      System.out.println("Los machos no ponemos huevos");
    } else {
      System.out.println("Ahí va la tercera camada de hijitos");
    }
  }
   
  
}
