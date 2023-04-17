package Ejercicio9;

import java.text.DecimalFormat;
import Ejercicio8.Terminal;

public class Movil extends Terminal {

    private String tarifa;
    private float coste;

    public Movil(String numero, String tarifa) {
        super(numero);
        this.tarifa = tarifa;
        this.coste = 0;
    }

    @Override
    public void llama(Terminal t, int segundos){
        super.llama(t, segundos);
        double minutos = (double) segundos / 60;

        switch(this.tarifa) {
            case "rata":
                this.coste += minutos * 0.06;
                break;
            case "mono":
                this.coste += minutos * 0.12;
                break;
            case "bisonte":
                this.coste += minutos * 0.30;
                break;
            default:
        }
    } 

    @Override
    public String toString(){
        DecimalFormat formatoEuros = new DecimalFormat("0.00");
        return super.toString() + " - tarificados " +  formatoEuros.format(this.coste) + " euros";
    }
}
