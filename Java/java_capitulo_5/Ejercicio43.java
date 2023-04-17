/*
 * 
 * Escribe un programa que permita partir un número introducido por teclado en
 * dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
 * el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
 * el número introducido tiene dos dígitos como mínimo y la posición en la que
 * se parte el número está entre 2 y la longitud del número. No se permite en
 * este ejercicio el uso de funciones de manejo de String (por ej. para extraer
 * subcadenas dentro de una cadena).
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número :");
        long numero = sc.nextLong();
        System.out.println("Introduzca por que cifra quiere partir: ");
        int cifra = sc.nextInt();
        long aux = numero;
        long numeroReves = 0;
        long parte1 = 0;
        long parte2 = 0;
        int digito1 = 0;
        int digito2 = 0;
        int i = 0;
        while (aux > 0) {
            numeroReves = (numeroReves * 10) + ( aux % 10 );
            aux /= 10;
        }
        for ( i = 1 ; i < cifra ; i++ ) {
            digito1 = (int) numeroReves % 10;
            parte1 = ( parte1 * 10 ) + digito1;
            numeroReves /= 10; 
        }
        for ( int i2 = i - 1 ; i2 <= cifra ; i2++ ) {
            digito2 = (int) numeroReves % 10;
            parte2 = ( parte2 * 10) + digito2;
            numeroReves /= 10;
        }
        System.out.println("Los números partidos son el " + parte1 + " y el " + parte2);
        sc.close();
    }
}
