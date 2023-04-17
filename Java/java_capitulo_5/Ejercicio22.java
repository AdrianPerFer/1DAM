/*
 * 
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        boolean primo = true;
        for (int numero = 2; numero <= 100; numero++) {
            primo = true;
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();
    }    
}
