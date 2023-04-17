/**
 * 
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
 * muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
 * todo el ArrayList sin usar ningún índice.
 * 
 * @author Adrián Perogil Fernández
 * 
 */

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> compi = new ArrayList<String>();
        System.out.println("Nombre de los compañeros");
        compi.add("Diego");
        compi.add("Javi");
        compi.add("Marco");
        compi.add("Deni");
        compi.add("Jesús");
        compi.add("Nuria");
        for (String nombre : compi) {
            System.out.println(nombre);
        }
    }
}