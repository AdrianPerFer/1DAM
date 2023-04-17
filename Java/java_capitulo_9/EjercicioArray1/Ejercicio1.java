package EjercicioArray1;

    /**
     * 
     * Utiliza la clase Gato para crear un array de cuatro gatos e introduce los datos
     * de cada uno de ellos mediante un bucle. Muestra a continuación los datos de
     * todos los gatos utilizando también un bucle.
     * 
     * @author Adrián Perogil Fernández
     * 
     */

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gato[] gato = new Gato[4];
        int i;
        System.out.println("Por favor, introduzca los datos de los gatos.");
        for (i = 0; i < 4; i++) {
            gato[i] = new Gato();
            System.out.print("Nombre: ");
            gato[i].setNombre(sc.nextLine());
            System.out.print("Color: ");
            gato[i].setColor(sc.nextLine());
            System.out.print("Raza: ");
            gato[i].setRaza(sc.nextLine());
        }  
        System.out.println("Datos de los gatos");
        for (i = 0; i < 4; i++) {
            System.out.println(gato[i]);
        }    
        sc.close();
    }
}
