/*
 * 
 * El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8
 * (todos los que encuentre). Realiza un programa que muestre un número antes
 * y después de haber sido comido por el gusano. Si el animalito no se ha comido
 * ningún dígito, el programa debe indicarlo.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero (mayor que cero): ");
        long numero = sc.nextLong();
        long aux = numero;
        long numeroReves = 0;
        long digito = 0;
        long numeroFinal = 0;
        boolean siCome = false;
        while (aux > 0) {
            numeroReves = ((numeroReves * 10) + (aux % 10));
            aux /= 10;
        }
        while ( numeroReves > 0 ) {
            digito = numeroReves % 10;
            if (digito == 0 || digito == 8){
                System.out.print("");
                siCome = true;
            } else {
                numeroFinal = ((numeroFinal * 10) + (digito));
            }
            numeroReves /= 10;
        }
        if (siCome) {
            System.out.println("Después de haber sido comido por el gusano númerico se queda en " + numeroFinal);
        } else {
            System.out.println("El gusano numérico no se ha comido ningún dígito");
        }
        sc.close();
    }
}
