/*
 * 
 * Realiza un programa que sea capaz de desplazar todos los dígitos de un número
 * de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría a
 * dar la vuelta y se colocaría a la derecha. Si el número tiene un solo dígito, se
 * queda igual.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        long numero = sc.nextLong();
        long aux = numero;
        long numeroReves = 0;
        long numeroReves2 = 0;
        long digito = 0;
        while (aux > 0) {
            if (aux > 10) {
                numeroReves = ((numeroReves * 10) + (aux % 10));
            } else {
                digito = aux % 10;
            }
            aux /= 10;
        }
        while (numeroReves > 0) {
            numeroReves2 = ((numeroReves2 * 10) + (numeroReves % 10));
            numeroReves /= 10;
        }
        numeroReves2 = ((numeroReves2 * 10) + digito);
        System.out.println("El número resultado es " + numeroReves2);
        sc.close();
    }
}
