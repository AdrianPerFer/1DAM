import java.util.Scanner;

public class Ejercicio1 {

  public static void main(String[] args) {
    System.out.println("Por favor, vaya introduciendo números enteros.");

    Scanner sc = new Scanner(System.in);

    int maximo = Integer.MIN_VALUE;

    for (int i = 1; i < 7; i++) {
      
      boolean datoValido = false;
      int numero = 0;

      do {
        try {
          System.out.print("Nº " + i + ": ");
          numero = Integer.parseInt(sc.nextLine());
          datoValido = true;
        } catch (Exception e) {
          System.out.println("El dato introducido no es correcto, debe ser un número entero.");
          System.out.println("Por favor, inténtelo de nuevo.");
        }
      } while (!datoValido);
      
      if (numero > maximo) {
        maximo = numero;
      }
    }
    
    System.out.println("El valor máximo introducido es " + maximo);
    sc.close();
  }

}