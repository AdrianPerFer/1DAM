package Ejercicio2;

/**
 * 
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
 * kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
 * también algún método específico para cada una de las subclases. Prueba las
 * clases creadas mediante un programa con un menú como el que se muestra a
 * continuación:
 * VEHÍCULOS
 * =========
 * 1. Anda con la bicicleta
 * 2. Haz el caballito con la bicicleta
 * 3. Anda con el coche
 * 4. Quema rueda con el coche
 * 5. Ver kilometraje de la bicicleta
 * 6. Ver kilometraje del coche
 * 7. Ver kilometraje total
 * 8. Salir
 * Elige una opción (1-8):
 * 
 * @author Adrián Perogil Fernández
 * 
 */

import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Inicializamos las variables
        int opcion = 0;
        int km;

        // Creamos los objetos
        Bicicleta bici = new Bicicleta(8);
        Coche cochecito = new Coche(1800);

        while (opcion != 8) {
            System.out.println("\n1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.println("Elige una opción (1-8): ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos Km quiere recorrer? ");
                    km = sc.nextInt();
                    bici.recorre(km);
                    break;
                case 2:
                    bici.hazCaballito();
                    break;
                case 3:
                    System.out.print("¿Cuántos Km quiere recorrer? ");
                    km = sc.nextInt();
                    cochecito.recorre(km);
                    break;
                case 4:
                    cochecito.quemaRueda();
                    break;
                case 5:
                    System.out.print("La bicicleta lleva recorridos ");
                    System.out.println(bici.getKilometrosRecorridos() + " Km");
                    break;
                case 6:
                    System.out.println("El coche lleva recorridos ");
                    System.out.println(cochecito.getKilometrosRecorridos() + " Km");
                    break;
                case 7:
                    System.out.println("Los vehículos llevan recorridos ");
                    System.out.println(Vehiculo.getKilometrosTotales() + " Km");
                    break;
                default:
            }
        }
        sc.close();
    }
}
