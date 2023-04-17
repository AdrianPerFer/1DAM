/*
    ************************************************************************************
    *                                                                                  *
    *         2.   Variables                                                           *
    *                                                                                  *
    *         6.   Escribe un programa que calcule el total de una factura a partir    *
    *              de la base imponible (precio sin IVA). La base imponible estará     *
    *              almacenada en una variable.                                         *
    *                                                                                  *
    ************************************************************************************
    *                                                              |  |                *
    *                                                              |  |                *
    *                    @author Adrián Perogil Fernández        *      *              *
    *                                                             ******               *
    ************************************************************************************
*/
public class Ejercicio6 {
    public static void main(String[] args) {
        // Variable "base_imponible"
        double base_imponible = 1300;
        // Outputs
        System.out.printf("Base imponible: %.2f euros. \n", base_imponible);
        System.out.printf("El IVA es: %.2f euros. \n", base_imponible * 0.21);
        System.out.println("-----------------------------");
        System.out.printf("Total (IVA incluido): %.2f euros. \n", base_imponible * 1.21);
    }
}