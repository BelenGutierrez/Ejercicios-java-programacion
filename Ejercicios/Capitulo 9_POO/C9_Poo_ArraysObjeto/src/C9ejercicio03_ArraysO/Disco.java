/*
 * Ejercicio 3
 * Realiza el programa “Colección de discos” por tu cuenta, mirando lo menos
 * posible el ejemplo que se proporciona. Pruébalo primero para ver cómo
 * funciona y luego intenta implementarlo tú mismo.
 */
package C9ejercicio03_ArraysO;

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

public static int id = 1;

public Disco() {
  
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
  Disco.id++;
}

@Override
public String toString() {
String cadena =  "\nCódigo: " + this.codigo;
cadena += "\nAutor: " + this.autor;
cadena += "\nTítulo: " + this.titulo;
cadena += "\nGénero: " + this.genero;
cadena += "\nDuración: " + this.duracion;
cadena += "\n------------------------------------------";
return cadena;

 }
}  


