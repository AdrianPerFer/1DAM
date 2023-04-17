/*
 * 
 * Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe
 * introducir la altura. En esa altura va incluida la estrella y el tronco. Suponemos
 * que el usuario introduce una altura mayor o igual a 4.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;
        do {
            System.out.println("Introduce la altura: ");
            altura = sc.nextInt();
            if ( altura < 4 ) {
                System.out.println("Introduzca una altura mínima de 4");
            }
        } while (altura < 4);
        altura = altura - 2 ;
        // Parte asterísco
        for ( int i = 1 ; i < altura ; i++ ) {
            System.out.print(" ");
        }
        System.out.println("*");
        // Parte media
        for ( int i = 1 ; i <= altura ; i++) {
            for ( int espacio = 1 ; espacio <= altura - i ; espacio++ ) {
                System.out.print(" ");
            }
            for ( int elevado = 1 ; elevado <= ( ( i * 2 ) - 1 ) ; elevado++ ) {
                if ( i == altura || (elevado == 1 || elevado == (2 * i) - 1)) {
                    System.out.print("^");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        // Tronco
        for ( int i = 1 ; i < altura ; i++ ) {
            System.out.print(" ");
        }
        System.out.println("Y");
        sc.close();
    }    
}
