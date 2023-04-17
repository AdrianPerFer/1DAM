package Ejercicio11;

import java.text.DecimalFormat;

public class TarjetaRegalo {
    
    private double saldo;
    private String numero;

    public TarjetaRegalo(double saldoIntroducido){
        this.saldo = saldoIntroducido;
        this.numero = "";
        for (int i = 0; i < 5; i++) {
            int digito = (int) (Math.random()*10);
            this.numero += "" + digito;
        }
    }

    // Añadir saldo a la variable saldo de la clase
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    // Devuelve el valor de la variable saldo de la clase
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public String toString(){
        DecimalFormat formatoEuros = new DecimalFormat("0.00");
        return "Tarjeta nº " + this.numero + " – Saldo " + formatoEuros.format(this.saldo) + "€";
    }

    public void gasta(double saldoGastando){
        if (this.saldo < saldoGastando) {
            System.out.printf("No tiene suficiente saldo para gastar %.2f€\n", saldoGastando);
        } else {
            this.saldo -= saldoGastando;
        }
    }

    // Tipo de variable: TarjetaRegalo (Porque hay que devolver una tarjeta nueva)
    // fusionaCon(Tipo TarjetaRegalo tarjetilla)
    TarjetaRegalo fusionaCon(TarjetaRegalo tarjetilla) {
        // saldoCombinado = valor de la variable saldo de la tarjeta actual + saldo de la tarjetilla (otra tarjeta)
        double saldoCombinado = this.getSaldo() + tarjetilla.getSaldo();
        // Cambiamos el valor del saldo de la tarjeta actual a 0 y el valor de la tarjetilla a 0
        this.setSaldo(0);
        tarjetilla.setSaldo(0);
        // Creación de la tarjeta nueva con los saldos combinados de la tarjeta actual y de la tarjetilla
        return new TarjetaRegalo(saldoCombinado);
    }
}
