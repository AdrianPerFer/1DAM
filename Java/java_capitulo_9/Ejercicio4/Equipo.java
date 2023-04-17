package Ejercicio4;

public class Equipo {
    
    protected String nombreEquipo;

    public Equipo(){
        this.nombreEquipo = "Unicaja";
    }

    public Equipo(String nombreEquipo){
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombreEquipo() {
        return this.nombreEquipo;
    }

    public void grito(){
        System.out.println("1, 2, 3, ¡EQUIPO!");
    }
}
