/*
 * 
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura.
 *
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura del triángulo: ");
        int altura = sc.nextInt();
        for ( int i = 0 ; i < altura ; i++ ) {
            System.out.print("*");
        }
        System.out.println("");
        for ( int i = 1 ; i < altura - 1 ; i++ ) {
            for ( int espacio = altura ; espacio >= altura - i + 1 ; espacio-- ) {
                System.out.print(" ");
            }
            System.out.print("*");
            for ( int i2 = 1 ; i2 <= altura - i - 2 ; i2++ ) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for ( int i = 0 ; i < altura - 1; i++ ) {
            System.out.print(" ");
        }
        System.out.println("*");
        sc.close();
    }
}
