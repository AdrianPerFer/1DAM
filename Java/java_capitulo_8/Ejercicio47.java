/**
 * 
 * Define la función convierteArrayEnString con la siguiente cabecera:
 * 
 * public static String convierteArrayEnString(int[] a)
 * 
 * Esta función toma como parámetro un array que contiene números y devuelve una cadena de caracteres con esos números. 
 * Por ejemplo, 
 *      si a = { }, convierteArrayEnString(a) devuelve “”; 
 *      si a = { 8 }, convierteArrayEnString(a) devuelve “8”; 
 *      si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve “62501”.
 * 
 * @author Adrián Perogil Fernández
 * 
 */

import java.util.Scanner;

public class Ejercicio47 {
    public static String convierteArrayEnString(int[] a){
        String resultado = "";
        for (int i = 0; i < a.length; i++) {
            resultado += a[i];
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la longitud del array: ");
        int longitud = sc.nextInt();
        int array[] = new int[longitud];
        System.out.println("Introduce un número: ");
        for (int i = 0; i < longitud; i++) {
            int numero = sc.nextInt();
            array[i] = numero;
        }
        System.out.println(convierteArrayEnString(array));
        sc.close();
    }
}
