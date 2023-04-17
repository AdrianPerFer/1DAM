/*
 * 
 * Escribe un programa que pinte por pantalla un rectángulo hueco de 6 caracteres de ancho por 3 de alto y, a continuación, un menú que permita agrandarlo,
 * achicarlo o cambiar su orientación. Cada vez que el rectángulo se agranda,
 * se incrementa en 1 tanto su anchura como su altura. Cuando se achica,
 * se decrementa en 1 su anchura y altura. Por último, cuando se cambia la
 * orientación, los valores de anchura y altura se intercambian. El valor mínimo
 * de la altura o la anchura es 2.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Establecemos el tamaño del rectángulo
        int ancho = 6;
        // auxAncho para no cambiar la variable ancho ya que vamos a usarlas muchas veces
        // y auxAncho solo en el case 3 para cambiar el alto por el auxAncho
        int auxAncho = ancho;
        int alto = 3;
        int opcion = 0;
        do {

            // Primera línea del rectángulo
            for ( int i = 1 ; i <= ancho ; i++ ){
                System.out.print("*");
            }
            System.out.println("");

            // Líneas del rectángulo con pintada, espacio, pintada
            for ( int i = 1 ; i <= alto - 2 ; i++ ){
                System.out.print("*");
                for ( int i2 = 1 ; i2 <= ancho - 2 ; i2++ ) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            // Última línea del rectángulo
            for ( int i = 1 ; i <= ancho ; i++ ) {
                System.out.print("*");
            }
            System.out.println("");

            // Menú
            System.out.println("Opción 1 - Agrandar");
            System.out.println("Opción 2 - Achicar");
            System.out.println("Opción 3 - Cambiar la orientación");
            System.out.println("Opción 4 - Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            switch(opcion) {
                case 1:
                    ancho++;
                    alto++;
                    break;
                case 2:
                    if ((alto > 2) && (ancho > 2)) {
                        ancho--;
                        alto--;
                    } else {
                        System.out.println("No puedes achiarlo más");
                    }
                    break;
                case 3:
                    ancho = alto;
                    alto = auxAncho;
                    break;
                default:
                    System.out.println("Programa finalizado");
            }
        } while (opcion != 4);
        sc.close();
    }
}
