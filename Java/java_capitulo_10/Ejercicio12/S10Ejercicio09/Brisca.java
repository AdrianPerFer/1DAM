import java.util.ArrayList;
import java.util.HashMap;

public class Brisca {
    private Baraja mazo;
    HashMap<String, Integer> puntuacion = new HashMap<>();
    public Brisca(Baraja mazo){
        this.mazo = mazo;
        this.puntuacion.put("as", 11);
        this.puntuacion.put("tres", 10);
        this.puntuacion.put("sota", 2);
        this.puntuacion.put("caballo", 3);
        this.puntuacion.put("rey", 4);
    }

    

    public ArrayList<Carta> obtenerMano(int cantidad){
        ArrayList<Carta> array = new ArrayList<>();
        for(int i = 0; i < cantidad; i++){
            Carta c = this.mazo.pop();
            array.add(c);
            
        }
        return array;
    }

    public int obtenerPuntuacion(ArrayList<Carta> cartas){
        int total = 0;
        for(int i = 0; i < cartas.size(); i++){
            Carta c = cartas.get(i);
            Integer valor = this.puntuacion.get(c.getNumero());
            if(valor!=null)
                total+=valor;
        }
        return total;
    }

    /*
     * /** obtenermano
     * Saca un número solicitado de cartas de la baraja y devuelve la puntuación de la mano
     * @param cantidad número de cartas a sacar
     * @return Puntuación de la mano
     */
    /*
    public int obtenerMano(int cantidad){
        int total = 0;
        for(int i = 0; i < cantidad; i++){
            Carta c = this.mazo.pop();
            System.out.println(c);
            Integer valor = this.puntuacion.get(c.getNumero());
            if(valor!=null)
                total+=valor;
        }
        System.out.format("Tienes %d puntos: ", total);
        return total;
    }
     */
    
}
