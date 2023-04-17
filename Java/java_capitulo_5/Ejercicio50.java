/*
 * 
 * Una empresa de cartelería nos ha encargado un programa para realizar uno de
 * sus diseños. Debido a los acontecimientos que han tenido lugar en Cataluña
 * durante el 2018, han recibido muchos pedidos del cartel que muestra el número
 * 155. Realiza un programa que pinte el número 155 mediante asteriscos. Al
 * usuario se le pedirán dos datos, la altura del cartel y el número de espacios
 * que habrá entre los números. La altura mínima es 5. La anchura de los números
 * siempre es la misma. La parte superior de los cincos también es siempre igual.
 * La parte inferior del 5 sí que varía en función de la altura.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura (mínimo 5): ");
        int altura = sc.nextInt();
        System.out.println("Introduzca el espacio entre números (mínimo 1): ");
        int espacios = sc.nextInt();
        if (altura < 5 || espacios < 1) {
            System.out.println("Altura mínima 5 y espaciado 1");
        } else {
            for ( int i = 1 ; i <= altura ; i++ ) {
                System.out.print("*");
                // espacios entre el primer y el segundo número
                for ( int i2 = 1 ; i2 <= espacios ; i2++ ) {
                    System.out.print(" ");
                }
                if (i == 1 || i == 3 || i == altura) {
                    System.out.print("****");
                } else if (i == 2) {
                    System.out.print("*   "); 
                } else if (i > 3 && i < altura) {
                    System.out.print("   *");
                }
                // espacios entre el segundo y el tercer número
                for ( int i2 = 1 ; i2 <= espacios ; i2++ ) {
                    System.out.print(" ");
                }
                if (i == 1 || i == 3 || i == altura) {
                    System.out.print("****");
                } else if (i == 2) {
                    System.out.print("*   "); 
                } else if (i > 3 && i < altura) {
                    System.out.print("   *");
                }
                System.out.println("");
            }
        }
        sc.close();
    }
}
