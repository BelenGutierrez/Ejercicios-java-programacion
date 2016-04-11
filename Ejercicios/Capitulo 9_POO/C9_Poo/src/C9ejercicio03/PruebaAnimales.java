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
public class PruebaAnimales {

  public static void main(String[] args) {

    Gato gato1 = new Gato("Silvestre", "macho", "Callejero");
    System.out.println(gato1.getNombre() + "\n" + gato1.getSexo());
    gato1.cazaRatones();
    gato1.bebe();
    System.out.println("");

    Perro perro1 = new Perro("Rex", "macho", "Pastor Alemán");
    System.out.println(perro1.getNombre() + "\n" + perro1.getSexo());
    perro1.vigilaLaCasa();
    perro1.escondeHueso();
    perro1.muerde();
    System.out.println("");

    Canario canario1 = new Canario("Tweety", "macho", "Canarisaurius");
    System.out.println(canario1.getNombre() + "\n" + canario1.getSexo());
    canario1.canta();
    canario1.comeLombriz();
    canario1.ponHuevos("macho");
    System.out.println("");

    Canario canario2 = new Canario("Canarita", "hembra", "Canarisaurius");
    System.out.println(canario2.getNombre() + "\n" + canario2.getSexo());
    canario2.ponHuevos("hembra");
    System.out.println("");

    Pinguino pinguino1 = new Pinguino("Penguin", "hembra", "Emperador");
    System.out.println(pinguino1.getNombre() + "\n" + pinguino1.getSexo());
    pinguino1.vuela();
    pinguino1.corre();
    pinguino1.nada();
    System.out.println("");

    Lagarto lagarto1 = new Lagarto("Lagarta", "hembra", "Camaleón");
    System.out.println(lagarto1.getNombre() + "\n" + lagarto1.getSexo());
    lagarto1.sacaLengua();
    lagarto1.repta();
    lagarto1.hiberna();

  }

}
