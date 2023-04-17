/*
 * 
 * Realiza un programa que nos diga cuántos digitos tiene un número introducido por teclado.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
 public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        long numero = sc.nextInt();
        long aux = numero;
        int i = 0;
        do {
            i++;
            numero = numero / 10;
        } while (numero != 0);
        System.out.println(aux + " tiene " + i + " cifras.");
        sc.close();
    }
 }