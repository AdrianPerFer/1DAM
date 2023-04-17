/*
(づ ◕‿◕ )づ
    ************************************************************************************
    *                                                                                  *
    *         4.   Sentencia Condicional                                               *
    *                                                                                  *
    *         22.  Realiza un programa que, dado un día de la semana (l - v) y una     *
    *              hora (horas y minutos), calcule cuántos minutos faltan para el fin  *
    *              de semana. Se considerará que el fin de semana comienza el viernes  *
    *              a las 15:00h. Se da por hecho qe el usuario introducirá un día y    *
    *              hora correctos, anteerior al viernes a las 15:00h.                  *
    *                                                                                  *
    ************************************************************************************
    *                                                              |  |                *
    *                                                              |  |                *
    *                    @author Adrián Perogil Fernández        *      *              *
    *                                                             ******               *
    ************************************************************************************
*/
import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un día de la semana (de lunes a viernes): ");
        String dia = sc.next();
        int numeroDia = 0;
        switch(dia) {
            case "lunes":
                numeroDia = 0;
                break;
            case "martes":
                numeroDia = 1;
                break;
            case "miércoles":
            case "miercoles":
                numeroDia = 2;
                break;
            case "jueves":
                numeroDia = 3;
                break;
            case "viernes":
                numeroDia = 4;
                break;
            default:
                System.out.println("Día introducido incorrecto");
        }
        System.out.println("Introduce la hora: ");
        int horas = sc.nextInt();
        System.out.println("Introduce los minutos: ");
        int minutos = sc.nextInt();
        int total_minutos = (4 * 24 * 60) + (15 * 60);
        int actual_minutos = (numeroDia * 24 * 60) + (horas * 60) + minutos;

        System.out.println("Faltan " + (total_minutos - actual_minutos) + " minutos para el fin de semana.");
        sc.close();
    }
}
