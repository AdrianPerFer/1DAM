/*
 * 
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
 * números junto con la palabra “par” o “impar” según proceda.
 * 
 * @author: Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numero = new int [8];
        for (int i = 0; i < numero.length; i++) {
            System.out.print("Introduce un número: ");
            numero[i] = sc.nextInt();
        }
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 == 0) {
                System.out.println(numero[i] + " par");
            } else {
                System.out.println(numero[i] + " impar");
            }
        }
        sc.close();
    }
}
