/*
 * 
 * Según cierta cultura oriental, los números de la suerte son el 3, el 7, el 8 y el 9.
 * Los números de la mala suerte son el resto: el 0, el 1, el 2, el 4, el 5 y el 6. Un
 * número es afortunado si contiene más números de la suerte que de la mala
 * suerte. Realiza un programa que diga si un número introducido por el usuario
 * es afortunado o no.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introudce un número: ");
        long numero = sc.nextLong();
        long aux = numero;
        long digito = 0;
        int suerte = 0;
        int noSuerte = 0;
        while (aux > 0) {
            digito = aux % 10;
            if ( digito == 3 || digito == 7 || digito == 8 || digito == 9 ) {
                suerte++;
            } else {
                noSuerte++;
            }
            aux /= 10;
        }
        if ( suerte > noSuerte ) {
            System.out.println("El " + numero + " es un número afortunado.");
        } else {
            System.out.println("El " + numero + " no es un número afortunado.");
        }
        sc.close();
    }
}
