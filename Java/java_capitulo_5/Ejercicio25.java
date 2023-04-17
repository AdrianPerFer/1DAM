/*
 * 
 * Realizar un programa que pida un número por teclado y que luego
 * muestre ese número al revés.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
        int aux = numero;
        int numeroReves = 0;
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
        System.out.println(numero + " al revés es: " + numeroReves);
        sc.close();
    }
}
