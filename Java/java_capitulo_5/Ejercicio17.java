/*
 * 
 * Realiza un programa que sume los 100 números siguientes a un número entero positivo
 * introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es
 * un número positivo).
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
        int sumaTotal = 0;
        // Comprobación de errores
        if (numero < 0) {
            System.out.println("Por favor, introduzca un número entero positivo");
        }
        for ( int i = numero ; i < 100 + numero ; i++ ) {
            sumaTotal += i;
        }
        System.out.println("Suma total: " + sumaTotal);
        sc.close();
    }
}
