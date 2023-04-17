package Ejercicio3;

/**
 * 
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList.
 * 
 * @author Adrián Perogil Fernández
 * 
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número:");
            int num = Integer.parseInt(sc.nextLine());
            a.add(num);
        }

        Collections.sort(a);

        System.out.println("Resultado: " + a);

        sc.close();
    }
}
