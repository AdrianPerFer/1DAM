/*
 * 
 * Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
 * el programa mostrará el array y preguntará si el usuario quiere destacar el
 * máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
 * el número destacado entre dobles asteriscos.
 * Ejemplo:
 * 459 204 20 250 178 90 353 32 229 357 224 454 260 310 140 249 332 426 423 413 96
 * 447 465 298 459 411 118 480 302 417 42 82 126 82 474 362 76 190 104 21 257 88 21
 * 251 6 383 47 78 392 394 244 494 87 253 376 379 98 364 237 13 299 228 409 402 225
 * 426 267 330 243 209 426 435 309 356 173 130 416 15 477 34 28 377 193 481 368 466
 * 262 422 275 384 399 397 87 218 84 312 480 207 68 108
 *
 * ¿Qué quiere destacar? (1 – mínimo, 2 – máximo): 1
 *
 * 459 204 20 250 178 90 353 32 229 357 224 454 260 310 140 249 332 426 423 413 96
 * 447 465 298 459 411 118 480 302 417 42 82 126 82 474 362 76 190 104 21 257 88 21
 * 251 **6** 383 47 78 392 394 244 494 87 253 376 379 98 364 237 13 299 228 409 402
 * 225 426 267 330 243 209 426 435 309 356 173 130 416 15 477 34 28 377 193 481 368
 * 466 262 422 275 384 399 397 87 218 84 312 480 207 68 108
 * 
 * @author: Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int [100];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int random;
        for (int i = 0; i < array.length; i++) {
            random = (int)(Math.random()*501);
            array[i] = random ;
            if (random > max) {
                max = random;
            }
            if (random < min) {
                min = random;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n\n¿Qué quiere destacar? (1. mínimo, 2. máximo): ");
        int opcion = sc.nextInt();
        System.out.println();
        if (opcion == 2) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == max) {
                    System.out.print("**"+array[i]+"** ");
                } else {
                    System.out.print(array[i] + " ");
                }
            }
        } else if (opcion == 1) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == min) {
                    System.out.print("**"+array[i]+"** ");
                } else {
                    System.out.print(array[i] + " ");
                }
            }
        } else {
            System.out.println("Opción incorrecta");
        }
        sc.close();
    }
}