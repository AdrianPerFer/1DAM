package Ejercicio7;
import java.util.*;

/**
 * 
 * La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa
 * un botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda
 * anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25
 * céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la posición – cara o
 * cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias
 * siguiendo la pauta correcta. Cada moneda generada debe ser una instancia de
 * la clase Moneda y la secuencia se debe ir almacenando en una lista.
 * 
 * @author Adrián Perogil Fernández
 * 
 */

public class Ejercicio7 {
   public static void main(String[] args) {
    
    ArrayList<Moneda> a = new ArrayList<>(); 
    Moneda monedaAux = new Moneda();
    a.add(monedaAux);
    String valor1 = monedaAux.getPosicion();
    String valor2 = monedaAux.getCantidad();
    for (int i = 0; i < 5; i++) {
        do {
            monedaAux = new Moneda();
        } while (!((monedaAux.getPosicion()).equals(valor1)) && !((monedaAux.getCantidad()).equals(valor2)));
        a.add(monedaAux);
        valor1 = monedaAux.getPosicion();
        valor2 = monedaAux.getCantidad();
    }

    for (Moneda moneda : a) {
        System.out.println(moneda);
    }
   } 
}
