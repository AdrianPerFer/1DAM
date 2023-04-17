/*
 * 
 * Escribe un programa que muestre en tres columnas, el cuadrado y
 * el cubo de los 5 primeros números enteros a partir de uno que se
 * introduce por teclado.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int numero = sc.nextInt();
        for(int i = numero;i < numero + 5;i++) {
            System.out.printf("%3d %6d %9d\n",i ,i*i ,i*i*i);
        }
        sc.close();
    }
}