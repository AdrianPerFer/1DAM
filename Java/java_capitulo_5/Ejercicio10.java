/*
 * 
 *  Escribe un programa que calcule la media de un conjunto de números
 *  positivos introducidos por teclado. A priori, el programa no sabe
 *  cuántos números se introducirán. El usuario indicará que ha terminado
 *  de introducir los datos cuando meta un número negativo.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio10 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float suma = 0;
        float valor = 0;
        int i = 0;
        do {
            System.out.println("Introduzca el número: ");
            valor = sc.nextFloat();
            if (valor  >= 0){
                suma+=valor;
                i++;
            }
        } while (valor >= 0);
        if (i > 0){
            System.out.printf("La media es %f\n", suma / i);
        } else {
            System.out.println("No ha introducido valores para calcular la media");
        }
        sc.close();
   } 
}
