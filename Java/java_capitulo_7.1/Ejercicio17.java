/*
 *
 * Escribe un programa que muestre por pantalla un array de 10 números enteros
 * generados al azar entre 0 y 100. A continuación, el programa debe pedir un
 * número al usuario. Se debe comprobar que el número introducido por teclado
 * se encuentra dentro del array, en caso contrario se mostrará un mensaje por
 * pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
 * correctamente. A continuación, el programa rotará el array hacia la derecha
 * las veces que haga falta hasta que el número introducido quede situado en la
 * posición 0 del array. Por último, se mostrará el array rotado por pantalla.
 *
 * @author: Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numero1 = new int [10];
        int numero2;
        int numero_random;
        boolean on = false;
        for (int i = 0; i < numero1.length; i++) {
            numero_random = (int)(Math.random()*101);
            numero1[i] = numero_random;
        }
        for (int i = 0; i < numero1.length; i++) {
            System.out.print(numero1[i] + " ");
        }
        do {
            System.out.println("\nIntroduce un número: ");
            numero2 = sc.nextInt();
            for (int i = 0; i < numero1.length; i++) {
                if (numero2 == numero1[i]){
                    on = true;
                }
            }
        } while(!on);
        while (numero1[0] != numero2) {
            int aux = numero1[9];
            for (int i = 9; i > 0; i--) {
                numero1[i] = numero1[i -1];
            }
            numero1[0] = aux;
        }
        for (int i = 0; i < numero1.length; i++) {
            System.out.print(numero1[i] + " ");
        }
        sc.close();
    }
}
