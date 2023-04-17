/*
 * 
 * Escribe un programa que, dado un número entero positivo, diga cuáles son y cuánto suman los dígitos pares.
 * Los dígitos pares se deben mostrar en orden, de izquierda a derecha. Usa long en lugar de int donde sea
 * necesario para admitir números largos.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero positivo: ");
        long numero = sc.nextLong();
        long aux = numero;
        long numeroReves = 0;
        long digito = 0;
        int sumaPares = 0;
        while (aux > 0) {
            /*
             * La secuencia sería (1234 por ejemplo): 
             * 0 + 4
             * (4 * 10) + 3 = 43
             * 430 + 2 = 432
             * 4320 + 1 = 4321
             */
            numeroReves = (numeroReves * 10) + ( aux % 10 );
            aux /= 10;
        }
        while (numeroReves > 0) {
            digito = numeroReves % 10;
            if (digito % 2 == 0) {
                sumaPares += digito;
                System.out.println("El digito " + digito + " es par.");
            }
            numeroReves /= 10;
        }
        System.out.println("La suma total de los pares es de: " + sumaPares);
        sc.close();
    }
}
