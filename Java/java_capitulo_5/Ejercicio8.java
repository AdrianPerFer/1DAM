/*
 * 
 * Muestra la tabla de multiplicar de un número intoducido por teclado.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número a multiplicar: ");
        int numero = sc.nextInt();
        for(int i = 1; i <= 10;i++) {
            int multiplicacion = numero * i;
            System.out.println(numero + " x " + i + " = " + multiplicacion);
        }
        sc.close();
    }
}
