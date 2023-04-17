/*
 * 
 * Realiza un programa que calcule el máximo, el mínimo y la media de una serie
 * de números enteros positivos introducidos por teclado. El programa terminará
 * cuando el usuario introduzca un número primo. Este último número no se
 * tendrá en cuenta en los cálculos. El programa debe indicar también cuántos
 * números ha introducido el usuario (sin contar el primo que sirve para salir).
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numéros (primo para finalizar el programa): ");
        int numero = 10000;
        int sumaTotal = 0;
        int i2 = 0;
        int maximo = 0;
        int minimo = numero;
        boolean esPrimo;
        do { 
            numero = sc.nextInt();
            esPrimo = true;
            for (int i = 2; i < numero; i++) {
                // En vez de ver si un número es divisible entre 1 y el mismo
                // Miramos que sea divisible entre 2 hasta el mismo - 1 (por eso i < numero)
                // Así conseguimos que nunca llegue a la división de ese numero
                if ((numero % i) == 0) {
                    esPrimo = false;
                }
            }
            // En caso de que no sea un número primo (!esPrimo)...
            // Número no primo = true, si es !esPrimo ya que es lo contrario
            // Numero primo = false, no es !esPrimo ya que no es lo contrario
            if (!esPrimo) {
                sumaTotal += numero;
                i2++;
                if (numero > maximo) {
                    maximo = numero;
                }
                if (numero < minimo) {
                    minimo = numero;
                }
            }  
            // Finalmente se hace hasta que esPrimo sea falso.
        } while (!esPrimo);  
        System.out.println("Total de números introducidos: " + i2);
        System.out.println("Número máximo introducido: " + maximo);
        System.out.println("Número mínimo introducido: " + minimo);
        System.out.println("Media de los números introducidos: " + (double)sumaTotal / i2);
        sc.close();
    }
}