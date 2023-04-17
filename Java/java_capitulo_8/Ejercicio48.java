/**
 * 
 * Define la función concatena con la siguiente cabecera:
 * 
 * public static int[] concatena(int[] a, int[] b)
 * 
 * Esta función toma dos arrays como parámetros y devuelve un array que es el resultado de concatenar ambos. 
 * Por ej. si a = { 8, 9, 0 } y b = { 1, 2, 3 }, concatena(a, b) devuelve { 8, 9, 0, 1, 2, 3 }.
 * 
 * @author Adrián Perogil Fernández
 * 
 */

import java.util.Scanner;
import matematicas.Arrays;

public class Ejercicio48 {
    public static int[] concatena(int[] a, int[] b){
        int j = 0;
        int longitudA = a.length;
        int longitudB = b.length;
        int longitud = longitudA + longitudB;
        int[] aux = new int[longitud];
        for (int i = 0; i < longitudA; i++) {
            aux[i] = a[i];
        }
        for (int i = longitudA; i < aux.length; i++) {
            aux[i] = b[j++];
        }
        return aux;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = Arrays.generaArrayInt(5, 0, 9);
        int[] array2 = Arrays.generaArrayInt(5, 0, 9);
        Arrays.muestraArrayInt(concatena(array1, array2));
        sc.close(); 
    }
}
