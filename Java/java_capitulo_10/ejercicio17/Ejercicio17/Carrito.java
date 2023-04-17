import java.util.ArrayList;

public class Carrito {
    ArrayList<Elemento> lista = new ArrayList<Elemento>();
    public Carrito(){

    }

    public Elemento agrega(Elemento e){
        lista.add(e);
        return e;
    }
    public double importeTotal(){
        int importe = 0;
        for(Elemento e:lista){
            importe+=e.getUnidades()*e.getPrecio();
        }
        return importe;
    }

    public int numeroDeElementos(){
        return lista.size();
    }

    public int numeroDeUnidades(){
        int cantidad = 0;
        for(Elemento e:lista){
            cantidad+=e.getUnidades();
        }
        return cantidad;
    }

    @Override
    public String toString(){
        String respuesta;
        respuesta= "Contenido del carrito\n=====================\n";
        for(Elemento e: lista){
            respuesta+=e.toString();
        }

        return respuesta;

    }
}
