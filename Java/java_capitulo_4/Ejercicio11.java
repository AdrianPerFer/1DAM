/*
(づ ◕‿◕ )づ
    ************************************************************************************
    *                                                                                  *
    *         4.   Sentencia Condicional                                               *
    *                                                                                  *
    *         11.  Escribe un programa que dada una hora determinada (h y m)           *
    *              calcule los segundos que faltan para llegar a la medianoche.        *
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca las horas: ");
        int hora = sc.nextInt();
        System.out.println("Introduzca los minutos: ");
        int minutos = sc.nextInt();
        int total_segundos = (hora * 3600) + (minutos * 60);
        int medianoche = (24 * 3600) + total_segundos;
        System.out.printf("Desde las %02d:%02d hasta la medianoche faltan %d segundos.", hora, minutos, medianoche);
        sc.close();
    }
}
