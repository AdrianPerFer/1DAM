/**
 * 
Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga
lo que se especifica en los comentarios (puedes incluirla en tu propia biblioteca
de rutinas):
public static int[] filtraPrimos(int x[]) // Devuelve un array con todos los
// números primos que se encuentren
// en otro array que se pasa como
// parámetro.
// Obviamente el tamaño del array
// que se devuelve será menor o
// igual al que se pasa como
// parámetro.
Utiliza esta función en un programa para comprobar que funcionan bien. Para
que el ejercicio resulte más fácil, las repeticiones de primos se conservan; es
decir, si en el array x el número 13 se repite 3 veces, en el array devuelto
también estará repetido 3 veces. Si no existe ningún número primo en x, se
devuelve un array con el número -1 como único elemento.
 * 
 * @author: Adrián Perogil Fernández
 * 
 */

import matematicas.Funciones;
import matematicas.Arrays;
public class Ejercicio36 {
    public static int[] filtraPrimos(int x[]){
        int[] primos = new int[x.length];
        int cuentaPrimos = 0;
        for (int i : x) {
            if (Funciones.esPrimo(i)) {
                primos[cuentaPrimos++] = i;
            }
        }
        int [] resultado = new int[cuentaPrimos];

        for (int i = 0; i < cuentaPrimos; i++) {
            resultado[i] = primos[i];
        }
        return resultado;
    }

    public static void main(String[] args) {
       int[] numeros = Arrays.generaArrayInt(20, 1, 100);
       System.out.println("Array: ");
       Arrays.muestraArrayInt(numeros);
       System.out.println("Primos: ");
       Arrays.muestraArrayInt(filtraPrimos(numeros));
    }

}
