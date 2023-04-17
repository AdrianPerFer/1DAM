/*
 * 
 * Escribe un programa que pida dos números por teclado y que luego mezcle en
 * dos números diferentes los dígitos pares y los impares. Se van comprobando los
 * dígitos de la siguiente manera: primer dígito del primer número, primer dígito
 * del segundo número, segundo dígito del primer número, segundo dígito del
 * segundo número, tercer dígito del primer número... Para facilitar el ejercicio,
 * podemos suponer que el usuario introducirá dos números de la misma longitud
 * y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de int
 * donde sea necesario para admitir números largos.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número (misma longitud): ");
        long numero1 = sc.nextLong();
        System.out.println("Introduce el segundo número (misma longitud): ");
        long numero2 = sc.nextLong();
        long aux1 = numero1;
        long aux2 = numero2;
        long numeroReves1 = 0;
        long numeroReves2 = 0;
        long auxDigito1 = 0;
        long auxDigito2 = 0;
        long numeroPar = 0;
        long numeroImpar = 0;
        // Volteado del primer número
        while (aux1 > 0 && aux2 > 0) {
            numeroReves1 = (numeroReves1 * 10) + ( aux1 % 10 );
            aux1 /= 10;
            // Volteado del segundo número
            numeroReves2 = (numeroReves2 * 10) + ( aux2 % 10 );
            aux2 /= 10;
        }
        System.out.println(numeroReves1);
        System.out.println(numeroReves2);
        // Comparación dígito a dígito
        while (numeroReves1 > 0 && numeroReves2 > 0) {
            auxDigito1 = numeroReves1 % 10;
            if (auxDigito1 % 2 == 0){
                numeroPar = (numeroPar * 10) + (auxDigito1);
            } else {
                numeroImpar = (numeroImpar * 10) + (auxDigito1);
            }
            auxDigito2 = numeroReves2 % 10;
            if (auxDigito2 % 2 == 0){
                numeroPar = (numeroPar * 10) + (auxDigito2);
            } else {
                numeroImpar = (numeroImpar * 10) + (auxDigito2);
            }
            numeroReves1 /= 10;
            numeroReves2 /= 10;
        }
        System.out.println("Número formado por los dígitos pares: " + numeroPar);
        System.out.println("Número formado por los dígitos impares: " + numeroImpar);
        sc.close();
    }
}
