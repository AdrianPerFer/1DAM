package Ejercicio17;

public class Rectangulo {
    private static int cuentaRectangulo = 0;
    private int altura;
    private int base;
    private String rectangulo;

    public Rectangulo(int alturaRectangulo, int baseRectangulo) {
        this.altura = alturaRectangulo;
        this.base = baseRectangulo;
        Rectangulo.cuentaRectangulo ++;
    }

    public static int getCuentaRectangulo() {
        return Rectangulo.cuentaRectangulo;
    }

    @Override
    public String toString(){
        rectangulo = "";
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                rectangulo += "*";
            }
            rectangulo += "\n";
        }
        return this.rectangulo;
    }
}
