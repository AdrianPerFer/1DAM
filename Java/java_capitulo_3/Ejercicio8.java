/*
    ************************************************************************************
    *                                                                                  *
    *         3.   Lectura de datos desde teclado                                      *
    *                                                                                  *
    *         8.   Escribe un programa que calcule el salario semanal de un            *
    *              empleado en base a las horas trabajadas, a razón de 12 euros        *
    *              la hora.                                                            *
    *                                                                                  *
    ************************************************************************************
    *                                                              |  |                *
    *                                                              |  |                *
    *                    @author Adrián Perogil Fernández        *      *              *
    *                                                             ******               *
    ************************************************************************************
*/
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Variable "Scanner"
        Scanner sc = new Scanner (System.in);
        // Variable "hours"
        System.out.print("Please, enter the number of hours worked during the week: ");
        int hours = sc.nextInt();
        // Variable "salary"
        int salary = hours * 12; 
        // Output
        System.out.println("Your weekly salary is: " + salary + " euros.");
        // Scanner closed
        sc.close();
    }
}