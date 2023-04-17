/*
 * Un restaurante nos ha encargado una aplicación para colocar a los clientes en
 * sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
 * (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
 * el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
 * un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
 * “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
 * como máximo e intente de nuevo”. Para el grupo que llega, se busca
 * siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
 * busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de
 * dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
 * las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
 * nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
 * pueden romper aunque haya huecos sueltos suficientes. El funcionamiento del
 * programa se ilustra a continuación:
 *
 * @author: Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] mesa = new int [10];
        int [] mesa_cliente = new int [10];
        int cliente_random;
        int cliente;
        for (int i = 0; i < mesa.length; i++) {
            cliente_random = (int)(Math.random()*5);
            mesa[i] = i + 1;
            mesa_cliente[i] = cliente_random;
            System.out.print(mesa[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mesa_cliente.length; i++) {
            System.out.print(mesa_cliente[i] + " ");
        }
        System.out.println();
        do {
            System.out.println("\nCuantos son (-1 para salir del programa) : ");
            cliente = sc.nextInt();
            if (cliente >= 5) {
                System.out.println("Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo.");
            } else if (cliente == -1) {
                System.out.println("Gracias. Hasta pronto.");
            } else {
                for (int i = 0; i < mesa_cliente.length; i++) {
                    if (mesa_cliente[i] == 0) {
                        mesa_cliente[i] = cliente;
                        System.out.println("Por favor, siéntese en la mesa " + (i + 1));                 
                        i = mesa_cliente.length;
                    } else if (mesa_cliente[i] == 1 && cliente <= 3) {
                        mesa_cliente[i] += cliente;
                        System.out.println("Tendrán que compatir mesa. Por favor, siéntese en la mesa número " + (i + 1));                 
                        i = mesa_cliente.length;
                    } else if (mesa_cliente[i] == 2 && cliente <= 2) {
                        mesa_cliente[i] += cliente;
                        System.out.println("Tendrán que compatir mesa. Por favor, siéntese en la mesa número " + (i + 1));                 
                        i = mesa_cliente.length;
                    } else if (mesa_cliente[i] == 3 && cliente <= 1) {
                        mesa_cliente[i] += cliente;
                        System.out.println("Tendrán que compatir mesa. Por favor, siéntese en la mesa número " + (i + 1));                 
                        i = mesa_cliente.length;
                    } else if (i == mesa_cliente.length - 1) {
                        System.out.println("Lo siento, en estos momentos no queda sitio.");
                    }
                }
                System.out.println();
                for (int i = 0; i < mesa.length; i++) {
                    mesa[i] = i + 1;
                    System.out.print(mesa[i] + " ");
                }
                System.out.println();
                for (int i = 0; i < mesa_cliente.length; i++) {
                    System.out.print(mesa_cliente[i] + " ");
                }
            }
        } while (cliente != -1);
        sc.close();
    }
}
