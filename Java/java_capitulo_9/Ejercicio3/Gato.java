package Ejercicio3;

public class Gato extends Mamifero{
    
    private String raza;

    public Gato(Sexo sexo, String raza) {
        super(sexo);
        this.raza = raza;
    }

    public Gato (Sexo sexo) {
        super(sexo);
        this.raza = "siamés";
    }

    public Gato (String raza) {
        super(Sexo.Hembra);
        this.raza = raza;
    }

    public void maulla() {
        System.out.println("Maullando");
    }

    public void ronronea() {
        System.out.println("Ronroneando");
    }

    public void come(String comida) {
        if (comida.equals("pescado")) {
            System.out.println("Hmmm, gracias");
        } else {
            System.out.println("Lo siento, solo como pescado");
        }
    }

    public void peleaCon(Gato contrincante) {
        if (this.getSexo() == Sexo.Hembra) {
            System.out.println("Me encanta pelear");
        } else {
            if (contrincante.getSexo() == Sexo.Hembra) {
                System.out.println("No, soy un gallina");
            } else {
                System.out.println("Ven bobo");
            }
        }
    }

    public void limpiate() {
        System.out.println("Lamiéndome");
    }

    public void caza() {
        System.out.println("Cazando");
    }
}
