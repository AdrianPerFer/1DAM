package Ejercicio16;

public class Linea {

    private String punto1;
    private String punto2;

    public Linea(Punto p1, Punto p2) {
        this.punto1 = "(" + p1.getX() + ", " + p1.getY() + ")";
        this.punto2 = "(" + p2.getX() + ", " + p2.getY() + ")";
    }

    //Línea formada por los puntos (4.21, 7.3) y (-2.0, 1.66)
    @Override
    public String toString() {
        return "Línea formada por los puntos " + this.punto1 + " y " + this.punto2;
    }
}
