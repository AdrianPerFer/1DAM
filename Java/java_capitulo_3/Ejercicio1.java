/*
    ************************************************************************************
    *                                                                                  *
    *         3.   Lectura de datos desde teclado                                      *
    *                                                                                  *
    *         1.   Realiza un programa que pida dos números y que luego muestre        *
    *              el resultado de su multiplicación.                                  *
    *                                                                                  *
    ************************************************************************************
    *                                                              |  |                *
    *                                                              |  |                *
    *                    @author Adrián Perogil Fernández        *      *              *
    *                                                             ******               *
    ************************************************************************************
*/
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Variable Scanner
        Scanner sc = new Scanner(System.in);
        // Variable "number_1", "number_2"
        System.out.print("First number: ");
        int number_1 = sc.nextInt();
        System.out.print("Second number: ");
        int number_2 = sc.nextInt();    
        // Output
        System.out.println(number_1 + " * " + number_2 + " = " + number_1 * number_2);
        sc.close();
    }
}