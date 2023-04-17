/*
 * 
 * Realiza un programa que calcule las horas transcurridas entre
 * dos horas de dos días de la semana. No se tendrán en cuenta los
 * minutos ni los segundos. El día de la semana se puede pedir como
 * un número (del 1 al 7) o como una cadena (de "lunes" a "domingo").
 * Se debe comprobar que el usuario introduce los datos correctamente
 * y que el segundo día es posterior al primero.
 * 
 * Ejemplo:
 * Por favor, introduzca la primera hora.
 * Día: lunes
 * Hora: 18
 * Por favor, introduzca la segunda hora.
 * Día: martes
 * Hora: 20
 * Entre las 18:00h del lunes y las 20:00h del martes hay 26 hora/s.
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio30 {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        int auxDia = 0;
        int auxDia2 = 0;
        System.out.print("Introduce un día de la semana (1 - 7): ");
        int dia1 = sc.nextInt();
        System.out.print("Introduce la hora deseada (0 - 24): ");
        int hora1 = sc.nextInt();
        System.out.print("Introduce otro día de la semana (1 - 7): ");
        int dia2 = sc.nextInt();
        System.out.print("Introduce la hora deseada (0 - 24): ");
        int hora2 = sc.nextInt();
        int horas = 24 - hora1 + hora2;
        if( dia1 < 1 || dia1 > 7 || dia2 < 1 || dia2 > 7 || dia1 > dia2 ){
            System.out.println("Días incorrectos");
        } else {
            auxDia = dia1;
            auxDia2 = dia2;
            while(auxDia + 1 < auxDia2){
                horas = horas + 24;
                auxDia++;
            }
            System.out.print("Entre las " + hora1 + " del " + dia1 + " y las " + hora2 + " del " + dia2 + " hay " + horas + " horas");
        }
      sc.close();
    }
}