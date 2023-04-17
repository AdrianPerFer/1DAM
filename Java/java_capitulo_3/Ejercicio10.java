/*
(づ ◕‿◕ )づ
    ************************************************************************************
    *                                                                                  *
    *         3.   Lectura de datos desde teclado                                      *
    *                                                                                  *
    *         10.   Realiza un conversor de Mb a Kb                                    *
    *                                                                                  *
    ************************************************************************************
    *                                                              |  |                *
    *                                                              |  |                *
    *                    @author Adrián Perogil Fernández        *      *              *
    *                                                             ******               *
    ************************************************************************************
*/
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        // Variable "Scanner"
        Scanner sc = new Scanner (System.in);
        // Variable "mb"
        System.out.print("Please, enter the number of Mb: ");
        double mb = sc.nextInt();
        // Variable "kb"
        double kb = mb * 1024; 
        // Output
        System.out.println(mb + " Mb is " + kb + " Kb.");
        // Scanner closed
        sc.close();
    }
}