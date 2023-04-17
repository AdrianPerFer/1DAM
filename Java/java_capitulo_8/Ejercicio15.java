import matematicas.Funciones;
/*
 * Muestra los números primos que hay entre 1 y 1000.
 * 
 * @author: Adrián Perogil Fernández
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        for (int i = 1; i < 1001; i++) {
            if (matematicas.Funciones.esPrimo(i)){
                System.out.println(i + " ");
            }
        }
    }
}
