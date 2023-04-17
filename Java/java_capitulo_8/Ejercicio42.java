/**
 * 
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para
 * pintar las líneas.
 * Ejemplo 1:
 * Introduzca la altura de la figura: 8
 * *********
 * *     *
 * *    *
 * *   *
 * *  *
 * * *
 * **
 * *
 * 
 * @author Adrian Perogil Fernandez
 * 
 */
import java.util.Scanner;

public class Ejercicio42 {
    public static String linea(char caracter, int repeticiones){
        String resultado = "";
        for (int i = 0; i < repeticiones; i++) {
            resultado += caracter;
        }
        return resultado;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura: ");
        int altura = sc.nextInt();
        System.out.println("Elige un caracter: ");
        char caracter = sc.next().charAt(0);

        // Primera línea
        System.out.println(linea(caracter, altura));

        for (int i = 1; i < altura ; i++) {
            // *.....
            System.out.print(caracter + linea(' ', altura - i - 2));
            // 7 < 8 - 1 == false (No entra, el asterisco final se pinta en el prin de arriba)
            if (i < altura - 1) {
                // *
                System.out.println("*");
            }
        }
        sc.close();
    }
}