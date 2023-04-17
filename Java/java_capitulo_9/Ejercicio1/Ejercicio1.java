package Ejercicio1;

/**
 * 
 * Implementa la clase Caballo vista en un ejercicio anterior.
 * Prueba creando instancias y aplicándole algunos métodos.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Caballo primerCaballo = new Caballo("Caballo1", "Dios", 10, "Negro", "Peludo");
        Caballo segundoCaballo = new Caballo("Caballo2", "Diablo", 10, "Blanco", "Calvo");
        System.out.println("Hola, me llamo " + primerCaballo.getNombre());
        primerCaballo.cabalga();
        primerCaballo.relincha();
        System.out.println("Hola, me llamo " + segundoCaballo.getNombre());
        segundoCaballo.rumia();
        segundoCaballo.cabalga();
    }
}
