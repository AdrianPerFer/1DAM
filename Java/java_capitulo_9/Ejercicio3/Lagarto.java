package Ejercicio3;

public class Lagarto extends Animal{
    
    public Lagarto() {}

    public Lagarto(Sexo sexo) {
        super(sexo);
    }

    public void tomaElSol() {
        System.out.println("Tomando el sol");
    }

    public void banarse() {
        System.out.println("Bañándome");
    }

    public void escondete() {
        System.out.println("Escondiéndome");
    }
}
