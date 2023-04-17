/*
 * 
 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
 * programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
 * dos asteriscos menos en la base para simular la curvatura de las esquinas
 * inferiores.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura de la U: ");
        int altura = sc.nextInt();
        for ( int i = 1 ; i < altura ; i++ ) {
            System.out.print("* ");
            for ( int espacio = 2 ; espacio < altura ; espacio++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        System.out.print("  ");
        for ( int base = 2 ; base < altura ; base++ ){
            System.out.print("* ");
        }
        sc.close();
    }
}
