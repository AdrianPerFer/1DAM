/*
 * 
 * Escribe un programa que pida una base y un exponente (entero positivo)
 * y que calcule la potencia.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la base: ");
        int base = sc.nextInt();
        System.out.println("Introduzca un exponente: ");
        int exponente = sc.nextInt();
        double potencia = 1;
        //double potencia = Math.pow(base, exponente);
        if (exponente == 0) {
            potencia = 1;
        } else if (exponente > 0) {
            for(int i = 0; i < exponente; i++) {
                potencia *= base;
            }
        } else if (exponente < 0) {
            for (int i = 0;i < -exponente; i++) {
                potencia *= base;
            }
            potencia = 1 / potencia;
        }
        System.out.println("La potencia con base " + base + " y exponente " + exponente + " es: " + potencia);
        sc.close();
    }
}
