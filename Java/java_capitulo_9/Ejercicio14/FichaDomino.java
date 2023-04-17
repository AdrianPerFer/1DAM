package Ejercicio14;

public class FichaDomino {
    private int c1;
    private int c2;
    private int aux = 0;
    public FichaDomino(int valor1, int valor2) {
        this.c1 = valor1;
        this.c2 = valor2;
    }

    public String voltea() {
        aux = c1;
        this.c1 = this.c2;
        this.c2 = aux;
        return "[ " + this.c1 + " ][ " + this.c2 + " ] ";
    }

    @Override
    public String toString() {
        return "[ " + this.c1 + " ][ " + this.c2 + " ] ";
    }

    public boolean encaja(FichaDomino ficha){
        if (this.c2 == ficha.c1) {
            return true;
        } else {
            ficha.voltea();
            if (this.c2 == ficha.c1) {
                return true;
            }
        } 
        return false;
    }
}
