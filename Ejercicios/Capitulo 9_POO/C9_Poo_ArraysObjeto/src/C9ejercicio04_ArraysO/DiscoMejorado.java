/*
 * Ejercicio 4
 * Modifica el programa “Colección de discos” como se indica a continuación:
 * a) Mejora la opción “Nuevo disco” de tal forma que cuando se llenen todas las
 * posiciones del array, el programa muestre un mensaje de error. No se permitirá
 * introducir los datos de ningún disco hasta que no se borre alguno de la lista.
 * 
 * b) Mejora la opción “Borrar” de tal forma que se verifique que el código introducido por el usuario existe.
 * 
 * c) Modifica el programa de tal forma que el código del disco sea único, es decir que no se pueda repetir.
 * 
 * d) Crea un submenú dentro dentro de “Listado” de tal forma que exista un listado completo, un listado por autor (todos los discos 
 * que ha publicado un determinado autor), un listado por género (todos los discos de un género determinado)
 * y un listado de discos cuya duración esté en un rango determinado por el usuario.
 */
package C9ejercicio04_ArraysO;

/**
 *
 * @author belen
 */
public class DiscoMejorado {

  private String codigo = "LIBRE";
  private String autor;
  private String titulo;
  private String genero;
  private int duracion;

  public static int id = 1;

  public DiscoMejorado() {

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

  public static int getId() {
    return id;

  }

  public static void incrementaId() {
    DiscoMejorado.id++;
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
