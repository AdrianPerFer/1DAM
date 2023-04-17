/*
 * 
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes
 * de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 * de asteriscos o cualquier otro carácter.
 * 
 * @author: Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        // Según España, la temperatura media nunca bajará de 0
        Scanner sc = new Scanner(System.in);
        int [] mesNumero = new int[12];
        int i;
        String mesNombre = "";
        for (i = 0; i < mesNumero.length; i++) {
            switch (i) {
                case 0:
                    mesNombre = "enero";
                    break;
                case 1:
                    mesNombre = "febrero";
                    break;
                case 2:
                    mesNombre = "marzo";
                    break;
                case 3:
                    mesNombre = "abril";
                    break;
                case 4:
                    mesNombre = "mayo";
                    break;
                case 5:
                    mesNombre = "junio";
                    break;
                case 6:
                    mesNombre = "julio";
                    break;
                case 7:
                    mesNombre = "agosto";
                    break;
                case 8:
                    mesNombre = "septiembre";
                    break;
                case 9:
                    mesNombre = "octubre";
                    break;
                case 10:
                    mesNombre = "noviembre";
                    break;
                case 11:
                    mesNombre = "diciembre";
                    break;
                default:
                    System.out.println("Error");
            }
            System.out.print("Introduce un número entero de la temperatura media de " + mesNombre + ": ");
            mesNumero [i] = sc.nextInt();
        }
        for ( i = 0; i < mesNumero.length; i++) {
            switch (i) {
                case 0:
                    mesNombre = "enero";
                    break;
                case 1:
                    mesNombre = "febrero";
                    break;
                case 2:
                    mesNombre = "marzo";
                    break;
                case 3:
                    mesNombre = "abril";
                    break;
                case 4:
                    mesNombre = "mayo";
                    break;
                case 5:
                    mesNombre = "junio";
                    break;
                case 6:
                    mesNombre = "julio";
                    break;
                case 7:
                    mesNombre = "agosto";
                    break;
                case 8:
                    mesNombre = "septiembre";
                    break;
                case 9:
                    mesNombre = "octubre";
                    break;
                case 10:
                    mesNombre = "noviembre";
                    break;
                case 11:
                    mesNombre = "diciembre";
                    break;
                default:
                    System.out.println("Error");
            }
            System.out.println(mesNombre + " (" + mesNumero[i] + " grados de media)");
            for (int j = 0; j < 2; j++) {
                for (int j2 = 0; j2 < mesNumero[i]; j2++) {
                    System.out.print("*");
                }
                System.out.println();
            } 
            System.out.println();
        }
        sc.close();
    }
}
