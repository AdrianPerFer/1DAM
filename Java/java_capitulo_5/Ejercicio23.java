/*
 * 
 * Escribe un programa que permita ir introduciendo una serie indeterminada
 * de números mientras su suma no supere el valor 10000. Cuando esto último
 * ocurra, se debe mostrar el total acumulado, el contador de los números
 * introducidos y la media.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;
        int i = 0;
        do {
            System.out.println("Introduzca un número: ");
            numero = sc.nextInt();
            suma += numero;
            i++;
        } while (suma <= 10000);
        double media = suma / i;
        System.out.println("Total acumulado: " + suma);
        System.out.println("Números introducidos: " + i);
        System.out.println("Media total: " + media);
        sc.close();
    }
}
