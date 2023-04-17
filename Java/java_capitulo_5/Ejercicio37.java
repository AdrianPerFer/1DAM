/*
 * 
 * Realiza un conversor del sistema decimal al sistema de "palotes".
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        long numero = sc.nextLong();
        System.out.print(numero + " = ");
        long aux = numero;
        long digitos = 0;
        long numeroReves = 0;
        // Para leer de izquierda a derecha
        while (aux > 0) {
            numeroReves = ((numeroReves*10) + (aux % 10));
            aux /=10;
            digitos++;
        }
        // Separamos cada dígito, y según el dígito, iteraremos tantas veces el bucle
        // de i2 como digito sea.
        long digito = 0;
        for ( int i = 0 ; i < digitos ; i++ ) {
            digito = numeroReves % 10;
            numeroReves /= 10;
            for ( int i2 = 0 ; i2 < digito ; i2++ ) {
                System.out.print("|");
            }
            if (i < digitos - 1) {
                System.out.print("-");
            }
        }
        sc.close();
    }
}
