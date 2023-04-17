/*
(づ ◕‿◕ )づ
    ************************************************************************************
    *                                                                                  *
    *         4.   Sentencia Condicional                                               *
    *                                                                                  *
    *         6.   Realiza un programa que calcule el tiempo que tardará en caer un    *
    *              objeto desde una altura h.                                          *
    *              t = raiz(2h/g) siendo g = 9.81 m/s2                                 *
    *                                                                                  *
    ************************************************************************************
    *                                                              |  |                *
    *                                                              |  |                *
    *                    @author Adrián Perogil Fernández        *      *              *
    *                                                             ******               *
    ************************************************************************************
*/
import java.util.Scanner;
public class Ejercicio6 {
    final static double g = 9.81;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura (metros) desde la que cae el objeto: ");
        double h = sc.nextDouble();
        double s = Math.sqrt(2 * h / g);
        System.out.printf("El objeto tarda %.2f segundos en caer.\n", s);
        sc.close();
    }
}
