/*
    ************************************************************************************
    *                                                                                  *
    *         3.   Lectura de datos desde teclado                                      *
    *                                                                                  *
    *         3.   Realiza un conversor de pesetas a euros. La cantidad de pesetas     *
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

public class Ejercicio3 {
    public static void main(String[] args) {
        // Variable Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de pesetas: ");
        // Variable "pesetas", "euros"
        int pesetas = sc.nextInt();
        double euros = pesetas / 166.386;
        // Output
        System.out.printf("%d pesetas son %.3f euros. \n", pesetas, euros);
        sc.close();
    }
}