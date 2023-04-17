/*
 * 
 * Escribe un programa que muestre los n primeros términos de la
 * serie de Fibonacci. El primer término de la serie de Fibonacci
 * es 0, el segundo es 1 y el resto se calcula sumando los dos
 * anteriores, por lo que tendríamos que los términos son 0, 1, 1,
 * 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe
 * introducir por teclado.

 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cuantos numeros de la serie Fibonacci quieres mostrar: ");
        int numero = sc.nextInt();
        int numero1 = 0;
        int numero2 = 1;
        int aux;
        switch(numero){
            case 1:
                System.out.println("0");
                break;
            case 2:
                System.out.println("0 1");
                break;
            default:
                System.out.print("0 1");
                while (numero > 2) {
                    aux = numero1;
                    numero1 = numero2;
                    numero2 = aux + numero2;
                    System.out.print(" " + numero2);
                    numero--;
                }
        }
        sc.close();
    }
}
