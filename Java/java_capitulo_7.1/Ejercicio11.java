/*
 * 
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
 * primos a las primeras posiciones, desplazando el resto de números (los que no
 * son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
 * array resultante.
 * 
 * @author: Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arrayInicial = new int [10];
        int [] arrayPrimo = new int [10];
        int [] arrayNoprimo = new int [10];
        int [] arrayFinal = new int [10];
        int i = 0;
        int primo = 0;
        int noPrimo = 0;
        int contador = 0;
        boolean esPrimo = false;
        for (i = 0; i < arrayInicial.length; i++) {
            System.out.println("Introduce un número: ");
            arrayInicial[i] = sc.nextInt();
        }
        for (i = 0; i < arrayInicial.length; i++) {
            for (int j = 2; j < arrayInicial[i]; j++) {
                if (arrayInicial[i] % j == 0) {
                    esPrimo = true;
                }
            }
            if (esPrimo) {
                arrayNoprimo[noPrimo++] = arrayInicial[i];
            } else {
                arrayPrimo[primo++] = arrayInicial[i];
            }
            esPrimo = false;
        }
        System.out.println("Primos: " + primo);
        for (int j = 0; j < arrayFinal.length; j++) {
            System.out.printf("|%3d", j);
        }
        System.out.print("|");
        System.out.println("\n-----------------------------------------");
        for (i = 0; i < arrayInicial.length; i++) {
            System.out.printf("|%3d", arrayPrimo[i]);
        }
        System.out.print("|");
        System.out.println();
        System.out.println("\nNo primos: " + noPrimo);
        for (int j = 0; j < arrayFinal.length; j++) {
            System.out.printf("|%3d", j);
        }
        System.out.print("|");
        System.out.println("\n-----------------------------------------");
        for (i = 0; i < arrayInicial.length; i++) {
            System.out.printf("|%3d", arrayNoprimo[i]);
        }
        System.out.print("|");
        System.out.println();
        for (i = primo; i < arrayFinal.length; i++) {
            arrayPrimo[i] = arrayNoprimo[contador++];
        }
        System.out.println("\nUnión");
        for (int j = 0; j < arrayFinal.length; j++) {
            System.out.printf("|%3d", j);
        }
        System.out.print("|");
        System.out.println("\n-----------------------------------------");
        for (i = 0; i < arrayInicial.length; i++) {
            System.out.printf("|%3d", arrayPrimo[i]);
        }
        System.out.print("|");
        sc.close();
    }
}