package Ejercicio7;

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

public class Moneda {
    private static String posiciones[] = {"cara", "cruz"};
    private static String cantidades[] = {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "20 céntimos", "50 céntimos", "1 euro", "2 euros"};
    private String cantidad;
    private String posicion;

    public Moneda(){
        this.posicion = posiciones[(int)(Math.random()*2)];
        this.cantidad = cantidades[(int)(Math.random()*8)];
    }

    public String getPosicion() {
        return this.posicion;
    }

    public String getCantidad() {
        return this.cantidad;
    }

    public String toString() {
        return this.cantidad + " - " + this.posicion;
    }
}
