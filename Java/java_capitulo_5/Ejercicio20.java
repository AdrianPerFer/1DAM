/*
 * 
 * Igual que el ejercicio anterior pero esta vez se debe pintar una
 * pirámide hueca.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el caracter para la pirámide: ");
        String caracter = sc.nextLine();
        System.out.println("Introduzca la altura de la pirámide: ");
        int altura = sc.nextInt();
        for( int i = 1 ; i <= altura ; i++ ){
            for ( int espacio = i ; espacio <= altura ; espacio++ ) {
                System.out.print(" ");
            }
            for ( int i2 = 1 ; i2 <= (i * 2) - 1 ; i2++ ){
                if (i == altura || ( i2 == 1 || i2 == (i * 2) - 1)) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        sc.close();
    } 
}
