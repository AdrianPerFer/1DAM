package Ejercicio6;
import java.util.*;

/** 
 * EJERCICIO 6
 * Implementa el control de acceso al área restringida de un programa. Se debe pedir un nombre de usuario y una contraseña. Si el usuario introduce los datos 
 * correctamente, el programa dirá “Ha accedido al área restringida”. El usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades el programa dirá 
 * “Lo siento, no tiene acceso al área restringida”. Los nombres de usuario con sus correspondientes contraseñas deben estar almacenados en una estructura de la clase
 * HashMap.
 * 
 * @author Adrián Perogil Fernández
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//! Se crea un arrayList del objeto HashMap, de tipo String, String (que guarden un String y otro String), llamado "a".
        HashMap<String, String> a = new HashMap<String, String>(); 
        String usuario;
        String clave;
        boolean entra =false;
        int oportunidades = 3;

//! Introducimos con "put" algunos usuarios y contraseñas. Usamos put porque no hay ningún dato introducido y no vamos a reescribir nada.
        a.put("root", "toor");
        a.put("adri", "ejemplo1234");
        a.put("usuario", "usuario");
        System.out.println("Por favor, introduzca nombre de usuario y contraseña para acceder al área restringida.\nDispone de 3 intentos.");

//! Hacemos un "do" para que cuando acierte el usuario y contraseña o lleve 3 intentos, se salga.
        do {
            System.out.println("Usuario: ");
            usuario = sc.nextLine();
            System.out.println("Contraseña: ");
            clave = sc.nextLine();

//! Hacemos a.containsKey(usuario), para comprobar que el usuario esté en el diccionario HashMap. En caso de que no esté, se muestra el mensaje de "El usuario introducido no existe".
            if (a.containsKey(usuario)) {

//! Una vez sabemos de que el usuario existe, comprobamos la contraseña, es decir, a.get(usuario).equals(clave)quiere decir que si el usuario que nos da con un get, es igual a la contraseña, salimos del do por el valor boolean de entra y nos muestra el mensaje de "Ha accedido al área restringida" o "Contraseña incorrecta" encaso de que la contraseña esté mal.
                if (a.get(usuario).equals(clave)) {
                    System.out.println("Ha accedido al área restringida");
                    entra = true;
                } else {
                    System.out.println("Contraseña incorrecta");
                }
            } else {
                System.out.println("El usuario introducido no existe");
            }

//! Contador sin mas de las oportunidades.
            oportunidades--;

//! Hacemos un if para en caso de que no entre o las oportunidades no lleguen a 0, el mensaje "Le quedan x oportunidades"
            if (!entra && (oportunidades > 0)) {
                System.out.println("Le quedan " + oportunidades + " oportunidades");
            }
        } while ((!entra) && (oportunidades > 0));

//! Si entra sigue falso, mostramos el mensaje "Lo siento, no tiene acceso al área restringida"
        if (!entra) {
            System.out.println("Lo siento, no tiene acceso al área restringida");
        }
    }
}