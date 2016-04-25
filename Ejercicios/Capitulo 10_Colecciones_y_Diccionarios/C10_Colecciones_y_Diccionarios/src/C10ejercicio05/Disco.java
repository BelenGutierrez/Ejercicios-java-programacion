/*
 * Ejercicio 5
 * Realiza de nuevo el ejercicio de la colección de discos pero utilizando esta vez
 * una lista para almacenar la información sobre los discos en lugar de un array
 * convencional. Comprobarás que el código se simplifica notablemente ¿Cuánto
 * ocupa el programa original hecho con un array? ¿Cuánto ocupa este nuevo
 * programa hecho con una lista?
 */
package C10ejercicio05;

/**
 *
 * @author belen
 */
public class Disco {
 

  private String codigo = "LIBRE";
  private String autor;
  private String titulo;
  private String genero;
  private int duracion;

  

  public Disco() {

  }
  
  public Disco(String c, String a, String t, String g, int d) {
    codigo = c;
    autor = a;
    titulo = t;
    genero = g;
    duracion = d;
  }
  
  

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getDuracion() {
    return duracion;
  }

  public void setDuracion(int duracion) {
    this.duracion = duracion;
  }

 

  @Override
  public String toString() {
    String cadena = "\nCódigo: " + this.codigo;
    cadena += "\nAutor: " + this.autor;
    cadena += "\nTítulo: " + this.titulo;
    cadena += "\nGénero: " + this.genero;
    cadena += "\nDuración: " + this.duracion;
    cadena += "\n------------------------------------------";
    return cadena;

  }

} 
  
  
  

