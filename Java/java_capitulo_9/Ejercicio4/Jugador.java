package Ejercicio4;

public class Jugador extends Equipo {

    private String nombre;
    private String apellido;
    private int edad;

    public Jugador(String nombreEquipo, String nombre, String apellido, int edad){
        super(nombreEquipo);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getJugador(){
        return this.nombreEquipo + " " + this.nombre + " " + this.apellido + " " + this.edad;
    }
    
    public void pasarBola(){
        System.out.println("Pasando la bola");
    }

}
