package Ejercicio13;

import java.text.DecimalFormat;

public class CuentaCorriente {
    
    private String numero = "";
    private double saldo;

    public CuentaCorriente() {
        this.saldo = 0;
        for (int i = 0; i < 10; i++) {
            int digito = (int) (Math.random()*10);
            this.numero += "" + digito;
        }
    }

    public CuentaCorriente(double saldoIntroducido) {
        this.saldo = saldoIntroducido;
        for (int i = 0; i < 10; i++) {
            int digito = (int) (Math.random()*10);
            this.numero += "" + digito;
        }
    }

    @Override
    public String toString() {
        DecimalFormat formatoEuros = new DecimalFormat("0.00");
        return "Número de cta: " + numero + " Saldo: " + formatoEuros.format(this.saldo) + " €";
    }

    // En una cuenta se pueden hacer ingresos y gastos
    public void ingreso(double saldoAumentando) {
        this.saldo += saldoAumentando;
    }

    public void cargo(double saldoRestando) {
        this.saldo -= saldoRestando;
    }

    public void transferencia(CuentaCorriente cuentaDestino, int dinero) {
        this.saldo -= dinero;
        cuentaDestino.saldo += dinero;
    }
}
