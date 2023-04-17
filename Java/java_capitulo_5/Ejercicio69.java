/*
 * 
 * Realiza un programa que pinte una pirámide maya. Por los lados, se trata
 * de una pirámide normal y corriente. Por el centro se van pintando líneas de
 * asteriscos de forma alterna (empezando por la superior): la primera se pinta,
 * la segunda no, la tercera sí, la cuarta no, etc. La terraza de la pirámide siempre
 * tiene 6 asteriscos, por tanto, las líneas centrales que se añaden a la pirámide
 * normal tienen 4 asteriscos. El programa pedirá la altura. Se supone que el
 * usuario introducirá un número entero mayor o igual a 3; no es necesario
 * comprobar los datos de entrada.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura: ");
        int altura = sc.nextInt();
        int espacio = 4;
        for ( int i = 1 ; i <= altura ; i++ ) {
            for ( int i2 = altura - i - 1 ; i2 >= 0 ; i2-- ) {
                System.out.print(" ");
            }
            for ( int i2 = i ; i2 >= 0 ; i2-- ) {
                System.out.print("*");
            }
            for ( int i2 = espacio ; i2 > 0 ; i2-- ) {
                if (i % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            for ( int i2 = i ; i2 >= 0 ; i2-- ) {
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}