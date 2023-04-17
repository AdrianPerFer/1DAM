/*
 * 
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 * muestre por pantalla separados por espacios. El programa pedirá entonces por
 * teclado dos valores y a continuación cambiará todas las ocurrencias del primer
 * valor por el segundo en la lista generada anteriormente. Los números que se
 * han cambiado deben aparecer entrecomillados.
 * 
 * @author: Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[100];
        int i;
        for (i = 0; i < 100; i++) {
            numero[i] = (int)(Math.random()*21);
            System.out.print(numero[i] + " ");
        }
        System.out.print("\nIntroduzca el primer valor: ");
        int valor1 = sc.nextInt();
        System.out.print("Introduzca el segundo valor: ");
        int valor2 = sc.nextInt();
        System.out.println();

        for (i = 0; i < 100; i++) {
            if (numero[i] == valor1){
                numero[i] = valor2;
                System.out.print("\"" + numero[i] + "\"  ");
            } else {
                System.out.print(numero[i] + "  ");
            }
        }
        sc.close();
    }
}
