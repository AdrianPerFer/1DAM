/*
(づ ◕‿◕ )づ
    ************************************************************************************
    *                                                                                  *
    *         3.   Lectura de datos desde teclado                                      *
    *                                                                                  *
    *         9.   Escribe un programa que calcule el volumen de un cono según         *
    *              la fórmula V = (1/3)πr^2h                                           *
    *                                                                                  *
    ************************************************************************************
    *                                                              |  |                *
    *                                                              |  |                *
    *                    @author Adrián Perogil Fernández        *      *              *
    *                                                             ******               *
    ************************************************************************************
*/
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Variable "Scanner"
        Scanner sc = new Scanner (System.in);
        // Variable "height", "radius"
        System.out.print("Please, enter the height (cm): ");
        double height = sc.nextDouble();
        System.out.print("Please, enter the radius (cm): ");
        double radius = sc.nextDouble();
        // Variable "volume"
        double volume = ( 1.0 / 3.0 ) * Math.PI * Math.pow(radius, 2) * height; 
        // Output
        System.out.println("The volume of the cone is: " + volume + " cm³.");
        // Scanner closed
        sc.close();
    }
}