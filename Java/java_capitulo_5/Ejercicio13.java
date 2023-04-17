/*
 * 
 * Escribe un programa que lea una lista de diez números y determine
 * cuántos son positivos, y cuantos son negativos
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivo = 0;
        int negativo = 0;
        int neutro = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduzca un número: ");
            int numero = sc.nextInt();
            if (numero < 0) {
                negativo++;
            } else if (numero == 0) {
                neutro++;
            } else if (numero > 0) {
                positivo++;
            }
        }
        System.out.println("Has introducido un total de: ");
        System.out.print("Positivos: " + positivo);
        System.out.println("");
        System.out.print("Neutros: " + neutro);
        System.out.println("");
        System.out.print("Negativos: " + negativo);
        sc.close();
    }
}
