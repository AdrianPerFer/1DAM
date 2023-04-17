/*
    ************************************************************************************
    *                                                                                  *
    *         3.   Lectura de datos desde teclado                                      *
    *                                                                                  *
    *         6.   Escribe un programa que calcule el área de un triánguo              *
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
    public static void main(String[] args) {
        // Variable "Scanner"
        Scanner sc = new Scanner (System.in);
        // Variable "base", "height"
        System.out.print("Please, enter the base length (cm): ");
        int base = sc.nextInt();
        System.out.print("Enter the height (cm): ");
        int height = sc.nextInt();
        // Variable "triangle_area"
        double triangle_area = ( base * height ) / 2;
        // Output
        System.out.println("The area of the triangle is: " + triangle_area + " cm2.");
        // Scanner closed
        sc.close();
    }
}