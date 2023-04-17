package Ejercicio12;

public class Revista extends Publicacion {

    private int numero;

    public Revista(String isbn, String titulo, int anoPublicacion, int numero) {
        super(isbn, titulo, anoPublicacion);
        this.numero = numero;
    } 
}
