package Ejercicio3;

/**
 * 
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
 * al menos, tres métodos específicos de cada clase y redefine el/los método/s
 * cuando sea necesario. Prueba las clases creadas en un programa en el que se
 * instancien objetos y se les apliquen métodos.
 * 
 * @author Adrián Perogil Fernández
 * 
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        Pinguino linux = new Pinguino(Sexo.Macho);
        linux.come("Palomitas");
        linux.programa();

        Perro kufy = new Perro(Sexo.Macho);
        kufy.duerme();
        kufy.dameLaPata();
        kufy.amamanta();
        kufy.cuidaCrias();

        Lagarto renekton = new Lagarto(Sexo.Hembra);
        renekton.tomaElSol();
        renekton.duerme();

        Gato leo = new Gato("bulldog");
        leo.caza();
        leo.anda();
        leo.amamanta();
        leo.come("pescado");
    }
}
