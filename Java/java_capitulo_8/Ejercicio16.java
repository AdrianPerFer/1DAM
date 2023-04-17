/*
 * Muestra los números capicúa que hay entre 1 y 99999.
 * 
 * @author: Adrián Perogil Fernández
 */
import matematicas.Funciones;
public class Ejercicio16 {
    public static void main(String[] args) {
        for (int i = 1; i < 100000 ; i++) {
            if (matematicas.Funciones.esCapicua(i)){
                System.out.println(i + " ");
            }
        }
    }
}
