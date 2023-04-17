/*
 *
 * Escribe un programa que rellene un array de 15 elementos con números enteros
 * comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
 * array “cincuerizado”, según el siguiente criterio: si el número que hay en una
 * posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
 * siguiente múltiplo de 5 que exista a partir de él.
 *
 * @author: Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arrayNumero = new int [15];
        int numero = 0;
        for (int i = 0; i < arrayNumero.length; i++) {
            numero = (int)(Math.random()*501);
            arrayNumero[i] = numero;
        }
        for (int i = 0; i < arrayNumero.length; i++) {
            System.out.printf("%5d", i);
        }
        System.out.println();
        for (int i = 0; i < arrayNumero.length; i++) {
            System.out.printf("%5d", arrayNumero[i]);
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < arrayNumero.length; i++) {
            while (arrayNumero[i] % 5 != 0) {
                arrayNumero[i]++;
            }
        }
        for (int i = 0; i < arrayNumero.length; i++) {
            System.out.printf("%5d", i);
        }
        System.out.println();
        for (int i = 0; i < arrayNumero.length; i++) {
            System.out.printf("%5d", arrayNumero[i]);
        }
        System.out.println();
        System.out.println();
        sc.close();
    }
}
