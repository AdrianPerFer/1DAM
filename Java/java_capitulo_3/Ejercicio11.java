/*
(づ ◕‿◕ )づ
    ************************************************************************************
    *                                                                                  *
    *         3.   Lectura de datos desde teclado                                      *
    *                                                                                  *
    *         11.   Realiza un conversor de Kb a Mb                                    *
    *                                                                                  *
    ************************************************************************************
    *                                                              |  |                *
    *                                                              |  |                *
    *                    @author Adrián Perogil Fernández        *      *              *
    *                                                             ******               *
    ************************************************************************************
*/
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        // Variable "Scanner"
        Scanner sc = new Scanner (System.in);
        // Variable "kb"
        System.out.print("Please, enter the number of Kb: ");
        double kb = sc.nextInt();
        // Variable "mb"
        double mb = kb / 1024; 
        // Output
        System.out.println(kb + " Kb is " + mb + " Mb.");
        // Scanner closed
        sc.close();
    }
}