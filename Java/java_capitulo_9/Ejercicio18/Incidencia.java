package Ejercicio18;

public class Incidencia {
    private static int pendientes = 0;
    private static int contador = 1;
    private int codigo = 0;
    private int puesto;
    private String estado;
    private String problema;
    private String solucion;

    public Incidencia(int puestoNum, String problemon) {
        this.codigo = contador++;
        this.puesto = puestoNum;
        this.estado = "Pendiente";
        this.problema = problemon;
        Incidencia.pendientes ++;
    }

    public static int getPendientes() {
        return Incidencia.pendientes;
    }

    public String toString(){
        //Incidencia 3 - Puesto: 5 - La pantalla se ve rosa - Resuelta - Cambio del cable VGA
        if (this.estado.equals("Pendiente")) {
            return "Incidencia " + this.codigo + " - Puesto: " + this.puesto + " - " + this.problema + " - " + this.estado;
        } else {
            return "Incidencia " + this.codigo + " - Puesto: " + this.puesto + " - " + this.problema + " - " + this.estado + " - " + this.solucion;

        }
    }

    public void resuelve(String solucionDada) {
        this.estado = "Resulta";
        this.solucion = solucionDada;
        Incidencia.pendientes --;
    }
}
