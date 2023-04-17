/* 
 * Escribe un programa que pase de binario a decimal.
 * 
 * @author: Adrián Perogil Fernández
 */
import matematicas.Funciones;
import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número binario: ");
        String num = sc.nextLine();
        int decimalConvertido = Integer.parseInt(num, 2);
        System.out.println(decimalConvertido);
        sc.close();
    }
}
