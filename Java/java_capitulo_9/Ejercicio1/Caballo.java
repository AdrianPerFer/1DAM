package Ejercicio1;

public class Caballo {
    
    private String nombre;
    private String raza;
    private int edad;
    private String color;
    private String pelaje;

    Caballo (String nombre, String raza, int edad, String color, String pelaje){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.pelaje = pelaje;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void cabalga() {
        System.out.println("Cabalgando");
    }

    public void relincha() {
        System.out.println("Relinchando");
    }

    public void rumia() {
        System.out.println("Rumiando");
    }
}
