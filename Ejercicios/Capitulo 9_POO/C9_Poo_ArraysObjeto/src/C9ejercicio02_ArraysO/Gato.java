/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C9ejercicio02_ArraysO;

/**
 *
 * @author belen
 */
public class Gato {

  String nombre;
  String sexo;
  String color;
  String raza;
  
  public Gato(String nombre, String color, String sexo) {
    this.nombre = nombre;
    this.color = color;
    this.sexo = sexo;
  }

  public String getNombre() {
    return nombre;
  }

  public String getSexo() {
    return sexo;
  }
  
   public String getColor() {
    return color;
  }
  public String getRaza() {
    return raza;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }
  
  public void setColor(String color) {
    this.color = color;
  }
  public void setRaza(String raza) {
    this.raza = raza;
  }
}
