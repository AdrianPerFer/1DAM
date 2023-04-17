package Ejercicio3;

public class Pinguino extends Ave{
    
    public Pinguino() {}

    public Pinguino(Sexo sexo) {
        super(sexo);
    }

    public void vuelta() {
        System.out.println("No puedo volar");
    }

    public void programa() {
        System.out.println("No puedo programar");
    }

    public void nada() {
        System.out.println("Nadando");
    }
}
