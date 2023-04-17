/*
 * 
 * Escribe un programa que diga si un número introducido por teclado
 * es o no primo. Un número primo es aque que sólo es divisible entre
 * él mismo y la unidad.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero = sc.nextInt();
        int i2 = 0;
        for( int i = 1 ; i <= numero ; i++ ){
            if (numero % i == 0) {
                i2++;
            }
        }
        if ( i2 == 2 ) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }
        sc.close();
    }
}
