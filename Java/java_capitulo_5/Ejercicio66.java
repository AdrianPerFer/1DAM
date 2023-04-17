/*
 * 
 * La Guardia Civil de Tráfico nos ha encargado un programa que pinte una señal
 * para desviar el tráfico hacia la derecha. La señal es una doble flecha con el
 * vértice apuntando a la derecha. Se pide al usuario la altura de la figura, que
 * debe ser un número impar mayor o igual que 3. La distancia entre cada flecha
 * de asteriscos es siempre de 4 espacios. Si la altura introducida por el usuario
 * no es un número impar mayor o igual que 3, el programa debe mostrar un
 * mensaje de error.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura (impar mayor o igual a 3): ");
        int altura = sc.nextInt();
        if (altura < 3 || altura % 2 == 0) {
            System.out.println("Valor mínimo de altura impar mayor o igual a 3");
        } else {
            int parteAbajo = altura / 2;
            int espacio = 0;
            int espacioInterior = 3;
            int i = 0;
            // Parte de arriba
            while (parteAbajo >= i) {
                for ( int i2 = 1 ; i2 <= espacio ; i2++ ) {
                    System.out.print(" ");
                }
                for ( int i2 = 0 ; i2 < 1 ; i2++ ) {
                    System.out.print("*");
                }
                for ( int i2 = 1 ; i2 <= espacioInterior ; i2++ ) {
                    System.out.print(" ");
                }
                for ( int i2 = 0 ; i2 < 1 ; i2++ ) {
                    System.out.print("*");
                }
                System.out.println("");
                i++;
                espacio++;
            }
            // Parte de abajo
            int espacio2 = espacio - 2;
            int i2 = 0;
            while ( parteAbajo > i2 ) {
                for ( int i3 = 1 ; i3 <= espacio2 - i2; i3++ ) {
                    System.out.print(" ");
                }
                for ( int i3 = 0 ; i3 < 1 ; i3++ ) {
                    System.out.print("*");
                }
                for ( int i3 = 1 ; i3 <= espacioInterior ; i3++ ) {
                    System.out.print(" ");
                }
                for ( int i3 = 0 ; i3 < 1 ; i3++ ) {
                    System.out.print("*");
                }
                System.out.println("");
                i2++;
                espacio--;
            }
        }
        sc.close();
    }
}
