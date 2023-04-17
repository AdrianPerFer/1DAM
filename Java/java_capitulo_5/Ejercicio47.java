/*
 * 
 * Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han
 * encargado realizar un programa que pinte un 8 por pantalla usando la letra
 * M. Se pide al usuario la altura, que debe ser un número entero impar mayor
 * o igual que 5. Si el número introducido no es correcto, el programa deberá
 * mostrar un mensaje de error. A continuación se muestran algunos ejemplos.
 * La anchura de la figura siempre será de 6 caracteres.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura (impar mayor o igual a 5): ");
        int altura = sc.nextInt();
        if (altura < 5 || altura % 2 == 0) {
            System.out.println("Valor mínimo de altura impar mayor o igual a 5");
        } else {
            int i = 0;
            System.out.println("MMMMMM");
            for ( i = 1 ; i < altura / 2 ; i++ ){
                System.out.println("M    M");
            }
            System.out.println("MMMMMM");
            for ( i = 1 ; i < altura / 2 ; i++ ) {
                System.out.println("M    M");
            }
            System.out.println("MMMMMM");
        }
        sc.close();
    }
}
