/**
 * 
 * Crea una función con la siguiente cabecera:
 * public String convierteEnPalabras(int n)
 * Esta función convierte los dígitos del número n en las correspondientes palabras y lo devuelve todo en una cadena de caracteres. Por 
 * ejemplo, el 470213
 * convertido a palabras sería:
 * cuatro, siete, cero, dos, uno, tres
 * Utiliza esta función en un programa para comprobar que funciona bien. Desde
 * la función no se debe mostrar nada por pantalla, solo se debe usar print desde
 * el programa principal. Fíjate que hay una coma detrás de cada palabra salvo al
 * final.
 * 
 * @author Adrián Perogil Fernández
 * 
 */
import matematicas.Funciones;
public class Ejercicio39 {
    public static String convierteEnPalabras(int n){
        String[] palabra = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        int digitos = Funciones.digitos(n);
        String resultado = "";
        for (int i = 0; i < digitos; i++) {
            if (i == 0){
                // Resultado = palabra[(4, 5604)]
                // Resultado = palabra[3]
                // Resultado = palabra[tres]
                resultado += palabra[Funciones.digitoN(n, i)];
            } else {
                resultado += ", " + palabra[Funciones.digitoN(n, i)];
            }
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        System.out.println(convierteEnPalabras(5604));
    }
}
