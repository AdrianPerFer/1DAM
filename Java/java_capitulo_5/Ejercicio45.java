/*
 * 
 * Escribe un programa que cambie un dígito dentro de un número dando la
 * posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
 * empezando por el 1. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos. Suponemos que el usuario introduce
 * correctamente los datos.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        long numero = sc.nextLong();
        System.out.println("Introduzca la posición dentro del número: ");
        int cifra = sc.nextInt();
        System.out.println("Introduce el nuevo dígito: ");
        int cifra2 = sc.nextInt();
        long aux = numero;
        long numeroReves = 0;
        long parte1 = 0;
        int digito1 = 0;
        int i = 0;
        int contador = 0;
        while (aux > 0) {
            numeroReves = (numeroReves * 10) + ( aux % 10 );
            aux /= 10;
            contador++;
        }
        for ( i = 1 ; i <= contador ; i++ ) {
            digito1 = (int) numeroReves % 10;
            parte1 = ( parte1 * 10 ) + digito1;
            if (i == cifra) {
                System.out.print(cifra2);
            } else {
                System.out.print(digito1);
            }
            numeroReves /= 10; 
        }
        sc.close();
    }
}