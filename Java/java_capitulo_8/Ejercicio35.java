/**
 * 
 * Crea una función con la siguiente cabecera:
 * 
 * public static String convierteEnPalotes(int n)
 * 
 * Esta función convierte el número n al sistema de palotes y lo devuelve en una
 * cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | - | | | | | |
 * | - - | | - | - | | | en el sistema de palotes. Utiliza esta función en un programa
 * para comprobar que funciona bien. Desde la función no se debe mostrar nada
 * por pantalla, solo se debe usar print desde el programa principal.
 * 
 * @author: Adrián Perogil Fernández
 * 
 */

import matematicas.Funciones;
public class Ejercicio35 {
    public static String convierteEnPalotes(int n){
        String resultado = "";

        for (int i = 0; i < Funciones.digitos(n); i++) {
            for (int j = 0; j < Funciones.digitoN(n, i); j++) {
                resultado += "|";
            }
            if (i < Funciones.digitos(n) - 1){
                resultado += "-";
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        int numero = 75;
        System.out.println("El " + numero + " en palotes es: " + convierteEnPalotes(numero));
    }
}
