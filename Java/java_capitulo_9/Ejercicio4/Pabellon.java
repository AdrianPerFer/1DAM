package Ejercicio4;

public class Pabellon {
    private String nombre;
    private String direccion;

    public Pabellon(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getPabellon(){
        return this.nombre + ": " + this.direccion;
    }
    
    public void encenderLuces(){
        System.out.println("Click!");
    }
}
