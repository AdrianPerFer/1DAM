/*
 * 
 * Escribe un programa que dados dos números, uno real (base) y un
 * entero positivo (exponente), saque por pantalla todas las potencias
 * con base el numero dado y exponentes entre uno y el exponente introducido.
 * No se deben utilizar funciones de exponenciación. Por ejemplo, si
 * introducimos el 2 y el 5, se deberán mostrar 2¹, 2², 2³, 2^4 y 2^5
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base del número: ");
        int base = sc.nextInt();
        System.out.println("Introduce el exponente del número: ");
        int exponente = sc.nextInt();
        double potencia = 1;
        for (int i = 1; i <= exponente; i++) {
            potencia = potencia * base;
            System.out.println(base + "^" + i + " = " + potencia);
        }
        sc.close();
    }
}
