import matematicas.*;
import java.util.Scanner;

public class Ejercicio29a34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Filas array: ");
        int n = sc.nextInt();
        System.out.print("Columnas array: ");
        int m = sc.nextInt();
        System.out.print("Valor mínimo del array: ");
        int x = sc.nextInt();
        System.out.print("Valor máximo del array: ");
        int y = sc.nextInt();
        System.out.print("Fila que queremos ver: ");
        int i = sc.nextInt();
        System.out.print("Columna que queremos ver: ");
        int j = sc.nextInt();
        int[][] array = ArraysBi.generaArrayBiInt(n, m, x, y);
        ArraysBi.muestraArrayBiInt(array);
        System.out.println();
        int[] fila = ArraysBi.filaDeArrayBiInt(array, i);
        int[] columna = ArraysBi.columnaDeArrayBiInt(array, j);          
        Arrays.muestraArrayInt(fila);
        System.out.println();
        Arrays.muestraArrayInt(columna);
        System.out.println();
        Arrays.muestraArrayInt(ArraysBi.diagonal(array, 2, 2, "neso"));
        Arrays.muestraArrayInt(ArraysBi.diagonal(array, 2, 2, "nose"));
    }    
}
