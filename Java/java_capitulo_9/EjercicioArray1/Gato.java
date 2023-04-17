package EjercicioArray1;

public class Gato {
    private String nombre;
    private String color;
    private String raza;
    private int codigo;
    private static int contador = 1;

    public Gato() {
        this.codigo = Gato.contador ++ ;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Gato " + this.codigo + ": " + this.nombre + ", " + this.color + ", " + this.raza + ".";
    }
}
