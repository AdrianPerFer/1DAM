/*
 * 
 * Realiza el control de acceso a una caja fuerte. La combinación
 * será un número de 4 cifras. El programa nos pedirá la combinación
 * para abrirla. Si no acertamos, se nos mostrará el mensaje
 * “Lo siento, esa no es la combinación” y si acertamos se nos dirá
 * “La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro
 * oportunidades para abrir la caja fuerte.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intento_password;
        int intentos = 4;
        boolean acierto = false;
        do{
            System.out.println("Introduzca la contraseña: ");
            intento_password = sc.nextInt();
            if (intento_password == 1234){
                acierto = true;
            } else {
                System.out.println("Contraseña incorrecta");
            }
            intentos--;
        } while ((intentos > 0) && (!acierto));
        if (acierto) {
            System.out.println("Contraseña correcta");
        } else {
            System.out.println("Número de intentos superados");
        }
        sc.close();
    }
}
