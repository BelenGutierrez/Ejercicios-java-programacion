/**
 *
 *  Escribe un programa que diga cuál es la primera cifra de un número entero
 *  introducido por teclado. Se permiten números de hasta 5 cifras.
 *
 * @author Belén Gutierrez
 */
public class C4ejercicio19 {

  public static void main(String[] args) {
    
   int numero, primeraCifra = 0;
    
    System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
    numero = Integer.parseInt(System.console().readLine());
    
    
    if (numero > 99999) {
    System.out.println("Lo siento el número es mayor de 5 cifras\n");
    System.out.println("Intente otra vez, por favor:");
    numero = Integer.parseInt(System.console().readLine());
    } else {
    }
    if ( numero < 10 ) {
      primeraCifra = numero;
    }
    
    if (( numero >= 10 ) && ( numero < 100 )) {
      primeraCifra = numero / 10;
    }
    
    if (( numero >= 100 ) && ( numero < 1000 )) {
      primeraCifra = numero / 100;
    }
    
    if (( numero >= 1000 ) && ( numero < 10000 )) {
      primeraCifra = numero / 1000;
    }
    
    if (( numero >= 10000 ) && ( numero < 100000)) {
      primeraCifra = numero / 10000;
    }
    
    System.out.println("La primera cifra del número introducido es el " + primeraCifra);
  }
}
