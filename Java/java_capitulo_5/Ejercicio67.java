/*
 * 
 * Realiza un programa que pinte una escalera que va descendiendo de izquierda
 * a derecha. El programa pedirá el número de escalones y la altura de cada
 * escalón. La anchura de los escalones siempre es la misma: 4 asteriscos.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce cuantos escalones quieres: ");
        int cantidad = sc.nextInt();
        System.out.print("Introduce la altura de los escalones: ");
        int altura = sc.nextInt();
        for ( int i = 1 ; i <= cantidad ; i++ ) {
            for ( int i2 = 1 ; i2 <= altura ; i2++) {
                for ( int i3 = 1 ; i3 <= i ; i3++ ) {
                    System.out.print("****");
                }
                System.out.println("");
            }
        }
        sc.close();
    }
}
