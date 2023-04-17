/*
    ************************************************************************************
    *                                                                                  *
    *         3.   Lectura de datos desde teclado                                      *
    *                                                                                  *
    *         2.   Realiza un conversor de euros a pesetas. La cantidad de euros       *
    *              que se quiere convertir debe ser introducida por teclado.           *
    *                                                                                  *
    ************************************************************************************
    *                                                              |  |                *
    *                                                              |  |                *
    *                    @author Adrián Perogil Fernández        *      *              *
    *                                                             ******               *
    ************************************************************************************
*/
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Variable Scanner
        Scanner sc = new Scanner(System.in);
        // Variable "euros"
        System.out.print("Introduzca la cantidad de euros: ");
        double euros = sc.nextDouble();  
        int pesetas = (int) (euros * 166.386); 
        // Output
        System.out.println(euros + " euros son " + pesetas + " pesetas.");
        sc.close();
    }
}