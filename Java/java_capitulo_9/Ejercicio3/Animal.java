package Ejercicio3;

public abstract class Animal {

    private Sexo sexo;

    public Animal () {
        this.sexo = Sexo.Macho;
    }

    public Animal (Sexo sexo) {
        this.sexo = sexo;
    }

    public Sexo getSexo() {
        return this.sexo;
    }

    public void duerme() {
        System.out.println("Zzz");
    }

    public void come(String comida) {
        System.out.println("Estoy comiendo " + comida);
    }
}
