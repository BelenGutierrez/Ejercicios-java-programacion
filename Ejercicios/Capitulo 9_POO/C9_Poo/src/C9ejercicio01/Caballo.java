/*
 * Ejercicio 1
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 */
package C9ejercicio01;

/**
 * Definición de la clase Caballo
 *
 * @author belen
 */
public class Caballo {

  private String nombre;
  private String raza;
  private String sexo;
  private int edad;
  
  

  public Caballo() {
  }

  public Caballo(String n, String r, String s, int e) {
    this.nombre = n;
    this.raza = r;
    this.sexo = s;
    this.edad = e;
  }

  
  
  
  public String getNombre() {
    return this.nombre;
  }

  public String getRaza() {
    return this.raza;
  }

  public String getSexo() {
    return this.sexo;
  }

  public int getEdad() {
    return this.edad;
  }

  void relincha() {
    System.out.println("ygigygigygigiy   brbrrrrbrbbrrrr");
  }

}
