package Ejercicio3;

public abstract class Ave extends Animal{
    
    public Ave(){
        super(Sexo.Hembra);
    }

    public Ave(Sexo sexo){
        super(sexo);
    }

    public void ponHuevo() {
        if (this.getSexo() == Sexo.Macho) {
            System.out.println("Soy macho, no puedo");
        } else {
            System.out.println("Soy hembra, si puedo");
        }
    }

    public void limpiate() {
        System.out.println("Limpiándome");
    }

    public void vuelta() {
        System.out.println("Volando");
    }
}
