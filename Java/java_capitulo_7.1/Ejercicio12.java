/*
 * 
 * Realiza un programa que pida 10 números por teclado y que los almacene en
 * un array. A continuación se mostrará el contenido de ese array junto al índice
 * (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
 * “inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
 * números están entre 0 y 9. El programa deberá colocar el número de la posición
 * inicial en la posición final, rotando el resto de números para que no se pierda
 * ninguno. Al final se debe mostrar el array resultante.
 * 
 * Por ejemplo, para inicial = 3 y final = 7:
 * 
 * @author: Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Parte 1
            int [] primerArray = new int [10];
            int [] auxArray = new int [10];
            int numero;
            int i;
                for (i = 0; i < auxArray.length; i++) {
                    System.out.println("Introduce un número: ");
                    numero = sc.nextInt();
                    auxArray[i] = numero;
                }
                System.out.println();
                System.out.print("Índice:\t");
                for (int j = 0; j < auxArray.length; j++) {
                    System.out.printf("%5d|",j);
                }
                System.out.println("\n────────────────────────────────────────────────────────────────────");
                System.out.print("Array:\t");
                for (int j = 0; j < auxArray.length; j++) {
                    System.out.printf("%5d|",auxArray[j]);
                }
                System.out.println();
                System.out.println();
        // Fin parte 1
        // Parte 2
        int inicial;
        int fin;
        do {
            System.out.println("Posición inicial: ");
            inicial = sc.nextInt();
            System.out.println("Posición final: ");
            fin = sc.nextInt();
        } while ((inicial > fin) || (inicial >= 9 && fin >= 9) || (inicial == fin));
        // Fin parte 2
        // Parte 3
        System.out.println();
        System.out.print("Índice:\t");
        for (int j = 0; j < auxArray.length; j++) {
            System.out.printf("%5d|",j);
        }
        System.out.println("\n────────────────────────────────────────────────────────────────────");
        System.out.print("Array:\t");
        for (int j = 0; j < auxArray.length; j++) {
            System.out.printf("%5d|",auxArray[j]);
        }
        System.out.println();
        // Fin parte 3
        // Parte 4
        for (int j = 0; j < 10; j++) {
            primerArray[j] = auxArray[j];
        }

        primerArray[fin] = auxArray[inicial];

        for (int j = fin + 1; j < 10; j++) {
            primerArray[j] = auxArray[j - 1];
        }

        primerArray[0] = auxArray[9];

        for (int j = 0; j < inicial; j++) {
            primerArray[j + 1] = auxArray[j];
        }

        // Fin parte 4
        // Parte 5
        System.out.println();
        System.out.print("Índice:\t");
        for (int j = 0; j < primerArray.length; j++) {
            System.out.printf("%5d|",j);
        }
        System.out.println("\n────────────────────────────────────────────────────────────────────");
        System.out.print("Array:\t");
        for (int j = 0; j < primerArray.length; j++) {
            System.out.printf("%5d|",primerArray[j]);
        }
        System.out.println();
        // Fin parte 5
        sc.close();
    }
}
