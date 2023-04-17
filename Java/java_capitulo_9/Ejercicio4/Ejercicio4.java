package Ejercicio4;

/**
 * 
 * Piensa en la liga de baloncesto, ¿qué 5 clases se te ocurren para
 * representar 5 elementos distintos que intervengan en la liga?
 * 
 *      - Equipo
 *      - Pabellon
 *      - Jugador
 *      - Partido
 *      - Arbitro
 * 
 * @author Adrián Perogil Fernández
 * 
 */

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el pabellon: ");
        String nombrePabellon = sc.nextLine();
        System.out.print("Introduzca la direcccion del pabellon: ");
        String direccionPabellon = sc.nextLine();
        System.out.print("Introduzca el nombre del equipo: ");
        String nombreEquipo = sc.nextLine();
        System.out.print("Introduzca el nombre del jugador: ");
        String nombreJugador = sc.nextLine();
        System.out.print("Introduzca el apellido del jugador: ");
        String apellidoJugador = sc.nextLine();
        System.out.print("Introduzca la edad del jugador: ");
        int edadJugador = sc.nextInt();

        Equipo primero = new Equipo(nombreEquipo);
        System.out.println(primero.getNombreEquipo());
        System.out.println();

        Equipo segundo = new Equipo();
        System.out.println(segundo.getNombreEquipo());
        segundo.grito();
        System.out.println();

        Jugador jugador1 = new Jugador(nombreEquipo, nombreJugador, apellidoJugador, edadJugador);
        System.out.println(jugador1.getJugador());
        jugador1.pasarBola();
        jugador1.grito();

        Pabellon cartama = new Pabellon(nombrePabellon, direccionPabellon);
        System.out.println(cartama.getPabellon());
        cartama.encenderLuces();
    }
}