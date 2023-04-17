
/*
 * 
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un número negativo
 * y nos diga cuantos números se han introducido, la media de los impares y el mayor de los pares,
 * el número negativo sólo se utiliza para indicar el final de la introducción de datos pero
 * no se incluye en el cómputo.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int totalNumeros = 0;
        int pares = 0;
        int impares = 0;
        int contadorImpares = 0;
        do {
            System.out.println("Introduce un número (un número negativo si quiere salir): ");
            numero = sc.nextInt();
            if (numero % 2 == 0) {
                if (numero > pares) {
                    pares = numero;
                }
            } else {
                impares += numero;
                contadorImpares++;
            }
            totalNumeros++;
        } while (numero >= 0);
        System.out.println(impares);
        System.out.println(contadorImpares);
        System.out.println("Números totales introducidos: " + totalNumeros);
        System.out.println("Número par mayor: " + pares);
        System.out.println("Media de impares: " + impares / contadorImpares);
        sc.close();
    }
}
