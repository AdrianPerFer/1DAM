/*
 * 
 * Escribe un programa que pinte por pantalla la letra V. El ancho del palo de
 * la V es siempre de 3 asteriscos. El usuario debe introducir la altura. La altura
 * mínima es de 3 pisos. Si el usuario introduce una altura menor, el programa
 * debe mostrar un mensaje de error.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;
        do {
            System.out.println("Introduce la altura: ");
            altura = sc.nextInt();
            if ( altura < 3 ) {
                System.out.println("Introduzca una altura mínima de 3");
            }
        } while (altura < 3);
        int auxAltura = 0;
        int i = 0;
        int espacioGrande = ((altura * 2) - 2);
        int espacioDelante = 0;
        while (auxAltura < altura) {
            for ( i = 1 ; i <= espacioDelante; i++ ) {
                System.out.print(" ");
            }
            System.out.print("***");
            for ( i = 0 ; i < espacioGrande; i++){
                System.out.print(" ");
            }
            System.out.println("***");
            espacioDelante++;
            auxAltura++;
            espacioGrande -= 2;
        }
        sc.close();
    }    
}
