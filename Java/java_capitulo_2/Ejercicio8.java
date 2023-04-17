/*
    ************************************************************************************
    *                                                                                  *
    *         2.   Variables                                                           *
    *                                                                                  *
    *         8.   Escribe un programa que declare 5 variables de tipo chat.           *
    *              A continuación, crea otra variable como cadena de caracteres        *
    *              y asignale como valor la concatenación de las anteriores            *
    *              5 variables. Por último, muestra la cadena de caracteres por        *
    *              ¿Qué problemas te encuentrs? ¿cómo lo has solucionado?              *
    *                                                                                  *
    ************************************************************************************
    *                                                              |  |                *
    *                                                              |  |                *
    *                    @author Adrián Perogil Fernández        *      *              *
    *                                                             ******               *
    ************************************************************************************
*/
public class Ejercicio8 {
    public static void main(String[] args) {
        // Variable "letra1", "letra2", "letra3", "letra4", "letra5", "union_letras"
        char letra1 = 'A';
        char letra2 = 'd';
        char letra3 = 'r';
        char letra4 = 'i';
        char letra5 = '.';
        String union_letras = "" + letra1 + letra2 + letra3 + letra4 + letra5;
        // Output
        System.out.println(union_letras);
    }
}