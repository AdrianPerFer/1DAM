/*
(づ ◕‿◕ )づ
    ************************************************************************************
    *                                                                                  *
    *         4.   Sentencia Condicional                                               *
    *                                                                                  *
    *         13.  Escribe un programa que ordene tres números enteros introducidos    *
    *              por teclado.                                                        *
    *                                                                                  *
    ************************************************************************************
    *                                                              |  |                *
    *                                                              |  |                *
    *                    @author Adrián Perogil Fernández        *      *              *
    *                                                             ******               *
    ************************************************************************************
*/
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        int aux;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce de 1 en 1 los tres numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }

        if (b > c) {
            aux = b;
            b = c;
            c = aux;
        }

        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }

        System.out.println("Los números ordenados de menor a mayor son " + a + ", " + b + " y " + c + ".");
        sc.close();
    }
}
