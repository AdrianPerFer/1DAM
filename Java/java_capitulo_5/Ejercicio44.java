/*
 * 
 * Escribe un programa que sea capaz de insertar un dígito dentro de un número
 * indicando la posición. El nuevo dígito se colocará en la posición indicada y el
 * resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
 * izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
 * correctamente los datos. Se recomienda usar long en lugar de int ya que el
 * primero admite números más largos.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número :");
        long numero = sc.nextLong();
        System.out.println("Introduzca por que cifra quiere partir: ");
        int cifra = sc.nextInt();
        System.out.println("Introduce el dígito que quiere insertar: ");
        int cifra2 = sc.nextInt();
        long aux = numero;
        long numeroReves = 0;
        long parte1 = 0;
        long parte2 = 0;
        int digito1 = 0;
        int digito2 = 0;
        int i = 0;
        int contador = 0;
        while (aux > 0) {
            numeroReves = (numeroReves * 10) + ( aux % 10 );
            aux /= 10;
            contador++;
        }
        for ( i = 1 ; i < cifra ; i++ ) {
            digito1 = (int) numeroReves % 10;
            parte1 = ( parte1 * 10 ) + digito1;
            numeroReves /= 10; 
        }
        parte1 = ( parte1 * 10 ) + cifra2;
        for ( int i2 = i - 1 ; i2 <= contador ; i2++ ) {
            digito2 = (int) numeroReves % 10;
            parte2 = ( parte2 * 10 ) + digito2;
            numeroReves /= 10;
        }
        System.out.println("El número resultante es " + parte1 + "" + parte2);
        sc.close();
    }
}
