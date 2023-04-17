package Ejercicio3;

public class Perro extends Mamifero{
    
    public Perro(Sexo sexo) {
        super(sexo);
    }

    public Perro() {
        super(Sexo.Hembra);
    }

    public void ladra() {
        System.out.println("Ladrando");
    }
    
    public void dameLaPata() {
        System.out.println("Toma la pata");
    }
    
    public void caza() {
        System.out.println("Cazando");
    }
}
