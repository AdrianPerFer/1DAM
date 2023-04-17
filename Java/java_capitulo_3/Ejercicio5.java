/*
    ************************************************************************************
    *                                                                                  *
    *         3.   Lectura de datos desde teclado                                      *
    *                                                                                  *
    *         5.   Escribe un programa que calcule el área de un rectángulo.           *
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
        // Variable "Scanner"
        Scanner sc = new Scanner (System.in);
        // Variable "base", "height"
        System.out.print("Please, enter the base length (cm): ");
        int base = sc.nextInt();
        System.out.print("Enter the height (cm): ");
        int height = sc.nextInt();
        // Variable "rectangle_area"
        double rectangle_area = ( base * height );
        // Output
        System.out.println("The area of the rectangle is: " + rectangle_area + " cm2.");
        // Scanner closed
        sc.close();
    }
}