package Ejercicio12;

public class Libro extends Publicacion implements Prestable {

    private boolean prestado = false;

    public Libro(String isbn, String titulo, int anoPublicacion){
        super(isbn, titulo, anoPublicacion);
    }

    public String toString() {
        return super.toString() + (prestado?" (prestado)":" (no prestado)");
    }

    public void presta(){
        prestado = true;
    }

    public void devuelve() {
        System.out.println("Lo siento, ese libro ya está prestado");
        prestado = false;
    }

    public boolean estaPrestado() {
        if (this.prestado) {
            prestado = true;
        } else {
            prestado = false;
        }
        return prestado;
    }
}
