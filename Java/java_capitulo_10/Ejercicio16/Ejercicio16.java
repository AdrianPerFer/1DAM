import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Paises paises = new Paises();
        boolean salir = false;
        do {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            String pais = sc.nextLine();
            if(pais.equals("salir"))
                salir=true;
            else{
                String capital = paises.getCapital(pais);
                if(capital!=null){
                    System.out.format("La capital de %s es %s\n", pais, capital);
                }
                else{
                    System.out.format("No conozco la respuesta ¿cuál es la capital de %s?: ", pais);
                    capital = sc.nextLine();
                    paises.anade(pais, capital);
                    System.out.println("Gracias por enseñarme nuevas capitales");
                }
            }
        } while (!salir);
        sc.close();
    }
}
