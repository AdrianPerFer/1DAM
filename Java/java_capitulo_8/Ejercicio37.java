import matematicas.Funciones;

/**
 * 
Crea una función con la siguiente cabecera:
public String convierteEnMorse(int n)
Esta función convierte el número n al sistema Morse y lo devuelve en una
cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
Morse. Utiliza esta función en un programa para comprobar que funciona bien.
Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
desde el programa principal.

1 . _ _ _ _ 6 _ . . . .
2 . . _ _ _ 7 _ _ . . .
3 . . . _ _ 8 _ _ _ . .
4 . . . . _ 9 _ _ _ _ .
5 . . . . . 0 _ _ _ _ _

 * 
 * @author: Adrián Perogil Fernández
 * 
 */

public class Ejercicio37 {
    public static void main(String[] args) {
        int[] numeros = {213, 0, 11, 24, 86};
        
        for (int numero : numeros) {
          System.out.print("El " + numero + " es el " + convierteEnMorse(numero));
          System.out.println(" en morse.");
        }
      }
      
      public static String convierteEnMorse(int n) {
        final String[] morse = {
          "_ _ _ _ _", ". _ _ _ _", ". . _ _ _", ". . . _ _", ". . . . _",
          ". . . . .", "_ . . . .", "_ _ . . .", "_ _ _ . .", "_ _ _ _ ."
        };
        
        String resultado = "";
        
        for(int i = 0; i < Funciones.digitos(n); i++) {
          resultado += morse[Funciones.digitoN(n, i)];
        }
        
        return resultado;
      }
    }

