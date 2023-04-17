/*
    ************************************************************************************
    *                                                                                  *
    *         2.   Variables                                                           *
    *                                                                                  *
    *         4.   Realiza un conversor de euros a pesetas. La cantidad en euros       *
    *              que se quiere convertir deberá estar almacenada en una variable.    *
    *                                                                                  *
    ************************************************************************************
    *                                                              |  |                *
    *                                                              |  |                *
    *                    @author Adrián Perogil Fernández        *      *              *
    *                                                             ******               *
    ************************************************************************************
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        // Variables "euros", "total"
        double euros = 13;
        int pesetas = (int) (euros * 166.386);
        // Output
        System.out.println(euros + " euros son " + pesetas + " pesetas");
    }
}