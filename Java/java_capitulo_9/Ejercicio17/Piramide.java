package Ejercicio17;

public class Piramide {
    
    private static int cuentaPiramide = 0;
    private int altura;
    private String piramide;
    
    public Piramide(int alturaIndicada){
        this.altura = alturaIndicada;
        Piramide.cuentaPiramide ++;
    }

    public static int getCuentaPiramide() {
        return Piramide.cuentaPiramide;
    }

    @Override
    public String toString(){
        piramide = "";
        for (int alt = 0; alt <= altura; alt++) {
            for (int espacio = 0; espacio < altura - alt; espacio++) {
                piramide += " ";
            }
            for (int asteriscos = 0; asteriscos < alt * 2 - 1; asteriscos++) {
                piramide += "*";
            }
            piramide += "\n";
        }
        return piramide;
    }
}
