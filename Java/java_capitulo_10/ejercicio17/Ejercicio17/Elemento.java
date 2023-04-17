public class Elemento {
    private String nombre;
    private double precio;
    private int unidades;
    
    Elemento(String nombre, double precio, int unidades){
        this.nombre = nombre;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getNombre(){
        return this.nombre;
    }

    public double getPrecio(){
        return this.precio;
    }

    public int getUnidades(){
        return this.unidades;
    }

    public void setUnidades(int cantidad){
        this.unidades+=cantidad;
    }

    @Override
    public boolean equals(Object o){
        return (o.getClass()==this.getClass() && this.nombre.equals(((Elemento)o).getNombre()));
    }

    @Override
    public String toString(){
        return this.nombre+" PVP: "+this.precio+" Unidades: "+this.unidades+" Subtotal: "+(this.precio*this.unidades);
    }

}
