/*
 * 
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un
 * número leído por teclado.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int numero1 = sc.nextInt();
        int i = 0;
        int sumaTotal = 0;
        int multiplo = 0;
        System.out.println("Múltiplos de 3 desde 1 hasta " + numero1 + ":");
        for ( int i2 = 1 ; i2 <= numero1 ; i2++ ) {
            multiplo = 3 * i2;
            sumaTotal += multiplo;
            i++;
            System.out.print(multiplo + " ");
        }
        System.out.println("");
        System.out.println("Conteo de múltiplos: " + i);
        System.out.println("La suma total es: " + sumaTotal);
        sc.close();
    }
}
