/*
 * 
 * Realiza un programa que sea capaz de desplazar todos los dígitos de un número
 * de izquierda a derecha una posición. El dígito de más a la derecha, pasaría a
 * dar la vuelta y se colocaría a la izquierda. Si el número tiene un solo dígito, se
 * queda igual.

 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        long numero = sc.nextLong();
        long aux = numero;
        long numeroReves = 0;
        long numeroReves2 = 0;
        long digito = 0;
        digito = aux % 10;
        while (aux > 0) {
            numeroReves = ((numeroReves * 10) + (aux % 10));
            aux /= 10;
        }
        numeroReves = ((numeroReves * 10) + digito);
        while (numeroReves > 0) {
            if (numeroReves > 10) {
                numeroReves2 = ((numeroReves2 * 10) + (numeroReves % 10));
            }
            numeroReves /= 10;
        }
        System.out.println("El número resultado es " + numeroReves2);
        sc.close();
    }
}