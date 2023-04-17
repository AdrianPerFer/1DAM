/*
 * 
 * Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
 * programa debe pedir la altura. Se debe comprobar que la altura sea un número
 * impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura de la X: ");
        int altura1 = sc.nextInt();
        int auxAltura = 1;
        int espacios1 = altura1 - 1;
        int espacios2 = 0;
        int i = 0;
        if ((altura1 <= 3) || (altura1 % 2 == 0)) {
          System.out.print("Error, introduzca un número impar mayor que 3");
        } else {
          while (auxAltura < altura1 / 2 + 1) {
            for (i = 1; i <= espacios2; i++) {
              System.out.print(" ");
            }
            System.out.print("*");
            for (i = 1; i < espacios1; i++) {
              System.out.print("*");
            }
            System.out.print("*");
            System.out.println();
            auxAltura++;
            espacios2++;
            espacios1 -= 2;      
          }
          espacios1 = 0;
          espacios2 = altura1 / 2;
          auxAltura = 1;
          while (auxAltura <= altura1 / 2 + 1) {
            for (i = 1; i <= espacios2; i++) {
              System.out.print(" ");
            }
            System.out.print("*");
            for (i = 1; i < espacios1; i++) {
              System.out.print("*");
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