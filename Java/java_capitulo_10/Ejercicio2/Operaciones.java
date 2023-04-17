package Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;

public class Operaciones {
    private ArrayList<Integer> a = new ArrayList<Integer>();

    public Operaciones(int tamano) {
        for (int i = 0; i < tamano; i++) {
            a.add((int)(Math.random() * 101));
        }
    }

    public int sumar(){
        int sumaTotal = 0;
        for (int numero : a) {
            sumaTotal += numero;
        }
        return sumaTotal;
    }

    public float media(){
        return sumar() / a.size();
    }

    public int maximo(){
        return Collections.max(a);
    }

    public int minimo(){
        return Collections.min(a);
    }

    @Override
    public String toString(){
        return "Array: " + a;
    }
}
