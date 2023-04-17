import java.util.Scanner;
import matematicas.Arrays;
public class Ejercicio20a28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Genero el array
        int[] array = matematicas.Arrays.generaArrayInt(20, 0, 100);
        // Muestro el array
        matematicas.Arrays.muestraArrayInt(array);
        System.out.print("¿Qué número quieres saber si está en el array?: ");
        int n = sc.nextInt();
        // Mínimo del array
        System.out.println("Mínimo: " + matematicas.Arrays.minimoArrayInt(array));
        // Máximo del array
        System.out.println("Máximo: " + matematicas.Arrays.maximoArrayInt(array));
        // Media del array
        System.out.println("Media: " + matematicas.Arrays.mediaArrayInt(array));
        // Está en el array
        System.out.println("¿Está " + n + " en el array?: " + matematicas.Arrays.estaEnArrayInt(array, n));
        // Posición del array
        System.out.println("Posición: " + matematicas.Arrays.posicionEnArray(array, n));
        // Voltea el array
        System.out.println("Array volteado: ");
        matematicas.Arrays.muestraArrayInt(matematicas.Arrays.volteaArrayInt(array));
        // Rotación del array a la derecha
        System.out.println("Array rotado a la derecha 2 veces: "); 
        matematicas.Arrays.muestraArrayInt(matematicas.Arrays.rotaDerechaArrayInt(array, 2));
        // Rotación del array a la izquierda
        System.out.println("Array rotado a la izquierda 3 veces: ");
        matematicas.Arrays.muestraArrayInt(matematicas.Arrays.rotaIzquierdaArrayInt(array, 3));
    }
}
