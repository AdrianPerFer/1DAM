/*
 * 
 * Escribe un programa que pinte por pantalla la letra A. El usuario debe introducir
 * la altura total y la fila en la que debe aparecer el palito horizontal (contando
 * desde el vértice). La altura mínima es de 3 pisos. La fila donde va el palito
 * horizontal debe ser mayor que 1 y menor que la altura total. Si el usuario
 * introduce algún dato incorrecto, el programa debe mostrar un mensaje de error.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura = 0;
        int palito = 0;
        do {
            System.out.print("Introduce una altura: ");
            altura = sc.nextInt();
            if (altura < 3) {
                System.out.println("Por favor, introduzca un número mayor que 3");
            }
            System.out.print("Introduce la fila donde colocar el palo horizontal ( entre 2 y " + (altura - 1) + " ): ");
            palito = sc.nextInt();
            if ( ( palito < 2 ) || ( palito >= altura ) ) {
                System.out.println("Fila errónea");
            }
        } while (altura < 3 || ( palito < 2 ) || ( palito >= altura ) ) ;
        
        for ( int i = 1 ; i <= altura ; i++) {
            for ( int i2 = 1 ; i2 <= altura - i ; i2++ ) {
                System.out.print(" ");
            }
            if ( i == palito ) {
                for ( int i3 = 1 ; i3 <= (i * 2) - 1 ; i3++ ) {
                    System.out.print("*");
                }
            } else {
                for ( int i2 = 1 ; i2 <= (i * 2) - 1 ; i2++ ) {
                    if ( (i2 == 1 || i2 == (i * 2) - 1) ) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}
