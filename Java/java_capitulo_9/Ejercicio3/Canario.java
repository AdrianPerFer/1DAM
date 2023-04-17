package Ejercicio3;

public class Canario extends Ave{
    
    public Canario() {}

    public Canario(Sexo sexo){
        super(sexo);
    }

    public void canta() {
        System.out.println("Cantando");
    }

    public void caza() {
        System.out.println("Cazando");
    }

    public void pia() {
        System.out.println("Piando");
    }
}
