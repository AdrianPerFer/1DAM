/*
 *
 * Realiza un programa que sea capaz de insertar un número en una posición
 * concreta de un array. En primer lugar, el programa generará un array de 12
 * números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
 * debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
 * el programa preguntará por el número que se quiere insertar y por la posición
 * donde será insertado. Los números del array se desplazan a la derecha para
 * dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
 * siempre se perderá.
 *
 * @author: Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arrayPrimero = new int [12];
        int numero_random;
        for (int i = 0; i < arrayPrimero.length; i++) {
            numero_random = (int)(Math.random()*201);
            arrayPrimero[i] = numero_random;
        }
        for (int i = 0; i < arrayPrimero.length; i++) {
            System.out.printf("%5d", i);
        }
        System.out.println();
        for (int i = 0; i < arrayPrimero.length; i++) {
            System.out.printf("%5d", arrayPrimero[i]);
        }
        System.out.println();
        System.out.println();
        System.out.print("Introduzca el número que quiere insertar: ");
        int numero = sc.nextInt();
        System.out.print("Introduzca la posición (0-11): ");
        int posicion = sc.nextInt();
        for (int i = arrayPrimero.length - 1; i > posicion; i--) {
            arrayPrimero[i] = arrayPrimero[i - 1];
        }
        arrayPrimero[posicion] = numero;
        System.out.println();
        for (int i = 0; i < arrayPrimero.length; i++) {
            System.out.printf("%5d", i);
        }
        System.out.println();
        for (int i = 0; i < arrayPrimero.length; i++) {
            System.out.printf("%5d", arrayPrimero[i]);
        }
        System.out.println();
        sc.close();
    }
}
