/*
    ************************************************************************************
    *                                                                                  *
    *         2.   Variables                                                           *
    *                                                                                  *
    *         5.   Realiza un conversor de pesetas a euros. La cantidad en pesetas     *
    *              que se quiere convertir deberá estar almacenada en una variable.    *
    *                                                                                  *
    ************************************************************************************
    *                                                              |  |                *
    *                                                              |  |                *
    *                    @author Adrián Perogil Fernández        *      *              *
    *                                                             ******               *
    ************************************************************************************
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        // Variables "pesetas", "euros"
        int pesetas = 1333;
        double euros = (pesetas / 166.386);
        // Output
        System.out.printf("%d pesetas son %.2f euros. \n", pesetas, euros);
    }
}