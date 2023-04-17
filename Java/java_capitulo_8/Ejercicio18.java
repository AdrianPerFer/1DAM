/** 
 * Escribe un programa que pase de decimal a binario.
 * 
 * @author: Adrián Perogil Fernández
 */
import matematicas.Funciones;
import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número binario: ");
        int num = sc.nextInt();
        String binario = Integer.toBinaryString(num);
        System.out.println(binario);
        sc.close();
    }
}
