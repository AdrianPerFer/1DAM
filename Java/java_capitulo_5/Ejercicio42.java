/*
 * 
 * Escribe un programa que pida un número entero positivo por teclado y que
 * muestre a continuación los 5 números consecutivos a partir del número
 * introducido. Al lado de cada número se debe indicar si se trata de un primo
 * o no.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int numero = sc.nextInt();
        int primo = 0;
        for ( int i = 1 ; i <= 5 ; i++ ) {
            for ( int i2 = 1 ; i2 <= numero ; i2++ ) {
                if (numero % i2 == 0) {
                    primo++;
                }
            }
            if (primo == 2) {
                System.out.println(numero + " es primo");
            } else {
                System.out.println(numero + " no es primo");
            }
            primo = 0;
            numero += 1;
        }
        sc.close();
    }
}
