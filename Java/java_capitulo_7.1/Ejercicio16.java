/*
 * Escribe un programa que rellene un array de 20 elementos con números enteros
 * aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
 * programa mostrará el array y preguntará si el usuario quiere resaltar los
 * múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
 * escribiendo los números que se quieren resaltar entre corchetes.
 *
 * @author: Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numero = new int [20];
        int numero_opcion;
        int numero_random;
        for (int i = 0; i < numero.length; i++) {
            numero_random = (int)(Math.random()*401);
            numero[i] = numero_random;
        }
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
        }
        do {
            System.out.println("\n5 para resaltar los múltiplos de 5");
            System.out.println("7 para resaltar los múltiplos de 7");
            System.out.println("Introduzca la opción: ");
            numero_opcion = sc.nextInt();
        } while (numero_opcion != 5 && numero_opcion != 7);
        if (numero_opcion == 5) {
            for (int i = 0; i < numero.length; i++) {
                if (numero[i] % 5 == 0) {
                    System.out.print("[" + numero[i] + "] ");
                } else {
                    System.out.print(numero[i] + " ");
                }
            }
        }
        if (numero_opcion == 7) {
            for (int i = 0; i < numero.length; i++) {
                if (numero[i] % 7 == 0) {
                    System.out.print("[" + numero[i] + "] ");
                } else {
                    System.out.print(numero[i] + " ");
                }
            }
        }
        sc.close();
    }
}
