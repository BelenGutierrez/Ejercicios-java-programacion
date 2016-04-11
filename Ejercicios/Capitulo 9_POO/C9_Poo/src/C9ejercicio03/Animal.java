/*
 * 3. Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario,  Pinguino y Lagarto. 
 *     Crea, al menos, tres métodos específicos de cada clase y redefne el/los método/s cuando sea necesario.  
 *     Prueba las clases creadas en un programa en el que se instancien
 *     objetos y se les apliquen métodos.
 */
package C9ejercicio03;

/**
 *
 * @author belen
 */
public abstract class Animal {

 
   private String nombre;
  private String sexo;
  private String raza;
  
  
  public Animal() {
    
  }

  public Animal(String n, String s, String r) {
    this.nombre = n;
    this.sexo = s;
    this.raza = r;
  }

  public String getNombre() {
    return this.nombre;
  }

  public String getSexo() {
    return this.sexo;
  }

  public String getRaza() {
    return this.raza;
  }
  
  
  public void anda() {
    System.out.println("Estoy andando según mi especie");
  }
  public void muerde() {
    System.out.println("añññññññññ añññññññññ");
  }
  public void come() {
    System.out.println("am am am");
  }
  
  public void bebe() {
    System.out.println("glup glup");
  }

}
