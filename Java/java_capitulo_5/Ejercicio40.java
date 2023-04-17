/*
 * 
 * Realiza un programa que pinte por pantalla un rombo hueco hecho con
 * asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
 * sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
 * mensaje de error.
 * 
 * @author Adrián Perogil Fernández
 * 
 */

import java.util.Scanner;
public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura de la X: ");
        int altura1 = sc.nextInt();
        int auxAltura = 1;
        int espacios1 = 0;
        int espacios2 = altura1 / 2;
        if ((altura1 <= 3) || (altura1 % 2 == 0)) {
          System.out.print("Error, introduzca un número impar mayor que 3");
        } else {
          while (auxAltura <= altura1 / 2 + 1) {
            for (int i = 1; i <= espacios2; i++) {
              System.out.print(" ");
            }
            System.out.print("*");
            for (int i = 1; i < espacios1; i++) {
              System.out.print(" ");
            }
            if (auxAltura > 1) {
                System.out.print("*");
            }
            System.out.println();
            auxAltura++;
            espacios2--;
            espacios1 += 2;      
          }
          espacios1 = altura1 - 3;
          espacios2 = 1;
          auxAltura = 0;
          while (auxAltura < altura1 / 2) {
            for (int i = 1; i <= espacios2; i++) {
              System.out.print(" ");
            }
            System.out.print("*");
            for (int i = 1; i < espacios1; i++) {
              System.out.print(" ");
            }
            if(auxAltura < altura1 / 2 - 1) {
              System.out.print("*");
            }
            System.out.println();
            auxAltura++;
            espacios2++;
            espacios1-=2;
          }
        }
        sc.close();
      }
    }
