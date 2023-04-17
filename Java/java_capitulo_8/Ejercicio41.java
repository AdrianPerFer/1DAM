/**
 * 
 * Realiza un programa que pinte un triángulo relleno tal como se muestra en
 * los ejemplos. El usuario debe introducir la altura de la figura. Este ejercicio
 * ya se realizó en el tema de bucles, ahora se trata de usar una función para
 * que la implementación sea más sencilla. Por ejemplo, se puede crear una
 * función linea(char caracter, int repeticiones) que pinte una línea con el carácter
 * especificado.
 * 
 * Ejemplo 1:
 * Introduzca la altura de la figura: 8
 * ********
 * *******
 * ******
 * *****
 * ****
 * ***
 * **
 * *
 * 
 * @author Adrián Perogil Fernández
 * 
 */

import java.util.Scanner;

public class Ejercicio41 {
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
        for (int i = altura; i > 0 ; i--) {
            System.out.println(linea(caracter, i));
        }
        sc.close();
    }
}
