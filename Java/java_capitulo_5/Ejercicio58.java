/*
 * 
 * Realiza un programa que calcule la media de los dígitos que contiene un número
 * entero introducido por teclado.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        long numero = sc.nextLong();
        long aux = numero;
        long digito = 0;
        double sumaTotal = 0;
        double i = 0;
        while (aux > 0) {
            digito = aux % 10;
            sumaTotal += digito;
            i++;
            aux /= 10;
        }
        double media = sumaTotal / i;
        System.out.println("La media de sus dígitos es " + media);
        sc.close();
    }
}
