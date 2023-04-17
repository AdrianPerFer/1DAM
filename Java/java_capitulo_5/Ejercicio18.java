/*
 * 
 * Escribe un programa que obtenga los números enteros comprendidos entre dos números
 * introducidos por teclado y validados como distintos, el programa debe empezar por
 * el menos de los enteros introducidos e ir incrementando de 7 en 7.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;
        do {
            System.out.println("Introduce un número entero: ");
            numero1 = sc.nextInt();
            System.out.println("Introduce otro número entero: ");
            numero2 = sc.nextInt();
            // Captura de errores
            if (numero1 == numero2) {
                System.out.println("Por favor, introduzca un número entero que no sea igual");
            }
        } while (numero1 == numero2);
        int menor;
        int mayor;
        if (numero1 < numero2) {
            menor = numero1;
            mayor = numero2;
        } else {
            menor = numero2;
            mayor = numero1;
        }
        for ( int i = menor ; i <= mayor ; i+=7 ) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
