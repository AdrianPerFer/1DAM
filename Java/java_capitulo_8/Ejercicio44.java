/**
 * 
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para
 * pintar las líneas.
 * 
 * 
 * @author Adrián Perogil Fernández
 * 
 */

 import java.util.Scanner;

 public class Ejercicio44 {
    public static String linea(char caracter, int repeticiones){
        String resultado = "";
        for (int i = 0; i < repeticiones; i++) {
            resultado += caracter;
        }
        return resultado;
    }    
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura: ");
        int altura = sc.nextInt();
        System.out.println(linea('*', altura));
        for (int i = 1; i < altura; i++) {
            System.out.print(linea(' ', i));
            System.out.print("*" + linea(' ', altura - i - 2));
            if (i < altura - 1){
                System.out.println("*");
            }
        }
        System.out.println();
        sc.close();
    }
}
 