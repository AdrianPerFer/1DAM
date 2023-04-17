package Ejercicio2;
/**
 * 
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.
 * 
 * @author Adrián Perogil Fernández
 * 
 */


public class Ejercicio2 {
    public static void main(String[] args) {
        int tamano = (int)(Math.random()* 11 + 10);
        Operaciones a = new Operaciones(tamano);
        
        int suma = a.sumar();
        float media = a.media();
        int maximo = a.maximo();
        int minimo = a.minimo();

        System.out.println(a);
        System.out.println("Suma : " + suma);
        System.out.println("Media: " + media);
        System.out.println("Max: " + maximo);
        System.out.println("Min: " + minimo);
    }

}
