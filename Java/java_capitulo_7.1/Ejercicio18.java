/*
 *
 * Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
 * ambos incluidos y que los almacene en un array. A continuación, el programa
 * debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
 * programa debe colocar de forma alterna y en orden los menores o iguales de
 * 100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
 * mayor… Cuando se acaben los menores o los mayores, se completará con los
 * números que queden.
 *
 * @author: Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numero1 = new int [10];
        int [] numero2 = new int [10];
        int [] arrayMenor = new int [10];
        int menor = 0;
        int [] arrayMayor = new int [10];
        int mayor = 0;
        int numero_random;
        int auxMenor = 0;
        int auxMayor = 0;
        for (int i = 0; i < numero1.length; i++) {
            numero_random = (int)(Math.random()*201);
            numero1[i] = numero_random;
            if (numero1 [i] <= 100) {
                arrayMenor[menor++] = numero1 [i];
            } else {
                arrayMayor[mayor++] = numero1 [i];
            }
        }
        for (int i = 0; i < numero1.length; i++) {
            System.out.printf("%5d", i);
        }
        System.out.println();
        for (int i = 0; i < numero1.length; i++) {
            System.out.printf("%5d", numero1[i]);
        }
        System.out.println();
        System.out.println();
        int j = 0;
        do {
            if (auxMenor < menor) {
                numero2[j++] = arrayMenor[auxMenor++];
            }
            if (auxMayor < mayor) {
                numero2[j++] = arrayMayor[auxMayor++];
            }
        } while (j < 10);
        for (int i = 0; i < numero1.length; i++) {
            System.out.printf("%5d", i);
        }
        System.out.println();
        for (int i = 0; i < numero2.length; i++) {
            System.out.printf("%5d", numero2[i]);
        }
        System.out.println();
        sc.close();
    }
}
