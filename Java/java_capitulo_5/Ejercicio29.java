/*
 * 
 * Escribe un programa que muestre por pantalla todos los números enteros
 * positivos menores, a uno leído por teclado que no sean divisibles entre otro
 * también leído de igual forma.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número grande: ");
        int numeroGrande = sc.nextInt();
        System.out.print("Introduzca un número pequeño: ");
        int numeroPequeno = sc.nextInt();
        System.out.print("Los números enteros positivos menores que " + numeroGrande );
        System.out.println(" que no son divisibles entre " + numeroPequeno + " son los siguientes: ");
        for (int i = 1; i < numeroGrande; i++) {
            if ((i % numeroPequeno) != 0) {
            // i es 1 % 4 por ejemplo != 0, es decir, si el resto de 1/4 es diferente a 0, se escribe, si es 0, no se escribe.
            System.out.print(i + " ");
            }
        }
        sc.close();
    }
}