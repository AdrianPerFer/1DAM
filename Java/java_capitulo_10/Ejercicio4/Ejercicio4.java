package Ejercicio4;

/**
 * 
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
 * debe ordenar palabras en lugar de números.
 * 
 * @author Adrián Perogil Fernández
 * 
 */

 import java.util.Scanner;
 import java.util.ArrayList;
 import java.util.Collections;
 
 public class Ejercicio4 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         ArrayList<String> a = new ArrayList<String>();
 
         for (int i = 0; i < 10; i++) {
             System.out.print("Introduce un número: ");
             String palabra = sc.nextLine();
             a.add(palabra);
         }
 
         Collections.sort(a);
 
         System.out.println("Resultado: " + a);
 
         sc.close();
     }
 }