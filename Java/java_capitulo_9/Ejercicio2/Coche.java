package Ejercicio2;

public class Coche extends Vehiculo{
    // Variable inicializada de la clase Coche
    private int cilindrada;

    // Constructor de Coche( Obtenemos lo heredado del padre + ciliandrada)
    public Coche(int c){
        super();
        this.cilindrada = c;
    }

    // Creamos el método de Coche: quemaRueda
    public void quemaRueda() {
        System.out.println("Brrrrrrrr");
    }
}
