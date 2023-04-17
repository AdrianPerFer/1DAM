/*
 * 
 * Realiza un programa que pinte una X hecha de asteriscos. El programa debe
 * pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
 * igual a 3, en caso contrario se debe mostrar un mensaje de error.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura de la X: ");
        int altura1 = sc.nextInt();
        // Creamos una variable aux de la altura
        int auxAltura = 1;
        // Restamos uno al espacio que es donde irá el *
        int espacios1 = altura1 - 1;
        // Variable espacio2
        int espacios2 = 0;
        // Contador i
        int i = 0;

        // Primero hacemos el chequeo de errores
        if ((altura1 <= 3) || (altura1 % 2 == 0)) {
          System.out.print("Error, introduzca un número impar mayor que 3");
        } else {
          // While de la primera parte de arriba de la X
          while (auxAltura < altura1 / 2 + 1) {
            
            // For para los espacios del lateral
            for (i = 1; i <= espacios2; i++) {
              System.out.print(" ");
            }
            
            // Pintamos un * y al realizar el for con espacios1, al salir del for, la resta que hicimos, volvemos a pintar un *
            // Ejemplo: *   *
            //           * *
            System.out.print("*");
            for (i = 1; i < espacios1; i++) {
              System.out.print(" ");
            }
            System.out.print("*");
            
            // Saltamos de línea y al incrementar auxAltura y espacios2, generamos otra iteración en el bucle y añadimos otro espacio más a la X
            // Reducimos espacios 1, 2 veces, ya que debemos finalizar el bucle donde pintamos la línea.
            System.out.println();
            auxAltura++;
            espacios2++;
            espacios1 -= 2;      
          }
          
          // While de la segunda parte de abajo de la X
          // reseteamos la variable espacio1 a 0 nuevamente junto a auxAultura y
          // espacios 2, al tener casi la mitad de la x, la divisimos entre 2 con altura1
          espacios1 = 0;
          espacios2 = altura1 / 2;
          auxAltura = 1;
          while (auxAltura <= altura1 / 2 + 1) {
            
            // *   *
            //  * *
            //   * <-- Espacios de la izquierda de este asterísco
            for (i = 1; i <= espacios2; i++) {
              System.out.print(" ");
            }
            
            // *   *
            //  * *
            //   * <-- Pintamos los astericos faltantes hasta que se deje de cumplir la condición del while
            //  * * <-- Pintamos los astericos faltantes hasta que se deje de cumplir la condición del while
            // *   * <-- Pintamos los astericos faltantes hasta que se deje de cumplir la condición del while
            System.out.print("*");
            for (i = 1; i < espacios1; i++) {
              System.out.print(" ");
            }
            
            if(auxAltura>1) {
              System.out.print("*");
            }
            
            System.out.println();
            auxAltura++;
            espacios2--;
            espacios1+=2;
          }
        }
      }
    }
