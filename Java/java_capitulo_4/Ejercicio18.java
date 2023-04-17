/*
(づ ◕‿◕ )づ
    ************************************************************************************
    *                                                                                  *
    *         4.   Sentencia Condicional                                               *
    *                                                                                  *
    *         18.  Escribe un programa que diga cuál es la primera cifra de un número  *
    *              entero introducido por teclado. Se permiten números de 5 cifras.    *
    *                                                                                  *
    ************************************************************************************
    *                                                              |  |                *
    *                                                              |  |                *
    *                    @author Adrián Perogil Fernández        *      *              *
    *                                                             ******               *
    ************************************************************************************
*/
import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int primera_cifra = 0;
        System.out.println("Introduzca un número entero (5 cifras máximo): ");
        numero = sc.nextInt();
        if ( numero < 10 ) {
            primera_cifra = numero;
        }
        if (( numero >= 10 ) && ( numero < 100 )) {
            primera_cifra = numero / 10;
        }
        if (( numero >= 100 ) && ( numero < 1000 )) {
            primera_cifra = numero / 100;
        }
        if (( numero >= 1000 ) && ( numero < 10000 )) {
            primera_cifra = numero / 1000;
        }
        if ( numero >= 10000 ) {
            primera_cifra = numero / 10000;
        }
        System.out.println("La primera cifra es " + primera_cifra);
        sc.close();
    }
}
