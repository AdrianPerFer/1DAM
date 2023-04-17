package Ejercicio10;

public class Ameba {
    // número entero de microgramos de la ameba
    private int peso;

    public Ameba(){
        this.peso = 3;
    }

    public void come(int p){
        this.peso += p - 1;
    }

    public void come(Ameba a){
        this.peso += a.peso - 1;
        a.peso = 0;
    }

    @Override
    public String toString(){
        return "Soy una ameba y peso " + this.peso + " microgramos.";
    }
}
