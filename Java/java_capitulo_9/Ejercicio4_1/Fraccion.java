package Ejercicio4_1;

public class Fraccion implements Cloneable{
    private int numerador;
    private int denominador;

    public int getNumerador(){
        return this.numerador;
    }

    public int getDenominador(){
        return this.denominador;
    }

    private Fraccion() {
        this.numerador = 0;
        this.denominador = 1;
    }

    public Fraccion(int numerador, int denominador){
        this();
        if (denominador == 0) {
            System.out.println("Fracción no permitida");
        } else {
            this.numerador = numerador;
            this.denominador = denominador;
        }
    }

    public Fraccion(Fraccion f){
        this(f.getNumerador(),f.getDenominador());
    }

    @Override
    public Fraccion clone(){
        return new Fraccion(this.getNumerador(), this.getDenominador());
    }

    public Fraccion invierte(){
        return new Fraccion(this.denominador, this.numerador);
    }

    public Fraccion multiplica(int n){
        return new Fraccion(this.numerador * n, this.denominador);
    }

    public Fraccion multiplica(Fraccion f){
        return new Fraccion(this.numerador * f.getNumerador(), this.denominador * f.getDenominador());
    }

    public Fraccion divide(Fraccion f){
        return this.multiplica(f.invierte());
    }

    public Fraccion divide(int n){
        return this.divide(new Fraccion(n , 1));
    }

    public Fraccion simplifica(){
        int numerador = this.numerador;
        int denominador = this.denominador;
        int menor = Math.min(this.numerador, this.denominador);
        for (int i = 2; i <= Math.abs(menor) && i <= numerador && i < denominador; i++) {
            if(numerador % Math.abs(i) == 0 && denominador % Math.abs(i) == 0){
                numerador /= i;
                denominador /= i;
            }
        }
        return new Fraccion(numerador, denominador);
    }

    @Override
    public String toString(){
        boolean negativo = (this.numerador < 0 || this.denominador < 0) && !(this.numerador < 0 && this.denominador < 0);
        return (negativo?"-":"") + Math.abs(this.numerador)+ "/" + Math.abs(this.denominador);
    }
}
