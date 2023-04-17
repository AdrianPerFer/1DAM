/*
 * 
 * Escribe un programa que diga cuántos pares y cuántos dígitos impares
 * hay dento de un número. Se recomienda usar long en luegar de int ya que el
 * primero admite números mas largos.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        long numero = sc.nextLong();
        long digito = 0;
        long aux = numero;
        int par = 0;
        int impar = 0;
        while (numero > 0) {
            digito = numero % 10;
            if (digito % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            numero /= 10;
        }
        System.out.println(aux + " tiene " + par + " digitos pares y " + impar + " digitos impares.");
        sc.close();
    }
}
