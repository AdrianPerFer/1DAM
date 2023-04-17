/*
    ************************************************************************************
    *                                                                                  *
    *         3.   Lectura de datos desde teclado                                      *
    *                                                                                  *
    *         7.   Escribe un programa que calcule el total de una factura a           *
    *              partir de la base imponible.                                        *
    *                                                                                  *
    ************************************************************************************
    *                                                              |  |                *
    *                                                              |  |                *
    *                    @author Adrián Perogil Fernández        *      *              *
    *                                                             ******               *
    ************************************************************************************
*/
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Variable "Scanner"
        Scanner sc = new Scanner (System.in);
        // Variable "tax_base"
        System.out.print("Please, enter the tax base: ");
        int tax_base = sc.nextInt();
        // Variable "IVA", "taxbaseIVA"
        double IVA = tax_base * 0.21;
        double taxbaseIVA = tax_base * 1.21;
        // Outputs
        System.out.println("Tax base: " + tax_base);
        System.out.println("IVA: " + IVA);
        System.out.println("Total: " + taxbaseIVA);
        // Scanner closed
        sc.close();
    }
}