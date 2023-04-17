/*
 *
 * Implementa un programa que calcule la denominación ordinal de los reyes de
 * una secuencia histórica. El programa solicitará la cantidad de reyes que se
 * van a introducir, y a continuación recibirá los nombres de los reyes. Presentará
 * por pantalla dichos nombres, pero colocándoles el ordinal correspondiente. Así,
 * por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería
 * aparecer como Felipe 1º y el segundo como Felipe 2º.
 *
 * @author: Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de reyes: ");
        int rey_numero = sc.nextInt();
        int aux_rey_numero = 0;
        String rey_nombre = "";
        String [] arrayNombre = new String [rey_numero];
        sc.nextLine();
        while (aux_rey_numero != rey_numero ) {
            System.out.println("Introduce nombre: ");
            rey_nombre = sc.nextLine();
            arrayNombre[aux_rey_numero++] = rey_nombre;
        }
        for (int i = 0; i < rey_numero; i++) {
            int contador = 1;
            for (int j = 0; j < i; j++) {
                if(arrayNombre[i].equals(arrayNombre[j])) {
                    contador++;
                }
            }
            System.out.println(arrayNombre[i] + " " + contador + "º");
        }
        sc.close();
    }
}
