package Ejercicio3;

public abstract class Mamifero extends Animal{
    
    public Mamifero() {
        super();
    }

    public Mamifero(Sexo sexo) {
        super(sexo);
    }

    public void amamanta() {
        if (this.getSexo() == Sexo.Macho) {
            System.out.println("Soy macho, no puedo");
        } else {
            System.out.println("Si puedo, soy hembra");
        }
    }

    public void cuidaCrias() {
        System.out.println("Cuidando a las crías");
    }

    public void anda() {
        System.out.println("Andando");
    }
}
