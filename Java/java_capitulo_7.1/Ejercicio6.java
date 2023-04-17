/*
 * 
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 0
 * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
 * la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
 * del array.
 * 
 * @author: Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numero = new int[15];
        int i;
        System.out.println("Introduce números enteros y pulsa INTRO para añadir otro: ");
        for (i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + "º: ");
            numero[i] = sc.nextInt();
        }    
        System.out.println("\n───────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.printf("Slots Array: %5s|", " ");
        for (i = 0; i < 15; i++) {
            System.out.printf(" %2d |", i);
        }
        System.out.println();
        System.out.printf("Array original: %2s|", " ");
        for (i = 0; i < 15; i++) {
            System.out.printf(" %2d |", numero[i]);
        }
        int auxNumero = numero[14];
        for (i = 14; i > 0; i--) {
            numero[i] = numero[i-1];
        }
        System.out.println("\n───────────────────────────────────────────────────────────────────────────────────────────────");
        numero[0] = auxNumero;
        System.out.printf("Slots Array: %5s|", " ");
        for (i = 0; i < 15; i++) {
            System.out.printf(" %2d |", i);
        }
        System.out.println();
        System.out.println();
        System.out.printf("Array rotado: %4s|", " ");
        for (i = 0; i < 15; i++) {
            System.out.printf(" %2d |", numero[i]);
        }
        System.out.println();
        System.out.println("───────────────────────────────────────────────────────────────────────────────────────────────");
        sc.close();
    }
}