/*
    ************************************************************************************
    *                                                                                  *
    *         3.   Lectura de datos desde teclado                                      *
    *                                                                                  *
    *         4.   Escribe un programa que sume, reste, multiplique y divida           *
    *              dos números introducidos por teclado.                               *
    *                                                                                  *
    ************************************************************************************
    *                                                              |  |                *
    *                                                              |  |                *
    *                    @author Adrián Perogil Fernández        *      *              *
    *                                                             ******               *
    ************************************************************************************
*/
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Variable "Scanner"
        Scanner sc = new Scanner (System.in);
        // Variable "number_1", "number_2"
        System.out.print("Please, insert the first number: ");
        int number_1 = sc.nextInt();
        System.out.print("Now the second number: ");
        int number_2 = sc.nextInt();
        // Variable "addition", "subtraction", "multiplication", "division"
        int addition = number_1 + number_2;
        int subtraction = number_1 - number_2;
        int multiplication = number_1 * number_2;
        int division = number_1 / number_2;
        // Outputs
        System.out.println(number_1 + " + " + number_2 + " is: " + addition);
        System.out.println(number_1 + " - " + number_2 + " is: " + subtraction);
        System.out.println(number_1 + " * " + number_2 + " is: " + multiplication);
        System.out.println(number_1 + " / " + number_2 + " is: " + division);
        // Scanner closed
        sc.close();
    }
}