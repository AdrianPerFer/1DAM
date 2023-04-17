package Ejercicio12;

public abstract class Publicacion {
    
    private String isbn;
    private String titulo;
    private int anoPublicacion;

    public Publicacion(String isbn, String titulo, int anoPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
    }

    public String toString() {
        return "ISBN: " + isbn + ", título: " + titulo + ", año de publicacion: " + anoPublicacion;
    }
}