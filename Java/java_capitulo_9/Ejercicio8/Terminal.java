package Ejercicio8;

public class Terminal {
    private String numero;
    private int segundos;

    public Terminal(String numero){
        this.numero = numero;
        this.segundos = 0;
    }

    public String getNumero() {
        return numero;
    }

    public int getSegundos() {
        return segundos;
    }

    @Override
    public String toString(){
        return "Nº " + numero + " - " + segundos + "s de conversación";
    }

    public void llama(Terminal terminal, int segundosLlamada){
        this.segundos += segundosLlamada;
        terminal.segundos += segundosLlamada;
    }
}
