/*
(づ ◕‿◕ )づ
    ************************************************************************************
    *                                                                                  *
    *         4.   Sentencia Condicional                                               *
    *                                                                                  *
    *         8.   Amplia el programa anterior para que diga la nota del boletín       *
    *              (insuficiente, suficiente, bien, notable o sobresaliente)           *
    *                                                                                  *
    ************************************************************************************
    *                                                              |  |                *
    *                                                              |  |                *
    *                    @author Adrián Perogil Fernández        *      *              *
    *                                                             ******               *
    ************************************************************************************
*/
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la primera nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Introduzca la segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Introduzca la tercera nota: ");
        double nota3 = sc.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("La media es %.2f\n", media);
        if (media < 5) {
            System.out.print("Insuficiente");
        }
        if ((media >= 5) && (media < 6)) {
            System.out.print("Suficiente");
        }
        if ((media >= 6) && (media < 7)) {
            System.out.print("Bien");
        }
        if ((media >= 7) && (media < 9)) {
            System.out.print("Notable");
        }
        if (media >= 9) {
            System.out.print("Sobresaliente");
        }
        sc.close();
    }
}
