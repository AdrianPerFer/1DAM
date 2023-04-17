import java.util.ArrayList;

/*
 * 9. Modifica el programa anterior de tal forma que las cartas se
 *    muestren ordenadas. Primero se ordenarán por palo: bastos,
 *    copas, espadas, oros. Cuando coincida el palo, se ordenará por
 *    número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
 *    
 *    @author Luis José Sánchez
 */
public class Ejercicio09 {

  public static void main(String[] args) {
    
    Baraja b = new Baraja();
    Brisca brisca = new Brisca(b);
    ArrayList<Carta> cartas = brisca.obtenerMano(5);
    for(Carta c: cartas){
      System.out.println(c);
    }
    int puntuacion = brisca.obtenerPuntuacion(cartas);
    System.out.format("Tienes %d puntos: ", puntuacion);
    
  }
}
