/*
 * 
 * Escribe un programa que pinte por pantalla un par de calcetines, de los que
 * se ponen al lado del árbol de Navidad para que Papá Noel deje sus regalos.
 * El usuario debe introducir la altura. Suponemos que el usuario introduce una
 * altura mayor o igual a 4. Observa que la talla de los calcetines y la distancia
 * que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio60 {
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
        // Primer parte
        for ( int i = 2 ; i < altura ; i++ ) {
            System.out.println("***     ***");
        }
        // Segunda parte
        System.out.println("******  ******");
        System.out.println("******  ******");
        sc.close();
    }
}
