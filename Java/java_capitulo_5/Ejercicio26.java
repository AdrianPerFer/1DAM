/*
 * 
 * Realiza un programa que pida primero un número y a continuación un dígito. El programa
 * nos debe dar la posición (o posiciones) contando de izquierda a derecha que ocupa ese dígito
 * el número introducido.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducza un número: ");
        int numero = sc.nextInt();
        System.out.println("Introducza un dígito: ");
        int digito = sc.nextInt();
        int aux = numero;
        int numeroReves = 0;
        int auxDigito = 0;
        int i = 0;
        while (aux > 0) {
            /*
             * La secuencia sería (1234 por ejemplo): 
             * 0 + 4
             * (4 * 10) + 3 = 43
             * 430 + 2 = 432
             * 4320 + 1 = 4321
             */
            numeroReves = (numeroReves * 10) + ( aux % 10 );
            aux /= 10;
        }
        while (numeroReves > 0) {
            /*
             * Al tener ahora 4321, si vamos sacando el módulo, aunque siga siendo de derecha a izquierda, a los ojos del usuario, parece de izquierda a derecha. 
             */
            auxDigito = numeroReves % 10;
            i++;
            if (auxDigito == digito){
                System.out.println("Posición " + i + ", del número " + numero + " coincide con el digito " + digito + " introducido.");
            }
            numeroReves /= 10;
        }
        sc.close();
    }
}
