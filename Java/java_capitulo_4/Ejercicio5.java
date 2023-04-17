/*
(づ ◕‿◕ )づ
    ************************************************************************************
    *                                                                                  *
    *         4.   Sentencia Condicional                                               *
    *                                                                                  *
    *         5.   Realiza un programa que resuelva una ecuación de primer grado       *
    *              (del tipo ax + b = 0)                                               *
    *                                                                                  *
    ************************************************************************************
    *                                                              |  |                *
    *                                                              |  |                *
    *                    @author Adrián Perogil Fernández        *      *              *
    *                                                             ******               *
    ************************************************************************************
*/
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el valor de a: ");
        double a = sc.nextDouble();
        System.out.println("Introduzca el valor de b: ");
        double b = sc.nextDouble();
        if (a == 0) {
            System.out.println("Esa ecuación no tiene solucion");
        } else {
            System.out.println("x = " + (-b/a));
        }
        sc.close();
    }
}
