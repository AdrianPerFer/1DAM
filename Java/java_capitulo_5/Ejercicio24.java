/*
 * 
 * Escribe un programa que lea un número N e imprima una pirámide de números con N filas
 * como en la siguiente figura:
 *
 *              1
 *             121
 *            12321
 *           1234321
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura de la pirámide: ");
        int altura = sc.nextInt();
        int aux = 1;
        int i = 0;
        // Ese espacio que restamos es para colocar el número
        int espacio = altura - 1;

        // While hará que cuando incrementemos la variable "aux", siendo este menor que altura
        // Incremente el número de iteraciones que hacemos en cada línea
        /* ---1
         * --121
         * -12321
         * 1234321
         * 
         * Dividimos el resultado de cada bucle
         * ---1(for primera mitad (capeado a 4, que es la altura))
         * --12(for primera mitad (capeado a 4, que es la altura)) 1(for segunda mitad (condicionado por i > 0, por eso va un número menos que el primer bucle))
         * -123(for primera mitad (capeado a 4, que es la altura)) 21(for segunda mitad (condicionado por i > 0, por eso va un número menos que el primer bucle))
         * 1234(for primera mitad (capeado a 4, que es la altura)) 321(for segunda mitad (condicionado por i > 0, por eso va un número menos que el primer bucle))
         */

        while (aux <= altura) {
            // Aquí introducimos los espacios
            for ( i = 1 ; i <= espacio ; i++ ) {
                System.out.print(" ");
            }
            // Hasta aquí hicimos:
            /*
             * ---
             * --
             * -
             * 
             */

            // Aquí ponemos números en cada línea (Una mitad)
            for ( i = 1 ; i < aux ; i++) {
                System.out.print(i);
            }
            // Hasta aquí hicimos:
            /*
             * ---1
             * --12
             * -123
             * 1234
             */

            // Aquí ponemos números en cada línea (La otra mitad)
            for ( i = aux ; i > 0 ; i-- ){
                System.out.print(i);
            }
            // Y finalmente:
            /*
             * ---1
             * --121
             * -12321
             * 1234321
             */
            
            System.out.println(" "); 
            aux++;
            espacio--;
        }
        sc.close();
    } 
}