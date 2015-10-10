 /**
 *
 * Escribe un programa que nos diga el horóscopo, a partir del día y el mes del
 * nacimiento.
 *
 * @author Belén Gutierrez
 */

public class C4ejercicio10 {  
  public static void main(String[] args) {
    
    String mes;
    String horoscopo = "";
     
    System.out.println("Programa que nos dice el horóscopo de una persona" );
    System.out.print("Por favor, introduzca el día de nacimiento (del 1 al 31 ): ");
    int dia = Integer.parseInt (System.console().readLine());
    
    System.out.print("Por favor, introduzca el mes (en letras) :  ");
    mes = (System.console().readLine());
    mes.toLowerCase();
    
    
    
    switch(mes) {
      case "enero":
        if(dia < 21) {
          horoscopo = "Capricornio";
        } else {
          horoscopo = "Acuario";
        } 
        break;
      case "febrero":
        if(dia < 21) {
          horoscopo = "Acuario";
        } else {
          horoscopo = "Piscis";
        } 
        break;
      case "marzo":
        if(dia < 21) {
          horoscopo = "Piscis";
        } else {
          horoscopo = "Aries";
        } 
        break;
      case "abril":
        if(dia < 21) {
          horoscopo = "Aries";
        } else {
          horoscopo = "Tauro";
        } 
        break;
      case "mayo":
        if(dia < 21) {
          horoscopo = "Tauro";
        } else {
          horoscopo = "Géminis";
        } 
        break;
      case "junio":
        if(dia < 21) {
          horoscopo = "Géminis";
        } else {
          horoscopo = "Cáncer";
        } 
        break;
      case "julio":
        if(dia < 21) {
          horoscopo = "Cáncer";
        } else {
          horoscopo = "Leo";
        } 
        break;
      case "agosto":
        if(dia < 21) {
          horoscopo = "Leo";
        } else {
          horoscopo = "Virgo";
        } 
        break;
      case "septiembre":
        if(dia < 21) {
          horoscopo = "Virgo";
        } else {
          horoscopo = "Libra";
        } 
        break;
      case "octubre":
        if(dia < 21) {
          horoscopo = "libra";
        } else {
          horoscopo = "Escorpio";
        } 
        break;
      case "noviembre":
        if(dia < 21) {
          horoscopo = "Escorpio";
        } else {
          horoscopo = "Sagitario";
        } 
        break;
      case "diciembre":
        if(dia < 21) {
          horoscopo = "Sagitario";
        } else {
          horoscopo = "Capricornio";
        } 
        break;
      default:
    }
    System.out.print("Su horóscopo es " + horoscopo);
  }
}
