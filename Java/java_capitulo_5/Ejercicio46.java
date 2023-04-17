/*
 * 
 * Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
 * asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
 * que tanto la anchura como la altura sean mayores o iguales que 2, en caso
 * contrario se debe mostrar un mensaje de error.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura: ");
        int altura = sc.nextInt();
        System.out.println("Introduce la anchura: ");
        int anchura = sc.nextInt();
        if (altura < 2 || anchura < 2) {
            System.out.println("Valor mínimo de altura y anchura debe ser 2");
        } else {
            int i1 = 0;
            int i2 = 0;
            for ( i1 = 1 ; i1 <= anchura ; i1++ ) {
                System.out.print("* ");
            }
            System.out.println("");
            for ( i1 = 2 ; i1 < altura ; i1++) {
                for ( i2 = 1 ; i2 <= anchura ; i2++) {
                    if ( i2 == 1 || i2 == anchura ){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println("");
            }
            for ( i1 = 1 ; i1 <= anchura ; i1++ ) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
