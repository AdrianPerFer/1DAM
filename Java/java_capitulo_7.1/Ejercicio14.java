/*
 * 
 * Escribe un programa que pida 8 palabras y las almacene en un array. A
 * continuación, las palabras correspondientes a colores se deben almacenar al
 * comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
 * auxiliares como quieras. Los colores que conoce el programa deben estar en
 * otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
 * blanco y morado.
 * 
 * @author: Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int color = 0;
        int noColor = 0;
        String palabra = "";
        String [] arrayColores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        String [] arrayPrimero = new String [7];
        String [] arraySegundo = new String [7];
        for (int i = 0; i < arrayPrimero.length; i++) {
            boolean on = false;
            System.out.println("Introduce una palabra");
            palabra = sc.nextLine();
            for (int j = 0; j < arrayColores.length; j++) {
                if (palabra.equals(arrayColores[j])){
                    on = true;
                    arrayPrimero[color++] = arrayColores[j];
                }
            }
            if (!on) {
                arraySegundo[noColor++] = palabra;
            }
        }
        noColor = 0;
        System.out.println();
        for (int i = color; i < arraySegundo.length; i++) {
            arrayPrimero[i] = arraySegundo[noColor++];
        }
        for (int i = 0; i < arrayPrimero.length; i++) {
            System.out.print(arrayPrimero[i] + " ");
        }
        sc.close();
    }
}