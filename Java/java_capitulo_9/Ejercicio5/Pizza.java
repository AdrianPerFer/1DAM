package Ejercicio5;

public class Pizza {

    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    private String tamano;
    private String tipo;
    private String estado;

    public Pizza(String tipo, String tamano){
        this.tipo = tipo;
        this.tamano = tamano;
        this.estado = "pedida";
        totalPedidas++;
    }
    
    public String toString(){
        return "pizza " + this.tipo + " " + this.tamano + ", " + this.estado;
    }

    public static int getTotalPedidas(){
        return totalPedidas;
    }

    public static int getTotalServidas(){
        return totalServidas;
    }

    public void sirve(){
        if (this.estado.equals("pedida")) {
            this.estado = "servida";
            totalServidas++;
        } else {
            System.out.println("Estaba servida");
        }
    }
}
