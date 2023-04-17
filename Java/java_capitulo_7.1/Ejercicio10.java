/*
 * 
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 * y que los almacene en un array. El programa debe ser capaz de pasar todos
 * los números pares a las primeras posiciones del array (del 0 en adelante) y
 * todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
 * necesario.
 * 
 * @author: Adrián Perogil Fernández
 * 
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        int [] general = new int [20];
        int [] impar = new int [20];
        int [] par = new int [20];
        int i;
        int i2 = 0;
        int i3 = 0;
        System.out.println("Array original");
        System.out.print("| ");
        for (i = 0; i < general.length; i++) {
            general[i] = (int)(Math.random()*4 + 1);
            System.out.print(general[i] + " | ");
        }
        System.out.println();
        for (i = 0; i < general.length; i++) {
            if (general[i] % 2 == 0) {
                par [i2++] = general [i];
            } else {
                impar [i3++] = general [i];
            }
        }
        for (i = 0; i < i2; i++) {
            general [i] = par [i];
        }
        for (i = i2; i < 20; i++) {
            general [i] = impar [i-i2];
        }
        System.out.println("Array resulado");
        System.out.print("| ");
        for (i = 0; i < general.length; i++) {
            System.out.print(general[i] + " | ");
        }
    }
}
