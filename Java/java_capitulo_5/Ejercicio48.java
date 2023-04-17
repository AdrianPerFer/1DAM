/*
 * 
 * Realiza un programa que diga los dígitos que aparecen y los que no aparecen
 * en un número entero introducido por teclado. El orden es el que se muestra en
 * los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números
 * largos.

 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        long numero = sc.nextLong();
        long auxNumero = numero;
        boolean esDigito = false;
        System.out.print("Dígitos que aparecen en el número: ");
        // Si los digitos están
        for (int i = 0; i <= 9; i++) {
            esDigito = false;
            auxNumero = numero;
            while (auxNumero > 0) {
                // Al comparar con i, evitamos que el número se repita si introducimos 4 ceros.
                if (auxNumero % 10 == i) {
                    esDigito = true;
                }
                auxNumero /= 10;
            }
            if (esDigito) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        System.out.print("Dígitos que no aparecen: ");
        // Si los digitos no están
        for (int i = 0; i <= 9; i++) {
            esDigito = false;
            auxNumero = numero;
            while (auxNumero > 0) {
                if (auxNumero % 10 == i) {
                    esDigito = true;
                }
                auxNumero /= 10;
            }
            // Igual que hacíamos en el anterior while pero, si ahora esDigito es !
            // Quiere decir que no se encontró, así conseguimos que sin !, diga que existe
            // Y poniendo ! diga cuales no existe.
            if (!esDigito) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}