/*
(づ ◕‿◕ )づ
    ************************************************************************************
    *                                                                                  *
    *         3.   Lectura de datos desde teclado                                      *
    *                                                                                  *
    *         12.  Realiza un programa que calcule la nota que hace falta              *
    *              sacar en el segundo examen de la asignatura **Programación**        *
    *              para obtener la media deseada. Hay que tener en cuenta que          *
    *              la nota del primer examen cuenta el 40% y la del segundo un 60%     *
    *                                                                                  *
    ************************************************************************************
    *                                                              |  |                *
    *                                                              |  |                *
    *                    @author Adrián Perogil Fernández        *      *              *
    *                                                             ******               *
    ************************************************************************************
*/
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        // Variable "Scanner"
        Scanner sc = new Scanner (System.in);
        // Variable "nota_examen_1", "nota_examen_2", "notaFinal"
        System.out.println("Introduce la nota el primer examen: ");
        double nota_examen_1 = sc.nextDouble();
        System.out.println("¿Qué nota quieres sacar en el trimestre?");
        double notaFinal = sc.nextDouble();
        double nota_examen_2 = ((notaFinal * 100) - (nota_examen_1 * 40)) / 60; 
        // Output
        System.out.println("Para tener un " + (int)notaFinal + " en el trimestre necesitas sacar un " + nota_examen_2 + " en el segundo examen.");
        // Scanner closed
        sc.close();
    }
}