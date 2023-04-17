/*
 * 
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
 * programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
 * mitad (división entera entre 2) de la altura más uno.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca la altura de la L: ");
            int altura = sc.nextInt();
            for ( int i = 1 ; i <= altura ; i++ ) {
                if ( i == altura) {
                    for ( int i2 = 1 ; i2 <= altura / 2 ; i2++ ) {
                        System.out.print("* ");
                    }
                }
                System.out.println("*");
            }
        sc.close();
    }
}
