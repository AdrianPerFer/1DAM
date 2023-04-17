package alumnos;
public class Alumno {
    long id;
    String nombre;
    String apellidos;
    int id_grupos;
 
    public Alumno(){
        this(0,"","",0);
    }

    public Alumno(int id, String nombre, String apellidos, int id_grupos){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id_grupos = id_grupos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getId_grupos() {
        return id_grupos;
    }

    public void setId_grupos(int id_grupos) {
        this.id_grupos = id_grupos;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Nombre: %s, Apellidos: %s, Grupo: %s", this.id, this.nombre, this.apellidos, this.id_grupos);
    }
}
